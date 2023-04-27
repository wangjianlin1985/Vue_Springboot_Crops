import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import discussjishu from '@/views/modules/discussjishu/list'
    import nonghu from '@/views/modules/nonghu/list'
    import xuanbo from '@/views/modules/xuanbo/list'
    import discusszhongzigongyingshang from '@/views/modules/discusszhongzigongyingshang/list'
    import jishu from '@/views/modules/jishu/list'
    import discussnongzuowushougoushang from '@/views/modules/discussnongzuowushougoushang/list'
    import zhongzigongyingshang from '@/views/modules/zhongzigongyingshang/list'
    import discussxuanbo from '@/views/modules/discussxuanbo/list'
    import nongzuowushougoushang from '@/views/modules/nongzuowushougoushang/list'
    import storeup from '@/views/modules/storeup/list'
    import config from '@/views/modules/config/list'
    import nongyejishuyuan from '@/views/modules/nongyejishuyuan/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/discussjishu',
        name: '技术评论',
        component: discussjishu
      }
      ,{
	path: '/nonghu',
        name: '农户',
        component: nonghu
      }
      ,{
	path: '/xuanbo',
        name: '选播',
        component: xuanbo
      }
      ,{
	path: '/discusszhongzigongyingshang',
        name: '种子供应商评论',
        component: discusszhongzigongyingshang
      }
      ,{
	path: '/jishu',
        name: '技术',
        component: jishu
      }
      ,{
	path: '/discussnongzuowushougoushang',
        name: '农作物收购商评论',
        component: discussnongzuowushougoushang
      }
      ,{
	path: '/zhongzigongyingshang',
        name: '种子供应商',
        component: zhongzigongyingshang
      }
      ,{
	path: '/discussxuanbo',
        name: '选播评论',
        component: discussxuanbo
      }
      ,{
	path: '/nongzuowushougoushang',
        name: '农作物收购商',
        component: nongzuowushougoushang
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/nongyejishuyuan',
        name: '农业技术员',
        component: nongyejishuyuan
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
