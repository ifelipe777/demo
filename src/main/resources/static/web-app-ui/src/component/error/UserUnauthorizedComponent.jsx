import React, { Component } from 'react'

class UserUnauthorizedComponent extends Component {

    render() {
        return (
            <div>
                <h2 className="text-center"> Unauthorized access </h2>

                <p style={{textAlign:"center"}}>
                    <link to="/">Go to login page </link>
                </p>
            </div>
        );
    }
}

export default UserUnauthorizedComponent;