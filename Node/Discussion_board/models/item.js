const mongoose = require("mongoose");
const Schema = mongoose.Schema;

const itemSchema = new Schema(
    {
        username:
        {
            type: String,
            required: true
        },
        content:
        {
            type: String,
            required: true
        },
        email:
        {
            type: String,
            required: true
        }
    }
);

const Item = mongoose.model('Item', itemSchema);

module.exports = Item;