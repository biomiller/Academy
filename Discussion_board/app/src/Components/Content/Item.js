import React, { Component } from 'react';


import 'bootstrap/dist/css/bootstrap.css';

export class Item extends Component {

    render() {
        return (
            <div>
                <h1>{this.props.data.username}</h1>
                <p>{this.props.data.content}</p>
            </div>

        );
    }

}