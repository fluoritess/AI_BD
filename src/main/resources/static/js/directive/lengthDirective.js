app.directive("inputLength",["$rootScope",function($rootScope){
    return {
        link:function(scope,element,attr){
            scope.lengthText=function(formname,inputname,maxlen){
            	var el=scope[formname][inputname];
                elLen= el.$viewValue.replace(/[\u0391-\uFFE5]/g,"aa").length;
                if(maxlen<elLen){
                   el.$error.maxlength=true;
                }
            }
        }
    }
}]);