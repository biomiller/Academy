const express = require("express");
const _ = require("lodash");
const router = express.Router();
const mongoose = require("mongoose");
const Item = require("../models/item.js");



// @route GET items/test
// @desc Tests items route
// @access Public
router.get("/test", (req, res) => {
    res.send("This is a test!");
});

// @route GET items/getAll
// @desc get all items in db array
// @access Public
router.get("/getAll", (req, res) => {
    const errors = {};
    Item.find()
        .then(items => {
            if (!items) {
                errors.noItems = "There are no items";
                res.status(404).json(errors);
            }
            res.json(items);
        })
        .catch(err => res.status(404).json({ noItems: "There are no items" }));
});

// @route POST items/addItem
// @desc add item to db array
// @access Public
router.post("/addItem", (req, res) => {
    const errors = {};
    let newItem = new Item({
        username: req.body.username,
        content: req.body.content
    });

    newItem.save()
        .then(() => res.status(200).send("Added new Item"))
        .catch(err => res.status(404).json({ noItems: "Item not added." }))

});

// @route PUT items/updateItem
// @desc updates the first item matching a given username
// @access Public
router.put("/updateItem", (req, res) => {
    const errors = {};
    Item.updateOne(
        { "username": req.body.username },
        {
            $set: {
                "content": req.body.content,
                "username": req.body.newUserName
            },
        }
    )
        .then(() => res.status(200).send("Item updated"))
        .catch(err => res.status(404).json({ noItems: "Item not updated." }))

});

// @route PUT items/updateItem
// @desc updates all items matching a given username
// @access Public
router.put("/updateManyItems", (req, res) => {
    const errors = {};
    Item.updateMany(
        { "username": req.body.username },
        {
            $set: {
                "content": req.body.content,
                "username": req.body.newUserName
            }
        }
    )
        .then(() => res.status(200).send("Items updated"))
        .catch(err => res.status(404).json({ noItems: "Items not updated." }))

});


// @route DELETE items/deleteItem
// @desc deletes an item matching a username
// @access Public
router.delete("/deleteItem", (req, res) => {

    Item.deleteOne({ "username": req.body.username })
        .then(() => res.status(200).send("Items deleted"))
        .catch(err => res.status(404).json({ noItems: "Items not deleted." }))

});


// @route DELETE items/deleteManyItems
// @desc deletes all items matching a given username
// @access Public
router.delete("/deleteManyItems", (req, res) => {

    Item.deleteMany({ "username": req.body.username })
        .then(() => res.status(200).send("Items deleted"))
        .catch(err => res.status(404).json({ noItems: "Items not deleted." }))

});


// @route DELETE items/deleteManyItems
// @desc deletes all items
// @access Public
router.delete("/deleteAllItems", (req, res) => {

    Item.deleteMany({})
        .then(() => res.status(200).send("All Items deleted"))
        .catch(err => res.status(404).json({ noItems: "Items not deleted." }))

});

module.exports = router;