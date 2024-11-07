function AfterDelay(a, b) {
    setTimeout(() => {
        var c=a+b;
        console.log("Sum is "+c);
    }, 3000);
}

AfterDelay(1,2);

console.log("waiting......");