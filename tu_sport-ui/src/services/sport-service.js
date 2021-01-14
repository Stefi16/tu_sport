import axios from 'axios'

const API_URL = 'http://localhost:8080/sports'

class SportService {
  getAllSports () {
    return axios.get(API_URL)
  }
}
export default new SportService()
