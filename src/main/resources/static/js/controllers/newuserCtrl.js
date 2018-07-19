var app = angular.module("myapp", ["ngCookies", "ngMessages"]);
app.controller("newUserCtrl", ["$scope", "$http", "$location","$sce", function ($scope, $http, $location,$sce) {
    $scope.login_host = "http://" + $location.host() + ":" + $location.port() + "/PHM";
    //获取验证码
    $scope.loginCode = function () {
        $scope.errormsg = "";
        $http.post("sendCode.action", angular.toJson({
            tel: $scope.newuser.tel
        })).then(function (success) {
            var msg=success.data.msg;
            var msg=msg=="本号码已存在,"?msg+"请<a href="+$scope.login_host+">直接登录</a>":msg;
            $scope.errormsg = $sce.trustAsHtml(msg);
            $scope.myForm.tel.$error.mark = !success.data.mark;
        }, function (err) {});
    };
}]);