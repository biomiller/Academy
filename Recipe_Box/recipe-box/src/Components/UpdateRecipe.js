import React from 'react';
import axios from "axios";

import { Link } from "react-router-dom";

import 'bootstrap/dist/css/bootstrap.css';


export function UpdateRecipe(props) {

    let handleSubmit = (e) => {

        e.preventDefault();

        let newRecipe = {
            _id: props.recipe._id,
            name: e.target[0].value,
            ingredients: e.target[1].value,
            description: e.target[2].value,
            image: e.target[3].value
        }

        console.log(newRecipe)

        axios
            .put("http://localhost:5000/recipe/updateRecipe", { data: newRecipe })
            .then(response => {
                props.getData();
                console.log("Updated recipe.")
            })
            .catch(() => { console.log("Not updated.") })
    }

    return (
        <div>
            <form onSubmit={handleSubmit} >
                <input name="name" type="text" defaultValue={props.recipe.name}></input>
                <input name="ingredients" type="text" defaultValue={props.recipe.ingredients}></input>
                <input name="description" type="text" defaultValue={props.recipe.description}></input>
                <input name="image" type="text" defaultValue={props.recipe.image}></input>
                <button type="submit">Update</button>
                <Link to={`/recipe/${props.recipe._id}`} ></Link>
            </form>
        </div>
    );
}
