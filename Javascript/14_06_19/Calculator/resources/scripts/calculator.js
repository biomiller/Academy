
function calc(){

    let a = Number(document.getElementById("num1").value);
    let b = Number(document.getElementById("num2").value);

    sessionStorage.setItem('num1', Number(document.getElementById("num1").value));
    sessionStorage.setItem('num2', Number(document.getElementById("num2").value));
    
    return{
        add: function (){
            document.getElementById("operator").innerText = '+';
            sessionStorage.setItem('result', a+b);  
        },

        subtract: function (){
            document.getElementById("operator").innerText = '-';
            sessionStorage.setItem('result', a-b);
        },

        multiply: function (){
            document.getElementById("operator").innerText = '*';
            sessionStorage.setItem('result', a*b);        },

        divide: function (){
            document.getElementById("operator").innerText = '/';
            sessionStorage.setItem('result', a/b);        
        },

        square: function (){
            document.getElementById("operator").innerText = '^';
            sessionStorage.setItem('result', a^b);        
        }
    }
}

function getResult(){
    console.log("getResult called");
    document.getElementById('result').innerHTML = sessionStorage.getItem('result');
}






