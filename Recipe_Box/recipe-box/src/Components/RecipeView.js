import React from 'react';
import axios from "axios";

import { Link } from "react-router-dom";



import {
    Col
} from 'reactstrap';

import 'bootstrap/dist/css/bootstrap.css';

export function RecipeView(props) {

    let handleClick = () => {

        let payload = {
            _id: props.recipe._id,
        };

        axios
            .delete("http://localhost:5000/recipe/deleteRecipe", { data: payload })
            .then(() => {
                console.log("Deleted");
                props.getData();

            })
            .catch(() => {
                alert("Not deleted.");
            });
    }

    return (

        <Col sm={{ size: "9", offset: 1 }}>
            <h1>{props.recipe.name}</h1>
            <img alt={props.recipe.name} src={props.recipe.image} width="400" height="400" />
            <h3>{props.recipe.ingredients}</h3>
            <p>{props.recipe.description}</p>
            <Link to={`/`}><button onClick={handleClick}>Delete</button></Link>
            <Link to={`/recipe/${props.recipe._id}/update`}><button>Update</button></Link>
        </Col>

    );
}

