webpackJsonp([4],{"cn+G":function(t,a,e){"use strict";Object.defineProperty(a,"__esModule",{value:!0});var n=e("D7x1"),i=e("whhw"),s={data:function(){return{checkData:[],inforadmin:!1,searchData:{data:""},pageloginData:{id:this.stateid},opreate:"add",tableData:function(){}}},props:{stateid:String,statetitle:String},components:{tables:n.a,addInfor:i.a},methods:{logintable:function(t){this.tableData=t,this.tableData()},onTableClick:function(t){this.checkData=t},hasLoginComponents:function(t){return this.$api.opreate.hasLoginComponents(this,t)},inforAddClick:function(t){this.inforadmin=t,this.opreate="add"},updateData:function(){this.$api.opreate.TESTcheck(this,"修改")&&(this.inforadmin=!0,this.opreate="update")},deleteData:function(){var t=this,a=t.checkData;t.$api.opreate.TESTcheck(t,"删除")&&layer.confirm("是否删除",{btn:["确认","取消"]},function(){var e={id:a[0].id,states:{id:t.stateid}};t.$api.http.opreateHttp(t,"deleteData.action",e,"删除",t.tableData)})},searchBtnClick:function(){""!=this.searchData.data||this.$layer.msg("请输入用户名后搜索",{icon:0})}},watch:{stateid:function(t){this.pageloginData.id=t}}},o={render:function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("div",[e("div",{staticClass:"panel panel-info"},[e("div",{staticClass:"panel-body"},[e("div",[t._v("功能管理")]),t._v(" "),e("div",{directives:[{name:"show",rawName:"v-show",value:!t.inforadmin,expression:"!inforadmin"}],staticClass:"buttonbox"},[t.hasLoginComponents("sys:page:add")?e("button",{staticClass:"btn btn-info",attrs:{type:"button"},on:{click:function(a){t.inforAddClick(!0)}}},[t._v("新增")]):t._e(),t._v(" "),t.hasLoginComponents("sys:page:modify")?e("button",{staticClass:"btn btn-warning",attrs:{type:"button"},on:{click:t.updateData}},[t._v("修改")]):t._e(),t._v(" "),t.hasLoginComponents("sys:page:delete")?e("button",{staticClass:"btn btn-danger",attrs:{type:"button"},on:{click:t.deleteData}},[t._v("删除")]):t._e(),t._v(" "),t.hasLoginComponents("sys:page:search")?e("div",{staticClass:"pull-right col-sm-3 search-input"},[e("div",{staticClass:"col-sm-12"},[t._m(0),t._v(" "),e("input",{staticClass:"btn btn-info col-sm-3",attrs:{type:"button",value:"搜索"},on:{click:t.searchBtnClick}})])]):t._e()]),t._v(" "),e("tables",{directives:[{name:"show",rawName:"v-show",value:!t.inforadmin,expression:"!inforadmin"}],attrs:{pageloginData:t.pageloginData},on:{logintable:t.logintable,tableCheck:t.onTableClick}}),t._v(" "),e("add-infor",{directives:[{name:"show",rawName:"v-show",value:t.inforadmin,expression:"inforadmin"}],attrs:{tableData:t.tableData,opreate:t.opreate,statetitle:t.statetitle,stateId:t.stateid,checkData:t.checkData},on:{inforCall:t.inforAddClick}})],1)])])},staticRenderFns:[function(){var t=this.$createElement,a=this._self._c||t;return a("div",{staticClass:"col-sm-8 search-input "},[a("input",{staticClass:"form-control",attrs:{type:"text",placeholder:"搜索用户"}})])}]};var c=e("VU/8")(s,o,!1,function(t){e("hIXt")},null,null);a.default=c.exports},hIXt:function(t,a){}});
//# sourceMappingURL=4.0b21d80f3dfd3acb25d4.js.map