<template>
  <div class="teachers">
    <b-container>
      <b-row>
      <b-col cols="5"
      class="bar">
        <b-form-input v-model="filters.firstName" placeholder="Търси по име"></b-form-input>
      </b-col>
      <b-col style="padding-right: 572px">
        <b-button variant="info"
        v-on:click="searchTeachers">Търси</b-button>
      </b-col>
      </b-row>
      <b-table class = "table"
        id="teachersTable"
        striped hover
        :items="content"
        :fields="fields"
        bordered
        table-variant="light">
        <template v-slot:cell(actions)="row">
          <router-link :to="{name: 'TeachersTab', params: {id: row.item.id } }" class="btn-outline-dark">Информация</router-link>
          |
          <b-button
            variant="danger"
            v-on:click="deleteTeacher(row.item.id)">Изтрий</b-button>
        </template>
      </b-table>
    </b-container>
  </div>
</template>

<script>
import TeacherServices from '../services/teacher-service.js'
export default {
  name: 'Teachers',
  components: {
  },
  data () {
    return {
      message: '',
      content: [{ id: '', firstName: '', lastName: '', email: '' }],
      fields: [
        { key: 'firstName', label: 'Име' },
        { key: 'lastName', label: 'Фамилия' },
        { key: 'email', label: 'Имейл' },
        { key: 'actions', label: 'Действия' }
      ],
      filters: {
        firstName: ''
      }
    }
  },
  mounted () {
    this.loadTeachers()
  },
  methods: {
    searchTeachers () {
      TeacherServices.findByName(this.filters.firstName.toLowerCase()).then(
        responce => {
          console.log(responce)
          this.content = responce.data
        },
        error => {
          this.content =
          (error.response() && error.response.data) ||
          error.message ||
          error.ToString()
        }
      )
    },
    deleteTeacher (id) {
      TeacherServices.deleteTeacher(id).then(
        responce => {
          this.loadTeachers()
        }
      )
    },
    loadTeachers () {
      TeacherServices.getAllTeachers().then(
        response => {
          console.log(response)
          this.content = response.data
        },
        error => {
          this.content =
            (error.response && error.response.data) ||
            error.message ||
            error.toString()
        }
      )
    }
  }
}
</script>

<style scoped>
.teachers {
  padding-top: 80px;
  padding-bottom: 450px;
  font-weight: bold;
  background-image: url("https://media.discordapp.net/attachments/788074443574214696/799248307770621982/m7.jpg?width=1106&height=622");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
.table {
  background-image: url("../assets/table2.jpg");
}
.bar {
  padding-bottom: 30px;
}
</style>
