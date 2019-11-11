import React from 'react';
import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import LoginComponent from "./component/login/LoginComponent";
import UserDetailComponent from "./component/userDetail/UserDetailComponent";
import UserUnauthorizedComponent from "./component/error/UserUnauthorizedComponent";

function App() {
  return (
    <div className = "container">
      <Router>
        <div className="col-md-6">
          <h1 className="text-center" style={style}> React User Application </h1>
          <Switch>
            <Route path="/" exact component={LoginComponent} />
            <Route path="/user-detail" component={UserDetailComponent} />
          </Switch>
        </div>
      </Router>
    </div>
  );
}

const style = {
  color: 'red',
  margin: '10px'
}
export default App;
