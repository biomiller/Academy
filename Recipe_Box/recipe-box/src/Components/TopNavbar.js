import React from 'react';

import {
    Navbar,
    NavbarBrand,
    NavItem,
    NavLink,
    Nav,
    Button
} from 'reactstrap';
import { Link } from "react-router-dom";


import 'bootstrap/dist/css/bootstrap.css';

import { Searchbar } from "./Searchbar.js"

export function TopNavbar() {
    return (
        <div>
            <Navbar color="light" light expand="md">
                <NavbarBrand>Recipe Box</NavbarBrand>
                <NavbarBrand><Searchbar /></NavbarBrand>
                <Nav>
                    <NavItem>
                    <Link to={`/NewRecipe`}><Button>New Recipe</Button></Link>
                    </NavItem>
                </Nav>
            </Navbar>
        </div>
    );
}