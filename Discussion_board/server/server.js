const express = require("express");
const app = express();
const bodyParser = require("body-parser");
const mongoose = require("mongoose");

const item = require("./routes/item.js");

// letting app use json
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());


// ports
const port = process.env.PORT || 5000;
app.listen(port, () => console.log(`server running on port ${port}`));


// routes
app.use("/item", item);

// mongoose

// connect to a locally running mongo database
let URI = 'mongodb://localhost:27017/example';
let OPTS = { useNewUrlParser: true };
mongoose.connect(URI, OPTS)
    .then(
        () => { console.log("It's working, for now...") },
        (err) => { console.log("I'm terribly sorry, I cannot find your mongoose.") }
    );
