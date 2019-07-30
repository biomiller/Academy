import React, { Component } from 'react';
import {
    Container,
    Row,
    Col
} from 'reactstrap';

import { Discussion } from './Discussion.js';

import 'bootstrap/dist/css/bootstrap.css';

export class AllDiscussions extends Component {

    render() {
        return (

            <Container>
                <Row>
                    <Col>
                        Discussion 1
                        Discussion 2
                    </Col>
                </Row>
            </Container>

        );
    }

}