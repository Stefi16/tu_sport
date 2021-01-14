import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import GeneralInfo from '@/views/GeneralInfo'
import Teachers from '@/views/Teachers.vue'
import Sports from '@/views/Sports.vue'
import Quiz from '@/views/Quiz.vue'
import Students from '@/views/Students'
import InsertTeacher from '@/views/InsertTeacher'
import InsertStudent from '@/views/InsertStudent'
import TeachersTab from '@/views/TeachersTab'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/generalInfo',
    name: 'GeneralInfo',
    component: GeneralInfo
  },
  {
    path: '/teachers',
    name: 'Teachers',
    component: Teachers
  },
  {
    path: '/sports',
    name: 'Sports',
    component: Sports
  },
  {
    path: '/students',
    name: 'Students',
    component: Students
  },
  {
    path: '/insertTeacher',
    name: 'InsertTeacher',
    component: InsertTeacher
  },
  {
    path: '/insertStudent',
    name: 'InsertStudent',
    component: InsertStudent
  },
  {
    path: '/quiz',
    name: 'Quiz',
    component: Quiz
  },
  {
    path: '/teachersTab',
    name: 'TeachersTab',
    component: TeachersTab
  }
]

const router = new VueRouter({
  routes
})

export default router
