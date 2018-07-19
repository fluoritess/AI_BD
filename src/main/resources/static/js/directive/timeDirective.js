app.directive("timeMsg",["$location","$timeout","$cookies",function($location,$timeout,$cookies){
    return {
        restrict:"EA",
        link:function(scope,element,attr){
            var i=5;
            function settext(){
                element.text(i);
                i-=1;
                if(i==-1){ 
                    location.href="http://" + $location.host() + ":" + $location.port()+ "/PHM";
                }
                $timeout(settext,1000);
            }
            settext();
        }
    }
}])