import React from 'react';

import {Link} from "react-router-dom";

import 'bootstrap/dist/css/bootstrap.css';

RecipeLink.defaultProps = {
    name: "Recipe"
};

export function RecipeLink(props) {

    let handleClick = () => {
        props.setCurrentRecipe(props.recipe)
    };

    return (
        
        <Link to={`/recipe/${props.recipe._id}`} onClick={handleClick}><h2>{props.recipe.name}</h2></Link>

    );
}

