webpackJsonp([3],{"2ECj":function(s,t){},lmfZ:function(s,t,e){"use strict";Object.defineProperty(t,"__esModule",{value:!0});e("n4oI");var o={data:function(){return{user:{id:"",pass:"",code:""},imgsrc:this.HOST+"captcha.jpg",errormsg:""}},methods:{clickIMG:function(){this.$refs.img.src=this.imgsrc+"?"+new Date},loginByTel:function(){var s=this,t=s.user;""!=t.id&&""!=t.pass&&s.$axios.post(s.HOST+"login.action",t).then(function(t){s.opreateResp(t.data)}).catch(function(t){console.log(t),s.$layer.msg("网络错误，请检查网络是否畅通",{icon:3})})},opreateResp:function(s){var t=this;switch(s.code){case"0":t.$store.commit("UPDATE_USER",{id:s.id}),t.$store.commit("SET_IS_LOGIN",!0),t.$layer.msg("登录成功",{icon:1,end:function(s,e){t.$router.push("/main")}});break;case"500":t.errormsg='<div class="alert alert-danger">'+s.msg+"</div>",t.clickIMG(),t.user.pass=t.user.code=""}}}},a={render:function(){var s=this,t=s.$createElement,e=s._self._c||t;return e("div",[e("div",{staticClass:"container login"},[e("form",{staticClass:"form-horizontal  col-sm-5 col-sm-offset-3 form_box",attrs:{name:"myform"}},[e("div",{staticClass:"form-group",domProps:{innerHTML:s._s(s.errormsg)}}),s._v(" "),e("div",{staticClass:"form-group col-sm-12"},[e("label",{staticClass:"control-label col-sm-2",attrs:{for:"ID"}},[s._v("帐号")]),s._v(" "),e("div",{staticClass:" input-group"},[e("input",{directives:[{name:"model",rawName:"v-model",value:s.user.id,expression:"user.id"}],staticClass:"form-control",attrs:{type:"text",id:"ID",required:"",name:"id",placeholder:"请输入帐号"},domProps:{value:s.user.id},on:{input:function(t){t.target.composing||s.$set(s.user,"id",t.target.value)}}}),s._v(" "),s._m(0)])]),s._v(" "),e("div",{staticClass:"form-group col-sm-12"},[e("label",{staticClass:"control-label col-sm-2",attrs:{for:"pass"}},[s._v("密码")]),s._v(" "),e("div",{staticClass:"input-group"},[e("input",{directives:[{name:"model",rawName:"v-model",value:s.user.pass,expression:"user.pass"}],staticClass:"form-control",attrs:{type:"password",id:"pass",required:"",name:"pass",placeholder:"请输入密码"},domProps:{value:s.user.pass},on:{input:function(t){t.target.composing||s.$set(s.user,"pass",t.target.value)}}}),s._v(" "),s._m(1)])]),s._v(" "),e("div",{staticClass:"form-group col-sm-12"},[e("label",{staticClass:"control-label col-sm-2",attrs:{for:"loginCode"}},[s._v("验证码")]),s._v(" "),e("div",{staticClass:"col-sm-3 logincode "},[e("div",{staticClass:"input-group col-sm-12"},[e("input",{directives:[{name:"model",rawName:"v-model",value:s.user.code,expression:"user.code"}],staticClass:"form-control",attrs:{type:"text",id:"loginCode",required:"",name:"loginCode",placeholder:"输入验证码"},domProps:{value:s.user.code},on:{input:function(t){t.target.composing||s.$set(s.user,"code",t.target.value)}}})])]),s._v(" "),e("div",{staticClass:"col-sm-7 logincode "},[e("img",{ref:"img",staticClass:"col-sm-6 logincode codeimg",attrs:{src:s.imgsrc,name:"img"}}),s._v(" "),e("a",{staticClass:"btn btn-link col-sm-6",on:{click:s.clickIMG}},[s._v("看不清，换一张")])])]),s._v(" "),e("div",{staticClass:"form-group"},[e("div",{staticClass:"col-sm-3 col-sm-offset-4"},[e("button",{staticClass:"btn btn-info btn-block",attrs:{type:"button",href:"javascript:void(0)"},on:{click:s.loginByTel}},[s._v("登录")])])]),s._v(" "),e("a",{staticClass:"btn btn-link pull-right",attrs:{href:"#/rigster"}},[s._v("注册新用户")])])])])},staticRenderFns:[function(){var s=this.$createElement,t=this._self._c||s;return t("div",{staticClass:"input-group-addon"},[t("span",{staticClass:"glyphicon glyphicon-user "})])},function(){var s=this.$createElement,t=this._self._c||s;return t("div",{staticClass:"input-group-addon"},[t("span",{staticClass:"glyphicon glyphicon-lock "})])}]};var i=e("VU/8")(o,a,!1,function(s){e("2ECj")},"data-v-c05f16ae",null);t.default=i.exports},n4oI:function(s,t){}});
//# sourceMappingURL=3.0d71ef411ec29146dbd3.js.map