app.controller("menuCtrl", ["$scope", "$http", "$stateParams", "$location", function ($scope, $http, $stateParams, $location) {
    $http.get("../json/menu.json").then(function (success) {
        $scope.menus = success.data.menu;
    }, function (err) {})
}])
app.controller("main_index_table", ["$scope", "$http", "$state", "$stateParams", "$rootScope", "$filter", "$location", function ($scope, $http, $state, $stateParams, $rootScope, $filter, $location) {
    var childID = $stateParams.ChildID;
    var mainID = $stateParams.mainID;
    $scope.update = false;
    $scope.delete = false;
    //数据添加操作
    $scope.addDatas = function (data) {
        var datas = {
            data: data,
            states: {
                id: mainID
            }
        }
        console.log(data)
        $http.post("distributor.action", angular.toJson(datas)).then(function (success) {
            alert("添加成功");
            $scope[data] = '';
            $location.path("/main/" + mainID);
        }, function (error) {
            alert("添加失败");
        })
    };
    //功能，战区，角色验证添加
    $scope.verNameData = function (datas,title,formname,inputname) {
        console.log(arguments);
        var error=formname[inputname].$error;
        var data = {
            data: {
                data:datas,
                name:title
            },
            states: {
                id: mainID
            }
        }
        if(arguments[0]){
            $http.post("inspectData.action", angular.toJson(data)).then(function (success) {
                if(success.data.msg!=""){
                    error.mark=true;
                }
            }, function (error) {
            });
        }
    }
    //页面对象
    $scope.page = {
        titleData: [], //表格标题数组
        datas: [], //表格数据数组
        pages: [], //页码数组
        checkdata: [], //选中状态下的数据行ID
        pageselect: [2, 5, 10], //可选择每页显示条数数组
        active: 1, //当前页
        pagelist: 8, //每页显示数据条数
        pageTotal: 0, //总页数
        listTotal: 0, //总条数
        count: 5, //页码可显示数，即页码数组长度
        deleteUrl: '', //删除操作指向action
        updateUrl: '' //修改操作指向action
    };
    //数据操作后台交互
    $scope.page.deleteData = function () {
        var data = $rootScope.main_table_deletedata;
        $http.post("deleteData.action", angular.toJson({
            data: data,
            states: {
                id: mainID
            }
        })).then(function (success) {
            alert("删除成功");
            $scope.page.click();
        }, function (error) {
            alert("删除失败");
        })
    };
    //过滤表格title
    var judgeTitle = function (data) {
        var datas = data;
        for (var i = 0; i < datas.length; i++) {
            if (datas[i] == "密码") {
                var b = datas.slice(0, i);
                var d = datas.slice(i + 1, datas.length);
                datas = b.concat(d);
            }
        }
        return datas;
    }
    //过滤函数
    var judgeData = function (data) {
        var datas = data;
        if (datas.length > 0) {
            angular.forEach(datas, function (Data) {
                for (var key in Data) {
                    switch (key) {
                        case "password":
                            delete Data[key];
                            break;
                        case "regtime":
                            Data[key] = $filter('date')(Data[key], 'yyyy年MM月dd日');
                            break;
                    }
                }
            })
        } else {
            datas = "";
        }
        return datas;
    }
    //页码点击后请求函数
    $scope.page.click = function () {
        if ($scope.ChildId != 'add') {
            $http.post("selectPaging.action", angular.toJson({
                page: {
                    active: $scope.page.active,
                    pagelist: $scope.page.pagelist
                },
                state: {
                    id: $scope.stateID,
                    ChildId: $scope.ChildId
                }
            })).then(function (success) {
                $scope.page.titleData = judgeTitle(success.data.data_title);
                $scope.page.datas = judgeData(success.data.lists);
                $scope.page.listTotal = success.data.listTotal;
                $scope.page.pageTotal = Math.ceil($scope.page.listTotal / $scope.page.pagelist);
                $scope.$broadcast("parentChange", {
                    pageTotal: $scope.page.pageTotal,
                    active: $scope.page.active,
                    pages: $scope.page.pages,
                    count: $scope.page.count
                });
            }, function (err) {
                $scope.page.datas = '';
            });
        }
    }
      //用户审核提交操作
      $scope.shenheData = function (data) {
        var datas = {
            data: data,
            states: {
                id: mainID
            }
        }
        console.log(datas);
        $http.post("examineUser.action", angular.toJson(datas)).then(function (success) {
            alert("审核通过");
            $scope.page.click();
        }, function (error) {
            alert("审核失败");
        });
    }
    //用户冻结函数
    $scope.freezeData = function () {
        var datas = {
            data: $scope.freezedata,
            states: {
                id: mainID
            }
        }
        console.log(datas);
        $http.post("frozenUser.action", angular.toJson(datas)).then(function (success) {
            alert("冻结成功");
            $scope.page.click();
        }, function (error) {
            alert("冻结失败");
        });
    }
    //获取子菜单
    var ChildHttp = function () {
        $http.get("../json/menu.json", {
            id: $scope.stateID
        }).then(function (success) {
            $scope.childMenus = success.data.childmenu[mainID];

        }, function (err) {
            console.log(err);
        })
    };
    //判断页面显示
    var stateUpdateWatch = function () {
        if (mainID != "") {
            $scope.stateID = mainID;
            ChildHttp();
            if (childID != "") {
                $scope.ChildId = childID;
            } else {
                $scope.ChildId = "";
            }
            loginoperate();
        } else {
            $scope.stateID = "";
        }
        switch ($scope.stateID) {
            case "jueseguanli":
                $rootScope.statesTitle = "角色";
                break;
            case "gongnengguanli":
                $rootScope.statesTitle = "功能";
                break;
            case "yonghuguanli":
                $rootScope.statesTitle = "用户";
                break;
            case "zhanquguanli":
                $rootScope.statesTitle = "站区";
                break;
        }
    }
    //表格操作初始化
    $scope.tablework={
        "jueseguanli": {
            select: [{
                    title: '功能分配',
                    class: "btn btn-warning",
                    callbacks: function (value) {
                        $rootScope.main_table_data = {
                            id: value.id,
                            operate: "update",
                        }
                        $scope.$broadcast('call', value.id);//传值
                },
                operate: "funUpdate"

            },
                {
                    title: '删除',
                    class: "btn btn-danger",
                    callbacks: function (value) {
                        $rootScope.main_table_deletedata = {
                            id: value.id,
                        }
                    },
                    operate: "delete"
                }
            ]
        },
        "gongnengguanli": {
            select: [{
                title: '修改',
                class: "btn btn-warning",
                callbacks: function (value) {
                    $scope.updateGonenengData={
                        id:value.id,
                        pagename:value.pagename,
                        url:value.url,
                        detail:value.detail
                    };
                    value={};
                },
                operate: "update"
            },
                {
                    title: '删除',
                    class: "btn btn-danger",
                    callbacks: function (value) {
                        $rootScope.main_table_deletedata = {
                            id: value.id,
                        }
                    },
                    operate: "delete"
                }
            ]
        },
        "yonghuguanli": {
            "selectwill": [{
                title: '审核',
                class: "btn btn-warning",
                callbacks: function (value) {
                    $scope.loginuserData = value;
                },
                operate: "shenhe"
            },
                {
                    title: '删除',
                    class: "btn btn-danger",
                    callbacks: function (value) {
                        $rootScope.main_table_deletedata = {
                            id: value.id,
                        }
                    },
                    operate: "delete"
                }
            ],
            "selectok": [{
                title: '冻结',
                class: "btn btn-warning",
                callbacks: function (value) {
                    $scope.freezedata=value.id;
                },
                operate: "freeze"
            }, {
                title: '删除',
                class: "btn btn-danger",
                callbacks: function (value) {
                    $rootScope.main_table_deletedata = {
                        id: value.id,
                    }
                },
                operate: "delete"
            }]
        },
        "zhanquguanli": {
            select: [{
                title: '查看',
                class: "btn btn-warning",
                callbacks: function (value) {
                    $scope.logindepartData=value;
                },
                operate: "departlogin"

            },
                {
                    title: '删除',
                    class: "btn btn-danger",
                    callbacks: function (value) {
                        $rootScope.main_table_deletedata = {
                            id: value.id,
                        }
                    },
                    operate: "delete"
                }
            ]
        }
    };
    //绑定函数和显示隐藏操作界面
    function loginoperate() {
        var TableWorks = $scope.tablework;
        for (var key in TableWorks[mainID]) {
            break;
        }
        var str = childID ? childID : key;

        $scope.page.tableworks = TableWorks[mainID][str];
        //引入函数
        $scope.page.loadData = function (data, call, events) {
            var eve = window.event || events;
            call(data)
            angular.forEach($scope.page.tableworks, function (datas) {
                if (eve.target.innerHTML == datas.title && datas.operate != "") {
                    $scope[datas.operate] = true;
                }
            });

        };
        //删除子菜单
        $scope.delete_alert = function () {
            $scope.update = false;
            $scope.delete = false;
            $scope.shenhe = false;
            $scope.funUpdate = false;
            $scope.freeze = false;
            $scope.departlogin=false;

        }
    }
    stateUpdateWatch();
}]);

