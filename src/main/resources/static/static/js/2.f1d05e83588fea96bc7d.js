webpackJsonp([2],{"8JpL":function(e,t,n){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var i=n("bOdI"),s=n.n(i),o={sensorInfNow:function(){for(var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:[],t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:[],n=arguments.length>2&&void 0!==arguments[2]?arguments[2]:[],i=arguments.length>3&&void 0!==arguments[3]?arguments[3]:[],s=arguments.length>4&&void 0!==arguments[4]?arguments[4]:[],o=arguments.length>5&&void 0!==arguments[5]?arguments[5]:[],a=[],r=e.length,l=function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:0,t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:1,n=Math.ceil(e/3),i=t%3;return[50/(e>=3?3:e%3)*(2*(0==i?3:i)-1)+"%",50/n*(2*Math.ceil(t/3)-1)+"%"]},c=function(e){return 75/Math.ceil(e/3)+"%"},u=0;u<r;u++)a.push({min:n[u]-s[u]/(t[u]-4)*2,max:i[u]+s[u]/(t[u]-4)*2,splitNumber:t[u],radius:c(r),center:l(r,u+1),name:e[u].name,type:"gauge",detail:{formatter:"{value} "+e[u].unit,fontSize:12},axisLine:{show:!0,lineStyle:{width:15,color:[[2/t[u],"#ec2a25"],[(t[u]-2)/t[u]," #47e64f"],[1,"#ec2a25"]]}},data:[{value:o[u],name:"当前"+e[u].name}],markPoint:{clickable:!1,symbol:"circle",symbolSize:5,data:[{x:"center",y:"center",itemStyle:{color:"#FFF"}}]},axisLabel:{show:!0,formatter:function(e){return e.toFixed(1)},textStyle:{color:"auto"}},axisTick:{splitNumber:15},splitLine:{length:17,lineStyle:{color:"rgba(128, 128, 128, 0.5)"}},tooltip:{formatter:"{a} <br/>{b} : {c} "+e[u].unit}});return{title:function(e,t){var n=[],i=1,s=Math.ceil(t/3);return e.forEach(function(e){var o=i%3,a=t>=3?3:t%3;n.push({text:e.name+"数据仪表图",x:50/a*(2*(0==o?3:o)-1)+"%",y:50/s*(2*Math.ceil(i/3)-2)+"%",textStyle:{align:"center"},textAlign:"center"}),i+=1}),n}(e,r),tooltip:{formatter:"{a} <br/>{b} : {c} "},splitNumber:t,series:a}},sensorInfHis:function(){var e,t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:[],n=arguments.length>1&&void 0!==arguments[1]?arguments[1]:[],i=arguments.length>2&&void 0!==arguments[2]?arguments[2]:[],o=arguments.length>3&&void 0!==arguments[3]?arguments[3]:[],a=arguments.length>4&&void 0!==arguments[4]?arguments[4]:{show:!1,start:0},r=arguments.length>5&&void 0!==arguments[5]?arguments[5]:"数据历史记录曲线图",l=[],c=t.length,u=c;console.log(i);for(var d=0;d<c;d++)l.push({data:i[d],type:"line",smooth:!0,symbolSize:8,tooltip:{formatter:"{a} <br/>时间:{b}<br/>数据:{c} "+t[d].unit},z:u,name:o[d],areaStyle:{}}),u-=1;return e={title:{text:r,x:"left"},tooltip:{},toolbox:{show:!0,feature:{mark:{show:!0},dataView:{show:!0,readOnly:!1},restore:{show:!0},saveAsImage:{show:!0}}},dataZoom:a,legend:{data:o},grid:{left:"3%",right:"4%",bottom:"3%",containLabel:!0},xAxis:{name:"时间",boundaryGap:!1,type:"category",axisLabel:{margin:8},axisTick:{show:!0,interval:0},data:n},yAxis:{name:"历史数据",type:"value"}},s()(e,"grid",{}),s()(e,"series",l),e}},a={data:function(){return{sensorInfVisible:!1,NowAndHistory:0,typenum:0,oldtypenum:0,restypenum:0,items:[],sensorInf:[],typeCheckData:[],initData:[{url:"Sensor/selectAddress.action",title:"农场"},{url:"Sensor/selectGreenHouse.action",title:"大棚"},{url:"Sensor/selectGreenHouseEquipment.action",title:"设备"}],sensorHis:{item:[[{title:"15分钟内历史记录数据",url:"collect/selectQuarter.action"},{title:"1小时内历史记录数据",url:"collect/selectOneHour.action"},{title:"一天内历史记录数据",url:"collect/selectOneDay.action"}],[{title:"最小二乘法预测",url:"predict/predictOneDay.action"},{title:"灰色预测",url:"predict/predictOneDayGM.action"}]],now:0}}},mounted:function(){this.loginThisItems(this.initData[this.typenum].url)},sockets:{},methods:{loginItems:function(e){var t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"",n=this,i=n.typenum;if(""!=t&&(n.typeCheckData[i]=t),i==n.initData.length-1)if(e>0)n.NowAndHistory=0,n.drawChartNow();else if(e<0&&n.sensorInfVisible)return 0==n.NowAndHistory&&n.$socket.emit("outGetValue",n.typeCheckData[n.typenum].id),n.sensorInfVisible=!1,void(n.NowAndHistory=!0);n.oldtypenum=i,e>0?i+=1:i-=1,n.restypenum=i,i<=n.initData.length-1?n.loginThisItems(n.initData[i].url,""!=t?t.id:0==i?"":n.typeCheckData[i].id):n.typenum=n.initData.length-1},loginThisItems:function(e){var t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"",n=this;n.$axios.post(n.HOST+e,""!=t?{id:t}:{id:"2"}).then(function(e){e.data.length>0?(n.items=e.data,n.typenum=n.restypenum):n.typenum=n.oldtypenum}).catch(function(e){})},watchDraw:function(e){var t=this;t.sensorHis.now=0,t.NowAndHistory=e,0==e?t.drawChartNow():(t.$socket.emit("outGetValue","0123456789"),t.drawChartHistory())},drawChartNow:function(){var e=this;e.$socket.emit("onGetValue","0123456789");var t={},n=[],i=[],s=[],a=[],r=[],l={},c=[],u=layer.msg("数据加载中",{icon:16,shade:[.6,"#ccc"]});function d(n){n.length;var i=e.sensorInf,s=[],o=[];n.forEach(function(e){for(var t=0;t<i.length;t++)if(i[t].id==e.id){i[t].now=n.value,l.series[0].data[t].value=i.now;var a=i.now>=i.max,r=i.now<=i.min;a?s.push(i[t].unittype.name):r&&o.push(i[t].unittype.name);break}});var a=(s.length>0?s.join("、")+"过高":"")+(o.length>0?o.join("、")+"过低":"");a.length>0&&e.$layer.alert(a,{icon:5,time:1500}),t.setOption(l,!0)}e.$axios.post(e.HOST+"Sensor/selectEquipmentSensorValue.action",{id:e.typeCheckData[e.typenum].id}).then(function(h){e.sensorInf=[];var v=0;h.data.forEach(function(t){e.sensorInf[v]={};var o=t.growth_parameter_min,l=t.growth_parameter_max,u=t.sensor_value,d={name:t.sensor_position,unit:t.unit};e.sensorInf[v].min=o,e.sensorInf[v].max=l,e.sensorInf[v].now=u,e.sensorInf[v].id=t.sensor_id,e.sensorInf[v].unittype=d;var h=l-o,m=10;h>10||h<6?h>10&&h<20&&(m=10):h<=10&&h>=6&&(m=h+4),i.push(l),s.push(o),a.push(h),n.push(m),r.push(d),c.push(u),v+=1}),t=e.$echarts.init(document.getElementById("myChartNow")),l=o.sensorInfNow(r,n,s,i,a,c),window.echartoption=l,t.setOption(l,!0),e.sensorInfVisible=!0,layer.close(u),e.$socket.on("onGetValue",d)}).catch(function(e){console.error(e)})},drawChartHistory:function(){var e=this,t=e.sensorHis,n=e.NowAndHistory-1,i=t.item[n][t.now],s=e.$echarts.init(document.getElementById("myChartHistory")),a=[],r=layer.msg("数据加载中",{icon:16,shade:[.6,"#ccc"]});e.$axios.post(e.HOST+i.url,{device_id:e.typeCheckData[e.typenum].id}).then(function(t){var n=[],l=[],c=[],u=0;t.data.list.forEach(function(t){l[u]=[],t.forEach(function(t){var i=e.$api.opreate.DateCompletion(t.collectTime);!n.includes(i)&&n.push(i),l[u].push(t.sensorValue)}),c.push(t[0].sensorPosition),a.push({name:t[0].sensorPosition,unit:t[0].unit}),u+=1});var d=o.sensorInfHis(a,n,l,c,{show:!0,start:0},i.title+"曲线图");s.setOption(d,!0),layer.close(r)}).catch(function(e){console.log(e)})},changeHisType:function(e){this.sensorHis.now=e,this.drawChartHistory()}}},r={render:function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",[n("div",{staticClass:"panel panel-info"},[n("div",{staticClass:"panel-body"},[n("div",[e._v("实时监测")]),e._v(" "),n("div",[n("div",{staticClass:"panel panel-default"},[n("div",{staticClass:"panel-heading"},[n("div",[n("h4",[e._l(e.typeCheckData,function(t,i){return n("span",{directives:[{name:"show",rawName:"v-show",value:i<e.typenum||e.sensorInfVisible,expression:"index<typenum||sensorInfVisible"}],key:i,class:["iconfont",{"icon-farm":0==i,"icon-greenHouse":1==i,"icon-device":2==i,"icon-sensor":3==i}],domProps:{innerHTML:e._s(t.name+"&nbsp;&nbsp;&nbsp;&nbsp;")}})}),e._v(" "),n("span",{directives:[{name:"show",rawName:"v-show",value:!e.sensorInfVisible,expression:"!sensorInfVisible"}],class:["iconfont",{"icon-farm":0==e.typenum,"icon-greenHouse":1==e.typenum,"icon-device":2==e.typenum,"icon-sensor":3==e.typenum}],domProps:{innerHTML:e._s(e.initData[e.typenum].title)}}),e._v(" "),0!=e.typenum?n("a",{staticClass:"btn btn-link pull-right",on:{click:function(t){e.loginItems(-1)}}},[e._v("返回上一级")]):e._e()],2)])]),e._v(" "),n("div",{staticClass:"panel-body"},[n("div",{directives:[{name:"show",rawName:"v-show",value:!e.sensorInfVisible,expression:"!sensorInfVisible"}]},[e.items.length>0?n("div",e._l(e.items,function(t,i){return n("div",{key:i,staticClass:"col-sm-3 col-md-3 col-lg-2"},[n("div",{staticClass:"item-back",on:{click:function(n){e.loginItems(1,t)}}},[n("div",{staticClass:"real-item"},[n("div",{staticClass:"real-icon"},[n("i",{staticClass:"iconfont ",class:["iconfont",{"icon-farm":0==e.typenum,"icon-greenHouse":1==e.typenum,"icon-device":2==e.typenum,"icon-sensor":3==e.typenum}]})]),e._v(" "),n("div",{staticClass:"real-info"},[n("span",{domProps:{innerHTML:e._s(t.name)}}),n("br"),e._v(" "),n("span",{domProps:{innerHTML:e._s(t.address)}})])])])])})):e._e(),e._v(" "),n("div",{directives:[{name:"show",rawName:"v-show",value:e.items.length<=0,expression:"items.length<=0"}],staticClass:"col-sm-12 txt-center cursor-pointer logindata-error"},[e._v("\r\n                                未查找到数据，点击请重试\r\n                            ")])]),e._v(" "),n("div",{directives:[{name:"show",rawName:"v-show",value:e.sensorInfVisible,expression:"sensorInfVisible"}]},[n("div",{staticClass:"pull-right sensor-info-type"},[n("a",{directives:[{name:"show",rawName:"v-show",value:0!=e.NowAndHistory,expression:"NowAndHistory!=0"}],staticClass:"btn btn-link",on:{click:function(t){e.watchDraw(0)}}},[e._v("查看当前数据")]),e._v(" "),n("a",{directives:[{name:"show",rawName:"v-show",value:1!=e.NowAndHistory,expression:"NowAndHistory!=1"}],staticClass:"btn btn-link",on:{click:function(t){e.watchDraw(1)}}},[e._v("查看历史记录")]),e._v(" "),n("a",{directives:[{name:"show",rawName:"v-show",value:2!=e.NowAndHistory,expression:"NowAndHistory!=2"}],staticClass:"btn btn-link",on:{click:function(t){e.watchDraw(2)}}},[e._v("查看数据预测")])]),e._v(" "),n("div",{staticClass:"sensor-echart"},[n("div",{staticClass:"sensorHis  sensor-info-type"},[1==e.NowAndHistory||2==e.NowAndHistory?n("div",[n("div",{staticClass:"sensorhis-header"},[n("span",{directives:[{name:"show",rawName:"v-show",value:1==e.NowAndHistory,expression:"NowAndHistory==1"}]},[e._v(" 选择历史记录时间段")]),e._v(" "),n("span",{directives:[{name:"show",rawName:"v-show",value:2==e.NowAndHistory,expression:"NowAndHistory==2"}]},[e._v(" 选择专家预测方式")])]),e._v(" "),n("div",{staticClass:"sensorhis-body"},[n("ul",e._l(e.sensorHis.item[e.NowAndHistory-1],function(t,i){return n("li",{key:i,class:[{"item-active":e.sensorHis.now==i},"item-link"],on:{click:function(t){e.changeHisType(i)}}},[e._v(e._s(t.title))])}))])]):e._e()]),e._v(" "),n("div",{directives:[{name:"show",rawName:"v-show",value:0==e.NowAndHistory,expression:"NowAndHistory==0"}]},[n("div",{style:{width:"70vw",height:300*(Math.floor(e.sensorInf.length.toString()/3)+1.5)+"px",margin:"auto"},attrs:{id:"myChartNow"}})]),e._v(" "),n("div",{directives:[{name:"show",rawName:"v-show",value:1==e.NowAndHistory||2==e.NowAndHistory,expression:"NowAndHistory==1||NowAndHistory==2"}]},[n("div",{style:{width:"1000px",height:"500px",margin:"auto"},attrs:{id:"myChartHistory"}})])])])])])])])])])},staticRenderFns:[]};var l=n("VU/8")(a,r,!1,function(e){n("X/42")},"data-v-22f48fbc",null);t.default=l.exports},"9bBU":function(e,t,n){n("mClu");var i=n("FeBl").Object;e.exports=function(e,t,n){return i.defineProperty(e,t,n)}},C4MV:function(e,t,n){e.exports={default:n("9bBU"),__esModule:!0}},"X/42":function(e,t){},bOdI:function(e,t,n){"use strict";t.__esModule=!0;var i,s=n("C4MV"),o=(i=s)&&i.__esModule?i:{default:i};t.default=function(e,t,n){return t in e?(0,o.default)(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}},mClu:function(e,t,n){var i=n("kM2E");i(i.S+i.F*!n("+E39"),"Object",{defineProperty:n("evD5").f})}});
//# sourceMappingURL=2.f1d05e83588fea96bc7d.js.map