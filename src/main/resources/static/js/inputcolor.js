app.directive("colorInput",[function(){
    function addClass(obj, cls){
        var obj_class = obj.className,//获取 class 内容.
            blank = (obj_class != '') ? ' ' : '';//判断获取到的 class 是否为空, 如果不为空在前面加个'空格'.
        added = obj_class + blank + cls;//组合原来的 class 和需要添加的 class.
        obj.className = added;//替换原来的 class.
    }
    function removeClass(obj, cls){
        var obj_class = ' '+obj.className+' ';//获取 class 内容, 并在首尾各加一个空格. ex) 'abc    bcd' -> ' abc    bcd '
        obj_class = obj_class.replace(/(\s+)/gi, ' '),//将多余的空字符替换成一个空格. ex) ' abc    bcd ' -> ' abc bcd '
            removed = obj_class.replace(' '+cls+' ', ' ');//在原来的 class 替换掉首尾加了空格的 class. ex) ' abc bcd ' -> 'bcd '
        removed = removed.replace(/(^\s+)|(\s+$)/g, '');//去掉首尾空格. ex) 'bcd ' -> 'bcd'
        obj.className = removed;//替换原来的 class.
    }
    return{
        restrict:"EA",
        link:function(scope,element,attr){
            var input=angular.element(document.querySelectorAll("input"));
            var vaild="input_vaild";
            var invaild="input_invaild";
            
            input.on("focus",function(){
                watch(this);
            })
            input.on("input propertychange",function(){
                watch(this);
            })
            scope.watch=watch;
            function watch(This){
                var formname=element.attr("name");
                nowThis=This.name?This:document.getElementsByName(This)[0];
                error=scope[formname][nowThis.name?nowThis.name:nowThis].$error;
                if(nowThis.value==""){
                    error.required=true;
                }else{
                   delete error.required;
                }
                var item=0;//没有错误
                for(var key in error){  
                    if(key&&key!="required"&&key!="mark"){
                        item=1;
                        break;
                    }
                }
                if(error.required||item==1||error.mark){
                    if(nowThis.className.indexOf(invaild)==-1){
                        addClass(nowThis,invaild);
                        removeClass(nowThis,vaild);
                    }
                }
                else if((!error.required||error.required=="")&&item==0){
                    if(nowThis.className.indexOf(vaild)==-1){
                        addClass(nowThis,vaild);
                        removeClass(nowThis,invaild);
                    }
                }
            }
           
        }
    }
}])