webpackJsonp([8],{fW9n:function(t,a,e){"use strict";Object.defineProperty(a,"__esModule",{value:!0});var s=e("Xxa5"),n=e.n(s),i=e("exGp"),o=e.n(i),r=e("D7x1"),c={data:function(){return{inforadmin:!1,opreate:"add",tableSelectData:{selectTableurl:"equipment/selectControlType.action",pageloginData:{id:this.stateid},filterName:[]},addData:{control_type_name:"",other:"",function_explain:""}}},props:{stateid:String,statetitle:String},computed:{checkData:function(){return this.$store.getters.GETUSERTABLEPAGECHECKDATA}},components:{tables:r.a},methods:{inforAddClick:function(t){var a,e=(a=o()(n.a.mark(function t(){var a;return n.a.wrap(function(t){for(;;)switch(t.prev=t.next){case 0:for(a in s.addData)s.addData[a]="";return t.abrupt("return",!0);case 2:case"end":return t.stop()}},t,this)})),function(){return a.apply(this,arguments)}),s=this;"update"==this.opreate&&(this.addData=this.$api.opreate.ObjectCopy(this.checkData[0])),e().then(function(){s.opreate="add",s.inforadmin=t,s.$validator.errors.items=[]})},updateData:function(){this.$api.opreate.TESTcheck(this,"修改")&&(this.inforadmin=!0,this.opreate="update",this.addData=this.$api.opreate.ObjectCopy(this.checkData[0]))},addDatas:function(){var t,a=(t=o()(n.a.mark(function t(){var a;return n.a.wrap(function(t){for(;;)switch(t.prev=t.next){case 0:return"update"==e.opreate?a=e.$api.http.opreateHttp(e,"equipment/updateControlType.action",i,"修改",""):"add"==e.opreate&&(a=e.$api.http.opreateHttp(e,"equipment/addControlType.action",i,"添加","")),t.abrupt("return",a);case 2:case"end":return t.stop()}},t,this)})),function(){return t.apply(this,arguments)}),e=this,s=e.stateid,i={data:e.addData,states:{id:s}};a().then(function(t){e.inforAddClick(!1)})},deleteData:function(){var t=this,a=t.$store.getters.GETUSERTABLEPAGECHECKDATA;t.$api.opreate.TESTcheck(t,"删除")&&layer.confirm("是否删除",{btn:["确认","取消"]},function(){var e={id:a[0].id,states:{id:t.stateid}};t.$api.http.opreateHttp(t,"equipment/deleteControlType.action",e,"删除")})},searchBtnClick:function(){""!=this.searchData.data||this.$layer.msg("请输入场景地址名后搜索",{icon:0})}}},l={render:function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("div",[e("div",{staticClass:"panel panel-info"},[e("div",{staticClass:"panel-body"},[e("div",[t._v("设备控制类型管理")]),t._v(" "),e("div",{directives:[{name:"show",rawName:"v-show",value:!t.inforadmin,expression:"!inforadmin"}],staticClass:"buttonbox"},[t.$api.opreate.hasLoginComponents(this,"sys:page:add")?e("button",{staticClass:"btn btn-info",attrs:{type:"button"},on:{click:function(a){t.inforAddClick(!0)}}},[t._v("新增")]):t._e(),t._v(" "),t.$api.opreate.hasLoginComponents(this,"sys:page:modify")?e("button",{staticClass:"btn btn-warning",attrs:{type:"button"},on:{click:t.updateData}},[t._v("修改")]):t._e(),t._v(" "),t.$api.opreate.hasLoginComponents(this,"sys:page:delete")?e("button",{staticClass:"btn btn-danger",attrs:{type:"button"},on:{click:t.deleteData}},[t._v("删除")]):t._e(),t._v(" "),t.$api.opreate.hasLoginComponents(this,"sys:page:search")?e("div",{staticClass:"pull-right col-sm-3 search-input"},[e("div",{staticClass:"col-sm-12"},[t._m(0),t._v(" "),e("input",{staticClass:"btn btn-info col-sm-3",attrs:{type:"button",value:"搜索"},on:{click:t.searchBtnClick}})])]):t._e()]),t._v(" "),e("tables",{directives:[{name:"show",rawName:"v-show",value:!t.inforadmin,expression:"!inforadmin"}],attrs:{tableSelectData:t.tableSelectData}}),t._v(" "),e("div",{directives:[{name:"show",rawName:"v-show",value:t.inforadmin,expression:"inforadmin"}]},[e("form",{ref:"refForm",staticClass:"form form-horizontal col-sm-8"},[e("div",{staticClass:"form-group"},[e("label",{staticClass:"control-label col-sm-2"},[t._v("控制类型名称")]),t._v(" "),e("div",{staticClass:"col-sm-6",class:{"has-success":!t.errors.has("name")&&""!=t.addData.control_type_name,"has-error":t.errors.has("name")}},[e("input",{directives:[{name:"model",rawName:"v-model",value:t.addData.control_type_name,expression:"addData.control_type_name"},{name:"validate",rawName:"v-validate",value:t.$api.opreate.validateAdd("name",30,t.stateid,t.opreate,"equipment"),expression:"$api.opreate.validateAdd('name',30,stateid,opreate,'equipment')"}],staticClass:"form-control",attrs:{type:"text",name:"name",placeholder:"请输入控制类型名称,最多为30位","data-vv-as":"控制类型名称"},domProps:{value:t.addData.control_type_name},on:{input:function(a){a.target.composing||t.$set(t.addData,"control_type_name",a.target.value)}}})]),t._v(" "),e("div",{staticClass:"text-danger"},[e("span",{directives:[{name:"show",rawName:"v-show",value:t.errors.has("name"),expression:"errors.has('name')"}]},[t._v(t._s(t.errors.first("name")))])])]),t._v(" "),e("div",{staticClass:"form-group"},[e("label",{staticClass:"control-label col-sm-2"},[t._v("功能说明")]),t._v(" "),e("div",{staticClass:"col-sm-6",class:{"has-success":!t.errors.has("explain")&&""!=t.addData.function_explain,"has-error":t.errors.has("explain")}},[e("textarea",{directives:[{name:"model",rawName:"v-model",value:t.addData.function_explain,expression:"addData.function_explain"},{name:"validate",rawName:"v-validate",value:"required",expression:"'required'"}],staticClass:"form-control",attrs:{rows:"6",name:"explain",placeholder:"请输入功能说明","data-vv-as":"功能说明"},domProps:{value:t.addData.function_explain},on:{input:function(a){a.target.composing||t.$set(t.addData,"function_explain",a.target.value)}}})]),t._v(" "),e("div",{staticClass:"text-danger"},[e("span",{directives:[{name:"show",rawName:"v-show",value:t.errors.has("explain"),expression:"errors.has('explain')"}]},[t._v(t._s(t.errors.first("explain")))])])]),t._v(" "),e("div",{staticClass:"form-group col-sm-12"},[e("button",{staticClass:" col-sm-2 col-sm-offset-2 btn btn-info",attrs:{type:"button"},on:{click:t.addDatas}},[t._v("提交")]),t._v(" "),e("button",{staticClass:" col-sm-2 col-sm-offset-2  btn btn-warning",attrs:{type:"button"},on:{click:function(a){t.inforAddClick(!1)}}},[t._v("返回")])])])])],1)])])},staticRenderFns:[function(){var t=this.$createElement,a=this._self._c||t;return a("div",{staticClass:"col-sm-8 search-input "},[a("input",{staticClass:"form-control",attrs:{type:"text",placeholder:"搜索用户"}})])}]};var d=e("VU/8")(c,l,!1,function(t){e("v2Us")},null,null);a.default=d.exports},v2Us:function(t,a){}});
//# sourceMappingURL=8.f06bbe7f4339d1ef7e31.js.map