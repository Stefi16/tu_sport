import axios from 'axios'

const API_URL = 'http://localhost:8080/teachers'

class TeacherService {
  getAllTeachers () {
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

  deleteTeacher (id) {
    return axios.delete(API_URL + '/delete',
      {
        params: {
          id: id
        }
      })
  }

  findById (id) {
    return axios.get(API_URL + '/id',
      {
        params: {
          id: id
        }
      })
  }

  saveTeacher (form) {
    return axios.post(API_URL + '/save',
      {
        id: form.id,
        firstName: form.firstName,
        lastName: form.lastName,
        email: form.email,
        characteristic: form.characteristic
      })
  }
}
export default new TeacherService()
