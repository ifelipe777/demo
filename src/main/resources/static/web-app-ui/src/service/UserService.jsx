import axios from 'axios';

const USER_API_BASE_URL = 'http://localhost:8080/login';

class UserService {

    validateUser(user) {
        return axios.post(USER_API_BASE_URL + "/user", user);
    }

    findUser(username) {
        return axios.get(USER_API_BASE_URL + "/user/find/" + username);
    }
}

export default new UserService();