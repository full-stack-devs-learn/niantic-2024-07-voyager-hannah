let categoryId = 1
    document.addEventListener("DOMContentLoaded", () => {
    const categoryDropdown = document.getElementById("category");

    categoryDropdown.addEventListener("change", () => {
    categoryId = categoryDropdown.value;
    loadPage();
});
function loadPage()
{
    const container = document.getElementById("product-container");
    container.innerHTML = "";

    const url = `/products/category/${categoryId}`;


    fetch(url).then(response => {
        if(response.status === 200)
        {
            return response.text();
        }
        throw new Error(response);
    }).then(data => {
        container.innerHTML = data;
    }).catch(error => {
        console.log(error)
    })
    ;
}
});
