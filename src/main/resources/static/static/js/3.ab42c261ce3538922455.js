webpackJsonp([3,8],{"4n6t":function(t,a){},QEn1:function(t,a,e){"use strict";Object.defineProperty(a,"__esModule",{value:!0});var i=e("D7x1"),n=e("whhw"),s=e("dsNe"),o={data:function(){return{inforadmin:!1,searchData:{data:""},opreate:"add",tableSelectData:{selectTableurl:"selectRolePaging.action",psgeloginData:{id:this.stateid}},tablefunall:!1}},props:{stateid:String,statetitle:String},components:{tables:i.a,addInfor:n.a,tableFunAll:s.default},methods:{tablefunCall:function(t){this.tablefunall=t},inforAddClick:function(t){this.inforadmin=t,this.opreate="add"},updateData:function(){this.$api.opreate.TESTcheck(this,"修改")&&(this.inforadmin=!0,this.opreate="update")},deleteData:function(){var t=this,a=t.$store.getters.GETUSERTABLEPAGECHECKDATA;t.$api.opreate.TESTcheck(t,"删除")&&layer.confirm("是否删除",{btn:["确认","取消"]},function(){var e={id:a[0].id,states:{id:t.stateid}};t.$api.http.opreateHttp(t,"deleteRoleData.action",e,"删除")})},distributeData:function(){this.tablefunall=this.$api.opreate.TESTcheck(this,"功能分配")},searchBtnClick:function(){""!=this.searchData.data||this.$layer.msg("请输入用户名后搜索",{icon:0})}},watch:{stateid:function(t){this.tableSelectData.psgeloginData.id=t}}},l={render:function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("div",[e("div",{staticClass:"panel panel-info"},[e("div",{staticClass:"panel-body"},[e("div",[t._v("角色管理")]),t._v(" "),e("div",{directives:[{name:"show",rawName:"v-show",value:!t.inforadmin,expression:"!inforadmin"}],staticClass:"buttonbox"},[t.$api.opreate.hasLoginComponents(this,"sys:role:add")?e("button",{staticClass:"btn btn-info",attrs:{type:"button"},on:{click:function(a){t.inforAddClick(!0)}}},[t._v("新增")]):t._e(),t._v(" "),t.$api.opreate.hasLoginComponents(this,"sys:role:modify")?e("button",{staticClass:"btn btn-warning",attrs:{type:"button"},on:{click:t.updateData}},[t._v("修改")]):t._e(),t._v(" "),t.$api.opreate.hasLoginComponents(this,"sys:role:delete")?e("button",{staticClass:"btn btn-danger",attrs:{type:"button"},on:{click:t.deleteData}},[t._v("删除")]):t._e(),t._v(" "),t.$api.opreate.hasLoginComponents(this,"sys:role:distribute")?e("button",{staticClass:"btn btn-parimary",attrs:{type:"button"},on:{click:t.distributeData}},[t._v("功能分配")]):t._e(),t._v(" "),t.$api.opreate.hasLoginComponents(this,"sys:role:search")?e("div",{staticClass:"pull-right col-sm-3 search-input"},[e("div",{staticClass:"col-sm-12"},[t._m(0),t._v(" "),e("input",{staticClass:"btn btn-info col-sm-3",attrs:{type:"button",value:"搜索"},on:{click:t.searchBtnClick}})])]):t._e()]),t._v(" "),e("tables",{directives:[{name:"show",rawName:"v-show",value:!t.inforadmin,expression:"!inforadmin"}],attrs:{statetitle:t.statetitle,state:t.stateid,tableSelectData:t.tableSelectData}}),t._v(" "),e("add-infor",{directives:[{name:"show",rawName:"v-show",value:t.inforadmin,expression:"inforadmin"}],attrs:{statetitle:t.statetitle,opreate:t.opreate,stateId:t.stateid,tableSelectData:t.tableSelectData},on:{inforCall:t.inforAddClick}}),t._v(" "),e("table-fun-all",{directives:[{name:"show",rawName:"v-show",value:t.tablefunall,expression:"tablefunall"}],attrs:{tablefunall:t.tablefunall},on:{tablefunCall:t.tablefunCall}})],1)])])},staticRenderFns:[function(){var t=this.$createElement,a=this._self._c||t;return a("div",{staticClass:"col-sm-8 search-input "},[a("input",{staticClass:"form-control",attrs:{type:"text",placeholder:"搜索角色"}})])}]};var c=e("VU/8")(o,l,!1,function(t){e("a/JD")},null,null);a.default=c.exports},"a/JD":function(t,a){},dsNe:function(t,a,e){"use strict";Object.defineProperty(a,"__esModule",{value:!0});var i={data:function(){return{page:{alldatas:[{createok:!0,id:"1",b:2,c:3},{createok:!1,id:"2",b:2,c:3}],haddatas:["1"],titleData:["菜单名","类型","描述"]},data:{roleid:"",addData:[],deleteData:[]}}},props:{tablefunall:Boolean},computed:{checkData:function(){return this.$store.getters.GETUSERTABLEPAGECHECKDATA}},watch:{tablefunall:function(t){t&&this.loginFunData()}},methods:{createok:function(){var t=0,a=this.itemtablesData.alldatas,e=this.itemtablesData.haddatas;a.forEach(function(i){e.forEach(function(e){i.id==e&&(a[t].createok=!0)}),t+=1})},updatejueFun:function(){this.data.roleid=this.checkData[0].id,this.$api.http.opreateHttp(this,"updataDistributionFunction.action",this.data,"修改功能")},closeupdateFun:function(){this.$api.opreate.emitCall("tablefunCall",!1,this)},loginFunData:function(){var t=this;t.$axios.post(t.HOST+"selecDistributionFunction.action",{id:this.checkData[0].id}).then(function(a){var e=a.data;console.log(e),"0"==e.code?(t.page.alldatas=e.allFunction,t.page.haddatas=e.hadFunction,t.createok()):"500"==e.code&&t.$layer.msg("功能获取失败",{icon:5})}).catch(function(){console.log(error),t.$layer.msg("网络错误，请检查网络是否畅通",{icon:5})})},updateCheckData:function(t,a){t=t;var e=this.data;a.target.checked?!e.addData.indexOf(t.id)>-1&&(e.deleteData.indexOf(t.id)>-1&&(e.deleteData=e.deleteData.splice(t.id,1)),this.page.haddatas.indexOf(t.id)>-1||e.addData.push(t.id)):!e.deleteData.indexOf(t.id)>-1&&(e.addData.indexOf(t.id)>-1&&(e.addData=e.addData.splice(t.id,1)),this.page.haddatas.indexOf(t.id)>-1&&e.deleteData.push(t.id)),console.log(e)}}},n={render:function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("div",{staticClass:"shilde"},[e("div",[e("h3",[t._v("功能分配")]),e("h5",[t._v("为角色"),e("span",{staticStyle:{color:"#ff0000"}},[t.checkData[0]?e("span",[t._v(t._s(t.checkData[0].rolename))]):t._e()]),t._v("分配功能")]),t._v(" "),e("div",[e("table",{staticClass:"table table-bordered table-striped table-hover"},[e("thead",[e("tr",[t._m(0),t._v(" "),t._l(t.page.titleData,function(a,i){return e("th",{key:i,domProps:{textContent:t._s(a)}})})],2)]),t._v(" "),e("tbody",t._l(t.page.alldatas,function(a,i){return e("tr",{key:i},[e("td",[e("input",{directives:[{name:"model",rawName:"v-model",value:a.createok,expression:"datas.createok"}],attrs:{type:"checkbox",name:"",id:""},domProps:{checked:Array.isArray(a.createok)?t._i(a.createok,null)>-1:a.createok},on:{change:[function(e){var i=a.createok,n=e.target,s=!!n.checked;if(Array.isArray(i)){var o=t._i(i,null);n.checked?o<0&&t.$set(a,"createok",i.concat([null])):o>-1&&t.$set(a,"createok",i.slice(0,o).concat(i.slice(o+1)))}else t.$set(a,"createok",s)},function(e){t.updateCheckData(a,e)}]}})]),t._v(" "),t._l(a,function(a,i){return"createok"!=i?e("td",{key:i,domProps:{innerHTML:t._s(a)}}):t._e()})],2)}))]),t._v(" "),e("div",[e("button",{staticClass:"btn btn-info",on:{click:t.updatejueFun}},[t._v("提交")]),t._v(" "),e("button",{staticClass:"btn btn-warning",on:{click:t.closeupdateFun}},[t._v("返回")])])])])])},staticRenderFns:[function(){var t=this.$createElement,a=this._self._c||t;return a("th",[a("input",{attrs:{type:"checkbox",name:"",id:""}})])}]};var s=e("VU/8")(i,n,!1,function(t){e("4n6t")},null,null);a.default=s.exports}});
//# sourceMappingURL=3.ab42c261ce3538922455.js.map