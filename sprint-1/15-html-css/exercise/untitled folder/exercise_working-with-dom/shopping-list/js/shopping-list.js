// add pageTitle

// add groceries

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function displayListTitle() {
//get title
const listName =ShoppingService.getListName();
//html reference
const titleElement = document.getElementById('title')
//set
titleElement.textContent = listName;

}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
//get grocery list
    const groceries = ShoppingService.getShoppingList();
//reference html
    const listElement = document.getElementById('shopping-list')
//loop through groceries
groceries.forEach(item => {
   
    const listItem = document.createElement('div')
    listItem.classList.add('list-item')
    listItem.setAttribute('data-id', item.id)
    
    listItem.innerHTML = ``;


    if (item.isComplete) {
        listItem.classList.add('completed')
    }
    listElement.appendChild(listItem);
});

}
/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() { 
    
    const items = document.querySelectorAll('.list-item')
    items.forEach(item => {
        item.classList.toggle('completed');
    })
}

displayListTitle();

displayGroceries();

window.markCompleted = markCompleted;