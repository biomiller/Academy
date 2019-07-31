import React from 'react';
import axios from "axios";
import { string } from 'prop-types';


import 'bootstrap/dist/css/bootstrap.css';

export function Item(props) {


    Item.propTypes = {
        username: string.isRequired,
        email: string.isRequired
    }

    Item.defaultProps = {
        username: "Guest",
        email: "email@mail.com"
    }

    let handleClick = () => {

        let payload = {
            _id: props.data._id,
            username: props.username,
            email: props.email
        };

        if (props.data.username === props.username) {

            console.log(payload);

            axios
                .delete("http://localhost:5000/item/deleteItem", { data: payload })
                .then(() => {
                    console.log("Deleted");
                    props.getAllItems();
                    
                })
                .catch(() => {
                    alert("Not your account!");
                });
        } else {
            alert("Not your account!");
        }

    };

    return (
        <div>
            <br></br>
            <h2>{props.data.username}</h2>
            <p>{props.data.content}</p>
            <button onClick={handleClick}>Delete</button>
            <br></br>
        </div>

    );


}