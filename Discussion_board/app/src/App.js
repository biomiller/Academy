import React, { Component } from 'react';

import { AppNavbar } from './Components/Navbar.js';
import { Content } from './Components/Content/Content.js';

import "./App.css";


class App extends Component {

  render() {
    return (
      <div className="Main">
        <AppNavbar />
        <Content />
      </div>
    );
  }

}


export default App;

