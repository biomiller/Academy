import React, {Component} from 'react';

export default class FormTest extends Component {
  
    constructor(props) {
        super(props);
        this.state = {
          first: '',
            last: ''
        }
      }
    
    handleSubmit = (event) => {
      event.preventDefault();
      this.setState({
          first: this.firstNode.value,
          last: this.lastNode.value
        });
    }
    
    render() {
      return (
        <div>
          <h1>FormTest.js</h1>
          <form name ="form" onSubmit={this.handleSubmit}>
             <p>First Name</p>
             <input name="first" ref={node => (this.firstNode = node)}/>
             <p>Last Name</p>
             <input name="last" ref={node => (this.lastNode = node)}/>
             <br />
             <button type="submit">Submit</ button>
          </ form>
          <p name="suppliedFirst">{this.state.first}</p>
          <p name="suppliedLast">{this.state.last}</p>
        </div>
      )
    }
  }
  