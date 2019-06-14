
function makeRequest(method, url, body) {

    return new Promise(
        
        (resolve, reject) => {

        const req = new XMLHttpRequest();

        req.onload = () => {

            if (req.status >= 200 && req.status <= 299) {
                resolve(req.responseText);
            }
            else {
                console.log(req.responseText)
                const reason = new Error("Rejected");
                reject(reason);
            }
        }
        req.open(method, url);
        req.setRequestHeader('Content-Type', 'application/json');
        req.send(body);
    });
    
}


const addOwner = () => {

    let newOwner = {
        address: document.getElementById("address").value,
        city: document.getElementById("city").value,
        telephone: document.getElementById("telephone").value,
        firstName: document.getElementById("firstName").value,
        lastName: document.getElementById("lastName").value,
        id: document.getElementById("owner_id").value,
    }

    makeRequest("POST", "http://localhost:9966/petclinic/api/owners", JSON.stringify(newOwner))
        .then((resolve) => {
            console.log(resolve);
        })
        .catch(function (error) { console.log(error.message) });

    return false;
}


