const expenses = [];
let totalExpense = 0;

function addExpense(description, amount, date = new Date()) {
    const expense = { description, amount, date }; 
    expenses.push(expense);
    totalExpense = totalExpense+amount; 
    displaySuccessMessage(() => console.log(`Expense added: ${description}`)); 
}

const displayExpenses = () => {
    console.log("Expenses:");
    expenses.forEach(({ description, amount, date }) => {
        console.log(`Description: ${description}, Amount: $${amount}, Date: ${date.toDateString()}`);
    });
};


const calculateTotalExpenses = () => {
    return totalExpense;
};

const filterExpensesAbove = (value) => {
    return expenses.filter(expense => expense.amount > value);
};

const fetchInitialExpenses = () => {
    return new Promise((resolve) => {
        const initialExpenses = [
            { description: "Groceries", amount: 50, date: new Date("2024-10-01") },
            { description: "Bakery", amount: 30, date: new Date("2024-10-05") },
            { description: "Dinner", amount: 25, date: new Date("2024-10-10") },
        ];
        resolve(initialExpenses); 
    });
};

const createTotalExpenseTracker = () => {
    let currentTotal = 0; 

    return (amount) => {
        currentTotal = currentTotal+amount;
        return currentTotal; 
    };
};

const initApp = async () => {
    const initialExpenses = await fetchInitialExpenses();
    initialExpenses.forEach(({ description, amount, date }) => {
        addExpense(description, amount, date); 
    });
    displayExpenses(); 
    console.log(`Total Expenses: $${calculateTotalExpenses()}`); 
};

const displaySuccessMessage = (callback) => {
    callback();
};

initApp(); 

const addMultipleExpenses = (...newExpenses) => {
    const newExpensesList = [...newExpenses];
    newExpensesList.forEach(({ description, amount }) => addExpense(description, amount));
};


addMultipleExpenses(
    { description: "Transportation", amount: 15 },
    { description: "Entertainment", amount: 40 }
);

displayExpenses();
console.log(`Total Expenses: $${calculateTotalExpenses()}`); 

const highExpenses = filterExpensesAbove(20);
console.log("Expenses above $20:");
highExpenses.forEach(({ description, amount }) => {
    console.log(`Description: ${description}, Amount: $${amount}`);
});
