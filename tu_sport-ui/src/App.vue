<template>
  <div id = "app">
    <div id="nav">
      <Header />
    </div>
    <router-view/>
  </div>
</template>
<script>
import Header from '@/components/Header'
export default {
  components: {
    Header
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav a {
  font-weight: bolder;
  color: black;
  font-size: 19px;
}

#nav a.router-link-exact-active {
  font-size: 20px;
  font-weight: bolder;
  color: #6610f2;
}
</style>
