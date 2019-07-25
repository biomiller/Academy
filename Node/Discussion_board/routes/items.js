const express = require("express");
const _ = require("lodash");
const router = express.Router();

// db array
let db = [];

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
    res.send(db);
});

// @route POST items/addItem
// @desc add item to db array
// @access Public
router.post("/addItem", (req, res) => {
    let newItem = {
        "username":req.body.username, 
        "content":req.body.content
    };
    // add field to object
    // newItem.test = "stringtest";

    // appends to end of array
    db.push(newItem);
    res.status(200).send(db);
});

// @route PUT items/updateItem
// @desc updates the first item in db array
// @access Public
router.put("/updateItem", (req, res) => {
    _.set(db, 0, req.body.item);
    //_.set(db, req.body.index, req.body.item);
    res.status(200).send(db);
});

// @route PUT items/updateItem
// @desc updates the first item in db array
// @access Public
router.delete("/deleteItem", (req, res) => {
    _.pullAt(db, 0);
    res.status(200).send(db);
});

module.exports = router;




// // UPDATE
// app.put("/update",(req,res) => {
//     let personRecord = {
//         firstName: "Bob",
//         lastName: "Builder",
//         age: "78",
//         occupation: "Builder"
//     }
//     let personRecord2 = {
//        firstName: "Bobby",
//        lastName: "Labourer",
//        age: "43",
//        occupation: "Manual Labourer"
//    }
//     let array = [personRecord,personRecord2];
//     let item = array[1];
//     lodash.set(item, "firstName", req.body.firstName);
//     res.send(array);
//   })