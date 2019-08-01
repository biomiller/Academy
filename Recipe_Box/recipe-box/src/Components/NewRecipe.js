import React from 'react';
import axios from "axios";


import 'bootstrap/dist/css/bootstrap.css';

export function NewRecipe(props) {

    let handleSubmit = (e) => {
        e.preventDefault();



        let name = e.target[0].value
        let ingredients = e.target[1].value
        let description = e.target[2].value
        let image = e.target[3].value

        let newRecipe = {
            name: name,
            ingredients: ingredients,
            description: description,
            image: image

        }

        axios
            .post("http://localhost:5000/recipe/createRecipe", newRecipe)
            .then(response => {
                props.getData();
                console.log("Added new recipe.")
            })
    }


    return (
        <div>
            <form onSubmit={handleSubmit}>
                <input type="text" placeholder="Name"></input>
                <input type="text" placeholder="Ingredients"></input>
                <input type="text" placeholder="Description"></input>
                <input type="text" placeholder="image"></input>
                <button type="submit">Submit</button>
            </form>
        </div>
    );
}