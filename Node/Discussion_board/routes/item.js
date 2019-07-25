const express = require("express");
const _ = require("lodash");
const router = express.Router();
const mongoose = require("mongoose");
const Item = require("../models/item.js");
const validateUsername = require("../utils/validators/Item.js")
const bcrypt = require("bcrypt");



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
    Item.find({}, '-email')
        .then(items => {
            if (!items) {
                errors.noItems = "There are no items";
                res.status(404).json(errors);
            }
            res.json(items);
        })
        .catch(err => res.status(404).json({ noItems: "There are no items" }));
});

// @route GET items/getItem
// @desc get an item matching a username
// @access Public
router.get("/getItem/:username", (req, res) => {
    const errors = {};

    Item.findOne({ "username": req.params.username })
        .then(item => {
            if (!item) {
                errors.noItems = "Item not found";
                res.status(404).json(errors);
            }
            res.json(item);
        })
        .catch(err => res.status(404).json({ noItems: "Item not found" }));
});

// @route POST items/addItem
// @desc add item to db array
// @access Public
router.post("/addItem", (req, res) => {

    // let vu = validateUsername(req.body);

    let { isValid, errors } = validateUsername(req.body);

    if (isValid) {

        let newItem = new Item({
            username: req.body.username,
            content: req.body.content,
            email: req.body.email
        });

        bcrypt.hash(req.body.email, 10)
            .then((hash) => {
                newItem.email = hash
                newItem.save()
                res.status(200).send("Added new Item")
            })
            .catch(err => res.status(404).json({ noItems: "Item not added." }))

    } else {
        res.status(404).send(errors.username)
    }

});

// @route PUT items/updateItem
// @desc updates the first item matching a given username
// @access Public
router.put("/updateItem", (req, res) => {
    //const errors = {};

    //let vu = validateUsername(req.body);

    let { isValid, errors } = validateUsername(req.body);

    if (isValid) {

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

    } else {
        res.status(404).send(errors.username)
    }
});

// @route PUT items/updateManyItems
// @desc updates all items matching a given username
// @access Public
router.put("/updateManyItems", (req, res) => {
    const errors = {};

    let vu = validateUsername(req.body);

    if (vu.isValid) {
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

    } else {
        res.status(404).send(vu.errors.username)
    }
});


// @route DELETE items/deleteItem
// @desc deletes an item matching a username
// @access Public
router.delete("/deleteItem", (req, res) => {

    Item.findOne({ "username": req.body.username })
        .then((item) => bcrypt.compare(req.body.email, item.email))
        .then(match => {
            if (match) {
                Item.deleteOne({ "username": req.body.username })
                    .then((ok) => {
                        if (ok.n == 0) {
                            res.status(200).send("Item not deleted")
                        } else {
                            res.status(200).send("Item deleted")
                        }

                    })
            }
        }
        )
        .catch(err => res.status(404).json({ noItems: "Item not deleted." }))
})


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