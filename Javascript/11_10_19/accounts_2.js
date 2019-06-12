
function makeRequest(method, url, body) {

    return new Promise(
        
        (resolve, reject) => {

        const req = new XMLHttpRequest();

        req.onload = () => {

            if (req.status >= 200 && req.status <= 299) {
                resolve(req.responseText);
            }
            else {
                const reason = new Error("Rejected");
                reject(reason);
            }
        }
        req.open(method, url);
        req.send(body);
    });
    
}

const buttonClickGetAccount = () => {
    makeRequest("GET", `http://localhost:8080/AccountSETemplate/api/account/getAnAccount/${document.getElementById("getAccountId").value}`)
        .then((resolve) => {getAnAccount(resolve)})
        .catch(function (error) { console.log(error.message) })

    return false;
};


function getAnAccount(input) {

    let data = JSON.parse(input);

    if (document.contains(document.getElementById("anAccountRow"))) {
        document.getElementById("accountTable").removeChild(document.getElementById("anAccountRow"));
    }

    let newRow = document.createElement('TR');

    newRow.id = "anAccountRow";

    document.getElementById("accountTable").appendChild(newRow);

    let td1 = document.createElement('TD');
    document.getElementById("anAccountRow").appendChild(td1);
    td1.innerText = data.id;
    
    let td2 = document.createElement('TD');
    document.getElementById("anAccountRow").appendChild(td2);
    td2.innerText = data.firstName;
    
    let td3 = document.createElement('TD');
    document.getElementById("anAccountRow").appendChild(td3);
    td3.innerText = data.lastName;
    
    let td4 = document.createElement('TD');
    document.getElementById("anAccountRow").appendChild(td4);
    td4.innerText = data.accountNumber;

}

const buttonClickCreateAccount = () => {

    let newAccount = {
        firstName: document.getElementById("firstName").value,
        lastName: document.getElementById("lastName").value,
        accountNumber: document.getElementById("accountNumber").value
    }

    makeRequest("POST", `http://localhost:8080/AccountSETemplate/api/account/createAccount`, JSON.stringify(newAccount))
        .then((resolve) => {
            console.log(resolve);
        })
        .catch(function (error) { console.log(error.message) });

    return false;
}


const buttonClickDeleteAccount = () => {

    makeRequest("DELETE", `http://localhost:8080/AccountSETemplate/api/account/deleteAccount/${document.getElementById("accountIdToRemove").value}`)
        .then(document.getElementById("accounts").removeChild(document.getElementById("accountIdToRemove")))
        .catch(function (error) { console.log(error.message) });

    return false;
}

const buttonClickUpdateAccount = () => {

    let newAccount = {
        firstName: document.getElementById("updateFirstName").value,
        lastName: document.getElementById("updateLastName").value,
        accountNumber: document.getElementById("updateAccountNumber").value
    }

    makeRequest("PUT", `http://localhost:8080/AccountSETemplate/api/account/updateAccount/${document.getElementById("updateId").value}`, JSON.stringify(newAccount))
        .then((resolve) => {
            console.log(resolve);
        })
        .catch(function (error) { console.log(error.message) })
    
    return false;
}

const buttonClickGetAllAccounts = () => {
    makeRequest("GET", `http://localhost:8080/AccountSETemplate/api/account/getAllAccounts`)
        .then((resolve) => {getAllAccounts(resolve)})
        .catch(function (error) { console.log(error.message) })
    
    return false;
}

function getAllAccounts(input) {

    allAccounts = JSON.parse(input);

    for (let i = 0; i < allAccounts.length; i++) {

        if (document.contains(document.getElementById("row" + allAccounts[i].id))) {
            document.getElementById("accountsTable").removeChild(document.getElementById("row" + allAccounts[i].id));
            }

        let newRow = document.createElement('TR');

        newRow.id = "row" + allAccounts[i].id;

        document.getElementById("accountsTable").appendChild(newRow);

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
}