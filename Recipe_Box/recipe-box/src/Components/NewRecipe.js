import React from 'react';

import 'bootstrap/dist/css/bootstrap.css';

export function NewRecipe (){
    return (
        <div>
            <input type="text" placeholder="Name"></input>
            <input type="text" placeholder="Ingredients"></input>
            <input type="text" placeholder="Description"></input>
        </div>
    );
}