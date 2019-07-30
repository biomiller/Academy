import React, { Component } from 'react';
import {
  Container,
  Row,
  Col
} from 'reactstrap';

export class NewItem extends Component {

  render() {
    return (
      <div>
        New Item
        <form onSubmit={this.handleSubmit}>
                    <input 
                        type="text" 
                        placeholder="Content" 
                        onChange="" />
                    <input type="submit" value="Submit" />
                </form>
      </div>
    );
  }

}