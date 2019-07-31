import React, { Component } from 'react';
import { Button, Form, FormGroup, Label, Input, Dropdown, DropdownToggle, DropdownMenu } from 'reactstrap';

export class Login extends Component {

    constructor(props) {
        super(props);
        this.state = {
            dropdownOpen: false
        };
    }

    toggle = () => {
        this.setState(prevState => ({
            dropdownOpen: !prevState.dropdownOpen
        }));
    }

    handleSubmit = (e) => {
        e.preventDefault();
    
        let username = e.target[0].value;
        let email = e.target[1].value;

        this.props.login(username,email);

    }

    render() {
        return (
            <div>
                <Dropdown isOpen={this.state.dropdownOpen} toggle={this.toggle} inNavbar='true' direction='left'>
                    <DropdownToggle nav caret>
                        Login
                    </DropdownToggle>
                    <DropdownMenu>

                        <Form inline onSubmit={this.handleSubmit}>
                            <FormGroup className="mb-2 mr-sm-2 mb-sm-0">
                                <Label for="exampleUsername" className="mr-sm-2"> Username</Label>
                                <Input required type="username" name="username" id="exampleUsername" placeholder="username" />
                            </FormGroup>
                            <FormGroup className="mb-2 mr-sm-2 mb-sm-0">
                                <Label for="exampleEmail" className="mr-sm-2">Email</Label>
                                <Input required type="email" name="email" id="exampleEmail" placeholder="something@idk.cool" />
                            </FormGroup>
                            <Button type="submit">Submit</Button>
                        </Form>

                    </DropdownMenu>
                </Dropdown>
            </div>
        );
    }
}