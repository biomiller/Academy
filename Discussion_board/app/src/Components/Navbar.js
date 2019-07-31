import React, { Component } from 'react';

import {
    Navbar,
    NavbarBrand,
    NavItem,
    NavLink,
    Nav
} from 'reactstrap';

import { Login } from './Login.js';


import 'bootstrap/dist/css/bootstrap.css';

export class AppNavbar extends Component {

    render() {
        return (
            <div>
                <Navbar color="light" light expand="md">
                    <NavbarBrand>Discussion Board</NavbarBrand>
                    <NavbarBrand>Logged in as: {this.props.username}</NavbarBrand>
                    <Nav className="ml-auto">
                        <NavItem>
                            <NavLink ><Login login={this.props.login} /></NavLink>
                        </NavItem>
                    </Nav>
                </Navbar>
            </div>
        );
    }

}