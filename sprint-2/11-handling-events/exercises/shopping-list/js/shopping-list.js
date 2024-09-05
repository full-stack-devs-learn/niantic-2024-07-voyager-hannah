let service;
let list = []

let allItemsIncomplete = true;


function displayListTitle() {
    const title = document.getElementById("title")
    title.textContent = service.getListName();
}


function displayShoppingList() {
    const parent = document.getElementById("shopping-list")
    parent.innerHTML = '';
    list.forEach(item => {
        addListItem(item, parent);
    })
}

function addListItem(item, parent)
{
    const div = document.createElement("div")
    div.classList.add("list-item");


    if(item.isComplete)
    {
        div.classList.add("complete")
    }
   addItemTitle(item, div)
   parent.appendChild(div)

    div.addEventListener("click", () => {
   if(!div.classList.contains("complete")) {
    div.classList.add("complete");
    item.isComplete = true;
   }
        
    });

    div.addEventListener("dblclick", () => {
        div.classList.remove("complete");
        item.isComplete = false;
        
    })

    
}

function addItemTitle(item, parent)
{
    const div = document.createElement("div")
    div.classList.add("item-title");

    
    div.textContent = item.title;

    parent.appendChild(div);
}

function addQuantity(item, parent)
{
    const div = document.createElement("div");
    div.classList.add("quantity-container");

    const span = document.createElement("span");
    span.textContent = "quantity"
    span.classList.add("super");

    const text = document.createTextNode(item.quantity)

    div.appendChild(span)
    div.appendChild(text)

    parent.appendChild(div);
}


function markCompleted() {
    const listItems = document.querySelectorAll(".list-item");

    listItems.forEach(item => {
        item.classList.add("complete");
    });
    allItemsIncomplete = false;
    document.getElementById("allCompleteButton").textContent = "Mark All Incomplete"
}
function markIncompleted() {
    const listItems = document.querySelectorAll(".list-item");
    listItems.forEach(item => {
        item.classList.remove("complete")
    });
    allItemsIncomplete = true;
    document.getElementById("allCompleteButton").textContent = "Mark All Complete";
}
    

// create the page load event here

document.addEventListener("DOMContentLoaded", () => {
    service = new ShoppingService();
    list = service.getShoppingList();

    displayListTitle();
    displayShoppingList();

   const form = document.querySelector("form")
   form.addEventListener("submit", addNewItem);

   const toggleButton = document.getElementById("allCompleteButton");
   toggleButton.addEventListener("click", () => {
    if (allItemsIncomplete) {
        markCompleted();
    } else {
        markIncompleted();
    }

   });
   });


function addNewItem(event) {
    event.preventDefault();

    const titleInput = document.getElementById("itemName");
    const quantityInput = document.getElementById("quantity")



    const newItem  = {
        id: list.length + 1,
        title: titleInput.value,
        quantity: parseInt(quantityInput.value, 10),
        isComplete: false
       };
       list.push(newItem);
       displayShoppingList();
    
       titleInput.value = "";
       quantityInput.value = "";
    }
