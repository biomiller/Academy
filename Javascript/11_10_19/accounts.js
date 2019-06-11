// function getAllAccountsFirstNames(){

//     let req = new XMLHttpRequest();

//     req.onload = function(){
//         allAccounts =JSON.parse(req.responseText);

//         allNames = "";

//         for (i = 0; i < allAccounts.length; i++) { 

//             firstName = allAccounts[i].firstName;

//             allNames+= (firstName + " ");

//         }

//         document.getElementById("output").innerText = allNames;
//     };

//     req.open("GET","http://localhost:8080/AccountSETemplate/api/account/getAllAccounts");

//     req.send();

// }


function createAccount(){

    let req = new XMLHttpRequest();

    let newAccount = {
        firstName: document.getElementById("firstName").value,
        lastName: document.getElementById("lastName").value,
        accountNumber: document.getElementById("accountNumber").value
    }

    req.onload = function(){
        console.log(req.responseText);
    }

    req.open("POST","http://localhost:8080/AccountSETemplate/api/account/createAccount");

    req.send(JSON.stringify(newAccount));

}


function deleteAccount(){

    let req = new XMLHttpRequest();

    let accountId = document.getElementById("accountIdToRemove").value;

    req.onload = function(){
        console.log(req.responseText);
        document.getElementById("accounts").removeChild(document.getElementById(accountId));
    }
    req.open("DELETE",`http://localhost:8080/AccountSETemplate/api/account/deleteAccount/${accountId}`);

    req.send();

}


function updateAccount(){

    let req = new XMLHttpRequest();

    let updateId = document.getElementById("updateId").value;

    let updateAccount = {
        firstName: document.getElementById("updateFirstName").value,
        lastName: document.getElementById("updateLastName").value,
        accountNumber: document.getElementById("updateAccountNumber").value
    }

    req.onload = function(){
        console.log(req.responseText);
    }

    req.open("PUT",`http://localhost:8080/AccountSETemplate/api/account/updateAccount/${updateId}`);

    req.send(JSON.stringify(updateAccount));

    return false;
}



function getAllAccounts(){

    let req = new XMLHttpRequest();

    req.onload = function(){
        allAccounts =JSON.parse(req.responseText);

        for (let i = 0; i < allAccounts.length; i++) { 

            // if (document.contains(document.getElementById(allAccounts[i].id))){
            //     document.getElementById("accounts").removeChild(document.getElementById(allAccounts[i].id));
            // } 
            
            // let newEl = document.createElement("p")

            // newEl.id = allAccounts[i].id;
            // newEl.innerText = "ID: " + allAccounts[i].id + " Name: " + allAccounts[i].firstName + " " + allAccounts[i].lastName + " Account Number: " + allAccounts[i].accountNumber;

            // document.getElementById("accounts").appendChild(newEl);

            if (document.contains(document.getElementById("row" + allAccounts[i].id))){
                 document.getElementById("accounts").removeChild(document.getElementById("row" + allAccounts[i].id));
             } 

            let newRow = document.createElement('TR');

            newRow.id = "row" + allAccounts[i].id;

            document.getElementById("accounts").appendChild(newRow);

            let td1 = document.createElement('TD');
            document.getElementById("row" + allAccounts[i].id).appendChild(td1);
            td1.innerText = allAccounts[i].id;
            let td2 = document.createElement('TD');
            document.getElementById("row" + allAccounts[i].id).appendChild(td2);
            td2.innerText = allAccounts[i].firstName;
            let td3 = document.createElement('TD');
            document.getElementById("row" + allAccounts[i].id).appendChild(td3);
            td3.innerText = allAccounts[i].lastName;
            let td4 = document.createElement('TD');
            document.getElementById("row" + allAccounts[i].id).appendChild(td4);
            td4.innerText = allAccounts[i].accountNumber;

        }
    };

    req.open("GET","http://localhost:8080/AccountSETemplate/api/account/getAllAccounts");

    req.send();

}