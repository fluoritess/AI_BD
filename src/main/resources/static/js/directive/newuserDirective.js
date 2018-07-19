app.directive("loginCode", function () {
    return {
        restrict: 'EA',
        link: function (scope, element, attr) {
            element.on("click", function () {
                scope.$watch("errormsg", function (oldD,newD) {
                    if(newD==''){
                        return;
                    }
                    element.attr("disabled", true);
                    var i = 10;
                    function setText() {
                        element.text(i);
                        if (i + 1 == 0) {
                            clearInterval(setTime);
                            element.text("再次发送验证码");
                            element.attr("disabled", false);
                        }
                        i--;
                    }
                    setText();
                    var setTime = setInterval(setText, 1000);
                })

            })
        }
    }
})