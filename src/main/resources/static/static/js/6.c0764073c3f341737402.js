webpackJsonp([6],{"cn+G":function(t,a,e){"use strict";Object.defineProperty(a,"__esModule",{value:!0});var i=e("D7x1"),n=e("whhw"),s={data:function(){return{inforadmin:!1,searchData:{data:""},opreate:"add",tableSelectData:{selectTableurl:"selectFunctionPaging.action",pageloginData:{id:this.stateid}}}},props:{stateid:String,statetitle:String},components:{tables:i.a,addInfor:n.a},methods:{inforAddClick:function(t){this.inforadmin=t,this.opreate="add"},updateData:function(){this.$api.opreate.TESTcheck(this,"修改")&&(this.inforadmin=!0,this.opreate="update")},deleteData:function(){var t=this,a=t.$store.getters.GETUSERTABLEPAGECHECKDATA;t.$api.opreate.TESTcheck(t,"删除")&&layer.confirm("是否删除",{btn:["确认","取消"]},function(){var e={id:a[0].id,states:{id:t.stateid}};t.$api.http.opreateHttp(t,"deleteFunctionData.action",e,"删除")})},searchBtnClick:function(){""!=this.searchData.data||this.$layer.msg("请输入用户名后搜索",{icon:0})}},watch:{stateid:function(t){this.tableSelectData.pageloginData.id=t}}},o={render:function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("div",[e("div",{staticClass:"panel panel-info"},[e("div",{staticClass:"panel-body"},[e("div",[t._v("功能管理")]),t._v(" "),e("div",{directives:[{name:"show",rawName:"v-show",value:!t.inforadmin,expression:"!inforadmin"}],staticClass:"buttonbox"},[t.$api.opreate.hasLoginComponents(this,"sys:page:add")?e("button",{staticClass:"btn btn-info",attrs:{type:"button"},on:{click:function(a){t.inforAddClick(!0)}}},[t._v("新增")]):t._e(),t._v(" "),t.$api.opreate.hasLoginComponents(this,"sys:page:modify")?e("button",{staticClass:"btn btn-warning",attrs:{type:"button"},on:{click:t.updateData}},[t._v("修改")]):t._e(),t._v(" "),t.$api.opreate.hasLoginComponents(this,"sys:page:delete")?e("button",{staticClass:"btn btn-danger",attrs:{type:"button"},on:{click:t.deleteData}},[t._v("删除")]):t._e(),t._v(" "),t.$api.opreate.hasLoginComponents(this,"sys:page:search")?e("div",{staticClass:"pull-right col-sm-3 search-input"},[e("div",{staticClass:"col-sm-12"},[t._m(0),t._v(" "),e("input",{staticClass:"btn btn-info col-sm-3",attrs:{type:"button",value:"搜索"},on:{click:t.searchBtnClick}})])]):t._e()]),t._v(" "),e("tables",{directives:[{name:"show",rawName:"v-show",value:!t.inforadmin,expression:"!inforadmin"}],attrs:{tableSelectData:t.tableSelectData}}),t._v(" "),e("add-infor",{directives:[{name:"show",rawName:"v-show",value:t.inforadmin,expression:"inforadmin"}],attrs:{tableSelectData:t.tableSelectData,opreate:t.opreate,statetitle:t.statetitle,stateId:t.stateid},on:{inforCall:t.inforAddClick}})],1)])])},staticRenderFns:[function(){var t=this.$createElement,a=this._self._c||t;return a("div",{staticClass:"col-sm-8 search-input "},[a("input",{staticClass:"form-control",attrs:{type:"text",placeholder:"搜索用户"}})])}]};var r=e("VU/8")(s,o,!1,function(t){e("q7xp")},null,null);a.default=r.exports},q7xp:function(t,a){}});
//# sourceMappingURL=6.c0764073c3f341737402.js.map