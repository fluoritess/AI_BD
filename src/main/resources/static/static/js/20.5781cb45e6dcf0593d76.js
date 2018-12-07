webpackJsonp([20],{"/oDV":function(e,t){},"8JpL":function(e,t,n){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var s={sensorInfNow:function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{name:"温度",unit:"℃"},t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:10,n=arguments.length>2&&void 0!==arguments[2]?arguments[2]:0,s=arguments.length>3&&void 0!==arguments[3]?arguments[3]:0,i=arguments.length>4&&void 0!==arguments[4]?arguments[4]:0;return{title:{text:e.name+"数据仪表图",x:"center"},tooltip:{formatter:"{a} <br/>{b} : {c} "+e.unit},toolbox:{feature:{}},splitNumber:t,series:[{min:n-i/(t-4)*2,max:s+i/(t-4)*2,splitNumber:t,name:e.name,type:"gauge",detail:{formatter:"{value} "+e.unit},axisLine:{show:!0,lineStyle:{color:[[2/t,"#ec2a25"],[(t-2)/t," #47e64f"],[1,"#ec2a25"]]}},data:[{value:(s-n)/2+n,name:"当前"+e.name}],markPoint:{clickable:!1,symbol:"circle",symbolSize:5,data:[{x:"center",y:"center",itemStyle:{color:"#FFF"}}]},axisLabel:{show:!0,formatter:function(e){return e.toFixed(1)},textStyle:{color:"auto"}},axisTick:{splitNumber:15}}]}},sensorInfHis:function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{name:"温度",unit:"℃"},t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:[],n=arguments.length>2&&void 0!==arguments[2]?arguments[2]:[],s=arguments.length>3&&void 0!==arguments[3]?arguments[3]:{show:!1,start:0},i=arguments.length>4&&void 0!==arguments[4]?arguments[4]:"数据历史记录曲线图";return{title:{text:e.name+i,x:"center"},tooltip:{formatter:"{a} <br/>时间:{b}<br/>数据:{c} "+e.unit},toolbox:{show:!0,feature:{mark:{show:!0},dataView:{show:!0,readOnly:!1},restore:{show:!0},saveAsImage:{show:!0}}},dataZoom:s,xAxis:{name:"时间",boundaryGap:!1,type:"category",axisLabel:{margin:8},axisTick:{show:!0,interval:0},data:t},yAxis:{name:e.name+" ("+e.unit+")",type:"value"},grid:{},series:[{data:n,type:"line",smooth:!0,symbolSize:8,name:e.name}]}}},i={data:function(){return{sensorInfVisible:!1,NowAndHistory:0,typenum:0,oldtypenum:0,restypenum:0,items:[],sensorInf:{max:35,min:26,now:24,type:"温度|气压"},typeCheckData:[],initData:[{url:"Sensor/selectAddress.action",title:"农场"},{url:"Sensor/selectGreenHouse.action",title:"大棚"},{url:"Sensor/selectGreenHouseEquipment.action",title:"设备"},{url:"Sensor/selectSensor.action",title:"传感器"}],sensorHis:{item:[[{title:"15分钟内历史记录数据",url:"collect/selectQuarter.action"},{title:"1小时内历史记录数据",url:"collect/selectQuarter.action"},{title:"一天内历史记录数据",url:"collect/selectQuarter.action"}],[{title:"最小二乘法预测",url:"predict/predictOneDay.action"},{title:"灰色预测",url:"predict/predictOneDayGM.action"}]],now:0}}},mounted:function(){this.loginThisItems(this.initData[this.typenum].url)},sockets:{},methods:{loginItems:function(e){var t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"",n=this,s=n.typenum;if(""!=t&&(n.typeCheckData[s]=t),s==n.initData.length-1)if(e>0)n.NowAndHistory=0,n.drawChartNow();else if(e<0&&n.sensorInfVisible)return 0==n.NowAndHistory&&n.$socket.emit("outGetValue",n.typeCheckData[n.typenum].id),n.sensorInfVisible=!1,void(n.NowAndHistory=!0);n.oldtypenum=s,e>0?s+=1:s-=1,n.restypenum=s,s<=n.initData.length-1?n.loginThisItems(n.initData[s].url,""!=t?t.id:0==s?"":n.typeCheckData[s].id):n.typenum=n.initData.length-1},loginThisItems:function(e){var t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"",n=this;n.$axios.post(n.HOST+e,""!=t?{id:t}:{id:"2"}).then(function(e){e.data.length>0?(n.items=e.data,n.typenum=n.restypenum):n.typenum=n.oldtypenum}).catch(function(e){})},watchDraw:function(e){var t=this;t.sensorHis.now=0,t.NowAndHistory=e,0==e?t.drawChartNow():(t.$socket.emit("outGetValue",t.typeCheckData[t.typenum].id),t.drawChartHistory())},drawChartNow:function(){var e=this;e.$socket.emit("onGetValue",e.typeCheckData[e.typenum].id);var t=e.$echarts.init(document.getElementById("myChartNow")),n=10,i=e.drawChartSensorType(0),o={};e.$axios.post(e.HOST+"collect/selectParameter.action",{sensor_id:e.typeCheckData[e.typenum].id}).then(function(a){e.sensorInf.min=a.data.min,e.sensorInf.max=a.data.max,e.sensorInf.now=a.data.collectInfoValue.sensorValue;var r=e.sensorInf.min,l=e.sensorInf.max,c=l-r;c>10||c<6?c>10&&c<20&&(n=10):c<=10&&c>=6&&(n=c+4),(o=s.sensorInfNow(i,n,r,l,c)).series[0].data[0].value=e.sensorInf.now,t.setOption(o,!0),e.sensorInfVisible=!0,e.$socket.on("onGetValue",function(n){e.sensorInf.now=n,function(n){var s=e.sensorInf;o.series[0].data[0].value=s.now;var i=s.now>=s.max,a=s.now<=s.min,r=n;i?r+="过高":a&&(r+="过低");(i||a)&&e.$layer.alert(r,{icon:5,time:1500});t.setOption(o,!0)}(i.name)})}).catch(function(e){})},drawChartHistory:function(){var e=this,t=e.sensorHis,n=e.NowAndHistory-1,i=t.item[n][t.now],o=e.$echarts.init(document.getElementById("myChartHistory")),a=e.drawChartSensorType(0);e.$axios.post(e.HOST+i.url,{sensor_id:e.typeCheckData[e.typenum].id}).then(function(t){var n=[],r=[];t.data.list.forEach(function(t){n.push(e.$api.opreate.DateCompletion(t.collectTime)),r.push(t.sensorValue)});var l=s.sensorInfHis(a,n,r,{show:!0,start:70},i.title+"曲线图");o.setOption(l,!0)}).catch(function(e){})},drawChartSensorType:function(e){return[{unit:"℃",name:"温度"},{unit:"Pa",name:"气压"},{unit:" %RH",name:"湿度"}][e]},changeHisType:function(e){this.sensorHis.now=e,this.drawChartHistory()}}},o={render:function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",[n("div",{staticClass:"panel panel-info"},[n("div",{staticClass:"panel-body"},[n("div",[e._v("实时监测")]),e._v(" "),n("div",[n("div",{staticClass:"panel panel-default"},[n("div",{staticClass:"panel-heading"},[n("div",[n("h4",[e._l(e.typeCheckData,function(t,s){return n("span",{directives:[{name:"show",rawName:"v-show",value:s<e.typenum||e.sensorInfVisible,expression:"index<typenum||sensorInfVisible"}],key:s,class:["iconfont",{"icon-farm":0==s,"icon-greenHouse":1==s,"icon-device":2==s,"icon-sensor":3==s}],domProps:{innerHTML:e._s(t.name+"&nbsp;&nbsp;&nbsp;&nbsp;")}})}),e._v(" "),n("span",{directives:[{name:"show",rawName:"v-show",value:!e.sensorInfVisible,expression:"!sensorInfVisible"}],class:["iconfont",{"icon-farm":0==e.typenum,"icon-greenHouse":1==e.typenum,"icon-device":2==e.typenum,"icon-sensor":3==e.typenum}],domProps:{innerHTML:e._s(e.initData[e.typenum].title)}}),e._v(" "),0!=e.typenum?n("a",{staticClass:"btn btn-link pull-right",on:{click:function(t){e.loginItems(-1)}}},[e._v("返回上一级")]):e._e()],2)])]),e._v(" "),n("div",{staticClass:"panel-body"},[n("div",{directives:[{name:"show",rawName:"v-show",value:!e.sensorInfVisible,expression:"!sensorInfVisible"}]},[e.items.length>0?n("div",e._l(e.items,function(t,s){return n("div",{key:s,staticClass:"col-sm-3 col-md-3 col-lg-2"},[n("div",{staticClass:"item-back",on:{click:function(n){e.loginItems(1,t)}}},[n("div",{staticClass:"real-item"},[n("div",{staticClass:"real-icon"},[n("i",{staticClass:"iconfont ",class:["iconfont",{"icon-farm":0==e.typenum,"icon-greenHouse":1==e.typenum,"icon-device":2==e.typenum,"icon-sensor":3==e.typenum}]})]),e._v(" "),n("div",{staticClass:"real-info"},[n("span",{domProps:{innerHTML:e._s(t.name)}}),n("br"),e._v(" "),n("span",{domProps:{innerHTML:e._s(t.address)}})])])])])})):e._e(),e._v(" "),n("div",{directives:[{name:"show",rawName:"v-show",value:e.items.length<=0,expression:"items.length<=0"}],staticClass:"col-sm-12 txt-center cursor-pointer logindata-error"},[e._v("\r\n                                未查找到数据，点击请重试\r\n                            ")])]),e._v(" "),n("div",{directives:[{name:"show",rawName:"v-show",value:e.sensorInfVisible,expression:"sensorInfVisible"}]},[n("div",{staticClass:"pull-right"},[n("a",{directives:[{name:"show",rawName:"v-show",value:0!=e.NowAndHistory,expression:"NowAndHistory!=0"}],staticClass:"btn btn-link",on:{click:function(t){e.watchDraw(0)}}},[e._v("查看当前数据")]),e._v(" "),n("a",{directives:[{name:"show",rawName:"v-show",value:1!=e.NowAndHistory,expression:"NowAndHistory!=1"}],staticClass:"btn btn-link",on:{click:function(t){e.watchDraw(1)}}},[e._v("查看历史记录")]),e._v(" "),n("a",{directives:[{name:"show",rawName:"v-show",value:2!=e.NowAndHistory,expression:"NowAndHistory!=2"}],staticClass:"btn btn-link",on:{click:function(t){e.watchDraw(2)}}},[e._v("查看数据预测")])]),e._v(" "),n("div",{staticClass:"sensorHis"},[1==e.NowAndHistory||2==e.NowAndHistory?n("div",[n("div",{staticClass:"sensorhis-header"},[n("span",{directives:[{name:"show",rawName:"v-show",value:1==e.NowAndHistory,expression:"NowAndHistory==1"}]},[e._v(" 选择历史记录时间段")]),e._v(" "),n("span",{directives:[{name:"show",rawName:"v-show",value:2==e.NowAndHistory,expression:"NowAndHistory==2"}]},[e._v(" 选择专家预测方式")])]),e._v(" "),n("div",{staticClass:"sensorhis-body"},[n("ul",e._l(e.sensorHis.item[e.NowAndHistory-1],function(t,s){return n("li",{key:s,class:[{"item-active":e.sensorHis.now==s},"item-link"],on:{click:function(t){e.changeHisType(s)}}},[e._v(e._s(t.title))])}))])]):e._e()]),e._v(" "),n("div",{directives:[{name:"show",rawName:"v-show",value:0==e.NowAndHistory,expression:"NowAndHistory==0"}]},[n("div",{style:{width:"600px",height:"500px",margin:"auto"},attrs:{id:"myChartNow"}})]),e._v(" "),n("div",{directives:[{name:"show",rawName:"v-show",value:1==e.NowAndHistory||2==e.NowAndHistory,expression:"NowAndHistory==1||NowAndHistory==2"}]},[n("div",{style:{width:"800px",height:"500px",margin:"auto"},attrs:{id:"myChartHistory"}})])])])])])])])])},staticRenderFns:[]};var a=n("VU/8")(i,o,!1,function(e){n("/oDV")},"data-v-4413e919",null);t.default=a.exports}});
//# sourceMappingURL=20.5781cb45e6dcf0593d76.js.map