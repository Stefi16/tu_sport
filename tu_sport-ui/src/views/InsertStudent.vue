<template>
<div class="students">
  <b-jumbotron
    class="saveStudent">
    <b-container>
      <h1 style="margin-bottom: 30px">
        {{message}}
      </h1>
      <b-form-input
        v-model="form.firstName"
        placeholder="Въведи име">
      </b-form-input>
      <b-form-input
        v-model="form.lastName"
        placeholder="Въведи фамилия"
        style="margin-top: 30px">
      </b-form-input>
      <b-form-input
        v-model="form.email"
        placeholder="Въведи имейл"
        style="margin-top: 30px">
      </b-form-input>
      <b-button
        style="margin-top: 30px"
        variant="outline-secondary"
        v-on:click="saveStudent">
        Въведи
      </b-button>
    </b-container>
  </b-jumbotron>
</div>
</template>

<script>
import StudentsServices from '../services/student-service.js'
export default {
  name: 'InsertStudent',
  components: {
  },
  data () {
    return {
      message: 'Въвеждане: ',
      form: {
        id: '',
        firstName: '',
        lastName: '',
        email: ''
      }
    }
  },
  methods: {
    saveStudent () {
      StudentsServices.saveStudent(this.form).then(
        response => {
          this.message = response.data.message
        }
      )
    }
  }
}
</script>

<style scoped>
.students {
  padding-top: 120px;
  padding-bottom: 800px;
  padding-left: 400px;
  padding-right: 400px;
  font-weight: bold;
  background-image: url("https://media.discordapp.net/attachments/788074443574214696/799243352708743218/m3.jpg?width=1106&height=622");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
.saveStudent {
  padding-top: 30px;
  background-color: #f3f2f2;
}
</style>
