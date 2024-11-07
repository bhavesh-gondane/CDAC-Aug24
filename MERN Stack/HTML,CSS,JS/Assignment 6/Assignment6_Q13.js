function counter() {
    let count = 0; 

    return function() {
        count++;
        return count;
    };
}

const count = counter();

console.log(count()); 
console.log(count()); 
console.log(count()); 