app.directive("loginMsg",['$cookies', "$cookieStore",function($cookies, $cookieStore){
    return {
        restrict: 'EA',
        controller:function($scope, $element, $attrs, $transclude){
            $scope.cookie = $cookies.get("msg");
            $scope.removecookie = function () {
                $cookies.remove("msg");
            };
            window.onbeforeunload = function () {
                $cookies.remove("msg");
            };
        },
        link:function(scope,element,attr){
            scope.$watch("cookie",function(olddata,newdata){
                var data=element.attr("login-msg").replace(";"," ");
                if(scope.cookie!=null){
                    element.append("<div class='"+data+"'>"+scope.cookie+"</div>");
                }
            });
        }
    };
}]);