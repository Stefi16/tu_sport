<template>
  <div class="quiz">
    <b-container>
        <b-jumbotron class="tron"
        header="Въпросник"
        lead="Разберете подходящия за Вас спорт.">
          <div class="questions">
            <b-list-group-item>
              <p>1.Колко често спортувате през седмицата?</p>
              <b-form-radio-group v-model="selected1"
              name="first"
              :options="fQuestion">
              </b-form-radio-group>
              </b-list-group-item>
              <b-list-group-item>
              <p>2. Къде предпочитате да спортувате – сред природата или в затворени пространства?</p>
              <b-form-radio-group v-model="selected2"
                 name="second"
                 :options="sQuestion">
              </b-form-radio-group>
              </b-list-group-item>
            <b-list-group-item>
              <p>3. Как обичате да спортувате – сам или отборно?</p>
              <b-form-radio-group v-model="selected3"
              name="third"
              :options="tQuestion">
              </b-form-radio-group>
              </b-list-group-item>
              <b-list-group-item>
              <p>4. Ако играете отборна игра, бихте ли станали капитан на отбора?</p>
                <b-form-radio-group v-model="selected4"
                name="fourth"
                :options="fourthQuestion">
                </b-form-radio-group>
                </b-list-group-item>
            <b-list-group-item>
              <p>5. Какъв вид натоварване предпочитате?</p>
              <b-form-radio-group v-model="selected5"
              name="five"
              :options="fifthQuestion">
              </b-form-radio-group>
            </b-list-group-item>
            <b-button
              class = "button"
              v-on:click="switchModals">Предай.
            </b-button>
          </div>
          <b-modal id="modal-result"
                   ref = "modal-result"
                   title="Резултат:">
            <p class="my-4">{{this.textModal}}</p>
          </b-modal>
        </b-jumbotron>
      </b-container>
  </div>
</template>

<script>
export default {
  name: 'Quiz',
  components: {
  },
  data () {
    return {
      selected1: 0,
      selected2: 0,
      selected3: 0,
      selected4: 0,
      selected5: 0,
      result: 0,
      textModal: '',
      fQuestion: [
        { text: 'Един път.', value: 1 },
        { text: 'Два или три пъти.', value: 2 },
        { text: 'Повече от три.', value: 3 }
      ],
      sQuestion: [
        { text: 'Сред природата.', value: 2 },
        { text: 'Затворени.', value: 1 },
        { text: 'И двете.', value: 3 }
      ],
      tQuestion: [
        { text: 'Самостоятелно.', value: 1 },
        { text: 'Отборно.', value: 2 },
        { text: 'И двете.', value: 3 }
      ],
      fourthQuestion: [
        { text: 'Да.', value: 3 },
        { text: 'Не.', value: 1 },
        { text: 'Може би.', value: 2 }
      ],
      fifthQuestion: [
        { text: 'Мускулно.', value: 3 },
        { text: 'Кардио.', value: 2 },
        { text: 'Алгоритми. :)', value: 1 }
      ]
    }
  },
  methods: {
    switchModals () {
      this.result = this.selected1 + this.selected2 + this.selected3 + this.selected4 + this.selected5
      console.log(this.result)
      if (this.result <= 6) {
        this.textModal = 'Спортовете, които Ви допадат са предимно в затворени пространства и не много екстремни.' +
          ' Препоръчваме Ви да се запишете на: аеробика, плуване или тенис на маса.'
      } else if (this.result >= 8 || this.result <= 11) {
        this.textModal = 'За Вас са подходящи средно активните спортове. В тази категория попадат: баскетбол, волейбол, футбол,\n' +
          ' тенис на корт или бадминтон.'
      } else {
        this.textModal = 'Вие харесвате най-активните видове спорт. Препоръчваме Ви да запишете:\n' +
          '    ветроходство, гребане, спортно катерене или планинарство.'
      }
      this.$refs['modal-result'].show()
    }
  }
}
</script>
<style scoped>
.quiz {
  padding-top: 100px;
}
.questions {
  padding-right: 220px;
  padding-left: 220px;
}
.button {
  margin-top: 20px;
}
.tron {
  font-weight: bold;
  background-image: url("https://cdn.discordapp.com/attachments/788074443574214696/793457729959755786/football-background.png");
  background-repeat: no-repeat;
  background-size: cover;
  background-color: white;
}
</style>
