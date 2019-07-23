function add(a,b) {
    console.log(a+b)
}

function subtract(a,b) {
    console.log(a-b)
}

function multiply(a,b) {
    console.log(a*b)
}

function divide(a,b) {
    console.log(a/b)
}


const calculator = (a,b,op) => {
    if (op == '+') {
        add(a,b);
    } else if (op == '-') {
        subtract(a,b);
    } else if (op == '*') {
        multiply(a,b);
    } else if (op == '/') {
        divide(a,b);
    } else {
        console.log('Unrecognised operator')
    }
}

// const readline = require('readline').createInterface({
//   input: process.stdin,
//   output: process.stdout
// })

// let num1 = readline.question(`First Number: `, function(num) {
//     readline.close();
//     return num;
// });

// let num2 = readline.question(`Second Number: `, function(num) {
//     return num;
// });

// let op = readline.question(`Operator: `, function(operator) {
//     readline.close();
//     return operator;
// });

console.log(process.argv[0]);

console.log(process.argv[1]);

let num1 = process.argv[2];

let num2 = process.argv[3];

let op = process.argv[4];

calculator(num1,num2,op);