<template>
<div class="teachersTab">
  <b-container>
    <h1>
      {{teachers.firstName}} {{teachers.lastName}}
    </h1>
  <h2>
      {{teachers.characteristic}}
  </h2>
  </b-container>
</div>
</template>

<script>
import TeacherServices from '../services/teacher-service.js'
export default {
  name: 'TeachersTab',
  data () {
    return {
      teachers: {
        id: '',
        firstName: '',
        lastName: '',
        email: '',
        characteristic: ''
      }
    }
  },
  beforeRouteEnter (to, from, next) {
    if (to.params.id) {
      TeacherServices.findById(to.params.id).then(
        responce => {
          next(vm => vm.setData(responce)
          )
        }
      )
    } else {
      next()
    }
  },
  methods: {
    setData (responce) {
      this.teachers = responce.data
    }
  }
}
</script>

<style scoped>
.teachersTab {
  padding-top: 80px;
  padding-bottom: 700px;
  font-weight: bold;
  background-image: url("https://media.discordapp.net/attachments/788074443574214696/799249573528076308/m8.jpg");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
  font-style: italic;
  color: black;
}
</style>
