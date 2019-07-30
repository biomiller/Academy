import React, { Component } from 'react';
import { Button } from "reactstrap";
import axios from "axios";

export class ItemList extends Component {

    constructor() {
        super();
        this.state = {
          data: ""
        }
      }

    render() {
        return (
            <div>
                <Button padding="10px" outline={true} onClick={this.makeRequest}>Get Items</Button>
                <p>{this.state.data}</p>
            </div>

        );
    }

    makeRequest = () => {
        axios
          .get("http://localhost:5000/item/getAll")
          .then(response => {
            this.setState({
              data: response.data
            });
          });
      };

}