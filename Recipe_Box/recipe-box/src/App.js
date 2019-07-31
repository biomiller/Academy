import React, { Component } from 'react';

import {
  Container,
  Row,
  Col
} from 'reactstrap';

import { TopNavbar } from "./Components/TopNavbar.js";
import { RecipeLink } from "./Components/RecipeLink.js";

import './App.css';


class App extends Component {

  render() {
    return (
      <div>
        <TopNavbar />
        <br></br>
        <RecipeLink name={"Test"} />
        <RecipeLink />
      </div>
    );
  }
}

export default App;
