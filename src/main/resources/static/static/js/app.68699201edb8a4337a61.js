webpackJsonp([11],{"7utO":function(e,t){},A66B:function(e,t,n){e.exports=function(e){return function(){return n("Opzk")("./"+e+".vue")}}},Akch:function(e,t){},NHnr:function(e,t,n){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var a=n("fZjL"),i=n.n(a),r=n("7+uW"),o=(n("Akch"),n("VaBq"),{render:function(){var e=this.$createElement,t=this._self._c||e;return t("div",[t("router-view")],1)},staticRenderFns:[]}),s=n("VU/8")({},o,!1,null,null,null).exports,u=n("/ocq"),c=n("A66B");r.a.use(u.a);var l=[{path:"/",name:"Login",component:c("Login"),meta:{title:"登录"}},{path:"/rigster",name:"rigster",component:c("rigster"),meta:{title:"注册"}},{path:"/main",name:"main",component:c("main"),meta:{requireAuth:!0},children:[{path:"/main/gongnengguanli",name:"gongnengguanli",component:c("Administration/gongnengguanli"),meta:{title:"功能",requireAuth:!0}},{path:"/main/jueseguanli",name:"jueseguanli",component:c("Administration/jueseguanli"),meta:{title:"角色",requireAuth:!0}},{path:"/main/yonghuguanli",name:"yonghuguanli",component:c("Administration/yonghuguanli"),meta:{title:"用户",requireAuth:!0}},{path:"/main/applicationMan",name:"applicationguanli",component:c("Administration/application"),meta:{title:"应用系统",requireAuth:!0}}]},{path:"/userindex",name:"userindex",component:c("user/users"),meta:{requireAuth:!0}}],g=new u.a({routes:l}),m={isEmptyObject:function(e){for(var t in e)return!1;return!0}},f=n("NYxO"),p=(n("Ya8g"),n("mvHQ")),d=n.n(p),E={user:{},userPage:[],islogin:!1,userPerms:[]},T={IS_LOGIN:function(e){e.commit;m.isEmptyObject(E.user)&&(E.user=JSON.parse(sessionStorage.getItem("user_info")),E.islogin=sessionStorage.getItem("isLogin"),E.userPage=JSON.parse(sessionStorage.getItem("user_page")),E.userPerms=JSON.parse(sessionStorage.getItem("user_perms")))}},A={state:E,getters:{GETUSERPAGE:function(e){return e.userPage},GETUSERPERMS:function(e){return e.userPerms}},actions:T,mutations:{UPDATE_USER:function(e,t){e.user=t,sessionStorage.setItem("user_info",d()(e.user))},SET_IS_LOGIN:function(e,t){e.islogin=t,sessionStorage.setItem("isLogin",e.islogin)},UPDATE_USERPAGE:function(e,t){e.userPage=t,sessionStorage.setItem("user_page",d()(e.userPage))},REMOVE_USER:function(){sessionStorage.clear()},UPDATE_USERPERMS:function(e,t){e.userPerms=t,sessionStorage.setItem("user_perms",d()(e.userPerms))}}},h={state:{stateid:"",statetitle:""},mutations:{UPDATESTATEID:function(e,t){e.stateid=t},UPDATESTATEIDANDTITLE:function(e,t){e.stateid=t.id,e.statetitle=t.title}},getters:{GETUSERSTATE:function(e){return e}}},v={state:{page:{titleData:[],datas:[],pages:[],pageselect:[2,5,10],active:1,pagelist:5,pageTotal:0,listTotal:0,count:5,checkData:[],check:{}}},mutations:{UPDATEPAGEACTIVE:function(e,t){e.page.active=t},UPDATEPAGETOTAL:function(e,t){e.page.pageTotal=t},UPDATETITLEDATA:function(e,t){e.page.titleData=t},UPDATEDATAS:function(e,t){e.page.datas=t},UPDATEPAGES:function(e,t){e.page.pages=t},UPDATEPAGELIST:function(e,t){e.page.pagelist=t},UPDATELISTTOTAL:function(e,t){e.page.listTotal=t},UPDATECOUNT:function(e,t){e.page.count=t},UPDATECHECKDATA:function(e,t){e.page.checkData=t},REININTPAGE:function(e){e.page={titleData:[],datas:[],pages:[],pageselect:[2,5,10],active:1,pagelist:5,pageTotal:0,listTotal:0,count:5,checkData:[],check:{}}},REMOVECHECK:function(e){e.page.check={}}},actions:{},getters:{GETUSERTABLEPAGE:function(e){return e.page},GETUSERTABLEPAGECHECKDATA:function(e){return e.page.checkData}}};r.a.use(f.a);var S=new f.a.Store({modules:{user:A,state:h,page:v}});g.beforeEach(function(e,t,n){if(S.commit("UPDATESTATEIDANDTITLE",{id:e.name,title:e.meta.title}),e.meta.requireAuth)if(S.state.islogin||S.dispatch("IS_LOGIN"),!m.isEmptyObject(S.state.user.user)&&S.state.user.islogin){var a=S.state.user.userPage,i=0;if("/main"==e.fullPath)n();else{for(var o=0;o<a.length;o++)for(var s=0;s<a[o].list.length;s++)"/main/"+a[o].list[s].pageInf.url==e.fullPath&&(i+=1);"/userindex"==e.fullPath&&(i=1),i>0?n():r.a.prototype.$layer.alert("前往网页不存在或角色权限不足",{icon:1,time:2e3,end:function(){n({path:"/main"})}})}}else r.a.prototype.$layer.alert("帐号未登录",{icon:1,time:2e3,end:function(){n({path:"/"})}}),S.commit("SET_IS_LOGIN",!1),S.commit("REMOVE_USER");else n()});var P=n("mtWM"),D=n.n(P),y={datafilter:function(e,t){function n(e){return e<10?"0"+e:e}var a=new Date(Number(e)),i=n(a.getFullYear()),r=n(a.getMonth()+1),o=n(a.getDate());if("yyyyMMdd"==t)return i+"年"+r+"月"+o+"日"}},U=n("//Fk"),$=n.n(U),O=n("sUu7"),I=n("+8+3"),_=n.n(I),L=n("TXmL");r.a.use(L.a);var G=new L.a({locale:"zh_CN"});r.a.use(O.b,{errorBagName:"errors",fieldsBagName:"fields",delay:100,locale:"zh_CN",strict:!0,enableAutoClasses:!0,events:"focus|input|blur|submit",inject:!0},{i18n:G,i18nRootKey:"validation",dictionary:{zh_CN:_.a}});var R,N={getMessage:function(e,t){return e+"长度不能超过"+t[0]+"位"},validate:function(e,t){var n=0;if("number"==typeof e)n=(e+="").length;else{if(void 0===e)return!0;n=e.replace(/[\u0391-\uFFE5]/g,"aa").length}return n<=t[0]}};O.b.Validator.localize({zh_CN:{messages:{numeric:function(e){return e+"应为数字"},required:function(e){return e+"不能为空"},max:function(e,t){return e+"不能超过"+t[0]+"个字符"},min:function(e,t){return e+"不能少于"+t[0]+"个字符"},length:function(e,t){return e+"应该为"+t[0]+"个字符"},regex:function(e){return e+"格式不正确"},alpha_num:function(e,t){return e+"只能为数字或英文"},email:function(e){return e+"格式不正确"}}}});var M={getMessage:function(e){return"已存在"},validate:function(e,t){return new $.a(function(n){if(clearTimeout(R),e){var a,i={data:{data:e,name:t[0]},states:{id:t[1]}};return R=setTimeout(function(){a=n(r.a.prototype.$axios.post(r.a.prototype.HOST+"inspectData.action",i).then(function(e){return"0"==e.data.code?{valid:!0}:(e.data.code="500")?{valid:!1,data:{message:e.data.msg}}:void 0}).catch(function(e){return console.log(e),console.log("网络错误"),{valid:!1,data:{message:""}}}))},500),a}return!1})}};O.a.extend("tel",{getMessage:function(e){return" 请输入正确格式的手机号"},validate:function(e,t){return 11==e.length&&/^((13|14|15|17|18)[0-9]{1}\d{8})$/.test(e)}}),O.a.extend("password",{getMessage:function(e){return e+"应为字母、数字和符号两种及以上的组合，6-16个字符"},validate:function(e,t){return/^(?![0-9]+$)(?![a-z]+$)(?![A-Z]+$)(?![,\!\.#%'\+\*\-:;^_`]+$)[,\!\.#%'\+\*\-:;^_`0-9A-Za-z]{6,16}$/.test(e)}}),O.a.extend("cnlength",N),O.a.extend("idnumber",{getMessage:function(e,t){return e+"格式不正确"},validate:function(e,t){return/(^\d{110}$)|(^\d{112}$)|(^\d{17}(\d|X|x)$)/.test(e)}}),O.a.extend("val",M);var b=n("ppUw"),C=n.n(b),x={loginleftmenu:function(e){e.$axios.post(e.HOST+"selectUserPage.action").then(function(t){var n=t.data;if("0"==n.code){var a=e.$api.opreate.addShow(n.userPageList);e.$store.commit("UPDATE_USERPAGE",a),e.$store.commit("UPDATE_USERPERMS",n.perms)}}).catch(function(e){console.log(e)})},loginTableData:function(e,t,n){e.$store.commit("REMOVECHECK");var a=e.$store.getters.GETUSERTABLEPAGE,i={page:{active:a.active,pagelist:a.pagelist},state:n},r=layer.msg("数据加载中",{icon:16,shade:[.1,"#ccc"]});e.$axios.post(e.HOST+t,i).then(function(t){var n=t.data;"0"==n.code?(e.$store.commit("UPDATETITLEDATA",function(e){var t=e;if(t.length){for(var n=0;n<t.length;n++)"密码"==t[n]&&(t=t.splice(n,1));return t}return[]}(n.data.data_title)),e.$store.commit("UPDATELISTTOTAL",n.data.listTotal),e.$store.commit("UPDATEDATAS",n.data.lists),e.$store.commit("UPDATEPAGETOTAL",Math.ceil(a.listTotal/a.pagelist)),e.$store.commit("UPDATEPAGES",function(e,t,n){var a=t-Math.floor(n/2),i=t+Math.floor(n/2);a<=0&&(i=(a=1)+n-1);i>e&&(a=(i=e)-n+1);for(var r=[],o=a;o<=i;o++)o>0&&r.push(o);r.length>0&&(r.push("»"),r.unshift("«"),r.push("尾页"),r.unshift("首页"));return r}(a.pageTotal,a.active,a.count)),e.$store.commit("UPDATECHECKDATA",[])):r=layer.msg("获取失败",{icon:5})}).catch(function(t){console.log(t),e.$store.commit("UPDATEDATAS",[]),r=layer.msg("网络错误，请检查网络是否畅通",{icon:5})}),layer.close(r)},opreateHttp:function(e,t,n,a,i){e.$validator.validateAll("required|cnlength").then(function(r){r&&e.$axios.post(e.HOST+t,n).then(function(t){var r=t.data;"0"==r.code?(e.$layer.msg(a+"成功",{icon:1,time:800,end:function(){x.loginTableData(e,e.tableSelectData.selectTableurl,e.tableSelectData.pageloginData),"function"==typeof i&&i(e)}}),n={}):e.$layer.msg(r.msg,{icon:2})}).catch(function(t){e.$layer.msg("网络错误，请检查网络是否畅通",{icon:5})})}).catch(function(e){console.log(e)})}},w=x;var k=n("pFYg"),H=n.n(k);var j={http:w,opreate:{emitCall:function(e,t,n){n.$emit(e,t)},ObjectCopy:function e(t){var n;t instanceof Object&&(n={});t instanceof Array&&(n=[]);for(var a in t)"object"==H()(t[a])?n[a]=e(t[a]):n[a]=t[a];return n},hasLoginComponents:function(e,t){return e.$store.getters.GETUSERPERMS.indexOf(t)>-1},TESTcheck:function(e,t){var n=e.$store.getters.GETUSERTABLEPAGECHECKDATA.length;return n>1?(e.$layer.msg("一次只能"+t+"一条数据",{icon:2}),!1):!(n<=0)||(e.$layer.alert("请选择需要"+t+"的数据",{icon:0}),!1)},datafilter:function(e,t){function n(e){return e<10?"0"+e:e}var a=new Date(Number(e)),i=n(a.getFullYear()),r=n(a.getMonth()+1),o=n(a.getDate());if("yyyyMMdd"==t)return i+"年"+r+"月"+o+"日"},addShow:function(e){return function e(t){for(var n=t,a=0;a<n.length;a++)n[a].pageInf&&(n[a].pageInf.show=!1),null!=n[a].list&&n[a].list.length>0&&e(n[a].list);return n}(e)},validateAdd:function(e,t,n,a){var i="required";return t>0&&(i+="|cnlength:"+t),"add"==a?i+"|val:"+e+","+n:i+""}}},q=n("7t+N"),z=n.n(q),B=n("osWI"),V=n.n(B);window.jQuery=z.a,window.$=z.a,r.a.use(C.a),D.a.defaults.withCredentials=!0,r.a.config.productionTip=!1,r.a.prototype.$api=j,r.a.prototype.$layer=V.a,r.a.prototype.HOST="",r.a.prototype.$axios=D.a,r.a.prototype.$store=S,i()(y).forEach(function(e){r.a.filter(e,y[e])});new r.a({el:"#app",router:g,store:S,components:{App:s},template:"<App/>"})},Opzk:function(e,t,n){var a={"./Administration/application.vue":["S5qs",0,6],"./Administration/gongneng/FunAllcation.vue":["dsNe",0],"./Administration/gongnengguanli.vue":["cn+G",0,5],"./Administration/jueseguanli.vue":["QEn1",0,4],"./Administration/yonghuguanli.vue":["Y/nL",0,7],"./Login.vue":["lmfZ",3],"./main.vue":["sRz/",1],"./rigster.vue":["ST3v",9],"./user/userindex.vue":["HrnT",8],"./user/users.vue":["H49N",2]};function i(e){var t=a[e];return t?Promise.all(t.slice(1).map(n.e)).then(function(){return n(t[0])}):Promise.reject(new Error("Cannot find module '"+e+"'."))}i.keys=function(){return Object.keys(a)},i.id="Opzk",e.exports=i},VaBq:function(e,t){}},["NHnr"]);
//# sourceMappingURL=app.68699201edb8a4337a61.js.map