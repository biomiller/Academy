import React from 'react';

import {
    Navbar,
    NavbarBrand,
    NavItem,
    NavLink,
    Nav,
    Button
} from 'reactstrap';

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
                        <Button href="/NewRecipe">New Recipe</Button>
                    </NavItem>
                </Nav>
            </Navbar>
        </div>
    );
}