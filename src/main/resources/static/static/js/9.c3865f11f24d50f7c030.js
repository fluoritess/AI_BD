webpackJsonp([9],{"9/2I":function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var o=a("D7x1"),s={data:function(){return{inforadmin:!1,opreate:"add",tableSelectData:{selectTableurl:"",pageloginData:{id:this.stateid,state:{statetype_id:0,statetype:"00",statetype_style_id:0}},filterName:[]},addData:{equipment_type_id:"",equipment_name:"",control_type_id:"",manufacturer_id:"",function_explain:""},addDeployData:{remarks:"",deploy_node_id:"",equipment_id:""},equipmentDeployAdmin:!1,equipment_type:[],control_type:[],manufacturer:[],deploy_type:[]}},props:{stateid:String,statetitle:String},computed:{checkData:function(){return this.$store.getters.GETUSERTABLEPAGECHECKDATA}},components:{tables:o.a},methods:{equipmentDeployClick:function(t){var e=this;t&&e.$api.opreate.TESTcheck(e,"部署节点")&&(e.addDeployData.equipment_id=e.checkData[0].equipment_id,e.loginDeploy_type()),e.equipmentDeployAdmin=t},inforAddClick:function(t){for(var e in this.inforadmin=t,this.opreate="add",this.addData)this.addData[e]="";t&&this.loginAddequipInfor(),this.$validator.errors.clear()},updateData:function(){var t=this;t.$api.opreate.TESTcheck(t,"修改")&&(t.inforadmin=!0,t.opreate="update",t.addData=t.checkData[0],t.loginAddequipInfor())},loginAddequipInfor:function(){this.loginControl_type(),this.loginControl_type(),this.loginManufacturer()},addDatas:function(){var t,e=this,a=e.stateid,o={data:e.addData,states:{id:a}};"update"==e.opreate?t=e.$api.http.opreateHttp(e,"",o,"修改",""):"add"==e.opreate&&(t=e.$api.http.opreateHttp(e,"",o,"添加","")),setTimeout(function(){e.$validator.errors.clear()},300),t.then(function(t){t&&setTimeout(function(){e.inforAddClick(!1)},800)})},addDeployDatas:function(){var t=this,e=t.stateid,a={data:t.addDeployData,states:{id:e}};bool=t.$api.http.opreateHttp(t,"",a,"添加",""),setTimeout(function(){t.$validator.errors.clear()},300),bool.then(function(e){e&&setTimeout(function(){t.equipmentDeployClick(!1)},800)})},deleteData:function(){var t=this,e=t.$store.getters.GETUSERTABLEPAGECHECKDATA;t.$api.opreate.TESTcheck(t,"删除")&&layer.confirm("是否删除",{btn:["确认","取消"]},function(){var a={id:e[0].id,states:{id:t.stateid}};t.$api.http.opreateHttp(t,"",a,"删除")})},searchBtnClick:function(){""!=this.searchData.data||this.$layer.msg("请输入场景地址名后搜索",{icon:0})},changeAudit:function(){var t=this,e=t.tableSelectData.pageloginData.state.statetype.split("");t.tableSelectData.pageloginData.state.statetype_id=e[0],t.tableSelectData.pageloginData.state.statetype_style_id=e[1],console.log(t.tableSelectData.pageloginData),t.$store.commit("REININTPAGE"),t.$api.http.loginTableData(t,"selectUserPaging.action",t.tableSelectData.pageloginData)},loginEquipment_type:function(){var t=this;t.$axios.post(t.HOST+"").then(function(e){e.bool&&(t.equipment_type=e.data.list)}).catch(function(t){console.log(t)})},loginControl_type:function(){var t=this;t.$axios.post(t.HOST+"").then(function(e){e.bool&&(t.control_type=e.data.list)}).catch(function(t){console.log(t)})},loginManufacturer:function(){var t=this;t.$axios.post(t.HOST+"").then(function(e){e.bool&&(t.manufacturer=e.data.list)}).catch(function(t){console.log(t)})},loginDeploy_type:function(){var t=this;t.$axios.post(t.HOST+"").then(function(e){e.bool&&(t.deploy_type=e.data.list)}).catch(function(t){console.log(t)})}}},n={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("div",{staticClass:"panel panel-info"},[a("div",{staticClass:"panel-body"},[a("div",[t._v("设备信息管理")]),t._v(" "),a("div",{directives:[{name:"show",rawName:"v-show",value:!t.inforadmin&&!t.equipmentDeployAdmin,expression:"!inforadmin&&!equipmentDeployAdmin"}],staticClass:"buttonbox"},[t.$api.opreate.hasLoginComponents(this,"sys:userMan:userOpera")?a("div",{staticClass:"col-sm-1"},[a("select",{directives:[{name:"model",rawName:"v-model",value:t.tableSelectData.pageloginData.state.statetype,expression:"tableSelectData.pageloginData.state.statetype"}],staticClass:"form-control",on:{change:[function(e){var a=Array.prototype.filter.call(e.target.options,function(t){return t.selected}).map(function(t){return"_value"in t?t._value:t.value});t.$set(t.tableSelectData.pageloginData.state,"statetype",e.target.multiple?a:a[0])},t.changeAudit]}},[a("option",{attrs:{value:"00"}},[t._v("全部")]),t._v(" "),a("option",{attrs:{value:"01"}},[t._v("已部署")]),t._v(" "),a("option",{attrs:{value:"10"}},[t._v("未审核")]),t._v(" "),a("option",{attrs:{value:"11"}},[t._v("已审核")]),t._v(" "),a("option",{attrs:{value:"20"}},[t._v("正在运行")]),t._v(" "),a("option",{attrs:{value:"21"}},[t._v("已停止")])])]):t._e(),t._v(" "),t.$api.opreate.hasLoginComponents(this,"sys:page:add")?a("button",{staticClass:"btn btn-info",attrs:{type:"button"},on:{click:function(e){t.inforAddClick(!0)}}},[t._v("新增设备")]):t._e(),t._v(" "),t.$api.opreate.hasLoginComponents(this,"sys:page:add")?a("button",{staticClass:"btn btn-info",attrs:{type:"button"},on:{click:function(e){t.equipmentDeployClick(!0)}}},[t._v("设备部署")]):t._e(),t._v(" "),t.$api.opreate.hasLoginComponents(this,"sys:page:modify")?a("button",{staticClass:"btn btn-warning",attrs:{type:"button"},on:{click:t.updateData}},[t._v("修改")]):t._e(),t._v(" "),t.$api.opreate.hasLoginComponents(this,"sys:page:delete")?a("button",{staticClass:"btn btn-danger",attrs:{type:"button"},on:{click:t.deleteData}},[t._v("删除")]):t._e(),t._v(" "),t.$api.opreate.hasLoginComponents(this,"sys:page:search")?a("div",{staticClass:"pull-right col-sm-3 search-input"},[a("div",{staticClass:"col-sm-12"},[t._m(0),t._v(" "),a("input",{staticClass:"btn btn-info col-sm-3",attrs:{type:"button",value:"搜索"},on:{click:t.searchBtnClick}})])]):t._e()]),t._v(" "),a("tables",{directives:[{name:"show",rawName:"v-show",value:!t.inforadmin&&!t.equipmentDeployAdmin,expression:"!inforadmin&&!equipmentDeployAdmin"}],attrs:{tableSelectData:t.tableSelectData}}),t._v(" "),a("div",{directives:[{name:"show",rawName:"v-show",value:t.inforadmin,expression:"inforadmin"}]},[a("form",{ref:"refForm",staticClass:"form form-horizontal col-sm-8"},[a("div",{staticClass:"form-group"},[a("label",{staticClass:"control-label col-sm-2"},[t._v("设备名")]),t._v(" "),a("div",{staticClass:"col-sm-6",class:{"has-success":!t.errors.has("name")&&""!=t.addData.equipment_name,"has-error":t.errors.has("name")}},[a("input",{directives:[{name:"model",rawName:"v-model",value:t.addData.equipment_name,expression:"addData.equipment_name"},{name:"validate",rawName:"v-validate",value:t.$api.opreate.validateAdd("name",30,t.stateid,t.opreate),expression:"$api.opreate.validateAdd('name',30,stateid,opreate)"}],staticClass:"form-control",attrs:{type:"text",name:"name",placeholder:"请输入设备名,最多为30位","data-vv-as":"设备名"},domProps:{value:t.addData.equipment_name},on:{input:function(e){e.target.composing||t.$set(t.addData,"equipment_name",e.target.value)}}})]),t._v(" "),a("div",{staticClass:"text-danger"},[a("span",{directives:[{name:"show",rawName:"v-show",value:t.errors.has("name"),expression:"errors.has('name')"}]},[t._v(t._s(t.errors.first("name")))])])]),t._v(" "),a("div",{staticClass:"form-group"},[a("label",{staticClass:"control-label col-sm-2"},[t._v("设备类型")]),t._v(" "),a("div",{staticClass:"col-sm-6"},[a("select",{directives:[{name:"model",rawName:"v-model",value:t.addData.equipment_type_id,expression:"addData.equipment_type_id"}],staticClass:"form-control",attrs:{type:"text",name:"url"},on:{change:function(e){var a=Array.prototype.filter.call(e.target.options,function(t){return t.selected}).map(function(t){return"_value"in t?t._value:t.value});t.$set(t.addData,"equipment_type_id",e.target.multiple?a:a[0])}}},t._l(t.equipment_type,function(e,o){return a("option",{key:o,domProps:{value:e.equipment_type_id,textContent:t._s(e.equipment_type_name)}})}))])]),t._v(" "),a("div",{staticClass:"form-group"},[a("label",{staticClass:"control-label col-sm-2"},[t._v("设备控制类型")]),t._v(" "),a("div",{staticClass:"col-sm-6"},[a("select",{directives:[{name:"model",rawName:"v-model",value:t.addData.control_type_id,expression:"addData.control_type_id"}],staticClass:"form-control",attrs:{type:"text",name:"url"},on:{change:function(e){var a=Array.prototype.filter.call(e.target.options,function(t){return t.selected}).map(function(t){return"_value"in t?t._value:t.value});t.$set(t.addData,"control_type_id",e.target.multiple?a:a[0])}}},t._l(t.control_type,function(e,o){return a("option",{key:o,domProps:{value:e.control_type_id,textContent:t._s(e.control_type_name)}})}))])]),t._v(" "),a("div",{staticClass:"form-group"},[a("label",{staticClass:"control-label col-sm-2"},[t._v("设备厂商")]),t._v(" "),a("div",{staticClass:"col-sm-6"},[a("select",{directives:[{name:"model",rawName:"v-model",value:t.addData.manufacturer_id,expression:"addData.manufacturer_id"}],staticClass:"form-control",attrs:{type:"text",name:"url"},on:{change:function(e){var a=Array.prototype.filter.call(e.target.options,function(t){return t.selected}).map(function(t){return"_value"in t?t._value:t.value});t.$set(t.addData,"manufacturer_id",e.target.multiple?a:a[0])}}},t._l(t.manufacturer,function(e,o){return a("option",{key:o,domProps:{value:e.manufacturer_id,textContent:t._s(e.manufacturer_name)}})}))])]),t._v(" "),a("div",{staticClass:"form-group"},[a("label",{staticClass:"control-label col-sm-2"},[t._v("设备功能说明")]),t._v(" "),a("div",{staticClass:"col-sm-6",class:{"has-success":!t.errors.has("explain")&&""!=t.addData.function_explain,"has-error":t.errors.has("explain")}},[a("textarea",{directives:[{name:"model",rawName:"v-model",value:t.addData.function_explain,expression:"addData.function_explain"},{name:"validate",rawName:"v-validate",value:"required",expression:"'required'"}],staticClass:"form-control",attrs:{rows:"6",name:"explain",placeholder:"请输入设备功能说明,最多为20位","data-vv-as":"设备功能说明"},domProps:{value:t.addData.function_explain},on:{input:function(e){e.target.composing||t.$set(t.addData,"function_explain",e.target.value)}}})]),t._v(" "),a("div",{staticClass:"text-danger"},[a("span",{directives:[{name:"show",rawName:"v-show",value:t.errors.has("explain"),expression:"errors.has('explain')"}]},[t._v(t._s(t.errors.first("explain")))])])]),t._v(" "),a("div",{staticClass:"form-group col-sm-12"},[a("button",{staticClass:" col-sm-2 col-sm-offset-2 btn btn-info",attrs:{type:"button"},on:{click:t.addDatas}},[t._v("提交")]),t._v(" "),a("button",{staticClass:" col-sm-2 col-sm-offset-2  btn btn-warning",attrs:{type:"button"},on:{click:function(e){t.inforAddClick(!1)}}},[t._v("返回")])])])]),t._v(" "),a("div",{directives:[{name:"show",rawName:"v-show",value:t.equipmentDeployAdmin,expression:"equipmentDeployAdmin"}]},[a("form",{ref:"refForm",staticClass:"form form-horizontal col-sm-8"},[a("div",{staticClass:"form-group"},[a("label",{staticClass:"control-label col-sm-2"},[t._v("部署节点")]),t._v(" "),a("div",{staticClass:"col-sm-6"},[a("select",{directives:[{name:"model",rawName:"v-model",value:t.addDeployData.deploy_node_id,expression:"addDeployData.deploy_node_id"}],staticClass:"form-control",attrs:{type:"text",name:"url"},on:{change:function(e){var a=Array.prototype.filter.call(e.target.options,function(t){return t.selected}).map(function(t){return"_value"in t?t._value:t.value});t.$set(t.addDeployData,"deploy_node_id",e.target.multiple?a:a[0])}}},t._l(t.deploy_type,function(e,o){return a("option",{key:o,domProps:{value:e.deploy_node_id,textContent:t._s(e.deploy_type_name)}})}))])]),t._v(" "),a("div",{staticClass:"form-group"},[a("label",{staticClass:"control-label col-sm-2"},[t._v("部署备注")]),t._v(" "),a("div",{staticClass:"col-sm-6",class:{"has-success":!t.errors.has("remarks")&&""!=t.addDeployData.remarks,"has-error":t.errors.has("remarks")}},[a("textarea",{directives:[{name:"model",rawName:"v-model",value:t.addDeployData.remarks,expression:"addDeployData.remarks"},{name:"validate",rawName:"v-validate",value:"required",expression:"'required'"}],staticClass:"form-control",attrs:{rows:"6",name:"remarks",placeholder:"请输入部署备注","data-vv-as":"部署备注"},domProps:{value:t.addDeployData.remarks},on:{input:function(e){e.target.composing||t.$set(t.addDeployData,"remarks",e.target.value)}}})]),t._v(" "),a("div",{staticClass:"text-danger"},[a("span",{directives:[{name:"show",rawName:"v-show",value:t.errors.has("remarks"),expression:"errors.has('remarks')"}]},[t._v(t._s(t.errors.first("remarks")))])])]),t._v(" "),a("div",{staticClass:"form-group col-sm-12"},[a("button",{staticClass:" col-sm-2 col-sm-offset-2 btn btn-info",attrs:{type:"button"},on:{click:t.addDeployDatas}},[t._v("提交")]),t._v(" "),a("button",{staticClass:" col-sm-2 col-sm-offset-2  btn btn-warning",attrs:{type:"button"},on:{click:function(e){t.equipmentDeployClick(!1)}}},[t._v("返回")])])])])],1)])])},staticRenderFns:[function(){var t=this.$createElement,e=this._self._c||t;return e("div",{staticClass:"col-sm-8 search-input "},[e("input",{staticClass:"form-control",attrs:{type:"text",placeholder:"搜索用户"}})])}]};var i=a("VU/8")(s,n,!1,function(t){a("HAuX")},null,null);e.default=i.exports},HAuX:function(t,e){}});
//# sourceMappingURL=9.c3865f11f24d50f7c030.js.map