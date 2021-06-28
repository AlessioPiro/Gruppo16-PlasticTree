var vis = 1000;
window.confirm = function(message) {
    var w = 400;
    var h = 350;
    var mt=100;
    var bm=20;
    if(screen.width<1024){
        w=200;
        h=150;
        mt=20;
        bm=10;
    }
    var l = Math.floor((screen.width-w)/2);
    var t = Math.floor((screen.height-h)/2);
    var a = document.createElement('div');
    var input = document.createElement('a');
    var y = document.createElement('button');

    //regole di stile CSS
    a.style.cssText = "width:"+w+"; height:"+h+"; border:1px solid #bbb; border-radius:5px; padding:10px; background:#9b334e; box-shadow:0px 0px 8px #0006; position:fixed; top:"+t+"; left:"+l+"; margin:auto; font-family: \"Arial\", sans-serif; color:black;z-index:"+ vis+ ";";
    input.style.cssText = "width:100%; margin-top:"+mt+"px;";
    input.href="CondividiServlet";
    input.innerHTML="<img src='icone/logo.png' alt='logo' style='width:30px; height:30px;'>"
    
    //buttons style
    y.style.cssText = "position:absolute; bottom:10; right:"+bm+"px; width:40%; margin:2px; margin-bottom:10px; clear:both; border-bottom: 2px solid #dec717; background-color: #800000;";
    a.innerHTML = "<b>Modifica "+message+"</b><br>";
    y.innerHTML = "Applica";
    y.id="button_updateSi";
    document.body.appendChild(a);
    a.appendChild(input);
    a.appendChild(y);
    vis--;


    //case NO
    y.addEventListener("click", function(e,resp) {
            a.remove();

        }
    )
}