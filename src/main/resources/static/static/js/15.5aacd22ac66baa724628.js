webpackJsonp([15],{"4+GX":function(a,e){},LGgV:function(a,e,t){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var s=t("D7x1"),r={data:function(){return{inforadmin:!1,opreate:"add",tableSelectData:{selectTableurl:"",pageloginData:{id:this.stateid},filterName:[]},addData:{greenhouse_id:"",greenhouse_name:"",greenhouse_useage:"",greenhouse_address:"",remark:""}}},props:{stateid:String,statetitle:String},computed:{checkData:function(){return this.$store.getters.GETUSERTABLEPAGECHECKDATA}},components:{tables:s.a},methods:{inforAddClick:function(a){for(var e in this.inforadmin=a,this.opreate="add",this.addData)this.addData[e]="";this.$validator.errors.clear()},updateData:function(){this.$api.opreate.TESTcheck(this,"修改")&&(this.inforadmin=!0,this.opreate="update",this.addData=this.checkData[0])},addDatas:function(){var a,e=this,t=e.stateid,s={data:e.addData,states:{id:t}};"update"==e.opreate?a=e.$api.http.opreateHttp(e,"",s,"修改",""):"add"==e.opreate&&(a=e.$api.http.opreateHttp(e,"",s,"添加","")),setTimeout(function(){e.$validator.errors.clear()},300),a.then(function(a){a&&setTimeout(function(){e.inforAddClick(!1)},800)})},deleteData:function(){var a=this,e=a.$store.getters.GETUSERTABLEPAGECHECKDATA;a.$api.opreate.TESTcheck(a,"删除")&&layer.confirm("是否删除",{btn:["确认","取消"]},function(){var t={id:e[0].id,states:{id:a.stateid}};a.$api.http.opreateHttp(a,"",t,"删除")})},searchBtnClick:function(){""!=this.searchData.data||this.$layer.msg("请输入大棚名称或代号后搜索",{icon:0})}}},o={render:function(){var a=this,e=a.$createElement,t=a._self._c||e;return t("div",[t("div",{staticClass:"panel panel-info"},[t("div",{staticClass:"panel-body"},[t("div",[a._v("大棚信息管理")]),a._v(" "),t("div",{directives:[{name:"show",rawName:"v-show",value:!a.inforadmin,expression:"!inforadmin"}],staticClass:"buttonbox"},[a.$api.opreate.hasLoginComponents(this,"sys:greenHouse:add")?t("button",{staticClass:"btn btn-info",attrs:{type:"button"},on:{click:function(e){a.inforAddClick(!0)}}},[a._v("新增大棚")]):a._e(),a._v(" "),a.$api.opreate.hasLoginComponents(this,"sys:greenHouse:modify")?t("button",{staticClass:"btn btn-warning",attrs:{type:"button"},on:{click:a.updateData}},[a._v("修改大棚信息")]):a._e(),a._v(" "),a.$api.opreate.hasLoginComponents(this,"sys:greenHouse:delete")?t("button",{staticClass:"btn btn-danger",attrs:{type:"button"},on:{click:a.deleteData}},[a._v("删除大棚")]):a._e(),a._v(" "),a.$api.opreate.hasLoginComponents(this,"sys:greenHouse:search")?t("div",{staticClass:"pull-right col-sm-3 search-input"},[t("div",{staticClass:"col-sm-12"},[a._m(0),a._v(" "),t("input",{staticClass:"btn btn-info col-sm-3",attrs:{type:"button",value:"搜索"},on:{click:a.searchBtnClick}})])]):a._e()]),a._v(" "),t("tables",{directives:[{name:"show",rawName:"v-show",value:!a.inforadmin,expression:"!inforadmin"}],attrs:{tableSelectData:a.tableSelectData}}),a._v(" "),t("div",{directives:[{name:"show",rawName:"v-show",value:a.inforadmin,expression:"inforadmin"}]},[t("form",{ref:"refForm",staticClass:"form form-horizontal col-sm-8"},[t("div",{staticClass:"form-group"},[t("label",{staticClass:"control-label col-sm-2"},[a._v("大棚名称")]),a._v(" "),t("div",{staticClass:"col-sm-6",class:{"has-success":!a.errors.has("name")&&""!=a.addData.greenhouse_name,"has-error":a.errors.has("name")}},[t("input",{directives:[{name:"model",rawName:"v-model",value:a.addData.greenhouse_name,expression:"addData.greenhouse_name"},{name:"validate",rawName:"v-validate",value:a.$api.opreate.validateAdd("name",50,a.stateid,a.opreate),expression:"$api.opreate.validateAdd('name',50,stateid,opreate)"}],staticClass:"form-control",attrs:{type:"text",name:"name",placeholder:"请输入大棚名称","data-vv-as":"大棚名称"},domProps:{value:a.addData.greenhouse_name},on:{input:function(e){e.target.composing||a.$set(a.addData,"greenhouse_name",e.target.value)}}})]),a._v(" "),t("div",{staticClass:"text-danger"},[t("span",{directives:[{name:"show",rawName:"v-show",value:a.errors.has("name"),expression:"errors.has('name')"}]},[a._v(a._s(a.errors.first("name")))])])]),a._v(" "),t("div",{staticClass:"form-group"},[t("label",{staticClass:"control-label col-sm-2"},[a._v("大棚地址")]),a._v(" "),t("div",{staticClass:"col-sm-6",class:{"has-success":!a.errors.has("address")&&""!=a.addData.greenhouse_address,"has-error":a.errors.has("address")}},[t("input",{directives:[{name:"model",rawName:"v-model",value:a.addData.greenhouse_address,expression:"addData.greenhouse_address"},{name:"validate",rawName:"v-validate",value:"required",expression:"'required'"}],staticClass:"form-control",attrs:{type:"text",name:"address",placeholder:"请输入大棚地址","data-vv-as":"大棚地址"},domProps:{value:a.addData.greenhouse_address},on:{input:function(e){e.target.composing||a.$set(a.addData,"greenhouse_address",e.target.value)}}})]),a._v(" "),t("div",{staticClass:"text-danger"},[t("span",{directives:[{name:"show",rawName:"v-show",value:a.errors.has("address"),expression:"errors.has('address')"}]},[a._v(a._s(a.errors.first("address")))])])]),a._v(" "),t("div",{staticClass:"form-group"},[t("label",{staticClass:"control-label col-sm-2"},[a._v("大棚用途")]),a._v(" "),t("div",{staticClass:"col-sm-6",class:{"has-success":!a.errors.has("useage")&&""!=a.addData.greenhouse_useage,"has-error":a.errors.has("useage")}},[t("textarea",{directives:[{name:"model",rawName:"v-model",value:a.addData.greenhouse_useage,expression:"addData.greenhouse_useage"},{name:"validate",rawName:"v-validate",value:"required",expression:"'required'"}],staticClass:"form-control",attrs:{rows:"6",name:"useage",placeholder:"请输入大棚用途","data-vv-as":"用途说明"},domProps:{value:a.addData.greenhouse_useage},on:{input:function(e){e.target.composing||a.$set(a.addData,"greenhouse_useage",e.target.value)}}})]),a._v(" "),t("div",{staticClass:"text-danger"},[t("span",{directives:[{name:"show",rawName:"v-show",value:a.errors.has("useage"),expression:"errors.has('useage')"}]},[a._v(a._s(a.errors.first("useage")))])])]),a._v(" "),t("div",{staticClass:"form-group"},[t("label",{staticClass:"control-label col-sm-2"},[a._v("大棚简述")]),a._v(" "),t("div",{staticClass:"col-sm-6"},[t("textarea",{directives:[{name:"model",rawName:"v-model",value:a.addData.remark,expression:"addData.remark"}],staticClass:"form-control",attrs:{rows:"6",name:"remark",placeholder:"请输入大棚简述"},domProps:{value:a.addData.remark},on:{input:function(e){e.target.composing||a.$set(a.addData,"remark",e.target.value)}}})])]),a._v(" "),t("div",{staticClass:"form-group col-sm-12"},[t("button",{staticClass:" col-sm-2 col-sm-offset-2 btn btn-info",attrs:{type:"button"},on:{click:a.addDatas}},[a._v("提交")]),a._v(" "),t("button",{staticClass:" col-sm-2 col-sm-offset-2  btn btn-warning",attrs:{type:"button"},on:{click:function(e){a.inforAddClick(!1)}}},[a._v("返回")])])])])],1)])])},staticRenderFns:[function(){var a=this.$createElement,e=this._self._c||a;return e("div",{staticClass:"col-sm-8 search-input "},[e("input",{staticClass:"form-control",attrs:{type:"text",placeholder:"搜索大棚信息"}})])}]};var i=t("VU/8")(r,o,!1,function(a){t("4+GX")},null,null);e.default=i.exports}});
//# sourceMappingURL=15.5aacd22ac66baa724628.js.map