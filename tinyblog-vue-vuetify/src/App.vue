<template>
  <v-app style="background-color: rgb(244, 245, 245)">
    <Navbar />
    <v-main>
      <router-view :key="key"/>
    </v-main>
  </v-app>
</template>

<script>
import Navbar from "./components/Navbar.vue";

export default {
  name: "App",

  components: {
    Navbar,
  },

  data: () => ({}),
  methods: {},
  computed: {
    key() {
      // 要跳转的页面组件和当前页面是同一个组件
      // https://www.cnblogs.com/lovecode3000/p/13871559.html
      let key =
        this.$route.name !== undefined
          ? this.$route.name + new Date()
          : this.$route + new Date();
      console.log(key);
      return key;
    },
  },
};
</script>
