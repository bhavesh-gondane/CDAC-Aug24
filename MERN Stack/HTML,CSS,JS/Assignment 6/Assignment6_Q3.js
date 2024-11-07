const book = {
    title: "Quantitative Mathematics",
    author: "R S Agrawal",
    yearPublished: 2023,
    
    displayDetails() {
        console.log(`Title: ${this.title}`);
        console.log(`Author: ${this.author}`);
        console.log(`Year Published: ${this.yearPublished}`);
    }
};

book.displayDetails();
