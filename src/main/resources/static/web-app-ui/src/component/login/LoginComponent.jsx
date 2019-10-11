import React, { Component } from 'react'
import UserService from "../../service/UserService";

class LoginComponent extends Component {

    constructor(props){
        super(props);
        this.state = {
            username: '',
            password: '',
            message: null
        }

        this.login = this.login.bind(this);
    }

    onChange = (e) =>
        this.setState({ [e.target.name]: e.target.value });

    login = (e) => {
        e.preventDefault();
        let user = {username: this.state.username,
            password: this.state.password
        }

        UserService.validateUser(user)
            .then(res => {
                this.setState({message: 'User validated successful.'});
                //this.props.history.push('/home');
            })
    }
    render() {
        return (
            <div>
                <h2 className="text-center"> Login </h2>
                <form>
                    <div className="form-group">
                        <label>User Name:</label>
                        <input type="text" placeholder="username" name="username" className="form-control"
                               defaultValue={this.state.username} onChange={this.onChange}/>
                    </div>
                    <div className="form-group">
                        <label>Password:</label>
                        <input placeholder="password" name="password" className="form-control"
                               value={this.state.password} onChange={this.onChange}/>
                    </div>
                    <button className="btn btn-success" onClick={this.login}>Log in</button>
                </form>
            </div>
        );
    }
}

export default LoginComponent;
