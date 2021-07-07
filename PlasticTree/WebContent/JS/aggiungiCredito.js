var vis = 1000;
function messageInfo(message) {
    var w = 300;
    var h = 250;
    var mt=100;
    var bm=20;
    if(screen.width<1024){
        w=150;
        h=100;
        mt=20;
        bm=10;
    }
    var l = Math.floor((screen.width-w)/2);
    var t = Math.floor((screen.height-h)/2);
    var a = document.createElement('div');
    var b = document.createElement('div');
    var input = document.createElement('p');
    var y = document.createElement('button');
    var img = document.createElement('img');

    //regole di stile CSS
    a.style.cssText = "width:250px; height:100px; border:1px solid #bbb; border-radius:5px; padding:10px; background:#ABDCB6; box-shadow:0px 0px 8px #0006; position:absolute; top:40%; left:42%; margin:auto; font-family: \"Arial\", sans-serif; color:black;z-index:"+ vis+ ";";
    b.style.cssText = "width:100%; height:80px;margin-top:20px; border-top:2px solid #000000; background:#FFFFFF; font-family: \"Arial\", sans-serif; color:black;";
    
    input.style.cssText = "display: flex; flex-direction: column; align-items: center; font-family: Verdana, Helvetica, sans-serif; font-size: 12px; margin-top: 10px; text-align:center;";
    input.innerHTML="Inserisci sulla riga il codice fornito dai plasticATM per poter incrementare il tuo credito!"
    
   img.src="icone/askLogo.png";
    img.style.cssText ="width: 20px; height: 20px; border-radius: 50%; position:absolute; top:10px; left:10px; margin-left: 5px; margin-right: 5px; margin-bottom:-4px;";
    //buttons style
    y.style.cssText = "position:absolute; top:10px; right:-40px; width:40%; margin-bottom:10px; clear:both; border: none; background-color: transparent;";
    y.innerHTML = "X";
    y.id="button_updateSi";
    document.body.appendChild(a);
    a.appendChild(b);
    b.appendChild(input);
    a.appendChild(y);
    a.appendChild(img);
    
    vis--;


    //case NO
    y.addEventListener("click", function(e,resp) {
            a.remove();

        }
    )
}
function conferma(importo,valido) {
    var w = 300;
    var h = 250;
    var mt=100;
    var bm=20;
    if(screen.width<1024){
        w=150;
        h=100;
        mt=20;
        bm=10;
    }
    var l = Math.floor((screen.width-w)/2);
    var t = Math.floor((screen.height-h)/2);
    var a = document.createElement('div');
    var b = document.createElement('div');
    var input = document.createElement('p');
    var input2 = document.createElement('p');
    var y = document.createElement('button');
    var img = document.createElement('img');

    //regole di stile CSS
    a.style.cssText = "width:250px; height:100px; border:1px solid #bbb; border-radius:5px; padding:10px; background:#ABDCB6; box-shadow:0px 0px 8px #0006; position:absolute; top:40%; left:42%; margin:auto; font-family: \"Arial\", sans-serif; color:black;z-index:"+ vis+ ";";
    b.style.cssText = "width:100%; height:80px;margin-top:5px; border-top:2px solid #000000; background:#FFFFFF; font-family: \"Arial\", sans-serif; color:black;";
    
    input.style.cssText = "display: flex; flex-direction: column; align-items: center; font-family: Verdana, Helvetica, sans-serif; font-size: 12px; margin-top: 10px; text-align:center;";
    input2.style.cssText = "display: flex; flex-direction: column; align-items: center; font-family: Verdana, Helvetica, sans-serif; font-size: 12px; margin-top: 2px; text-align:center;";
    
    if(valido==false){
    	    input.innerHTML="Codice non valido!"
    	    	input2.innerHTML=""
    	    	
    	}else{
    		input.innerHTML="Codice corretto"
    		input2.innerHTML="Credito di +"+importo+"0&euro; aggiunto con successo!"
    	}
    
   //buttons style
    y.style.cssText = "position:absolute; top:10px; right:-40px; width:40%; margin-bottom:10px; clear:both; border: none; background-color: transparent;";
    y.innerHTML = "X";
    y.id="button_updateSi";
    document.body.appendChild(a);
    a.innerHTML = "<b>Conferma</b><br>";
    a.appendChild(b);
    b.appendChild(input);
    b.appendChild(input2);
    a.appendChild(y);
    a.appendChild(img);
    
    vis--;


    //case NO
    y.addEventListener("click", function(e,resp) {
            a.remove();

        }
    )
}