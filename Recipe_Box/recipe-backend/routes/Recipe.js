const express = require("express");
const router = express.Router();

const Recipe = require("../models/recipe");

// @route   GET recipe/all
// @desc    Get all recipes
// @access  Public
router.get("/all", (req, res) => {
  const errors = {};
  Recipe.find({})
    .then(recipes => {
      if (!recipes) {
        errors.noRecipes = "There are no recipes";
        res.status(404).json(errors);
      }

      res.json(recipes);
    })
    .catch(err => res.status(404).json({ noRecipes: "There are no recipes" }));
});

// @route   GET recipe/name
// @desc    Get all recipes from one name
// @access  Public
router.get("/name", (req, res) => {
  const errors = {};
  Recipe.find({ name: req.body.name })
    .then(recipes => {
      if (!recipes) {
        errors.noRecipes = "There are no recipes";
        res.status(404).json(errors);
      }
      res.json(recipes);
    })
    .catch(err => res.status(404).json({ noRecipes: "There are no recipes" }));
});

// @route   POST recipe/createrecipe
// @desc    Create an recipe
// @access  Public
router.post("/createRecipe", (req, res) => {
  
  const newRecipe = new Recipe({
    name: req.body.name,
    description: req.body.description,
    ingredients: req.body.ingredients,
    image: req.body.image
  });

  newRecipe.save().then(recipe => res.json(recipe))
        .catch(err => console.log(err));

});

// @route   PUT recipe/updaterecipe
// @desc    Update first recipe
// @access  Public
router.put("/updateRecipe", (req, res) => {

  const newRecipe = new Recipe({
    name: req.body.name,
    description: req.body.description,
    ingredients: req.body.ingredients,
    image: req.body.image
  });

  Recipe.findOne({_id:req.body._id})
    .then(recipe => {
      if (!recipe) {
        errors.noRecipe = "There are no recipes with this ID";
        res.status(404).json(errors);
      }

      Recipe
        .remove({_id:req.body._id})
        .then(() => {
          res.json({ success: true });
        })
        .catch(err =>
          res.status(404).json({ recipenotfound: "No recipe found" })
        );

      newRecipe.save().then(recipe => res.json(recipe))
        .catch(err => console.log(err));

    })
    .catch(err => res.status(404).json(err));

});

// @route   DELETE recipe/deleterecipe
// @desc    Delete first recipe
// @access  Public
router.delete("/deleteRecipe", (req, res) => {

  let errors = {};

  const _id = req.body._id;

  Recipe.findById(_id).then(recipe => {

        Recipe
          .remove({_id:_id})
          .then(() => {
            res.json({ success: true });
          })
          .catch(err =>
            res.status(404).json({ recipenotfound: "No recipe found" })
          );

      } 

  ).catch(err => res.status(404).json({ norecipe: "There is no recipe with this ID" }));

});

module.exports = router;
