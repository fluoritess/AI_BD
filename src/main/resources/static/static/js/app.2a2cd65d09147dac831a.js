webpackJsonp([10],{"7utO":function(e,t){},A66B:function(e,t,n){e.exports=function(e){return function(){return n("Opzk")("./"+e+".vue")}}},Akch:function(e,t){},NHnr:function(e,t,n){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var a=n("fZjL"),i=n.n(a),r=n("7+uW"),o=(n("Akch"),n("VaBq"),{render:function(){var e=this.$createElement,t=this._self._c||e;return t("div",[t("router-view")],1)},staticRenderFns:[]}),s=n("VU/8")({},o,!1,null,null,null).exports,u=n("/ocq"),c=n("A66B");r.a.use(u.a);var l=[{path:"/",name:"Login",component:c("Login"),meta:{title:"登录"}},{path:"/rigster",name:"rigster",component:c("rigster"),meta:{title:"注册"}},{path:"/main",name:"main",component:c("main"),meta:{requireAuth:!0},children:[{path:"/main/gongnengguanli",name:"gongnengguanli",component:c("Administration/gongnengguanli"),meta:{title:"功能",requireAuth:!0}},{path:"/main/jueseguanli",name:"jueseguanli",component:c("Administration/jueseguanli"),meta:{title:"角色",requireAuth:!0}},{path:"/main/yonghuguanli",name:"yonghuguanli",component:c("Administration/yonghuguanli"),meta:{title:"用户",requireAuth:!0}}]},{path:"/userindex",name:"userindex",component:c("user/users"),meta:{requireAuth:!0}}],g=new u.a({routes:l}),m={isEmptyObject:function(e){for(var t in e)return!1;return!0}},p=n("NYxO"),f=(n("Ya8g"),n("mvHQ")),T=n.n(f),E={user:{},userPage:[],islogin:!1,userPerms:[]},A={IS_LOGIN:function(e){e.commit;m.isEmptyObject(E.user)&&(E.user=JSON.parse(sessionStorage.getItem("user_info")),E.islogin=sessionStorage.getItem("isLogin"),E.userPage=JSON.parse(sessionStorage.getItem("user_page")),E.userPerms=JSON.parse(sessionStorage.getItem("user_perms")))}},d={state:E,getters:{GETUSERPAGE:function(e){return e.userPage},GETUSERPERMS:function(e){return e.userPerms}},actions:A,mutations:{UPDATE_USER:function(e,t){e.user=t,sessionStorage.setItem("user_info",T()(e.user))},SET_IS_LOGIN:function(e,t){e.islogin=t,sessionStorage.setItem("isLogin",e.islogin)},UPDATE_USERPAGE:function(e,t){e.userPage=t,sessionStorage.setItem("user_page",T()(e.userPage))},REMOVE_USER:function(){sessionStorage.clear()},UPDATE_USERPERMS:function(e,t){e.userPerms=t,sessionStorage.setItem("user_perms",T()(e.userPerms))}}},h={state:{stateid:"",statetitle:""},mutations:{UPDATESTATEID:function(e,t){e.stateid=t},UPDATESTATEIDANDTITLE:function(e,t){e.stateid=t.id,e.statetitle=t.title}},getters:{GETUSERSTATE:function(e){return e}}},v={state:{page:{titleData:[],datas:[],pages:[],pageselect:[2,5,10],active:1,pagelist:5,pageTotal:0,listTotal:0,count:5,checkData:[]}},mutations:{UPDATEPAGEACTIVE:function(e,t){e.page.active=t},UPDATEPAGETOTAL:function(e,t){e.page.pageTotal=t},UPDATETITLEDATA:function(e,t){e.page.titleData=t},UPDATEDATAS:function(e,t){e.page.datas=t},UPDATEPAGES:function(e,t){e.page.pages=t},UPDATEPAGELIST:function(e,t){e.page.pagelist=t},UPDATELISTTOTAL:function(e,t){e.page.listTotal=t},UPDATECOUNT:function(e,t){e.page.count=t},UPDATECHECKDATA:function(e,t){e.page.checkData=t},REININTPAGE:function(e){e.page={titleData:[],datas:[],pages:[],pageselect:[2,5,10],active:1,pagelist:5,pageTotal:0,listTotal:0,count:5,checkData:[]}}},actions:{},getters:{GETUSERTABLEPAGE:function(e){return e.page},GETUSERTABLEPAGECHECKDATA:function(e){return e.page.checkData}}};r.a.use(p.a);var P=new p.a.Store({modules:{user:d,state:h,page:v}});g.beforeEach(function(e,t,n){if(P.commit("UPDATESTATEIDANDTITLE",{id:e.name,title:e.meta.title}),e.meta.requireAuth)if(P.state.islogin||P.dispatch("IS_LOGIN"),!m.isEmptyObject(P.state.user.user)&&P.state.user.islogin){var a=P.state.user.userPage,i=0;if("/main"==e.fullPath)n();else{for(var o=0;o<a.length;o++)for(var s=0;s<a[o].list.length;s++)"/main/"+a[o].list[s].pageInf.url==e.fullPath&&(i+=1);"/userindex"==e.fullPath&&(i=1),i>0?n():r.a.prototype.$layer.alert("前往网页不存在或角色权限不足",{icon:1,time:2e3,end:function(){n({path:"/main"})}})}}else r.a.prototype.$layer.alert("帐号未登录",{icon:1,time:2e3,end:function(){n({path:"/"})}}),P.commit("SET_IS_LOGIN",!1),P.commit("REMOVE_USER");else n()});var S=n("mtWM"),D=n.n(S),y={datafilter:function(e,t){function n(e){return e<10?"0"+e:e}var a=new Date(Number(e)),i=n(a.getFullYear()),r=n(a.getMonth()+1),o=n(a.getDate());if("yyyyMMdd"==t)return i+"年"+r+"月"+o+"日"}},U=n("sUu7"),$=n("+8+3"),I=n.n($),O=n("TXmL");r.a.use(O.a);var _=new O.a({locale:"zh_CN"});r.a.use(U.b,{errorBagName:"errors",fieldsBagName:"fields",delay:100,locale:"zh_CN",strict:!0,enableAutoClasses:!0,events:"focus|input|blur|submit",inject:!0},{i18n:_,i18nRootKey:"validation",dictionary:{zh_CN:I.a}});U.b.Validator.localize({zh_CN:{messages:{numeric:function(e){return e+"应为数字"},required:function(e){return e+"不能为空"},max:function(e,t){return e+"不能超过"+t[0]+"个字符"},min:function(e,t){return e+"不能少于"+t[0]+"个字符"},length:function(e,t){return e+"应该为"+t[0]+"个字符"},regex:function(e){return e+"格式不正确"},alpha_num:function(e,t){return e+"只能为数字或英文"},email:function(e){return e+"格式不正确"}}}}),U.a.extend("tel",{getMessage:function(e){return" 请输入正确格式的手机号"},validate:function(e,t){return 11==e.length&&/^((13|14|15|17|18)[0-9]{1}\d{8})$/.test(e)}}),U.a.extend("password",{getMessage:function(e){return e+"应为字母、数字和符号两种及以上的组合，6-16个字符"},validate:function(e,t){return/^(?![0-9]+$)(?![a-z]+$)(?![A-Z]+$)(?![,\!\.#%'\+\*\-:;^_`]+$)[,\!\.#%'\+\*\-:;^_`0-9A-Za-z]{6,16}$/.test(e)}}),U.a.extend("cnlength",{getMessage:function(e,t){return e+"长度不能超过"+t[0]+"位"},validate:function(e,t){return("number"==typeof e?e.length:e.replace(/[\u0391-\uFFE5]/g,"aa").length)<=t[0]}}),U.a.extend("idnumber",{getMessage:function(e,t){return e+"格式不正确"},validate:function(e,t){return/(^\d{110}$)|(^\d{112}$)|(^\d{17}(\d|X|x)$)/.test(e)}});var L=n("ppUw"),G=n.n(L),N={loginTableData:function(e,t,n){var a=e.$store.getters.GETUSERTABLEPAGE,i={page:{active:a.active,pagelist:a.pagelist},state:n};e.$axios.post(e.HOST+t,i).then(function(t){var n=t.data;layer.msg("数据加载中",{icon:16,time:200,end:function(){"0"==n.code?(e.$store.commit("UPDATETITLEDATA",function(e){var t=e;if(t.length){for(var n=0;n<t.length;n++)"密码"==t[n]&&(t=t.splice(n,1));return t}return[]}(n.data.data_title)),e.$store.commit("UPDATELISTTOTAL",n.data.listTotal),e.$store.commit("UPDATEDATAS",n.data.lists),e.$store.commit("UPDATEPAGETOTAL",Math.ceil(a.listTotal/a.pagelist)),e.$store.commit("UPDATEPAGES",function(e,t,n){var a=t-Math.floor(n/2),i=t+Math.floor(n/2);a<=0&&(i=(a=1)+n-1);i>e&&(a=(i=e)-n+1);for(var r=[],o=a;o<=i;o++)o>0&&r.push(o);r.length>0&&(r.push("»"),r.unshift("«"),r.push("尾页"),r.unshift("首页"));return r}(a.pageTotal,a.active,a.count))):layer.msg("获取失败",{icon:5})}})}).catch(function(t){console.log(t),e.$store.commit("UPDATEDATAS",[]),layer.msg("网络错误，请检查网络是否畅通",{icon:5})}),layer.closeAll("loading")},opreateHttp:function(e,t,n,a){e.$validator.validateAll().then(function(i){i&&e.$axios.post(e.HOST+t,n).then(function(t){var i=t.data;"0"==i.code?(e.$layer.msg(a+"成功",{icon:1,end:function(){N.loginTableData()}}),e.$api.http.loginTableData(e,e.pageloginData),n={}):e.$layer.msg(i.msg,{icon:2})}).catch(function(t){e.$layer.msg("网络错误，请检查网络是否畅通",{icon:5})})})}},R=N;var b=n("pFYg"),x=n.n(b);var C={http:R,opreate:{emitCall:function(e,t,n){n.$emit(e,t)},ObjectCopy:function e(t){var n;t instanceof Object&&(n={});t instanceof Array&&(n=[]);for(var a in t)"object"==x()(t[a])?n[a]=e(t[a]):n[a]=t[a];return n},hasLoginComponents:function(e,t){return e.$store.getters.GETUSERPERMS.indexOf(t)>-1},TESTcheck:function(e,t){var n=e.$store.getters.GETUSERTABLEPAGECHECKDATA.length;return n>1?(e.$layer.msg("一次只能"+t+"一条数据",{icon:2}),!1):!(n<=0)||(e.$layer.alert("请选择需要"+t+"的数据",{icon:0}),!1)}}},M=n("7t+N"),j=n.n(M),w=n("osWI"),k=n.n(w);window.jQuery=j.a,window.$=j.a,r.a.use(G.a),D.a.defaults.withCredentials=!0,r.a.config.productionTip=!1,r.a.prototype.$api=C,r.a.prototype.$layer=k.a,r.a.prototype.HOST="",r.a.prototype.$axios=D.a,r.a.prototype.$store=P,i()(y).forEach(function(e){r.a.filter(e,y[e])});new r.a({el:"#app",router:g,store:P,components:{App:s},template:"<App/>"})},Opzk:function(e,t,n){var a={"./Administration/gongnengguanli.vue":["cn+G",0,6],"./Administration/jueseguanli.vue":["QEn1",0,5],"./Administration/yonghuguanli.vue":["Y/nL",0,4],"./Login.vue":["lmfZ",3],"./main.vue":["sRz/",1],"./rigster.vue":["ST3v",8],"./user/userindex.vue":["HrnT",7],"./user/users.vue":["H49N",2]};function i(e){var t=a[e];return t?Promise.all(t.slice(1).map(n.e)).then(function(){return n(t[0])}):Promise.reject(new Error("Cannot find module '"+e+"'."))}i.keys=function(){return Object.keys(a)},i.id="Opzk",e.exports=i},VaBq:function(e,t){}},["NHnr"]);
//# sourceMappingURL=app.2a2cd65d09147dac831a.js.map