<template>
<div class="students">
  <b-container>
    <b-row class="input">
      <b-col cols="5">
        <b-form-input v-model="filters.firstName" placeholder="Въведи име"></b-form-input>
      </b-col>
      <b-col style="padding-right: 572px">
        <b-button pill variant="secondary"
        v-on:click="searchStudents">Търси</b-button>
      </b-col>
    </b-row>
    <b-table class = 'table'
             :items="content"
             :fields="fields"
             fixed
             striped hover
             bordered>
      <template v-slot:cell(actions)="row">
        <b-button variant="outline-secondary" v-on:click="deleteStudent(row.item.id)">Изтрий</b-button>
      </template>
    </b-table>
  </b-container>
</div>
</template>

<script>
import StudentsServices from '@/services/student-service'

export default {
  name: 'Students',
  data () {
    return {
      content: [{ id: ' ', firstName: ' ', lastName: ' ', email: ' ' }],
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
    this.loadStudents()
  },
  methods: {
    loadStudents () {
      StudentsServices.getAllStudents().then(
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
    },
    searchStudents () {
      StudentsServices.findByName(this.filters.firstName.toLowerCase()).then(
        response => {
          console.log(response)
          this.content = response.data
        }
      )
    },
    deleteStudent (id) {
      StudentsServices.deleteStudent(id).then(
        response => {
          console.log(response.data)
          this.loadStudents()
        }
      )
    }
  }
}
</script>

<style scoped>
.students {
  padding-top: 80px;
  padding-bottom: 600px;
  font-weight: bold;
  background-image: url("https://media.discordapp.net/attachments/660572052255670273/798590596658102311/students5.jpg?width=611&height=611");
  background-repeat: no-repeat;
  background-size: cover;
}
.table {
  background-image: url("https://media.discordapp.net/attachments/660572052255670273/798590627004022834/b.jpg");
  background-size: cover;
  color: navy;
}
.input {
  padding-bottom: 40px;
}
</style>
