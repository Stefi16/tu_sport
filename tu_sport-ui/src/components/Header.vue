<template>
  <div style = "position:absolute; left:0px; top:0px; " >
    <b-navbar> <!--toggleable="lg" type="light" variant="light"-->
      <b-navbar-brand router-link to = "/" Home>Начало</b-navbar-brand>

      <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

      <b-collapse id="nav-collapse" is-nav>
        <b-navbar-nav>
          <b-nav-item-dropdown text="Информация">
            <b-dropdown-item router-link to = "/generalInfo" GeneralInfo>Обща</b-dropdown-item>
            <b-dropdown-item router-link to = "/teachers" Teachers>Преподаватели</b-dropdown-item>
            <b-dropdown-item router-link to = "/students" Students>Студенти</b-dropdown-item>
            <b-dropdown-item router-link to = "/sports" Sports>Спортове</b-dropdown-item>
          </b-nav-item-dropdown>
          <b-nav-item-dropdown text="Въведи">
          <b-nav-item router-link to = "/insertTeacher" InsertTeacher>Преподавател</b-nav-item>
          <b-nav-item router-link to = "/insertStudent" InsertStudent>Студент</b-nav-item>
            </b-nav-item-dropdown>
          <b-nav-item router-link to = "/quiz" Quiz>Въпросник</b-nav-item>
          </b-navbar-nav>
      </b-collapse>
    </b-navbar>
  </div>
</template>
<script>

</script>
<style scoped>

</style>
