webpackJsonp([4],{"38ye":function(a,s){},HrnT:function(a,s,e){"use strict";Object.defineProperty(s,"__esModule",{value:!0});var t={data:function(){return{indexData:!0,userAdd:{role:"",idnumber:"",name:"",email:""},updateshow:{upDate:!1,upDatePass:!1,upDateRole:!1},userData:{},updateData:{},updateRoleData:{addData:[],deleteData:[]},role:{titleData:["角色名","描述"],alldatas:[],haddatas:[]}}},mounted:function(){this.initData()},methods:{statefilter:function(a){var s=[];return a&&a.forEach(function(a){switch(a.role_state){case"0":s.push(a.rolename+"<span class='label label-warning'>未审核</span>");break;case"1":s.push(a.rolename+"<span class='label label-success'>已审核</span>");break;case"2":s.push(a.rolename+"<span class='label label-danger'>冻结</span>")}}),s.join("  ")},submitForm:function(){var a=this,s=a.userAdd;a.$validator.validateAll().then(function(e){e&&(""!=s.role?a.$axios.post(a.HOST+"addData.action",a.userAdd).then(function(s){s.bool?a.$layer.msg("补全成功",{icon:1}):a.$layer.msg(s.msg,{icon:2})}).catch(function(a){console.log(a)}):a.$layer.msg("请选择角色",{icon:0}))})},loginData:function(){this.updateData=this.copeElement(this.userData)},copeElement:function(a){var s={};for(var e in a)s[e]=a[e];return s},initData:function(){var a=this;a.$axios.post(a.HOST+"getUserDate.action").then(function(s){if(s.bool){var e=s.data;0==e.indexData?a.indexData=!1:1==e.indexData&&(a.userData=s.data,a.indexData=!0),a.loginRoleSelectData(a)}else a.$layer.msg("初始化信息失败，请检查登录状态",{icon:5})}).catch(function(a){console.log(a)})},createok:function(){var a=0,s=this.role.alldatas,e=this.role.haddatas;s instanceof Array&&s.forEach(function(t){e instanceof Array&&e.forEach(function(e){t.id==e&&(s[a].createok=!0)}),a+=1})},updateCheckData:function(a,s){a=a;var e=this.updateRoleData,t=s.target.checked;a.id+="",t?!e.addData.indexOf(a.id)>-1&&(e.deleteData.indexOf(a.id)>-1&&(e.deleteData=e.deleteData.splice(a.id,1)),this.role.haddatas.indexOf(a.id)>-1||e.addData.push(a.id)):!e.deleteData.indexOf(a.id)>-1&&(e.addData.indexOf(a.id)>-1&&(e.addData=e.addData.splice(a.id,1)),this.role.haddatas.indexOf(a.id)>-1&&e.deleteData.push(a.id))},loginRoleSelectData:function(){var a=this;a.$axios.post(a.HOST+"allRole.action").then(function(s){var e=s.data;s.bool&&(a.role.alldatas=e.allRole,a.role.haddatas=e.hadRole,a.createok())}).catch(function(s){a.$layer.msg("网络错误，请检查网络是否畅通",{icon:5})})},UpdateData:function(a){var s=this,e={title:a,data:s.updateData};function t(a,e){s.$axios.post(s.HOST+a,e).then(function(a){a.data;if(a.bool){for(var e in s.loginData(),s.updateshow)s.updateshow[e]=!1;s.$layer.msg("修改成功",{icon:1}),s.initData()}}).catch(function(a){console.log(a)})}s.$validator.validateAll().then(function(o){if(o)switch(a){case"updateRole":e.data=s.updateRoleData,t("UserRole.action",e);break;case"updateDate":t("UserDate.action",e);break;case"updatePwd":s.updateData.newpass==s.updateData.newPass&&t("UserDate.action",e)}})}}},o={render:function(){var a=this,s=a.$createElement,e=a._self._c||s;return e("div",[e("div",{staticClass:"container",attrs:{id:"user_data"}},[a.indexData?a._e():e("div",{staticClass:"panel panel-info"},[a._m(0),a._v(" "),a._m(1),a._v(" "),e("form",{ref:"myaddForm",staticClass:"form form-horizontal",attrs:{name:"myaddForm"}},[e("div",{staticClass:"form-group"}),a._v(" "),e("div",{staticClass:"form-group"},[e("label",{staticClass:"control-label col-sm-2"},[a._v("邮箱")]),a._v(" "),e("div",{staticClass:"col-sm-10",class:{"has-success":!a.errors.has("email")&&""!=a.userAdd.email,"has-error":a.errors.has("email")}},[e("div",{staticClass:"col-sm-6"},[e("input",{directives:[{name:"model",rawName:"v-model",value:a.userAdd.email,expression:"userAdd.email"},{name:"validate",rawName:"v-validate",value:"required|email",expression:"'required|email'"}],staticClass:"form-control",attrs:{type:"text",name:"email","data-vv-as":"邮箱"},domProps:{value:a.userAdd.email},on:{input:function(s){s.target.composing||a.$set(a.userAdd,"email",s.target.value)}}})]),a._v(" "),e("div",{staticClass:"col-sm-4 text-alert text-danger"},[e("span",{directives:[{name:"show",rawName:"v-show",value:a.errors.has("email"),expression:"errors.has('email')"}]},[a._v(a._s(a.errors.first("email")))])])])]),a._v(" "),e("div",{staticClass:"form-group"},[e("label",{staticClass:"control-label col-sm-2"},[a._v("姓名")]),a._v(" "),e("div",{staticClass:"col-sm-10",class:{"has-success":!a.errors.has("name")&&""!=a.userAdd.name,"has-error":a.errors.has("name")}},[e("div",{staticClass:"col-sm-6"},[e("input",{directives:[{name:"model",rawName:"v-model",value:a.userAdd.name,expression:"userAdd.name"},{name:"validate",rawName:"v-validate",value:"required|regex:^[一-龡0a-zA-Z]+$",expression:"'required|regex:^[\\u4e00-\\u9fa10a-zA-Z]+$'"}],staticClass:"form-control",attrs:{type:"text",name:"name","data-vv-as":"姓名"},domProps:{value:a.userAdd.name},on:{input:function(s){s.target.composing||a.$set(a.userAdd,"name",s.target.value)}}})]),a._v(" "),e("div",{staticClass:"col-sm-4 text-alert text-danger"},[e("span",{directives:[{name:"show",rawName:"v-show",value:a.errors.has("name"),expression:"errors.has('name')"}]},[a._v(a._s(a.errors.first("name")))])])])]),a._v(" "),e("div",{staticClass:"form-group"},[e("label",{staticClass:"control-label col-sm-2"},[a._v("身份证号")]),a._v(" "),e("div",{staticClass:"col-sm-10",class:{"has-success":!a.errors.has("idnumber")&&""!=a.userAdd.idnumber,"has-error":a.errors.has("idnumber")}},[e("div",{staticClass:"col-sm-6"},[e("input",{directives:[{name:"model",rawName:"v-model",value:a.userAdd.idnumber,expression:"userAdd.idnumber"},{name:"validate",rawName:"v-validate",value:"required|idnumber",expression:"'required|idnumber'"}],staticClass:"form-control",attrs:{type:"text",name:"idnumber","data-vv-as":"身份证号"},domProps:{value:a.userAdd.idnumber},on:{input:function(s){s.target.composing||a.$set(a.userAdd,"idnumber",s.target.value)}}})]),a._v(" "),e("div",{staticClass:"col-sm-4 text-alert text-danger"},[e("span",{directives:[{name:"show",rawName:"v-show",value:a.errors.has("idnumber"),expression:"errors.has('idnumber')"}]},[a._v(a._s(a.errors.first("idnumber")))])])])]),a._v(" "),e("div",{staticClass:"form-group"},[e("button",{staticClass:"btn btn-info col-sm-2 col-sm-offset-4",attrs:{type:"button"},on:{click:a.submitForm}},[a._v("提 交")])])])]),a._v(" "),a.indexData?e("div",{staticClass:"panel panel-info"},[a._m(2),a._v(" "),e("div",{staticClass:"panel-body"},[e("div",{staticClass:"col-sm-12"},[e("div",{staticClass:"col-sm-1 pull-right "},[e("button",{staticClass:" btn btn-info",attrs:{type:"button"},on:{click:function(s){a.updateshow.upDate=!a.updateshow.upDate,a.loginData()}}},[a._v("编辑资料")])]),a._v(" "),e("div",{staticClass:"col-sm-1 pull-right"},[e("button",{staticClass:"btn btn-info",attrs:{ype:"button"},on:{click:function(s){a.updateshow.upDatePass=!a.updateshow.upDatePass,a.loginData()}}},[a._v("修改密码")])]),a._v(" "),e("div",{staticClass:"col-sm-1 pull-right"},[e("button",{staticClass:"btn btn-info",attrs:{ype:"button"},on:{click:function(s){a.updateshow.upDateRole=!a.updateshow.upDateRole,a.loginData()}}},[a._v("角色审核")])])]),a._v(" "),e("div",{staticClass:"col-sm-12"},[e("ul",{staticClass:"nav center-block nav-list"},[e("li",[e("span",{staticClass:"col-sm-2"},[a._v("帐号:")]),a._v(" "),e("span",{domProps:{textContent:a._s(a.userData.id)}})]),a._v(" "),e("li",[e("span",{staticClass:"col-sm-2"},[a._v("昵称:")]),a._v(" "),e("span",{domProps:{textContent:a._s(a.userData.nic)}})]),a._v(" "),e("li",[e("span",{staticClass:"col-sm-2"},[a._v("姓名:")]),a._v(" "),e("span",{domProps:{textContent:a._s(a.userData.name)}})]),a._v(" "),e("li",[e("span",{staticClass:"col-sm-2"},[a._v("电话:")]),a._v(" "),e("span",{domProps:{textContent:a._s(a.userData.tel)}})]),a._v(" "),e("li",[e("span",{staticClass:"col-sm-2"},[a._v("邮箱:")]),a._v(" "),e("span",{domProps:{textContent:a._s(a.userData.email)}})]),a._v(" "),e("li",[e("span",{staticClass:"col-sm-2"},[a._v("拥有角色:")]),a._v(" "),e("span",{domProps:{innerHTML:a._s(a.statefilter(a.userData.hadRole))}})]),a._v(" "),e("li",[e("span",{staticClass:"col-sm-2"},[a._v("身份证号:")]),a._v(" "),e("span",{domProps:{textContent:a._s(a.userData.idnumber)}})]),a._v(" "),e("li",[e("span",{staticClass:"col-sm-2"},[a._v("注册时间:")]),a._v(" "),e("span",[a._v(a._s(a._f("datafilter")(a.userData.regtime,"yyyyMMdd")))])])])])]),a._v(" "),a.updateshow.upDateRole?e("div",{staticClass:"back_box"},[e("div",{staticClass:"panel panel-info col-sm-6 col-sm-offset-3 "},[e("div",{staticClass:"panel-heading"},[e("h2",{staticClass:"panel-title"},[a._v("角色选择 "),e("span",{staticClass:"close glyphicon glyphicon-remove",on:{click:function(s){a.updateshow.upDateRole=!a.updateshow.upDateRole}}})])]),a._v(" "),e("table",{staticClass:"table table-bordered table-striped table-hover"},[e("thead",[e("tr",[a._m(3),a._v(" "),a._l(a.role.titleData,function(s,t){return e("th",{key:t,domProps:{textContent:a._s(s)}})})],2)]),a._v(" "),e("tbody",a._l(a.role.alldatas,function(s,t){return e("tr",{key:t},[e("td",[e("input",{directives:[{name:"model",rawName:"v-model",value:s.createok,expression:"datas.createok"}],attrs:{type:"checkbox",name:"",id:""},domProps:{checked:Array.isArray(s.createok)?a._i(s.createok,null)>-1:s.createok},on:{change:[function(e){var t=s.createok,o=e.target,r=!!o.checked;if(Array.isArray(t)){var l=a._i(t,null);o.checked?l<0&&a.$set(s,"createok",t.concat([null])):l>-1&&a.$set(s,"createok",t.slice(0,l).concat(t.slice(l+1)))}else a.$set(s,"createok",r)},function(e){a.updateCheckData(s,e)}]}})]),a._v(" "),e("td",[a._v(a._s(s.name))]),a._v(" "),e("td",[a._v(a._s(s.detail))])])}))]),a._v(" "),e("div",{staticClass:"form-group"},[e("button",{staticClass:"btn btn-info  col-sm-3 col-sm-offset-2",attrs:{type:"button"},on:{click:function(s){a.UpdateData("updateRole")}}},[a._v("提 交")])])])]):a._e(),a._v(" "),a.updateshow.upDatePass?e("div",{staticClass:"back_box "},[e("div",{staticClass:"panel panel-info col-sm-6 col-sm-offset-3 "},[e("div",{staticClass:"panel-heading"},[e("h2",{staticClass:"panel-title"},[a._v("修改信息\n            "),e("span",{staticClass:"close glyphicon glyphicon-remove",on:{click:function(s){a.updateshow.upDatePass=!a.updateshow.upDatePass}}})])]),a._v(" "),e("form",{staticClass:"form form-horizontal panel-body",attrs:{name:"myFormPass"}},[e("div",{staticClass:"form-group"},[e("label",{staticClass:"col-sm-3 control-label"},[a._v("旧密码")]),a._v(" "),e("div",{staticClass:"col-sm-8",class:{"has-success":!a.errors.has("myoldPass")&&null!=a.updateData.oldPass,"has-error":a.errors.has("myoldPass")}},[e("div",{staticClass:"col-sm-12"},[e("input",{directives:[{name:"model",rawName:"v-model",value:a.updateData.oldPass,expression:"updateData.oldPass"},{name:"validate",rawName:"v-validate",value:"required",expression:"'required'"}],staticClass:"form-control",attrs:{type:"password",name:"myoldPass",placeholder:"请输入旧密码","data-vv-as":"密码"},domProps:{value:a.updateData.oldPass},on:{input:function(s){s.target.composing||a.$set(a.updateData,"oldPass",s.target.value)}}})])]),a._v(" "),e("div",{staticClass:"col-sm-10 col-sm-offset-2 text-alert control-label text-danger"},[e("span",{directives:[{name:"show",rawName:"v-show",value:a.errors.has("myoldPass"),expression:"errors.has('myoldPass')"}]},[a._v(a._s(a.errors.first("myoldPass")))])])]),a._v(" "),e("div",{staticClass:"form-group"},[e("label",{staticClass:"col-sm-3 control-label"},[a._v("新密码")]),a._v(" "),e("div",{staticClass:"col-sm-8",class:{"has-success":!a.errors.has("newPass")&&null!=a.updateData.newpass,"has-error":a.errors.has("newPass")}},[e("div",{staticClass:"col-sm-12"},[e("input",{directives:[{name:"model",rawName:"v-model",value:a.updateData.newpass,expression:"updateData.newpass"},{name:"validate",rawName:"v-validate",value:"required|password",expression:"'required|password'"}],staticClass:"form-control",attrs:{type:"password",name:"newPass",placeholder:"请输入新密码","data-vv-as":"密码"},domProps:{value:a.updateData.newpass},on:{input:function(s){s.target.composing||a.$set(a.updateData,"newpass",s.target.value)}}})])]),a._v(" "),e("div",{staticClass:"col-sm-10 col-sm-offset-2 text-alert control-label text-danger"},[e("span",{directives:[{name:"show",rawName:"v-show",value:a.errors.has("newPass"),expression:"errors.has('newPass')"}]},[a._v(a._s(a.errors.first("newPass")))])]),a._v(" "),e("div",{staticClass:"col-sm-10 col-sm-offset-3",staticStyle:{"font-size":"8px"}},[a._v("密码为字母、数字和符号两种及以上的组合，6-16个字符")])]),a._v(" "),e("div",{staticClass:"form-group"},[e("label",{staticClass:"col-sm-3 control-label"},[a._v("确认密码")]),a._v(" "),e("div",{staticClass:"col-sm-8",class:{"has-success":!a.errors.has("mynewPass")&&a.updateData.newpass==a.updateData.newPass&&null!=a.updateData.newPass,"has-error":a.errors.has("mynewPass")||a.updateData.newpass!=a.updateData.newPass}},[e("div",{staticClass:"col-sm-12"},[e("input",{directives:[{name:"model",rawName:"v-model",value:a.updateData.newPass,expression:"updateData.newPass"},{name:"validate",rawName:"v-validate",value:"required",expression:"'required'"}],staticClass:"form-control",attrs:{type:"password",name:"mynewPass",placeholder:"请再次输入新密码","data-vv-as":"密码"},domProps:{value:a.updateData.newPass},on:{input:function(s){s.target.composing||a.$set(a.updateData,"newPass",s.target.value)}}})])]),a._v(" "),e("div",{staticClass:"col-sm-10 col-sm-offset-2 text-alert control-label text-danger"},[e("span",{directives:[{name:"show",rawName:"v-show",value:a.errors.has("mynewPass"),expression:"errors.has('mynewPass')"}]},[a._v(a._s(a.errors.first("mynewPass")))]),a._v(" "),e("span",{directives:[{name:"show",rawName:"v-show",value:a.updateData.newpass!=a.updateData.newPass&&null!=a.updateData.newPass,expression:"updateData.newpass!=updateData.newPass&&updateData.newPass!=null"}]},[a._v("两次密码不符")])])]),a._v(" "),e("div",{staticClass:"form-group"},[e("button",{staticClass:"btn btn-info  col-sm-3 col-sm-offset-4",attrs:{type:"button"},on:{click:function(s){a.UpdateData("updatePwd")}}},[a._v("提 交")])])])])]):a._e(),a._v(" "),a.updateshow.upDate?e("div",{staticClass:"back_box "},[e("div",{staticClass:"panel panel-info col-sm-6 col-sm-offset-3"},[e("div",{staticClass:"panel-heading"},[e("h2",{staticClass:"panel-title"},[a._v("修改信息\n            "),e("span",{staticClass:"close glyphicon glyphicon-remove",on:{click:function(s){a.updateshow.upDate=!a.updateshow.upDate}}})])]),a._v(" "),e("form",{staticClass:"form form-horizontal panel-body",attrs:{name:"myForm"}},[e("div",{staticClass:"form-group"},[e("label",{staticClass:"col-sm-3 control-label"},[a._v("昵称")]),a._v(" "),e("div",{staticClass:"col-sm-8",class:{"has-success":!a.errors.has("myNic")&&null!=a.updateData.nic,"has-error":a.errors.has("myNic")}},[e("div",{staticClass:"col-sm-12"},[e("input",{directives:[{name:"model",rawName:"v-model",value:a.updateData.nic,expression:"updateData.nic"},{name:"validate",rawName:"v-validate",value:"required|cnlength:12",expression:"'required|cnlength:12'"}],staticClass:"form-control",attrs:{type:"text",name:"myNic",required:"","data-vv-as":"昵称"},domProps:{value:a.updateData.nic},on:{input:function(s){s.target.composing||a.$set(a.updateData,"nic",s.target.value)}}})])]),a._v(" "),e("div",{staticClass:"col-sm-10 col-sm-offset-2 text-alert control-label text-danger"},[e("span",{directives:[{name:"show",rawName:"v-show",value:a.errors.has("myNic"),expression:"errors.has('myNic')"}]},[a._v(a._s(a.errors.first("myNic")))])])]),a._v(" "),e("div",{staticClass:"form-group"},[e("label",{staticClass:"col-sm-3 control-label"},[a._v("姓名")]),a._v(" "),e("div",{staticClass:"col-sm-8",class:{"has-success":!a.errors.has("myName")&&null!=a.updateData.name,"has-error":a.errors.has("myName")}},[e("div",{staticClass:"col-sm-12"},[e("input",{directives:[{name:"model",rawName:"v-model",value:a.updateData.name,expression:"updateData.name"},{name:"validate",rawName:"v-validate",value:"required|regex:^[一-龡0a-zA-Z]+$",expression:"'required|regex:^[\\u4e00-\\u9fa10a-zA-Z]+$'"}],staticClass:"form-control",attrs:{type:"text",name:"myName","data-vv-as":"姓名"},domProps:{value:a.updateData.name},on:{input:function(s){s.target.composing||a.$set(a.updateData,"name",s.target.value)}}})])]),a._v(" "),e("div",{staticClass:"col-sm-10 col-sm-offset-2 text-alert control-label text-danger "},[e("span",{directives:[{name:"show",rawName:"v-show",value:a.errors.has("myName"),expression:"errors.has('myName')"}]},[a._v(a._s(a.errors.first("myName")))])])]),a._v(" "),e("div",{staticClass:"form-group"},[e("label",{staticClass:"col-sm-3 control-label"},[a._v("邮箱")]),a._v(" "),e("div",{staticClass:"col-sm-8",class:{"has-success":!a.errors.has("myEmail")&&null!=a.updateData.email,"has-error":a.errors.has("myEmail")}},[e("div",{staticClass:"col-sm-12"},[e("input",{directives:[{name:"model",rawName:"v-model",value:a.updateData.email,expression:"updateData.email"},{name:"validate",rawName:"v-validate",value:"required|email",expression:"'required|email'"}],staticClass:"form-control",attrs:{type:"email",name:"myEmail",required:"","data-vv-as":"邮箱"},domProps:{value:a.updateData.email},on:{input:function(s){s.target.composing||a.$set(a.updateData,"email",s.target.value)}}})])]),a._v(" "),e("div",{staticClass:"col-sm-10 col-sm-offset-2 text-alert control-label text-danger "},[e("span",{directives:[{name:"show",rawName:"v-show",value:a.errors.has("myEmail"),expression:"errors.has('myEmail')"}]},[a._v(a._s(a.errors.first("myEmail")))])])]),a._v(" "),e("div",{staticClass:"form-group"},[e("button",{staticClass:"btn btn-info  col-sm-3 col-sm-offset-4",attrs:{type:"button"},on:{click:function(s){a.UpdateData("updateDate")}}},[a._v("提 交")])])])])]):a._e()]):a._e()])])},staticRenderFns:[function(){var a=this.$createElement,s=this._self._c||a;return s("div",{staticClass:"panel-heading"},[s("h2",{staticClass:"panel-title"},[this._v("补全资料")])])},function(){var a=this.$createElement,s=this._self._c||a;return s("div",{staticClass:"panel-body"},[s("h4",{staticClass:"text-primary"},[this._v("请补全您的信息，方便获取系统更多的功能")])])},function(){var a=this.$createElement,s=this._self._c||a;return s("div",{staticClass:"panel-heading"},[s("h2",{staticClass:"panel-title"},[this._v("基本资料")])])},function(){var a=this.$createElement,s=this._self._c||a;return s("th",[s("input",{attrs:{type:"checkbox",name:"",id:""}})])}]};var r=e("VU/8")(t,o,!1,function(a){e("38ye")},"data-v-725cff16",null);s.default=r.exports}});
//# sourceMappingURL=4.9904c7bbecc151117eea.js.map