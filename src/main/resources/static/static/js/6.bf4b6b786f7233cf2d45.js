webpackJsonp([6],{S5qs:function(a,t,e){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var s=e("D7x1"),i=e("dsNe"),r={data:function(){return{inforadmin:!1,searchData:{data:""},addData:{name:"",remarks:"",detail:""},opreate:"add",tableSelectData:{selectTableurl:"selectManageSystemPaging.action",pageloginData:{id:this.stateid}},tablefunall:!1}},props:{stateid:String,statetitle:String},components:{tables:s.a,tableFunAll:i.default},methods:{addDatas:function(){var a,t=this,e=t.stateid,s={data:t.addData,states:{id:e}};"update"==t.opreate?a=t.$api.http.opreateHttp(t,"updataSystemManage.action",s,"修改",""):"add"==t.opreate&&(a=t.$api.http.opreateHttp(t,"addSystemManage.action",s,"添加","")),setTimeout(function(){t.$validator.errors.clear()},300),a.then(function(a){a&&(t.logincheckData(),setTimeout(function(){t.inforAddclick()},800))})},cutStr:function(a,t,e){var s=e;for(var i in s)i.indexOf(a)>-1&&i!=a&&(s[a]=s[i],delete s[i]),i.indexOf(t)>-1&&i!=t&&(s[t]=s[i],delete s[i]);return s},logincheckData:function(){var a,t=this.$store.getters.GETUSERTABLEPAGECHECKDATA;console.log(t),"update"==this.opreate?t.length>0&&(a=this.$api.opreate.ObjectCopy(t),this.addData=this.cutStr("id","name",a[0])):"add"==this.opreate&&(this.addData={name:"",remarks:"",detail:""})},inforAddClick:function(a){this.opreate="add",this.inforadmin=a,this.logincheckData()},updateData:function(){this.$api.opreate.TESTcheck(this,"修改")&&(this.inforadmin=!0,this.opreate="update",this.logincheckData())},deleteData:function(){var a=this,t=a.$store.getters.GETUSERTABLEPAGECHECKDATA;a.$api.opreate.TESTcheck(a,"删除")&&layer.confirm("是否删除",{btn:["确认","取消"]},function(){var e={id:t[0].application_system_id,states:{id:a.stateid}};a.$api.http.opreateHttp(a,"deleteSystemManage.action",e,"删除")})},distributeData:function(){this.tablefunall=this.$api.opreate.TESTcheck(this,"功能分配")},searchBtnClick:function(){""!=this.searchData.data||this.$layer.msg("请输入用户名后搜索",{icon:0})}}},n={render:function(){var a=this,t=a.$createElement,e=a._self._c||t;return e("div",[e("div",{staticClass:"panel panel-info"},[e("div",{staticClass:"panel-body"},[e("div",[a._v("应用系统管理")]),a._v(" "),e("div",{directives:[{name:"show",rawName:"v-show",value:!a.inforadmin,expression:"!inforadmin"}],staticClass:"buttonbox"},[a.$api.opreate.hasLoginComponents(this,"sys:app:add")?e("button",{staticClass:"btn btn-info",attrs:{type:"button"},on:{click:function(t){a.inforAddClick(!0)}}},[a._v("新增")]):a._e(),a._v(" "),a.$api.opreate.hasLoginComponents(this,"sys:app:modify")?e("button",{staticClass:"btn btn-warning",attrs:{type:"button"},on:{click:a.updateData}},[a._v("修改")]):a._e(),a._v(" "),a.$api.opreate.hasLoginComponents(this,"sys:app:delete")?e("button",{staticClass:"btn btn-danger",attrs:{type:"button"},on:{click:a.deleteData}},[a._v("删除")]):a._e(),a._v(" "),a.$api.opreate.hasLoginComponents(this,"sys:app:distribute")?e("button",{staticClass:"btn btn-parimary",attrs:{type:"button"},on:{click:a.distributeData}},[a._v("功能分配")]):a._e(),a._v(" "),a.$api.opreate.hasLoginComponents(this,"sys:app:search")?e("div",{staticClass:"pull-right col-sm-3 search-input"},[e("div",{staticClass:"col-sm-12"},[a._m(0),a._v(" "),e("input",{staticClass:"btn btn-info col-sm-3",attrs:{type:"button",value:"搜索"},on:{click:a.searchBtnClick}})])]):a._e()]),a._v(" "),e("tables",{directives:[{name:"show",rawName:"v-show",value:!a.inforadmin,expression:"!inforadmin"}],attrs:{tableSelectData:a.tableSelectData}}),a._v(" "),e("div",{directives:[{name:"show",rawName:"v-show",value:a.inforadmin,expression:"inforadmin"}]},[e("div",{staticClass:"col-sm-6"},[e("h5",["add"==a.opreate?e("span",[a._v("应用系统添加")]):"update"==a.opreate?e("span",[a._v("应用系统修改")]):a._e()])]),a._v(" "),e("form",{staticClass:"form form-horizontal col-sm-8"},[e("div",{staticClass:"form-group"},[e("label",{staticClass:"control-label col-sm-2"},[a._v("应用系统名")]),a._v(" "),e("div",{staticClass:"col-sm-6",class:{"has-success":!a.errors.has("name")&&""!=a.addData.name,"has-error":a.errors.has("name")}},[e("input",{directives:[{name:"model",rawName:"v-model",value:a.addData.name,expression:"addData.name"},{name:"validate",rawName:"v-validate",value:a.$api.opreate.validateAdd("name",20,a.stateid,a.opreate),expression:"$api.opreate.validateAdd('name',20,stateid,opreate)"}],staticClass:"form-control",attrs:{type:"text",name:"name",placeholder:"请输入应用系统名,最多为20位","data-vv-as":"应用系统名"},domProps:{value:a.addData.name},on:{input:function(t){t.target.composing||a.$set(a.addData,"name",t.target.value)}}})]),a._v(" "),e("div",{staticClass:"text-danger"},[e("span",{directives:[{name:"show",rawName:"v-show",value:a.errors.has("name"),expression:"errors.has('name')"}]},[a._v(a._s(a.errors.first("name")))])])]),a._v(" "),e("div",{staticClass:"form-group"},[e("label",{staticClass:"control-label col-sm-2"},[a._v("备注")]),a._v(" "),e("div",{staticClass:"col-sm-6",class:{"has-success":!a.errors.has("remark")&&""!=a.addData.remarks,"has-error":a.errors.has("remark")}},[e("input",{directives:[{name:"model",rawName:"v-model",value:a.addData.remarks,expression:"addData.remarks"},{name:"validate",rawName:"v-validate",value:"required",expression:"'required'"}],staticClass:"form-control",attrs:{type:"text",name:"remark",placeholder:"请输入备注","data-vv-as":"备注"},domProps:{value:a.addData.remarks},on:{input:function(t){t.target.composing||a.$set(a.addData,"remarks",t.target.value)}}})]),a._v(" "),e("div",{staticClass:"text-danger"},[e("span",{directives:[{name:"show",rawName:"v-show",value:a.errors.has("remark"),expression:"errors.has('remark')"}]},[a._v(a._s(a.errors.first("remark")))])])]),a._v(" "),e("div",{staticClass:"form-group"},[e("label",{staticClass:"control-label col-sm-2"},[a._v("详情描述")]),a._v(" "),e("div",{staticClass:"col-sm-6",class:{"has-success":!a.errors.has("mydetail")&&""!=a.addData.detail,"has-error":a.errors.has("mydetail")}},[e("textarea",{directives:[{name:"model",rawName:"v-model",value:a.addData.detail,expression:"addData.detail"},{name:"validate",rawName:"v-validate",value:"required",expression:"'required'"}],staticClass:"form-control",attrs:{rows:"6",name:"mydetail",placeholder:"请输入描述信息","data-vv-as":"描述"},domProps:{value:a.addData.detail},on:{input:function(t){t.target.composing||a.$set(a.addData,"detail",t.target.value)}}})]),a._v(" "),e("div",{staticClass:"text-danger"},[e("span",{directives:[{name:"show",rawName:"v-show",value:a.errors.has("mydetail"),expression:"errors.has('mydetail')"}]},[a._v(a._s(a.errors.first("mydetail")))])])]),a._v(" "),e("div",{staticClass:"form-group col-sm-12"},[e("button",{staticClass:" col-sm-2 col-sm-offset-2 btn btn-info",attrs:{type:"button"},on:{click:a.addDatas}},[a._v("提交")]),a._v(" "),e("button",{staticClass:" col-sm-2 col-sm-offset-2  btn btn-warning",attrs:{type:"button"},on:{click:function(t){a.inforadmin=!1}}},[a._v("返回")])])])]),a._v(" "),e("table-fun-all",{directives:[{name:"show",rawName:"v-show",value:a.tablefunall,expression:"tablefunall"}],attrs:{tablefunall:a.tablefunall,state:"application"},on:{"update:tablefunall":function(t){a.tablefunall=t}}})],1)])])},staticRenderFns:[function(){var a=this.$createElement,t=this._self._c||a;return t("div",{staticClass:"col-sm-8 search-input "},[t("input",{staticClass:"form-control",attrs:{type:"text",placeholder:"搜索用户"}})])}]};var o=e("VU/8")(r,n,!1,function(a){e("tluA")},null,null);t.default=o.exports},tluA:function(a,t){}});
//# sourceMappingURL=6.bf4b6b786f7233cf2d45.js.map