(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d0d5c52"],{7069:function(e,t,a){"use strict";a.r(t);var n=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("el-card",{staticClass:"card_back",scopedSlots:e._u([{key:"header",fn:function(){return[a("div",{staticClass:"buttons"},[a("el-select",{model:{value:e.rolestate,callback:function(t){e.rolestate=t},expression:"rolestate"}},[a("el-option",{attrs:{label:"未审核",value:"0"}}),a("el-option",{attrs:{label:"已审核",value:"1"}})],1)],1)]},proxy:!0}])},[a("table-page",{attrs:{url:e.tableinit.url,datatitle:e.tableinit.datatitle,parems:e.tableinit.parems,opreate:e.tableinit.opreate}})],1)},r=[],i=(a("c5f6"),a("2d7d")),l=a.n(i),s={computed:{examineShow:function(){return this.utils.hasLoginComponents("sys:userMan:roleOpera")&&0==this.rolestate||null==this.rolestate},retrialShow:function(){return this.utils.hasLoginComponents("sys:userMan:roleOpera")&&1==this.rolestate}},data:function(){var e=this,t=e.utils.hasLoginComponents;return{rolestate:"0",tableinit:{url:"/selectUserPaging.action",parems:{state:0},datatitle:[{prop:"userid",width:"100",label:"用户编号",fixed:!0},{prop:"username",width:"100",label:"用户名称"},{prop:"tel",width:"150",label:"电话"},{prop:"email",width:"200",label:"邮箱"},{prop:"name",width:"100",label:"姓名"},{prop:"state",width:"100",label:"账号状态",component:{render:e.stateRender}},{prop:"regtime",width:"200",label:"注册时间",formatter:e.dateFormatter},{prop:"type_name",width:"100",label:"所属平台"},{prop:"rolename",width:"100",label:"角色名称"},{prop:"role_state",width:"100",label:"角色状态",component:{render:e.roleStateRender}}],opreate:{label:"操作",minwidth:"200",btn:[{type:"primary",size:"mini",icon:"el-icon-check",text:"审核",btnfun:e.examine,circle:!0,show:e.examineShow||!0},{type:"warning",size:"mini",icon:"el-icon-close",text:"冻结",btnfun:e.retrial,circle:!0,show:e.retrialShow},{type:"danger",size:"mini",icon:"el-icon-delete",text:"删除",btnfun:e.delete,circle:!0,show:t("sys:userMan:userOpera")}]}}}},watch:{rolestate:function(e){this.tableinit.parems.state=e,this.tableinit.opreate.btn[0].show=this.examineShow,this.tableinit.opreate.btn[1].show=this.retrialShow}},components:{tablePage:function(){return a.e("chunk-709599df").then(a.bind(null,"7a95"))}},methods:{stateRender:function(e,t,a,n){var r=new l.a([[0,function(){return e("el-tag",{attrs:{type:"warning"}},["注销"])}],[1,function(){return e("el-tag",{attrs:{type:"success"}},["正常"])}],[2,function(){return e("el-tag",{attrs:{type:"danger"}},["冻结"])}]]);return null!=t.state?r.get(Number(t.state))():null},roleStateRender:function(e,t,a,n){var r=new l.a([[0,function(){return e("el-tag",{attrs:{type:"warning"}},["未审核"])}],[1,function(){return e("el-tag",{attrs:{type:"success"}},["已审核"])}],[2,function(){return e("el-tag",{attrs:{type:"danger"}},["冻结"])}]]);return null!=t.role_state?r.get(Number(t.role_state))():null},dateFormatter:function(e,t,a,n){var r=this;return r.utils.date.formatter(a)},examine:function(e){this.$api.opreateRequset("/examineUser.action",vm.utils.data.formatter(e),"审核")},retrial:function(e){this.$api.opreateRequset("/frozenUser.action",vm.utils.data.formatter(e),"冻结")},delete:function(e){var t=this,a={id:e.userid};t.$api.deleteRequset("/deleteUserData.action",t.utils.data.formatter(a))}}},o=s,u=a("2877"),c=Object(u["a"])(o,n,r,!1,null,null,null);t["default"]=c.exports}}]);
//# sourceMappingURL=chunk-2d0d5c52.306da30d.js.map