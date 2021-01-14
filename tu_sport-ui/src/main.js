import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import * as axios from 'axios'
import { BootstrapVue, IconsPlugin, FormInputPlugin, BFormInput } from 'bootstrap-vue'

import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import 'bootstrap-vue/dist/bootstrap-vue-icons.min.css'

Vue.config.productionTip = false
Vue.prototype.$axios = axios
Vue.use(BootstrapVue)
Vue.use(IconsPlugin)
Vue.use(FormInputPlugin)
Vue.component('b-form-input', BFormInput)

new Vue({
  router,
  store,
  axios,
  render: h => h(App)
}).$mount('#app')
