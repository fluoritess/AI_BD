app.directive("pageList", ["$state", "$stateParams", "$http", "$compile", function ($state, $stateParams, $http, $compile) {
    function pagelogin(data) {
        var Data = data;
        var total = Data.pageTotal;
        var active = Data.active;
        var count = Data.count; //最多可显示页数
        var from = active - Math.floor(count / 2); //最左侧页码
        var to = active + Math.floor(count / 2); //最右侧页码
        if (from <= 0) {
            from = 1;
            to = from + count - 1;
        }
        if (to > total) {
            to = total;
            from = to - count + 1;
        }
        var range = [];
        for (var i = from; i <= to; i++) {
            if (i > 0) {
                range.push(i);
            }

        }
        if (range.length > 0) {
            range.push('»');
            range.unshift('«');
            range.push("尾页");
            range.unshift('首页');
        }
        Data.pages = range;
        return Data.pages;
    }
    return {
        restrict: 'EA',
        templateUrl: "public/table.html",
        controller: function ($scope, $element, $attrs, $transclude) {
            
        },
        scope: {
            allcheck: "=",
            page: "=", //在页面中调用时要使用page='page'第一个page代表的是现在这个作用域的page，后面的那个是控制器的page
            tablework: "=",

        },
        link: function (scope, element, attr) {
            scope.page.click();
            //数据接收
            scope.$on("parentChange", function (oldData, newData) {
                //数据监听
                scope.$watch("page", function () {
                    scope.page.pages = pagelogin(newData); //获取页码
                });
            });
            
            //数据行的checkbox选中函数
            scope.checkData = function ($event, value) {
                var checkbox = event.target; //获取事件操作对象的节点  event返回操作对象 target返回节点
                var item = checkbox.checked ? "add" : "remove"; //根据多选框是否选中得到是添加id还是删除id代号
                var checkdata = scope.page.checkdata; //获取当前已选择id
                var dataslen = scope.page.datas.length; //本页数据长度
                var num = scope.page.checkdata.indexOf(value); //查找选中id是否存在选中状态下的数组中
                //添加id
                if (item == "add" && num == -1) {
                    checkdata.push(value);
                    if (checkdata.length == dataslen) {
                        scope.allcheck = true;
                    }
                }
                //删除id
                if (item == "remove" && num != -1) {
                    checkdata.splice(num, 1);
                    scope.allcheck = false;
                }
            };
            //标题行的checkbox选中函数
            scope.CheckDatas = function ($event) {
                var checkbox = event.target; //获取事件操作对象的节点  event返回操作对象 target返回节点
                var item = checkbox.checked ? "add" : "remove";
                var checkdata = scope.page.checkdata;
                var datas = scope.page.datas;
                if (item == "remove") {
                    checkdata = [];
                    scope.check = false; //将每个行多选框的选中状态去除
                }
                if (item == "add") {
                    //循环
                    angular.forEach(datas, function (data) {
                        if (checkdata.indexOf(data.num) == -1)
                            checkdata.push(data.num);
                    });
                    scope.check = true;
                }
                scope.page.checkdata = checkdata; //将当前函数作用域下的id数组赋值给指令作用域
            };
            //检测按钮是否可按
            scope.addClass = function (pages) {
                var page = scope.page.pages;
                if ((pages == page[0] || pages == page[1]) && scope.page.active == 1) {
                    return 'disabled';
                }
                if ((pages == page[page.length - 1] || pages == page[page.length - 2]) && scope.page.active == scope.page.pageTotal) {
                    return 'disabled';
                }
            };
            //选择每页显示多少行数据函数
            scope.countclick = function () {
                scope.allcheck = false;
                scope.page.active = 1;
                scope.check = false;
                scope.page.checkdata = [];
                scope.page.click();
            };
            //页面点击函数
            scope.pageClick = function (Active) {
                var active = scope.page.active;
                var total = scope.page.pageTotal;
                if (Active == active) {
                    scope.loginpage = "";
                    return;
                } else if (Active > total) {
                    alert("没有第" + Active + "页");
                    scope.loginpage = "";
                    return;
                } else if (Active == "首页") {
                    Active = 1;
                } else if (Active == "尾页") {
                    Active = total;
                } else if (Active == "«") {
                    if (active == 1) {
                        return;
                    }
                    Active = active - 1;
                } else if (Active == "»") {
                    if (active == total) {
                        return;
                    }
                    Active = active + 1;
                } else if (Active < 1) {
                    Active = 1;
                }
                scope.loginpage = "";
                scope.allcheck = false;
                scope.check = false;
                scope.page.checkdata = [];
                if (scope.page.click && typeof scope.page.click === 'function') {
                    scope.page.active = Active;
                    scope.page.click();
                }
            };
        }
    };
}]);