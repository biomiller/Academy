import React from 'react';
import { RecipeLink } from './RecipeLink.js';


export function RecipeList(props) {

  return (
    <div>
      {props.data.map(recipe => (
        <RecipeLink
          key={recipe._id}
          recipe={recipe}
          setCurrentRecipe={props.setCurrentRecipe}
        />
      ))
      }
    </div>

  );
}