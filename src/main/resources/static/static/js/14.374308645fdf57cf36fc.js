webpackJsonp([14],{AsQ2:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var n={data:function(){return{tableSelectData:{selectTableurl:"Alarm/selectAlarmInfo.action",pageloginData:{id:this.stateid},filterName:[]}}},computed:{checkData:function(){return this.$store.getters.GETUSERTABLEPAGECHECKDATA}},components:{tables:a("D7x1").a},mounted:function(){this.$store.commit("UPDATETABLESELECTDATA",this.tableSelectData)},methods:{deleteData:function(){var t=this,e=t.$store.getters.GETUSERTABLEPAGECHECKDATA;t.$api.opreate.TESTcheck("删除")&&layer.confirm("是否删除",{btn:["确认","取消"]},function(){var a={id:e[0].id,states:{id:t.stateid}};t.$api.http.opreateHttp("Alarm/deleteAlarmInfo.action",a,"删除")})}}},s={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"panel panel-info"},[a("div",{staticClass:"panel-body"},[a("div",[t._v("报警信息管理")]),t._v(" "),a("div",{staticClass:"buttonbox"},[t.$api.opreate.hasLoginComponents("sys:alert:delete")?a("button",{staticClass:"btn btn-danger",attrs:{type:"button"},on:{click:t.deleteData}},[t._v("删除")]):t._e()]),t._v(" "),a("tables",{attrs:{tableSelectData:t.tableSelectData}})],1)])},staticRenderFns:[]};var i=a("VU/8")(n,s,!1,function(t){a("FJ2U")},null,null);e.default=i.exports},FJ2U:function(t,e){}});
//# sourceMappingURL=14.374308645fdf57cf36fc.js.map