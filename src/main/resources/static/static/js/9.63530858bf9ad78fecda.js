webpackJsonp([9],{DjN5:function(e,s){},ST3v:function(e,s,r){"use strict";Object.defineProperty(s,"__esModule",{value:!0});r("DjN5"),r("VaBq");var a={data:function(){return{newuser:{tel:"",code:"",userid:"",pass:"",password:""},codedis:!1,codeinner:"获取验证码",codeerrormsg:"",errormsg:""}},methods:{removecodeMSg:function(){this.codeerrormsg=""},loginCode:function(){var e=this,s=e.newuser.tel;e.codeerrormsg||e.$axios.post(e.HOST+"sendCode.action",{tel:s}).then(function(s){var r=s;if(r.bool)e.codeDis(),e.$layer.alert("验证码已发送，请注意查收",{icon:1,time:2e3});else{var a=r.msg;a="本号码已存在,"==a?a+"请<a href='#/'>直接登录</a>":a,e.codeerrormsg=a}}).catch(function(e){console.log(e)})},codeDis:function(){var e=this;e.codedis=!0;var s=10;a();var r=setInterval(a,1e3);function a(){e.codeinner=s+"秒后继续",(s-=1)<=-1&&(clearInterval(r),e.codeinner="再次获取",e.codedis=!1)}},submits:function(){var e=this,s=e.newuser;e.$validator.validateAll().then(function(r){r&&s.pass==s.password&&e.$axios.post(e.HOST+"register.action",s).then(function(s){var r=s;r.bool?e.$layer.msg("注册成功",{icon:1,time:800,end:function(){e.$router.push("/")}}):e.$layer.msg(r.msg,{icon:2})}).catch(function(e){console.log(e)})})}}},t={render:function(){var e=this,s=e.$createElement,r=e._self._c||s;return r("div",[r("div",{staticClass:"container user_box"},[r("div",{staticClass:"panel panel-info"},[e._m(0),e._v(" "),r("div",{staticClass:"panel-body"},[e._m(1),e._v(" "),r("form",{ref:"myForm",staticClass:"form form-horizontal col-sm-4 col-sm-offset-4",attrs:{name:"myForm"}},[r("div",{staticClass:"form-group",domProps:{innerHTML:e._s(e.errormsg)}}),e._v(" "),r("div",{staticClass:"form-group",class:{"has-success":!e.errors.has("tel")&&""!=e.newuser.tel,"has-error":e.errors.has("tel")}},[r("div",{staticClass:"col-sm-12"},[r("input",{directives:[{name:"model",rawName:"v-model",value:e.newuser.tel,expression:"newuser.tel"},{name:"validate",rawName:"v-validate",value:"required|tel",expression:"'required|tel'"}],staticClass:"form-control",attrs:{type:"text",name:"tel",placeholder:"请输入11位手机号","data-vv-as":"手机号"},domProps:{value:e.newuser.tel},on:{input:[function(s){s.target.composing||e.$set(e.newuser,"tel",s.target.value)},e.removecodeMSg]}})]),e._v(" "),r("div",{staticClass:"col-sm-11 col-sm-offset-1 text-alert text-danger"},[r("span",{directives:[{name:"show",rawName:"v-show",value:e.errors.has("tel"),expression:"errors.has('tel')"}]},[e._v(e._s(e.errors.first("tel")))]),e._v(" "),r("span",{domProps:{innerHTML:e._s(e.codeerrormsg)}})])]),e._v(" "),r("div",{staticClass:"form-group",class:{"has-success":!e.errors.has("code")&&""!=e.newuser.code,"has-error":e.errors.has("code")}},[r("div",{staticClass:"col-sm-7"},[r("input",{directives:[{name:"model",rawName:"v-model",value:e.newuser.code,expression:"newuser.code"},{name:"validate",rawName:"v-validate",value:"required|numeric|length:6",expression:"'required|numeric|length:6'"}],staticClass:"form-control",attrs:{type:"text",name:"code","data-vv-as":"验证码",placeholder:"请输入验证码",disabled:e.errors.has("tel")||""==e.newuser.tel},domProps:{value:e.newuser.code},on:{input:function(s){s.target.composing||e.$set(e.newuser,"code",s.target.value)}}})]),e._v(" "),r("div",{staticClass:"col-sm-5"},[r("button",{ref:"code",staticClass:"btn btn-primary btn-block",attrs:{type:"button",disabled:e.errors.has("tel")||""==e.newuser.tel||e.codedis},domProps:{innerHTML:e._s(e.codeinner)},on:{click:e.loginCode}})]),e._v(" "),r("div",{staticClass:"col-sm-11 col-sm-offset-1 text-alert text-danger"},[r("span",{directives:[{name:"show",rawName:"v-show",value:e.errors.has("code"),expression:"errors.has('code')"}]},[e._v(e._s(e.errors.first("code")))])])]),e._v(" "),r("div",{staticClass:"form-group",class:{"has-success":!e.errors.has("userid")&&""!=e.newuser.userid,"has-error":e.errors.has("userid")}},[r("div",{staticClass:"col-sm-12"},[r("input",{directives:[{name:"model",rawName:"v-model",value:e.newuser.userid,expression:"newuser.userid"},{name:"validate",rawName:"v-validate",value:"required|cnlength:6",expression:"'required|cnlength:6'"}],staticClass:"form-control",attrs:{type:"text",name:"userid","data-vv-as":"用户名",placeholder:"请输入用户名"},domProps:{value:e.newuser.userid},on:{input:function(s){s.target.composing||e.$set(e.newuser,"userid",s.target.value)}}})]),e._v(" "),r("div",{staticClass:"col-sm-11 col-sm-offset-1 text-alert text-danger"},[r("span",{directives:[{name:"show",rawName:"v-show",value:e.errors.has("userid"),expression:"errors.has('userid')"}]},[e._v(e._s(e.errors.first("userid")))])])]),e._v(" "),r("div",{staticClass:"form-group",class:{"has-success":!e.errors.has("password")&&""!=e.newuser.pass,"has-error":e.errors.has("password")}},[r("div",{staticClass:"col-sm-12"},[r("input",{directives:[{name:"model",rawName:"v-model",value:e.newuser.pass,expression:"newuser.pass"},{name:"validate",rawName:"v-validate",value:"required|password",expression:"'required|password'"}],staticClass:"form-control",attrs:{type:"password",name:"password","data-vv-as":"密码",placeholder:"请输入密码"},domProps:{value:e.newuser.pass},on:{input:function(s){s.target.composing||e.$set(e.newuser,"pass",s.target.value)}}})]),e._v(" "),r("div",{staticClass:"col-sm-11 col-sm-offset-1 text-alert text-danger"},[r("span",{directives:[{name:"show",rawName:"v-show",value:e.errors.has("password"),expression:"errors.has('password')"}]},[e._v(e._s(e.errors.first("password")))])]),e._v(" "),r("div",{staticClass:"col-sm-12",staticStyle:{"font-size":"8px"}},[e._v("密码为字母、数字和符号两种及以上的组合，6-16个字符")])]),e._v(" "),r("div",{staticClass:"form-group",class:{"has-success":!e.errors.has("repw")&&e.newuser.pass==e.newuser.password&&""!=e.newuser.password,"has-error":e.errors.has("repw")||e.newuser.pass!=e.newuser.password}},[r("div",{staticClass:"col-sm-12"},[r("input",{directives:[{name:"model",rawName:"v-model",value:e.newuser.password,expression:"newuser.password"},{name:"validate",rawName:"v-validate",value:"required",expression:"'required'"}],staticClass:"form-control",attrs:{type:"password",name:"repw","data-vv-as":"确认密码",placeholder:"再次输入密码"},domProps:{value:e.newuser.password},on:{input:function(s){s.target.composing||e.$set(e.newuser,"password",s.target.value)}}})]),e._v(" "),r("div",{staticClass:"col-sm-11 col-sm-offset-1 text-alert text-danger"},[r("span",{directives:[{name:"show",rawName:"v-show",value:e.errors.has("repw"),expression:"errors.has('repw')"}]},[e._v(e._s(e.errors.first("repw")))]),e._v(" "),r("span",{directives:[{name:"show",rawName:"v-show",value:e.newuser.pass!=e.newuser.password&&""!=e.newuser.password,expression:"newuser.pass!=newuser.password&&newuser.password!=''"}]},[e._v("两次密码不符")])])]),e._v(" "),r("div",{staticClass:"form-group"},[r("button",{staticClass:"btn btn-info col-sm-5 col-sm-offset-3",attrs:{type:"button"},on:{click:e.submits}},[e._v("注册")])])])])])])])},staticRenderFns:[function(){var e=this.$createElement,s=this._self._c||e;return s("div",{staticClass:"panel-heading"},[s("h3",{staticClass:"panel-title"},[this._v("注册帐号")])])},function(){var e=this.$createElement,s=this._self._c||e;return s("div",{staticClass:"col-sm-12"},[s("a",{staticClass:"btn btn-link  pull-right",attrs:{id:"index",href:"#/"}},[this._v("返回登录页面")])])}]},o=r("VU/8")(a,t,!1,null,null,null);s.default=o.exports}});
//# sourceMappingURL=9.63530858bf9ad78fecda.js.map