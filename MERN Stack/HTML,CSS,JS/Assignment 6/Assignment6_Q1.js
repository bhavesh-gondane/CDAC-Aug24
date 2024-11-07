const taxRate = 0.08;
let cart = []; 
let totalPrice = 0; 


function addItem(itemName, price) {
  cart.push({ name: itemName, price: price });
  updateTotal();
}


function updateTotal() {
  totalPrice = 0;
  for (let item of cart) {
    totalPrice += item.price;
  }
  console.log("Total Price:", totalPrice);
}


addItem("T-Shirt", 15.99);
addItem("Jeans", 39.99); 


let totalWithTax = totalPrice * (1 + taxRate); 
console.log("Total Price with Tax:", totalWithTax); 