<template>
  <div class="home">
    <h2 class="header">
      Физическо възпитание и спорт - Технически университет София
    </h2>
    <b-container>
      <b-carousel
        controls
        indicators
        img-width="1024"
        img-height="480"
        :interval="3000"
        v-model="slide"
      >
        <b-carousel-slide img-src="https://media.discordapp.net/attachments/788074443574214696/792466733515407411/90d38f3bb0b7128b.jpeg"
                          text="Гребане на езерото Панчарево"
        ></b-carousel-slide>
        <b-carousel-slide img-src="https://media.discordapp.net/attachments/788074443574214696/792466758300598282/a377877ba444549f.jpeg"
                          text="Спортно катерене, провеждащо се в Софийски университет"
        >
        </b-carousel-slide>
        <b-carousel-slide img-src="https://media.discordapp.net/attachments/788074443574214696/792466787928637440/45b58866aea72648.jpeg"
                          text="Плуване в спортния комплекс на Технически университет"
        >
        </b-carousel-slide>
        <b-carousel-slide img-src="https://media.discordapp.net/attachments/788074443574214696/792466786267562014/e183fbabaed56b97.jpeg"
                          text="Планинарство в планината Витоша"
        ></b-carousel-slide>
        <b-carousel-slide img-src="https://media.discordapp.net/attachments/788074443574214696/792466795628855366/1ceea1e93751b26a.jpeg"
                          text="Тенис на корт в спортния комплекс на Технически университет"
        ></b-carousel-slide>
        <b-carousel-slide img-src="https://media.discordapp.net/attachments/788074443574214696/792466795394498580/84ae72ea10f54d73.jpeg"
                          text="Тенис на маса в спортния комплекс на Технически университет"
        ></b-carousel-slide>
      </b-carousel>
    </b-container>
  </div>
</template>

<script>

export default {
  name: 'Home',
  components: {
  }
}
</script>
<style scoped>
.home {
  min-height: 100vh;
  padding-bottom: 80px;
  margin: 0;
  background-image: url("https://media.discordapp.net/attachments/788074443574214696/799251094063546398/93566.jpg?width=1106&height=622");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
.header {
  padding-top: 100px;
  padding-bottom: 45px;
  font-weight: bold;
  color: black;
}
</style>
