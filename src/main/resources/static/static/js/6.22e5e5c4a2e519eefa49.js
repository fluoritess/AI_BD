webpackJsonp([6],{mRoS:function(e,a){},yti8:function(e,a,t){"use strict";Object.defineProperty(a,"__esModule",{value:!0});var s=t("Xxa5"),o=t.n(s),r=t("exGp"),i=t.n(r),n=t("D7x1"),d={data:function(){return{inforadmin:!1,opreate:"add",tableSelectData:{selectTableurl:"equipment/selectDeployNode.action",pageloginData:{id:this.stateid},filterName:[]},addData:{address_id:"",node_name:"",purpose_explain:"",inside_location:"",remarks:"",parent_id:""},deployNodeType:"0",sceneAddress:[],deployNode:[{deployNodeId:"1",nodeName:"123"}]}},props:{stateid:String,statetitle:String},computed:{checkData:function(){return this.$store.getters.GETUSERTABLEPAGECHECKDATA}},components:{tables:n.a},mounted:function(){this.loginSceneAddress()},watch:{deployNodeType:function(e){"1"==e&&this.loginDeployNode()}},methods:{inforAddClick:function(e){var a,t=this,s=(a=i()(o.a.mark(function e(){var a;return o.a.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:for(a in r.addData)r.addData[a]="";return e.abrupt("return",!0);case 2:case"end":return e.stop()}},e,this)})),function(){return a.apply(this,arguments)}),r=this;"update"==this.opreate&&(this.addData=this.$api.opreate.ObjectCopy(this.checkData[0])),s().then(function(){r.$validator.errors.items.length>0&&r.$validator.errors.clear(),t.opreate="add",r.inforadmin=e})},loginSceneAddress:function(){var e=this;e.$axios.post(e.HOST+"equipment/selectAllAddress.action").then(function(a){a.bool&&(e.sceneAddress=a.data.list)}).catch(function(e){console.log(e)})},loginDeployNode:function(){var e=this;e.$axios.post(e.HOST+"equipment/selectSceneNode.action").then(function(a){a.bool&&(e.deployNode=a.data.list)}).catch(function(e){console.log(e)})},updateData:function(){this.$api.opreate.TESTcheck(this,"修改")&&(this.inforadmin=!0,this.opreate="update",this.addData=this.$api.opreate.ObjectCopy(this.checkData[0]))},addDatas:function(){var e,a=(e=i()(o.a.mark(function e(){var a;return o.a.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:return"update"==t.opreate?a=t.$api.http.opreateHttp(t,"equipment/modifyDeployNode.action",r,"修改",""):"add"==t.opreate&&(a=t.$api.http.opreateHttp(t,"0"==t.deployNodeType?"equipment/addDeployNode.action":"equipment/addEquipmentNode.action",r,"添加","")),e.abrupt("return",a);case 2:case"end":return e.stop()}},e,this)})),function(){return e.apply(this,arguments)}),t=this,s=t.stateid,r={data:t.addData,states:{id:s}};a().then(function(e){t.$validator.errors.clear(),e&&setTimeout(function(){t.inforAddClick(!1)},800)})},deleteData:function(){var e=this,a=e.$store.getters.GETUSERTABLEPAGECHECKDATA;e.$api.opreate.TESTcheck(e,"删除")&&layer.confirm("是否删除",{btn:["确认","取消"]},function(t,s){var o={id:a[0].deploy_node_id,states:{id:e.stateid}};e.$api.http.opreateHttp(e,"equipment/deleteDeployNode.action",o,"删除")})},searchBtnClick:function(){""!=this.searchData.data||this.$layer.msg("请输入场景地址名后搜索",{icon:0})}}},l={render:function(){var e=this,a=e.$createElement,t=e._self._c||a;return t("div",[t("div",{staticClass:"panel panel-info"},[t("div",{staticClass:"panel-body"},[t("div",[e._v("设备部署节点管理")]),e._v(" "),t("div",{directives:[{name:"show",rawName:"v-show",value:!e.inforadmin,expression:"!inforadmin"}],staticClass:"buttonbox"},[e.$api.opreate.hasLoginComponents(this,"sys:page:add")?t("button",{staticClass:"btn btn-info",attrs:{type:"button"},on:{click:function(a){e.inforAddClick(!0)}}},[e._v("新增")]):e._e(),e._v(" "),e.$api.opreate.hasLoginComponents(this,"sys:page:modify")?t("button",{staticClass:"btn btn-warning",attrs:{type:"button"},on:{click:e.updateData}},[e._v("修改")]):e._e(),e._v(" "),e.$api.opreate.hasLoginComponents(this,"sys:page:delete")?t("button",{staticClass:"btn btn-danger",attrs:{type:"button"},on:{click:e.deleteData}},[e._v("删除")]):e._e(),e._v(" "),e.$api.opreate.hasLoginComponents(this,"sys:page:search")?t("div",{staticClass:"pull-right col-sm-3 search-input"},[t("div",{staticClass:"col-sm-12"},[e._m(0),e._v(" "),t("input",{staticClass:"btn btn-info col-sm-3",attrs:{type:"button",value:"搜索"},on:{click:e.searchBtnClick}})])]):e._e()]),e._v(" "),t("tables",{directives:[{name:"show",rawName:"v-show",value:!e.inforadmin,expression:"!inforadmin"}],attrs:{tableSelectData:e.tableSelectData}}),e._v(" "),t("div",{directives:[{name:"show",rawName:"v-show",value:e.inforadmin,expression:"inforadmin"}]},[t("form",{ref:"refForm",staticClass:"form form-horizontal col-sm-8"},[t("div",{staticClass:"form-group"},[t("label",{staticClass:"col-sm-2 control-label",attrs:{for:""}},[e._v("节点类别")]),e._v(" "),t("div",[t("div",{staticClass:"col-sm-2"},[t("input",{directives:[{name:"model",rawName:"v-model",value:e.deployNodeType,expression:"deployNodeType"}],attrs:{type:"radio",name:"type",id:"type1",value:"0",disabled:"update"==e.opreate},domProps:{checked:e._q(e.deployNodeType,"0")},on:{change:function(a){e.deployNodeType="0"}}}),t("label",{staticClass:"control-label",attrs:{for:"type1"}},[e._v("场景节点")])]),e._v(" "),t("div",{staticClass:"col-sm-2"},[t("input",{directives:[{name:"model",rawName:"v-model",value:e.deployNodeType,expression:"deployNodeType"}],attrs:{type:"radio",name:"type",id:"type2",value:"1",disabled:"update"==e.opreate},domProps:{checked:!0,checked:e._q(e.deployNodeType,"1")},on:{change:function(a){e.deployNodeType="1"}}}),t("label",{staticClass:"control-label",attrs:{for:"type2"}},[e._v("设备节点")])])])]),e._v(" "),t("div",{staticClass:"form-group"},[t("label",{staticClass:"control-label col-sm-2"},[e._v("节点名称")]),e._v(" "),t("div",{staticClass:"col-sm-6",class:{"has-success":!e.errors.has("name")&&""!=e.addData.node_name,"has-error":e.errors.has("name")}},[t("input",{directives:[{name:"model",rawName:"v-model",value:e.addData.node_name,expression:"addData.node_name"},{name:"validate",rawName:"v-validate",value:e.$api.opreate.validateAdd("name",30,e.stateid,e.opreate,"equipment"),expression:"$api.opreate.validateAdd('name',30,stateid,opreate,'equipment')"}],staticClass:"form-control",attrs:{type:"text",name:"name",placeholder:"请输入节点名称,最多为30位","data-vv-as":"节点名称"},domProps:{value:e.addData.node_name},on:{input:function(a){a.target.composing||e.$set(e.addData,"node_name",a.target.value)}}})]),e._v(" "),t("div",{staticClass:"text-danger"},[t("span",{directives:[{name:"show",rawName:"v-show",value:e.errors.has("name"),expression:"errors.has('name')"}]},[e._v(e._s(e.errors.first("name")))])])]),e._v(" "),"0"==e.deployNodeType?t("div",{staticClass:"form-group"},[t("label",{staticClass:"control-label col-sm-2"},[e._v("部署地址")]),e._v(" "),t("div",{staticClass:"col-sm-6"},[t("select",{directives:[{name:"model",rawName:"v-model",value:e.addData.address_id,expression:"addData.address_id"}],staticClass:"form-control",attrs:{type:"text",name:"url"},on:{change:function(a){var t=Array.prototype.filter.call(a.target.options,function(e){return e.selected}).map(function(e){return"_value"in e?e._value:e.value});e.$set(e.addData,"address_id",a.target.multiple?t:t[0])}}},e._l(e.sceneAddress,function(a,s){return t("option",{key:s,domProps:{value:a.addressId,textContent:e._s(a.address)}})}))])]):"1"==e.deployNodeType?t("div",{staticClass:"form-group"},[t("label",{staticClass:"control-label col-sm-2"},[e._v("父级节点")]),e._v(" "),t("div",{staticClass:"col-sm-6"},[t("select",{directives:[{name:"model",rawName:"v-model",value:e.addData.parent_id,expression:"addData.parent_id"}],staticClass:"form-control",attrs:{type:"text",name:"url"},on:{change:function(a){var t=Array.prototype.filter.call(a.target.options,function(e){return e.selected}).map(function(e){return"_value"in e?e._value:e.value});e.$set(e.addData,"parent_id",a.target.multiple?t:t[0])}}},e._l(e.deployNode,function(a,s){return t("option",{key:s,domProps:{value:a.deployNodeId,textContent:e._s(a.nodeName)}})}))])]):e._e(),e._v(" "),t("div",{staticClass:"form-group"},[t("label",{staticClass:"control-label col-sm-2"},[e._v("用途说明")]),e._v(" "),t("div",{staticClass:"col-sm-6",class:{"has-success":!e.errors.has("explain")&&""!=e.addData.purpose_explain,"has-error":e.errors.has("explain")}},[t("textarea",{directives:[{name:"model",rawName:"v-model",value:e.addData.purpose_explain,expression:"addData.purpose_explain"},{name:"validate",rawName:"v-validate",value:"required",expression:"'required'"}],staticClass:"form-control",attrs:{rows:"6",name:"explain",placeholder:"请输入用途说明信息","data-vv-as":"用途说明信息"},domProps:{value:e.addData.purpose_explain},on:{input:function(a){a.target.composing||e.$set(e.addData,"purpose_explain",a.target.value)}}})]),e._v(" "),t("div",{staticClass:"text-danger"},[t("span",{directives:[{name:"show",rawName:"v-show",value:e.errors.has("explain"),expression:"errors.has('explain')"}]},[e._v(e._s(e.errors.first("explain")))])])]),e._v(" "),t("div",{staticClass:"form-group"},[t("label",{staticClass:"control-label col-sm-2"},[e._v("内部位置")]),e._v(" "),t("div",{staticClass:"col-sm-6",class:{"has-success":!e.errors.has("location")&&""!=e.addData.inside_location,"has-error":e.errors.has("location")}},[t("textarea",{directives:[{name:"model",rawName:"v-model",value:e.addData.inside_location,expression:"addData.inside_location"},{name:"validate",rawName:"v-validate",value:"required",expression:"'required'"}],staticClass:"form-control",attrs:{rows:"6",name:"location",placeholder:"请输入内部位置信息","data-vv-as":"内部位置信息"},domProps:{value:e.addData.inside_location},on:{input:function(a){a.target.composing||e.$set(e.addData,"inside_location",a.target.value)}}})]),e._v(" "),t("div",{staticClass:"text-danger"},[t("span",{directives:[{name:"show",rawName:"v-show",value:e.errors.has("location"),expression:"errors.has('location')"}]},[e._v(e._s(e.errors.first("location")))])])]),e._v(" "),t("div",{staticClass:"form-group"},[t("label",{staticClass:"control-label col-sm-2"},[e._v("描述")]),e._v(" "),t("div",{staticClass:"col-sm-6",class:{"has-success":!e.errors.has("remarks")&&""!=e.addData.remarks,"has-error":e.errors.has("remarks")}},[t("textarea",{directives:[{name:"model",rawName:"v-model",value:e.addData.remarks,expression:"addData.remarks"},{name:"validate",rawName:"v-validate",value:"required",expression:"'required'"}],staticClass:"form-control",attrs:{rows:"6",name:"remarks",placeholder:"请输入描述信息","data-vv-as":"描述信息"},domProps:{value:e.addData.remarks},on:{input:function(a){a.target.composing||e.$set(e.addData,"remarks",a.target.value)}}})]),e._v(" "),t("div",{staticClass:"text-danger"},[t("span",{directives:[{name:"show",rawName:"v-show",value:e.errors.has("remarks"),expression:"errors.has('remarks')"}]},[e._v(e._s(e.errors.first("remarks")))])])]),e._v(" "),t("div",{staticClass:"form-group col-sm-12"},[t("button",{staticClass:" col-sm-2 col-sm-offset-2 btn btn-info",attrs:{type:"button"},on:{click:e.addDatas}},[e._v("提交")]),e._v(" "),t("button",{staticClass:" col-sm-2 col-sm-offset-2  btn btn-warning",attrs:{type:"button"},on:{click:function(a){e.inforAddClick(!1)}}},[e._v("返回")])])])])],1)])])},staticRenderFns:[function(){var e=this.$createElement,a=this._self._c||e;return a("div",{staticClass:"col-sm-8 search-input "},[a("input",{staticClass:"form-control",attrs:{type:"text",placeholder:"搜索用户"}})])}]};var c=t("VU/8")(d,l,!1,function(e){t("mRoS")},null,null);a.default=c.exports}});
//# sourceMappingURL=6.22e5e5c4a2e519eefa49.js.map