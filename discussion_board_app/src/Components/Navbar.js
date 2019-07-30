import React, { Component } from 'react';

import {
    Navbar,
    NavbarBrand,
    NavItem,
    NavLink,
    Nav
} from 'reactstrap';


import 'bootstrap/dist/css/bootstrap.css';

export class AppNavbar extends Component {

    render() {
        return (
            <div>
                <Navbar color="light" light expand="md">
                    <NavbarBrand>Discussion Board</NavbarBrand>
                    <Nav className="ml-auto">
                        <NavItem>
                            <NavLink href="#">Sign Up</NavLink>
                        </NavItem>
                        <NavItem>
                            <NavLink href="#">Login</NavLink>
                        </NavItem>
                    </Nav>
                </Navbar>
            </div>
        );
    }

}