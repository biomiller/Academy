const express = require("express");
const app = express();
const bodyParser = require("body-parser");
const _ = require("lodash");

app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());


app.get("/", (req, res) => {
res.send("Hello World from Express");
});



app.post("/add", (req, res) => {
    let sum = req.body.num1 + req.body.num2;
    res.send(String(sum));
});

app.post("/array", (req, res) => {
    let arr = [req.body.num1, req.body.num2, req.body.num3];
    res.send(arr);
});

app.delete("/delete", (req, res) => {
    let arr = [0, 1, 2, 3, 4, 5 ,6, 7, 8];
    _.pullAt(arr,req.body.index)
    res.send(arr);
});    

app.put("/update", (req, res) => {
    let arr = [0, 1, 2];
    removed = _.set(arr,
        req.body.index,
        req.body.new)
    res.send(arr);
});


const port = process.env.PORT || 5000;

app.listen(port, () => console.log(`server running on port ${port}`));
