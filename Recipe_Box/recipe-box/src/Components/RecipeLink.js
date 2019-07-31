import React from 'react';

import {
    BrowserRouter as Router,
    Route,
    Link
} from "react-router-dom";

import {
    Container,
    Row,
    Col
} from 'reactstrap';

import 'bootstrap/dist/css/bootstrap.css';

RecipeLink.defaultProps = {
    name:"Recipe"
};

export function RecipeLink(props) {

    return (
            <Row>
                <Col sm={{ size: "3", offset: 1 }}>
                    <Router>
                        <Link to="/"><h3>{props.name}</h3></Link>
                        {/* <Route path="/recipe1" component {} */}
                    </Router>
                </Col>
            </Row>
    );
}

