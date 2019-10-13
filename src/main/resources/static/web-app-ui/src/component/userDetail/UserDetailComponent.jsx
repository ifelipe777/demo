import React, { Component } from 'react'
import UserService from "../../service/UserService";

class UserDetailComponent extends Component {

    constructor(props) {
        super(props);
        this.state = {
            username: '',
            password: '',
            message: null
        }

        this.loadUser = this.loadUser.bind(this);
    }

    componentDidMount() {
        this.loadUser();
    }

    onChange = (e) =>
        this.setState({ [e.target.name]: e.target.value });

    loadUser() {
        UserService.findUser(window.localStorage.getItem("username"))
            .then(res => {
                let user = res.data;
                this.setState({
                    username: user.username,
                })
            })
    }

    render(){
        return (
            <div>
                <h2 className="text-center">User detail</h2>
                <div className="form-group">
                    <label>User Name:</label>
                    <label>{this.state.username} </label>
                </div>
            </div>
        )
    }
}

export default UserDetailComponent;