import React, { Component } from 'react';

export class ContentTest extends Component {

    constructor() {
        super();
        this.state = {
            count: 0
        }
    }



    tickUp = () => {
        this.setState({
            count: this.state.count + 1
        })
    }
    render() {
        return (
            <div>
                <h2>Look at me i'm content!</h2>
                <button name="addOne" onClick={this.tickUp}>{this.state.count}</button>
            </div>
        );
    }

}
