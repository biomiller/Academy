import React from 'react';

import 'bootstrap/dist/css/bootstrap.css';

export function Searchbar (){
    return (
        <div>
            <input type="text" placeholder="Search Ingredients"></input>
            <button>Submit</button>
        </div>
    );
}