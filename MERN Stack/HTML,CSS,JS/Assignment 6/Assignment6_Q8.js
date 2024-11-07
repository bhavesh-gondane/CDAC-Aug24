const cart = [
    { name: "Apple", price: 0.5, quantity: 4 },
    { name: "Bread", price: 3.0, quantity: 2 },
    { name: "Milk", price: 2.5, quantity: 1 },
];

const totalPrice = cart.reduce((total, item) => {
    return total + (item.price * item.quantity);
});

console.log("Total Price:", totalPrice); 
