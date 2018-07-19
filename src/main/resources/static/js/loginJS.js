var head = document.getElementsByTagName('head')[0];
function loginJS(scriptSrc,linkHref) {
    var hostport=document.location.host; 
    function load(i) {
        
        var script = document.createElement('script');
        script.src ="http://"+hostport+ scriptSrc[i];
        head.appendChild(script);
        script.onload = function () {
            if (i >= scriptSrc.length - 1) {
                return;
            }
            load(i + 1);
        }
    }
    load(0);
    for (var i = 0; i < linkHref.length; i++) {
        var link = document.createElement('link');
        link.rel = "stylesheet";
        link.href = "http://"+hostport+ linkHref[i];
        head.appendChild(link);
    }
}