const mongoose = require("mongoose");

const Schema = mongoose.Schema;

const RecipeSchema = new Schema({

  name: {
    type: String,
    required: true
  },
  description: {
    type: String,
    required: true
  },
  ingredients: {
    type: Array
  },
  image: {
    type: String
  }
});

module.exports = Item = mongoose.model("recipes", RecipeSchema);
