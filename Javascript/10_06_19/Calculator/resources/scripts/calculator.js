
function add(){
    let a = Number(document.getElementById("num1").value);
    let b = Number(document.getElementById("num2").value);
    document.getElementById("result").innerText = a+b;
}

function subtract(){
    let a = Number(document.getElementById("num1").value);
    let b = Number(document.getElementById("num2").value);
    document.getElementById("result").innerText = a-b;
}

function multiply(){
    let a = Number(document.getElementById("num1").value);
    let b = Number(document.getElementById("num2").value);
    document.getElementById("result").innerText = a*b;
}

function divide(){
    let a = Number(document.getElementById("num1").value);
    let b = Number(document.getElementById("num2").value);
    document.getElementById("result").innerText = a/b;
}

function square(){
    let a = Number(document.getElementById("num1").value);
    let b = Number(document.getElementById("num2").value);
    document.getElementById("result").innerText = Math.pow(a,b);
}



function calc(){
    let a = Number(document.getElementById("num1").value);
    let b = Number(document.getElementById("num2").value);
    
    return{
        add: function (){
            document.getElementById("result").innerText = a+b;
        },

        subtract: function (){
            document.getElementById("result").innerText = a-b;
        },

        multiply: function (){
            document.getElementById("result").innerText = a*b;
        },

        divide: function (){
            document.getElementById("result").innerText = a/b;
        },

        square: function (){
            document.getElementById("result").innerText = Math.pow(a,b);
        }
    }
}


