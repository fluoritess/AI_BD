webpackJsonp([8],{FLCY:function(t,a){},dsNe:function(t,a,e){"use strict";Object.defineProperty(a,"__esModule",{value:!0});var n={data:function(){return{page:{alldatas:[],haddatas:[],titleData:["菜单名","类型","描述"]},data:{roleid:"",addData:[],deleteData:[]}}},props:{tablefunall:Boolean},computed:{checkData:function(){return this.tablefunall&&this.loginFunData(),this.$store.getters.GETUSERTABLEPAGECHECKDATA}},methods:{updatejueFun:function(){this.data.roleid=this.checkData[0].id,this.$api.http.opreateHttp(this,"updataDistributionFunction.action",this.data,"修改功能")},closeupdateFun:function(){this.$api.opreate.emitCall("tablefunCall",!1,this)},loginFunData:function(){var t=this;t.$axios.post(t.HOST+"selecDistributionFunction.action").then(function(a){var e=a.data;console.log(e),"0"==e.code?(t.page.alldatas=e.allFunction,t.page.haddatas=e.hadFunction):"500"==e.code&&t.$layer.msg("功能获取失败",{icon:5})}).catch(function(){console.log(error),t.$layer.msg("网络错误，请检查网络是否畅通",{icon:5})})},updateCheckData:function(t,a){t=t;var e=this.data;a.target.checked?!e.addData.indexOf(t.id)>-1&&(!e.deleteData.indexOf(t.id)>-1&&e.deleteData.splice(t.id,1),e.addData.push(t.id)):!e.deleteData.indexOf(t.id)>-1&&(!e.addData.indexOf(t.id)>-1&&e.addData.splice(t.id,1),e.deleteData.push(t.id))}}},i={render:function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("div",{staticClass:"shilde"},[e("div",[e("h3",[t._v("功能分配")]),e("h5",[t._v("为角色"),e("span",{staticStyle:{color:"#ff0000"}},[t.checkData[0]?e("span",[t._v(t._s(t.checkData[0].rolename))]):t._e()]),t._v("分配功能")]),t._v(" "),e("div",[e("table",{staticClass:"table table-bordered table-striped table-hover"},[e("thead",[e("tr",[t._m(0),t._v(" "),t._l(t.page.titleData,function(a,n){return e("th",{key:n,domProps:{textContent:t._s(a)}})})],2)]),t._v(" "),e("tbody",t._l(t.page.alldatas,function(a,n){return e("tr",{key:n},[e("td",[e("input",{attrs:{type:"checkbox",name:"",id:""},on:{change:function(e){t.updateCheckData(a,e)}}})]),t._v(" "),t._l(a,function(a,n){return e("td",{key:n,domProps:{innerHTML:t._s(a)}})})],2)}))]),t._v(" "),e("div",[e("button",{staticClass:"btn btn-info",on:{click:t.updatejueFun}},[t._v("提交")]),t._v(" "),e("button",{staticClass:"btn btn-warning",on:{click:t.closeupdateFun}},[t._v("返回")])])])])])},staticRenderFns:[function(){var t=this.$createElement,a=this._self._c||t;return a("th",[a("input",{attrs:{type:"checkbox",name:"",id:""}})])}]};var d=e("VU/8")(n,i,!1,function(t){e("FLCY")},null,null);a.default=d.exports}});
//# sourceMappingURL=8.2cf0b68ac5454526f138.js.map