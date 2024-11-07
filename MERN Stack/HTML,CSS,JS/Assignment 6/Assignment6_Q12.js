const myPromise = new Promise((resolve) => {
    setTimeout(() => {
        resolve("Promise resolved in 3 seconds");
    }, 3000);
});

myPromise
    .then((message) => {
        console.log(message); 
    })
    .catch((error) => {
        console.error("Promise rejected:", error);
    });
