const express = require("express");
const mongoose = require("mongoose");
const bodyParser = require("body-parser");

const recipe = require("./routes/recipe");

const app = express();

app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

const db = require("./config/keys").mongoURI;

mongoose
  .connect(db)
  .then(() => console.log("Connected to MongoDB"))
  .catch(err => console.log(err));

app.use("/recipe", recipe);

const port = process.env.PORT || 5000;

app.listen(port, () => console.log(`server running on port ${port}`));
