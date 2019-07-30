import React, { Component } from 'react';
import {
    Container,
    Row,
    Col
} from 'reactstrap';

import { AllDiscussions } from './AllDiscussions.js';
import { NewItem } from './NewItem.js';
import { ItemList } from './ItemList.js';


export class Content extends Component {

    render() {
        return (
            <div >
                <Container>
                    <Row>
                        <Col xs="3">
                            <AllDiscussions />
                        </Col>
                        <Col xs="6">
                            <ItemList />
                        </Col>
                        <Col xs="3">
                            <NewItem />
                        </Col>
                    </Row>

                </Container>
            </div>
        );
    }



}
