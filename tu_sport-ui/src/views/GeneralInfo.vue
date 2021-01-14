<template>
  <div class="generalInfo">
    <h2>
      Информация за Зимен семестър на учебната 2020/2021 година.
    </h2>
    <b-form-textarea
      class="info"
      id="textarea-plaintext"
      plaintext :value="text"
      max-rows="1000"
      no-auto-shrink
      style="overflow: hidden"
    >
    </b-form-textarea>
  </div>
</template>

<script>
import generalInfo from '../data/GeneralInfo'
export default {
  name: 'GeneralInfo',
  data () {
    return {
      text: ''
    }
  },
  mounted () {
    this.text = generalInfo
  }
}
</script>
<style scoped>
.generalInfo {
  min-height: 100vh;
  padding-top: 70px;
  margin: 0;
  background-image: url("https://media.discordapp.net/attachments/788074443574214696/799250903457726484/1092570.jpg?width=960&height=623");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
.info {
  padding-top: 20px;
  padding-left: 20px;
}
</style>