app.controller("user_Index_Ctrl", ["$scope", "$http", "$location", function ($scope, $http, $location) {
    //获取战区select
    $scope.selectdata = {};
    $scope.updateData={};
    $scope.loginDepartSelectData = function () {
        $http.post("allDepart.action").then(function (success) {
            $scope.selectdata.depart = success.data
        }, function (err) {})
    }
    //获取角色
    $scope.loginRoleSelectData = function () {
        $http.post("allRole.action").then(function (success) {
            $scope.selectdata.role = success.data
        }, function (err) {})
    }
    //初始化界面获取资料
    $scope.loginData = function () {
        $http.post("getUserDate.action").then(function (success) {
            var data = success.data;
            if (data.indexData == false) {
                $scope.indexData = false;
                $scope.loginDepartSelectData();
            } else if (data.indexData == true) {
                $scope.userData = success.data;
                $scope.indexData = true;
            }
            $scope.loginRoleSelectData();
        }, function (err) {});
    };
    $scope.loginData();
    $scope.remove = function () {
        $scope.updateData = [];
        $scope.myForm.myName.$dirty = false;
        $scope.myForm.myEmail.$dirty = false;
        $scope.myForm.myNic.$dirty = false;
        $scope.myFormPass.myoldPass.$dirty = false;
        $scope.myFormPass.newPass.$dirty = false;
        $scope.myFormPass.mynewPass.$dirty = false;
    };
    //修改信息
    $scope.UpdateData = function (title) {
        var data = {
            title: title,
            data: $scope.updateData,
        }
        $http.post("UserDate.action", angular.toJson(data)).then(function (success) {
            $scope.loginData();
            $scope.upDate = false;
            $scope.upDatePass = false;
            alert("修改成功");
        }, function (err) {
            console.log(err)
            alert("修改失败");
        });

    }

}])
app.controller("itemtables", ["$scope", "$http", "$stateParams", "$rootScope", function ($scope, $http, $stateParams, $rootScope) {
    var childID = $stateParams.ChildID;
    var mainID = $stateParams.mainID;
    var jueseID;
    
    $scope.$watch("main_table_data",function(olds,news){
        $scope.$on('call', function(event,data1){
            jueseID=data1;//接受值
            $scope.itemTableData();
        });
    })
    //获取子表格数据
    $scope.itemTableData = function () {
        $http.post("selecDistributionFunction.action", angular.toJson({
            data:jueseID,
            states: {
                id: mainID
            }
        })).then(function (success) {
            $scope.itemtablesData = success.data;
            createOK();
        }, function (error) {alert("功能获取失败");})

    };
    //选中功能数据
    $scope.createUpdate = function (id) {
        console.log(id)
        $http.post("updataDistributionFunction.action", angular.toJson({
        data:jueseID,//角色id
           id:id//功能id
        })).then(function (success) {
            $scope.itemTableData();
            alert("功能选中成功");
        }, function (error) {
            alert("功能选中失败");
        });
    };
    //撤销功能数据
    $scope.deleteUpdate = function (id) {
        console.log(id)
        $http.post("delectDistributionFunction.action", angular.toJson({
            data:jueseID,//角色id
            id:id//功能id
        })).then(function (success) {
            $scope.itemTableData();
            alert("功能撤销成功");
        }, function (error) {
            alert("功能撤销失败");
        });
    };
   // 为数据添加选中状态函数
   function createOK(){
       var index=0;
       var allpage=$scope.itemtablesData.allpage;
       var id=$scope.itemtablesData.id;
       angular.forEach($scope.itemtablesData.allpage,function(datas){
           angular.forEach(id,function(data){
               if(datas.id==data){
                   allpage[index].createok=true;
               }
           })
           index+=1;
       })
   }
}])
app.controller("update_gongneng",["$scope","$http","$stateParams",function($scope,$http,$stateParams){
    var mainID=$stateParams.stateID;
    $scope.delete_form_alert=function(formname,data){
        $scope.updateGonenengData={};
        for(var key=0;key<data.length;key++){
            formname[data[key]].$dirty=false;
        }
    };
    //功能修改提交操作
    $scope.updateData = function (data) {
        var datas = {
            data: data,
            states: {
                id: mainID
            }
        }
        $http.post("updatePageInf.action", angular.toJson(datas)).then(function (success) {
            alert("修改成功");
            $scope.page.click();
        }, function (error) {
            alert("修改失败");
        })

    }
}])