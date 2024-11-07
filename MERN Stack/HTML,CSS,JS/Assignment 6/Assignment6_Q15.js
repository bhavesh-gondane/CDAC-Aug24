function Multinumbers(numbers) {
    return numbers
        .filter(num => num % 2 === 0) 
        .map(num => num * 2)          
        .reduce((total, num) => total + num, 0);
}

const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const result = Multinumbers(numbers);

console.log(result);