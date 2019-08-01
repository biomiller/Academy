import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Link } from "react-router-dom";
import axios from "axios";

import {
  Container,
  Row,
  Col
} from 'reactstrap';

import { TopNavbar } from "./Components/TopNavbar.js";
import { RecipeList } from "./Components/RecipeList.js";
import { RecipeView } from "./Components/RecipeView.js";
import { NewRecipe } from "./Components/NewRecipe.js";
import { UpdateRecipe } from "./Components/UpdateRecipe.js";




import './App.css';


class App extends Component {

  constructor() {
    super();
    this.state = {
      recipe: {
        _id: "",
        name: "",
        description: "",
        ingredients: [],
        image: ""
      },
      data: []
    }
  }


  getData = () => {
    axios
      .get("http://localhost:5000/recipe/all")
      .then(response => {
        this.setState({
          data: response.data.reverse()
        });
        console.log(this.state.data)
      });
  };

  setCurrentRecipe = (recipe) => {
    console.log(recipe);
    this.setState({
      recipe: {
        _id: recipe._id,
        name: recipe.name,
        description: recipe.description,
        ingredients: recipe.ingredients,
        image: recipe.image
      }
    })
  }

  componentDidMount = () => {
    this.getData()
  }


  render() {
    return (
      <div>
        <Router>
          <Row>
            <TopNavbar />

            <br></br>
          </Row>
          <Row>
            <Col md="3">
              <RecipeList data={this.state.data} setCurrentRecipe={this.setCurrentRecipe} />
            </Col>

            <Col >
              <Route exact path={`/recipe/:${this.state.recipe._id}`} render={() => <RecipeView recipe={this.state.recipe} getData={this.getData} />} />
              <Route exact path={`/recipe/:${this.state.recipe._id}/update`} render={() => <UpdateRecipe recipe={this.state.recipe} getData={this.getData} />} />
              <Route exact path={`/NewRecipe`} render={() => <NewRecipe getData={this.getData} />} />
            </Col>
            </Row>

        </Router>
      </div>
          );
        }
      }
      
      export default App;
