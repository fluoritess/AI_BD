webpackJsonp([21],{"8D0+":function(a,t){},mIqI:function(a,t,e){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var s=e("Xxa5"),r=e.n(s),n=e("exGp"),o=e.n(n),i=e("D7x1"),c={data:function(){return{inforadmin:!1,opreate:"add",tableSelectData:{selectTableurl:"Sensor/selectSensorTypeInfo.action",pageloginData:{id:this.stateid},filterName:[]},addData:{sensor_type_id:"",sensor_name:"",sensor_funcation_remark:"",remark:""}}},props:{stateid:String,statetitle:String},computed:{checkData:function(){return this.$store.getters.GETUSERTABLEPAGECHECKDATA}},components:{tables:i.a},methods:{inforAddClick:function(a){var t,e=(t=o()(r.a.mark(function a(){var t;return r.a.wrap(function(a){for(;;)switch(a.prev=a.next){case 0:for(t in s.addData)s.addData[t]="";return a.abrupt("return",!0);case 2:case"end":return a.stop()}},a,this)})),function(){return t.apply(this,arguments)}),s=this;"update"==this.opreate&&(this.addData=this.$api.opreate.ObjectCopy(this.checkData[0])),e().then(function(){s.opreate="add",s.inforadmin=a,s.$validator.errors.clear()})},updateData:function(){this.$api.opreate.TESTcheck(this,"修改")&&(this.inforadmin=!0,this.opreate="update",this.addData=this.$api.opreate.ObjectCopy(this.checkData[0]))},addDatas:function(){var a,t=(a=o()(r.a.mark(function a(){var t;return r.a.wrap(function(a){for(;;)switch(a.prev=a.next){case 0:return"update"==e.opreate?t=e.$api.http.opreateHttp(e,"Sensor/updateSensorTypeInfo.action",n,"修改",""):"add"==e.opreate&&(t=e.$api.http.opreateHttp(e,"Sensor/addSensorTypeInfo.action",n,"添加","")),a.abrupt("return",t);case 2:case"end":return a.stop()}},a,this)})),function(){return a.apply(this,arguments)}),e=this,s=e.stateid,n={data:e.addData,states:{id:s}};t().then(function(a){a&&e.inforAddClick(!1)})},deleteData:function(){var a=this;a.$validator.errors.clear();var t=a.$store.getters.GETUSERTABLEPAGECHECKDATA;a.$api.opreate.TESTcheck(a,"删除")&&layer.confirm("是否删除",{btn:["确认","取消"]},function(){var e={id:t[0].sensor_type_id,states:{id:a.stateid}};a.$api.http.opreateHttp(a,"Sensor/deleteSensorTypeInfo.action",e,"删除")})},searchBtnClick:function(){""!=this.searchData.data||this.$layer.msg("请输入传感器类型id后搜索",{icon:0})}}},d={render:function(){var a=this,t=a.$createElement,e=a._self._c||t;return e("div",[e("div",{staticClass:"panel panel-info"},[e("div",{staticClass:"panel-body"},[e("div",[a._v("传感器类型管理")]),a._v(" "),e("div",{directives:[{name:"show",rawName:"v-show",value:!a.inforadmin,expression:"!inforadmin"}],staticClass:"buttonbox"},[a.$api.opreate.hasLoginComponents(this,"sys:sensorType:add")?e("button",{staticClass:"btn btn-info",attrs:{type:"button"},on:{click:function(t){a.inforAddClick(!0)}}},[a._v("新增传感器类型")]):a._e(),a._v(" "),a.$api.opreate.hasLoginComponents(this,"sys:sensorType:modify")?e("button",{staticClass:"btn btn-warning",attrs:{type:"button"},on:{click:a.updateData}},[a._v("修改类型信息")]):a._e(),a._v(" "),a.$api.opreate.hasLoginComponents(this,"sys:sensorType:delete")?e("button",{staticClass:"btn btn-danger",attrs:{type:"button"},on:{click:a.deleteData}},[a._v("删除")]):a._e(),a._v(" "),a.$api.opreate.hasLoginComponents(this,"sys:sensorType:search")?e("div",{staticClass:"pull-right col-sm-3 search-input"},[e("div",{staticClass:"col-sm-12"},[a._m(0),a._v(" "),e("input",{staticClass:"btn btn-info col-sm-3",attrs:{type:"button",value:"搜索"},on:{click:a.searchBtnClick}})])]):a._e()]),a._v(" "),e("tables",{directives:[{name:"show",rawName:"v-show",value:!a.inforadmin,expression:"!inforadmin"}],attrs:{tableSelectData:a.tableSelectData}}),a._v(" "),e("div",{directives:[{name:"show",rawName:"v-show",value:a.inforadmin,expression:"inforadmin"}]},[e("form",{ref:"refForm",staticClass:"form form-horizontal col-sm-8"},[e("div",{staticClass:"form-group"},[e("label",{staticClass:"control-label col-sm-2"},[a._v("类型名称")]),a._v(" "),e("div",{staticClass:"col-sm-6",class:{"has-success":!a.errors.has("name")&&""!=a.addData.sensor_name,"has-error":a.errors.has("name")}},[e("input",{directives:[{name:"model",rawName:"v-model",value:a.addData.sensor_name,expression:"addData.sensor_name"},{name:"validate",rawName:"v-validate",value:a.$api.opreate.validateAdd("name",50,a.stateid,a.opreate,"Sensor"),expression:"$api.opreate.validateAdd('name',50,stateid,opreate,'Sensor')"}],staticClass:"form-control",attrs:{type:"text",name:"name",placeholder:"请输入类型名称","data-vv-as":"类型名称"},domProps:{value:a.addData.sensor_name},on:{input:function(t){t.target.composing||a.$set(a.addData,"sensor_name",t.target.value)}}})]),a._v(" "),e("div",{staticClass:"text-danger"},[e("span",{directives:[{name:"show",rawName:"v-show",value:a.errors.has("name"),expression:"errors.has('name')"}]},[a._v(a._s(a.errors.first("name")))])])]),a._v(" "),e("div",{staticClass:"form-group"},[e("label",{staticClass:"control-label col-sm-2"},[a._v("功能描述")]),a._v(" "),e("div",{staticClass:"col-sm-6",class:{"has-success":!a.errors.has("fun_remark")&&""!=a.addData.sensor_funcation_remark,"has-error":a.errors.has("fun_remark")}},[e("textarea",{directives:[{name:"model",rawName:"v-model",value:a.addData.sensor_funcation_remark,expression:"addData.sensor_funcation_remark"},{name:"validate",rawName:"v-validate",value:"required",expression:"'required'"}],staticClass:"form-control",attrs:{rows:"6",name:"fun_remark",placeholder:"请输入功能描述","data-vv-as":"功能描述"},domProps:{value:a.addData.sensor_funcation_remark},on:{input:function(t){t.target.composing||a.$set(a.addData,"sensor_funcation_remark",t.target.value)}}})]),a._v(" "),e("div",{staticClass:"text-danger"},[e("span",{directives:[{name:"show",rawName:"v-show",value:a.errors.has("fun_remark"),expression:"errors.has('fun_remark')"}]},[a._v(a._s(a.errors.first("fun_remark")))])])]),a._v(" "),e("div",{staticClass:"form-group"},[e("label",{staticClass:"control-label col-sm-2"},[a._v("类型简述")]),a._v(" "),e("div",{staticClass:"col-sm-6"},[e("textarea",{directives:[{name:"model",rawName:"v-model",value:a.addData.remark,expression:"addData.remark"}],staticClass:"form-control",attrs:{rows:"6",name:"remark",placeholder:"请输入类型简述"},domProps:{value:a.addData.remark},on:{input:function(t){t.target.composing||a.$set(a.addData,"remark",t.target.value)}}})])]),a._v(" "),e("div",{staticClass:"form-group col-sm-12"},[e("button",{staticClass:" col-sm-2 col-sm-offset-2 btn btn-info",attrs:{type:"button"},on:{click:a.addDatas}},[a._v("提交")]),a._v(" "),e("button",{staticClass:" col-sm-2 col-sm-offset-2  btn btn-warning",attrs:{type:"button"},on:{click:function(t){a.inforAddClick(!1)}}},[a._v("返回")])])])])],1)])])},staticRenderFns:[function(){var a=this.$createElement,t=this._self._c||a;return t("div",{staticClass:"col-sm-8 search-input "},[t("input",{staticClass:"form-control",attrs:{type:"text",placeholder:"搜索传感器信息"}})])}]};var l=e("VU/8")(c,d,!1,function(a){e("8D0+")},null,null);t.default=l.exports}});
//# sourceMappingURL=21.d1117ea7056d257dbf15.js.map