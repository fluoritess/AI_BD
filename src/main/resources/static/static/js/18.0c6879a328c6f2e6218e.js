webpackJsonp([18],{PjbY:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var s=a("Xxa5"),o=a.n(s),r=a("exGp"),i=a.n(r),n=a("D7x1"),c={data:function(){return{inforadmin:!1,opreate:"add",tableSelectData:{selectTableurl:"agriculture/selectNodeTypeInfo.action",pageloginData:{id:this.stateid},filterName:[]},devices:[],type:[],addData:{device_id:"",sensor_type_id:"",sensor_position:"",remark:""}}},props:{stateid:String,statetitle:String},computed:{checkData:function(){return this.$store.getters.GETUSERTABLEPAGECHECKDATA}},components:{tables:n.a},mounted:function(){},methods:{getinfosensor_type:function(){var t=this;t.$axios.post(t.HOST+"agriculture/selectSensorType.action").then(function(e){e.bool&&(t.type=e.data)}).catch(function(t){console.log(t)})},getinfodevice:function(){var t=this;t.$axios.post(t.HOST+"agriculture/selectEquipmentType.action").then(function(e){e.bool&&(t.devices=e.data)}).catch(function(t){console.log(t)})},inforAddClick:function(t){var e,a=this,s=(e=i()(o.a.mark(function t(){var e;return o.a.wrap(function(t){for(;;)switch(t.prev=t.next){case 0:for(e in r.addData)r.addData[e]="";return t.abrupt("return",!0);case 2:case"end":return t.stop()}},t,this)})),function(){return e.apply(this,arguments)}),r=this,n=this.opreate;t&&this.publicAddAndUpdate(),"update"==n&&(this.addData=this.$api.opreate.ObjectCopy(this.checkData[0])),s().then(function(){r.$validator.errors.items.length>0&&r.$validator.errors.clear(),a.opreate="add",r.inforadmin=t})},publicAddAndUpdate:function(){this.getinfodevice(),this.getinfosensor_type()},updateData:function(){this.$api.opreate.TESTcheck(this,"修改")&&(this.publicAddAndUpdate(),this.inforadmin=!0,this.opreate="update",this.addData=this.$api.opreate.ObjectCopy(this.checkData[0]))},addDatas:function(){var t,e=(t=i()(o.a.mark(function t(){var e;return o.a.wrap(function(t){for(;;)switch(t.prev=t.next){case 0:return"update"==a.opreate?e=a.$api.http.opreateHttp(a,"agriculture/updateNodeTypeInfo.action",r,"修改",""):"add"==a.opreate&&(e=a.$api.http.opreateHttp(a,"agriculture/addNodeTypeInfo.action",r,"添加","")),t.abrupt("return",e);case 2:case"end":return t.stop()}},t,this)})),function(){return t.apply(this,arguments)}),a=this,s=a.stateid,r={data:a.addData,states:{id:s}};e().then(function(t){a.$validator.errors.clear(),t&&setTimeout(function(){a.inforAddClick(!1)},800)})},deleteData:function(){var t=this,e=t.$store.getters.GETUSERTABLEPAGECHECKDATA;t.$api.opreate.TESTcheck(t,"删除")&&layer.confirm("是否删除",{btn:["确认","取消"]},function(){var a={id:e[0].sensorId,states:{id:t.stateid}};t.$api.http.opreateHttp(t,"agriculture/deleteNodeTypeInfo.action",a,"删除")})},searchBtnClick:function(){""!=this.searchData.data||this.$layer.msg("请输入场景类型名后搜索",{icon:0})}}},l={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("div",{staticClass:"panel panel-info"},[a("div",{staticClass:"panel-body"},[a("div",[t._v("节点设备管理")]),t._v(" "),a("div",{directives:[{name:"show",rawName:"v-show",value:!t.inforadmin,expression:"!inforadmin"}],staticClass:"buttonbox"},[t.$api.opreate.hasLoginComponents(this,"sys:nodeE:add")?a("button",{staticClass:"btn btn-info",attrs:{type:"button"},on:{click:function(e){t.inforAddClick(!0)}}},[t._v("新增")]):t._e(),t._v(" "),t.$api.opreate.hasLoginComponents(this,"sys:nodeE:modify")?a("button",{staticClass:"btn btn-warning",attrs:{type:"button"},on:{click:t.updateData}},[t._v("修改")]):t._e(),t._v(" "),t.$api.opreate.hasLoginComponents(this,"sys:nodeE:delete")?a("button",{staticClass:"btn btn-danger",attrs:{type:"button"},on:{click:t.deleteData}},[t._v("删除")]):t._e(),t._v(" "),t.$api.opreate.hasLoginComponents(this,"sys:nodeE:search")?a("div",{staticClass:"pull-right col-sm-3 search-input"},[a("div",{staticClass:"col-sm-12"},[t._m(0),t._v(" "),a("input",{staticClass:"btn btn-info col-sm-3",attrs:{type:"button",value:"搜索"},on:{click:t.searchBtnClick}})])]):t._e()]),t._v(" "),a("tables",{directives:[{name:"show",rawName:"v-show",value:!t.inforadmin,expression:"!inforadmin"}],attrs:{tableSelectData:t.tableSelectData}}),t._v(" "),a("div",{directives:[{name:"show",rawName:"v-show",value:t.inforadmin,expression:"inforadmin"}]},[a("form",{ref:"refForm",staticClass:"form form-horizontal col-sm-8"},[a("div",{staticClass:"form-group"},[a("label",{staticClass:"control-label col-sm-2"},[t._v("所属设备")]),t._v(" "),a("div",{staticClass:"col-sm-6"},[a("select",{directives:[{name:"model",rawName:"v-model",value:t.addData.device_id,expression:"addData.device_id"}],staticClass:"form-control",attrs:{name:"device",placeholder:"请选择所属设备"},on:{change:function(e){var a=Array.prototype.filter.call(e.target.options,function(t){return t.selected}).map(function(t){return"_value"in t?t._value:t.value});t.$set(t.addData,"device_id",e.target.multiple?a:a[0])}}},t._l(t.devices,function(e,s){return a("option",{key:s,domProps:{value:e.id,innerHTML:t._s(e.name)}})}))])]),t._v(" "),a("div",{staticClass:"form-group"},[a("label",{staticClass:"control-label col-sm-2"},[t._v("传感器类型")]),t._v(" "),a("div",{staticClass:"col-sm-6"},[a("select",{directives:[{name:"model",rawName:"v-model",value:t.addData.sensor_type_id,expression:"addData.sensor_type_id"}],staticClass:"form-control",attrs:{name:"device",placeholder:"请选择类型"},on:{change:function(e){var a=Array.prototype.filter.call(e.target.options,function(t){return t.selected}).map(function(t){return"_value"in t?t._value:t.value});t.$set(t.addData,"sensor_type_id",e.target.multiple?a:a[0])}}},t._l(t.type,function(e,s){return a("option",{key:s,domProps:{value:e.id,innerHTML:t._s(e.name)}})}))])]),t._v(" "),a("div",{staticClass:"form-group"},[a("label",{staticClass:"control-label col-sm-2"},[t._v("传感器位置")]),t._v(" "),a("div",{staticClass:"col-sm-6",class:{"has-success":!t.errors.has("position")&&""!=t.addData.sensor_position,"has-error":t.errors.has("position")}},[a("input",{directives:[{name:"model",rawName:"v-model",value:t.addData.sensor_position,expression:"addData.sensor_position"},{name:"validate",rawName:"v-validate",value:"required|cnlength:20",expression:"'required|cnlength:20'"}],staticClass:"form-control",attrs:{type:"text",name:"position",placeholder:"请输入位置","data-vv-as":"传感器位置"},domProps:{value:t.addData.sensor_position},on:{input:function(e){e.target.composing||t.$set(t.addData,"sensor_position",e.target.value)}}})]),t._v(" "),a("div",{staticClass:"text-danger"},[a("span",{directives:[{name:"show",rawName:"v-show",value:t.errors.has("position"),expression:"errors.has('position')"}]},[t._v(t._s(t.errors.first("position")))])])]),t._v(" "),a("div",{staticClass:"form-group"},[a("label",{staticClass:"control-label col-sm-2"},[t._v("备注")]),t._v(" "),a("div",{staticClass:"col-sm-6",class:{"has-success":!t.errors.has("remark")&&""!=t.addData.remark,"has-error":t.errors.has("remark")}},[a("textarea",{directives:[{name:"model",rawName:"v-model",value:t.addData.remark,expression:"addData.remark"},{name:"validate",rawName:"v-validate",value:"required",expression:"'required'"}],staticClass:"form-control",attrs:{rows:"6",name:"remark",placeholder:"请输入备注","data-vv-as":"备注"},domProps:{value:t.addData.remark},on:{input:function(e){e.target.composing||t.$set(t.addData,"remark",e.target.value)}}})]),t._v(" "),a("div",{staticClass:"text-danger"},[a("span",{directives:[{name:"show",rawName:"v-show",value:t.errors.has("remark"),expression:"errors.has('remark')"}]},[t._v(t._s(t.errors.first("remark")))])])]),t._v(" "),a("div",{staticClass:"form-group col-sm-12"},[a("button",{staticClass:" col-sm-2 col-sm-offset-2 btn btn-info",attrs:{type:"button"},on:{click:t.addDatas}},[t._v("提交")]),t._v(" "),a("button",{staticClass:" col-sm-2 col-sm-offset-2  btn btn-warning",attrs:{type:"button"},on:{click:function(e){t.inforAddClick(!1)}}},[t._v("返回")])])])])],1)])])},staticRenderFns:[function(){var t=this.$createElement,e=this._self._c||t;return e("div",{staticClass:"col-sm-8 search-input "},[e("input",{staticClass:"form-control",attrs:{type:"text",placeholder:"搜索用户"}})])}]};var d=a("VU/8")(c,l,!1,function(t){a("wMrE")},null,null);e.default=d.exports},wMrE:function(t,e){}});
//# sourceMappingURL=18.0c6879a328c6f2e6218e.js.map