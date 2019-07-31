import React from 'react';
import axios from "axios";

export function NewItem(props) {

  let handleSubmit = (e) => {
    e.preventDefault();

    if (props.username !== "Guest") {

      let content = e.target[0].value

      let newItem = {
        username: props.username,
        content: content,
        email: props.email
      }

      axios
        .post("http://localhost:5000/item/addItem", newItem)
        .then(response => {
          props.getAllItems()
          console.log("Added new item.")
        })
    } else {
      alert("Guests cannot post. Please login to post.")
    }
  };



let handleChange = (e) => { };


return (
  <div>
    New Item
      <form onSubmit={handleSubmit}>
      <textarea
        required
        cols="40"
        rows="10"
        type="text"
        placeholder="Content"
        onChange={handleChange} />
      <input type="submit" value="Submit" />
    </form>
  </div>
)


}