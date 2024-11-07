//regular function
function calculateArea(length, width) {
  return length * width;
}
console.log("Area (regular function):", calculateArea(5, 3)); 


//arroow function
const calculateAreaArrow = (length, width) => length * width;
console.log("Area (arrow function):", calculateAreaArrow(5, 3)); 
