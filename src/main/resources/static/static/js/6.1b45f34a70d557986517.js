webpackJsonp([6],{"R/t+":function(a,t){},WlxI:function(a,t,e){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var r=e("Xxa5"),s=e.n(r),i=e("exGp"),o=e.n(i),n=e("D7x1"),c={data:function(){return{inforadmin:!1,opreate:"add",tableSelectData:{selectTableurl:"agriculture/selectCropVarietiesInfo.action",pageloginData:{id:this.stateid},filterName:[]},addData:{crop_varieties_id:"",crop_varieties_name:"",remark:""}}},props:{stateid:String,statetitle:String},computed:{checkData:function(){return this.$store.getters.GETUSERTABLEPAGECHECKDATA}},components:{tables:n.a},mounted:function(){this.$store.commit("UPDATETABLESELECTDATA",this.tableSelectData)},methods:{inforAddClick:function(a){var t,e=(t=o()(s.a.mark(function a(){var t;return s.a.wrap(function(a){for(;;)switch(a.prev=a.next){case 0:for(t in r.addData)r.addData[t]="";return console.log(1),a.abrupt("return",!0);case 3:case"end":return a.stop()}},a,this)})),function(){return t.apply(this,arguments)}),r=this;this.opreate;a&&r.publicAddAndUpdate(),e().then(function(t){r.opreate="add",r.inforadmin=a,r.$validator.errors.clear()})},publicAddAndUpdate:function(){},updateData:function(){this.$api.opreate.TESTcheck("修改")&&(this.inforadmin=!0,this.opreate="update",this.publicAddAndUpdate(),this.addData=this.$api.opreate.ObjectCopy(this.checkData[0]))},addDatas:function(){var a,t=(a=o()(s.a.mark(function a(){var t;return s.a.wrap(function(a){for(;;)switch(a.prev=a.next){case 0:return"update"==e.opreate?t=e.$api.http.opreateHttp("agriculture/updateCropVarietiesInfo.action",i,"修改"):"add"==e.opreate&&(t=e.$api.http.opreateHttp("agriculture/addCropVarietiesInfo.action",i,"添加")),a.abrupt("return",t);case 2:case"end":return a.stop()}},a,this)})),function(){return a.apply(this,arguments)}),e=this,r=e.stateid,i={data:e.addData,states:{id:r}};t().then(function(a){a&&e.inforAddClick(!1)})},deleteData:function(){var a=this;a.$validator.errors.clear();var t=a.$store.getters.GETUSERTABLEPAGECHECKDATA;a.$api.opreate.TESTcheck("删除")&&layer.confirm("是否删除",{btn:["确认","取消"]},function(){var e={id:t[0].crop_varieties_id,states:{id:a.stateid}};a.$api.http.opreateHttp("agriculture/deleteCropVarietiesInfo.action",e,"删除")})},searchBtnClick:function(){""!=this.searchData.data||this.$layer.msg("请输入场景类型名后搜索",{icon:0})}}},d={render:function(){var a=this,t=a.$createElement,e=a._self._c||t;return e("div",[e("div",{staticClass:"panel panel-info"},[e("div",{staticClass:"panel-body"},[e("div",[a._v("作物品种信息管理")]),a._v(" "),e("div",{directives:[{name:"show",rawName:"v-show",value:!a.inforadmin,expression:"!inforadmin"}],staticClass:"buttonbox"},[a.$api.opreate.hasLoginComponents("sys:cropVIM:add")?e("button",{staticClass:"btn btn-info",attrs:{type:"button"},on:{click:function(t){a.inforAddClick(!0)}}},[a._v("新增")]):a._e(),a._v(" "),a.$api.opreate.hasLoginComponents("sys:cropVIM:modify")?e("button",{staticClass:"btn btn-warning",attrs:{type:"button"},on:{click:a.updateData}},[a._v("修改")]):a._e(),a._v(" "),a.$api.opreate.hasLoginComponents("sys:cropVIM:delete")?e("button",{staticClass:"btn btn-danger",attrs:{type:"button"},on:{click:a.deleteData}},[a._v("删除")]):a._e(),a._v(" "),a.$api.opreate.hasLoginComponents("sys:cropVIM:search")?e("div",{staticClass:"pull-right col-sm-3 search-input"},[e("div",{staticClass:"col-sm-12"},[a._m(0),a._v(" "),e("input",{staticClass:"btn btn-info col-sm-3",attrs:{type:"button",value:"搜索"},on:{click:a.searchBtnClick}})])]):a._e()]),a._v(" "),e("tables",{directives:[{name:"show",rawName:"v-show",value:!a.inforadmin,expression:"!inforadmin"}],attrs:{tableSelectData:a.tableSelectData}}),a._v(" "),e("div",{directives:[{name:"show",rawName:"v-show",value:a.inforadmin,expression:"inforadmin"}]},[e("form",{ref:"refForm",staticClass:"form form-horizontal col-sm-8"},[e("div",{staticClass:"form-group"},[e("label",{staticClass:"control-label col-sm-2"},[a._v("作物品种名称")]),a._v(" "),e("div",{staticClass:"col-sm-6",class:{"has-success":!a.errors.has("crop_varieties_name")&&""!=a.addData.crop_varieties_name,"has-error":a.errors.has("crop_varieties_name")}},[e("input",{directives:[{name:"model",rawName:"v-model",value:a.addData.crop_varieties_name,expression:"addData.crop_varieties_name"},{name:"validate",rawName:"v-validate",value:a.$api.opreate.validateAdd("name",50,a.stateid,a.opreate,"Sensor"),expression:"$api.opreate.validateAdd('name',50,stateid,opreate,'Sensor')"}],staticClass:"form-control",attrs:{type:"text",name:"crop_varieties_name",placeholder:"请输入类型名,最多为50位","data-vv-as":"类型名"},domProps:{value:a.addData.crop_varieties_name},on:{input:function(t){t.target.composing||a.$set(a.addData,"crop_varieties_name",t.target.value)}}})]),a._v(" "),e("div",{staticClass:"text-danger"},[e("span",{directives:[{name:"show",rawName:"v-show",value:a.errors.has("crop_varieties_name"),expression:"errors.has('crop_varieties_name')"}]},[a._v(a._s(a.errors.first("crop_varieties_name")))])])]),a._v(" "),e("div",{staticClass:"form-group"},[e("label",{staticClass:"control-label col-sm-2"},[a._v("备注")]),a._v(" "),e("div",{staticClass:"col-sm-6",class:{"has-success":!a.errors.has("remark")&&""!=a.addData.remark,"has-error":a.errors.has("remark")}},[e("textarea",{directives:[{name:"model",rawName:"v-model",value:a.addData.remark,expression:"addData.remark"},{name:"validate",rawName:"v-validate",value:"required",expression:"'required'"}],staticClass:"form-control",attrs:{rows:"6",name:"remark",placeholder:"请输入类型说明","data-vv-as":"类型说明信息"},domProps:{value:a.addData.remark},on:{input:function(t){t.target.composing||a.$set(a.addData,"remark",t.target.value)}}})]),a._v(" "),e("div",{staticClass:"text-danger"},[e("span",{directives:[{name:"show",rawName:"v-show",value:a.errors.has("remark"),expression:"errors.has('remark')"}]},[a._v(a._s(a.errors.first("remark")))])])]),a._v(" "),e("div",{staticClass:"form-group col-sm-12"},[e("button",{staticClass:" col-sm-2 col-sm-offset-2 btn btn-info",attrs:{type:"button"},on:{click:a.addDatas}},[a._v("提交")]),a._v(" "),e("button",{staticClass:" col-sm-2 col-sm-offset-2  btn btn-warning",attrs:{type:"button"},on:{click:function(t){a.inforAddClick(!1)}}},[a._v("返回")])])])])],1)])])},staticRenderFns:[function(){var a=this.$createElement,t=this._self._c||a;return t("div",{staticClass:"col-sm-8 search-input "},[t("input",{staticClass:"form-control",attrs:{type:"text",placeholder:"搜索用户"}})])}]};var l=e("VU/8")(c,d,!1,function(a){e("R/t+")},null,null);t.default=l.exports}});
//# sourceMappingURL=6.1b45f34a70d557986517.js.map