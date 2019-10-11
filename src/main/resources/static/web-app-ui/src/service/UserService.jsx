import axios from 'axios';

const USER_API_BASE_URL = 'http://localhost:8080/login';

class UserService {

    validateUser(user) {
        return axios.post(USER_API_BASE_URL + "/user", user);
    }
}

export default new UserService();