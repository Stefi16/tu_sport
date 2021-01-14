import axios from 'axios'

const API_URL = 'http://localhost:8080/students'

class StudentsService {
  getAllStudents () {
    return axios.get(API_URL)
  }

  findByName (firstName) {
    return axios.get(API_URL + '/search/name',
      {
        params: {
          firstName: firstName
        }
      })
  }

  deleteStudent (id) {
    return axios.delete(API_URL + '/delete',
      {
        params: {
          id: id
        }
      })
  }

  saveStudent (form) {
    return axios.put(API_URL + '/save',
      {
        id: form.id,
        firstName: form.firstName,
        lastName: form.lastName,
        email: form.email
      })
  }
}
export default new StudentsService()
