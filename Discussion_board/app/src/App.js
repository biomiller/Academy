import React, { Component } from 'react';

import axios from "axios";

import {
  Container,
  Row,
  Col
} from 'reactstrap';
import "./App.css";


import { AppNavbar } from './Components/Navbar.js';
import { NewItem } from './Components/Content/NewItem.js';
import { ItemList } from './Components/Content/ItemList.js';



class App extends Component {

  constructor() {
    super();
    this.state = {
      username: "Guest",
      email: "",
      data: []
    }
  }

  login = (username, email) => {
    this.setState({
      username:username,
      email:email
    })
    console.log("Logged in as: " + this.state.username)
  }

  getAllItems = () => {
    axios
      .get("http://localhost:5000/item/getAll")
      .then(response => {
        this.setState({
          data: response.data.reverse()
        });
        console.log(this.state.data)
      });
  };


  componentDidMount = () => {
    this.getAllItems()
  }


  render() {
    return (
      <div >
        <AppNavbar login={this.login} username={this.state.username}/>
        <Container>
          <Row>
            <Col xs="6">
              <ItemList email={this.state.email} username={this.state.username} data={this.state.data} getAllItems={this.getAllItems} />
            </Col>
            <Col xs="3">
              <br></br>
              <NewItem email={this.state.email} username={this.state.username} getAllItems={this.getAllItems} />
            </Col>
          </Row>

        </Container>
      </div>
    );
  }

}


export default App;

