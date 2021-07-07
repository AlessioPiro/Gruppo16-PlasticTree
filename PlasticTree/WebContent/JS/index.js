function over(){
	document.getElementById("helpMsg").style.cssText= " color:black; font-weight:bold; text-shadow: 2px 2px 10px white;"
}
function out(){
	document.getElementById("helpMsg").style.cssText= "background-color: transparent; color:transparent; text-shadow: 0px 0px 0px;"
}

var vis = 1000;
function faq(){
	document.getElementById('wrapper').style.cssText= "display: flex; flex-direction: column; align-items: flex-end; background-image: url('icone/sfondoHome.png'); margin-top:-49.5px"
		document.getElementById('attivita').style.cssText="margin-top:0px";
	document.getElementById("help").style.cssText="background-image: url('icone/sfondoHome.png');"
}
function closeFaq(){
	document.getElementById('wrapper').style.cssText= "display: none;"
		document.getElementById('attivita').style.cssText="margin-top:-120px";
	document.getElementById("help").style.cssText= "background-image: url('icone/sfondoHome.png');"
}

var vis = 1000;
function messageInfo(idUtente,idPost,nomeUtente) {
	var array=[];
	var arrayU=[];
	var arrayF=[];
	var taglia=document.getElementById('C'+idPost).childElementCount;
	for(var j=0;j<taglia;j++){
		array.push(document.getElementById('C'+idPost).children.item(j).id);
		arrayU.push(document.getElementById('U'+idPost).children.item(j).id);
		arrayF.push(document.getElementById('F'+idPost).children.item(j).id);
	}
	
		
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
    var c = document.createElement('div');
    var a1 = document.createElement('a');
    var y = document.createElement('button');
    var x = document.createElement('button');
    var input = document.createElement('input');
    var commentoNew="";
    

    //regole di stile CSS
    a.style.cssText = "width:250px; height:400px; border:1px solid #bbb; border-radius:5px; padding:10px; background:#ABDCB6; box-shadow:0px 0px 8px #0006; position:fixed; top:20%; left:38%; margin:auto; font-family: \"Arial\", sans-serif; color:black;z-index:"+ vis+ ";";
    c.style.cssText = "display: flex; flex-direction: column; align-items: left; width:93%; height:55px; margin-top:5px; position:absolute; bottom:4px; border-top:2px solid #000000; background:#ABDCB6; font-family: \"Arial\", sans-serif; color:black;";
    b.style.cssText = "display: flex; flex-direction: column; align-items: top; width:100%; margin-top:5px; border-top:2px solid #000000; background:#FFFFFF; font-family: \"Arial\", sans-serif; color:black;";
    a1.href="CommentiServlet?idUtente="+idUtente+"&idPost="+idPost+"&commentiNew="+commentoNew+"&paginaPost=home";
    a1.style.cssText = "display: flex; flex-direction: rows; align-items: left;";
    
    for(var i =0;i<array.length;i++){
    	var divElem = document.createElement('div');
        var divFoto = document.createElement('div');
        var divTesto = document.createElement('div');
        var name = document.createElement('p');
        var testo = document.createElement('p');
        var img = document.createElement('img');
        divElem.style.cssText = "display: flex; flex-direction: rows; align-items: left; width:100%; height:40px; border-bottom:2px solid #000000; background:#FFFFFF; font-family: \"Arial\", sans-serif; color:black;";
        divTesto.style.cssText = "display: flex; flex-direction: column; align-items: left; width:80%; height:10px;  background:#FFFFFF; font-family: \"Arial\", sans-serif; color:black;";
        divFoto.style.cssText = "display: flex; flex-direction: column; align-items: center; width:20%; height:10px; background:#FFFFFF; font-family: \"Arial\", sans-serif; color:black;";
        testo.style.cssText = "font-family: Verdana, Helvetica, sans-serif; font-size: 12px; text-align:center; margin-top:-5px;";
        testo.innerHTML=array[i];
        name.style.cssText = "font-family: Verdana, Helvetica, sans-serif; font-size: 12px; font-weight: bold; text-align:left; margin-top:2px;";
        name.innerHTML=arrayU[i];
        img.src="fotoUtente/"+arrayF[i]+".jpg";
        img.style.cssText ="width: 20px; height: 20px; border-radius: 50%; margin-top:2px;";
        
    	    b.appendChild(divElem);
    	    divElem.appendChild(divFoto);
    	    divElem.appendChild(divTesto);
    	    divFoto.appendChild(img);
    	    divTesto.appendChild(name);
    	    divTesto.appendChild(testo);
    
    }
   
    	    	
    
    
    //buttons style
    y.style.cssText = "position:absolute; top:10px; right:-40px; width:40%; margin-bottom:10px; clear:both; border: none; background-color: transparent;";
    y.innerHTML = "X";
    y.id="button_updateSi";
    x.style.cssText = "background-color: white;  color: black; border: none; font-family: Verdana, Helvetica, sans-serif; font-size:8px;width:40%; padding: 2px 4px; font-weight: bold; transition: 0.3s; border: 1px solid black; margin-top:3px;";
    x.innerHTML = "Pubblica commento";
    input.type="text";
    input.style.cssText="border: 1px solid #ccc; transition: 0.3s; width: 80%; height:30px; border-radius: 10px; padding: 5px 3px; margin-top:3px;";
    input.placeholder="Commento...";
    input.required= true ;
    
    //inserimento
    document.body.appendChild(a);
    a.innerHTML = "<b>Commenti</b><br>";
    a.appendChild(b);
    a.appendChild(a1);
    a1.appendChild(y);
    a.appendChild(c);
    c.appendChild(input);
    c.appendChild(x);
    
    vis--;
    
    


    //case NO
    y.addEventListener("click", function(e,resp) {
    	
            a.remove();

        }
    )
    
    //case comment
    x.addEventListener("click", function(e,resp) {
    	  if(input.value!=""){
    		  var divElem = document.createElement('div');
    	        var divFoto = document.createElement('div');
    	        var divTesto = document.createElement('div');
    	        var name = document.createElement('p');
    	        var testo = document.createElement('p');
    	        var img = document.createElement('img');
    	        divElem.style.cssText = "display: flex; flex-direction: rows; align-items: left; width:100%; height:40px; border-bottom:2px solid #000000; background:#FFFFFF; font-family: \"Arial\", sans-serif; color:black;";
    	        divTesto.style.cssText = "display: flex; flex-direction: column; align-items: left; width:80%; height:10px;  background:#FFFFFF; font-family: \"Arial\", sans-serif; color:black;";
    	        divFoto.style.cssText = "display: flex; flex-direction: column; align-items: center; width:20%; height:10px; background:#FFFFFF; font-family: \"Arial\", sans-serif; color:black;";
    	        testo.style.cssText = "font-family: Verdana, Helvetica, sans-serif; font-size: 12px; text-align:center; margin-top:-5px;";
    	        testo.innerHTML=input.value;
    	        name.style.cssText = "font-family: Verdana, Helvetica, sans-serif; font-size: 12px; font-weight: bold; text-align:left; margin-top:2px;";
    	        name.innerHTML=nomeUtente;
    	        img.src="fotoUtente/"+idUtente+".jpg";
    	        img.style.cssText ="width: 20px; height: 20px; border-radius: 50%; margin-top:2px;";
    	        
    	    	    b.appendChild(divElem);
    	    	    divElem.appendChild(divFoto);
    	    	    divElem.appendChild(divTesto);
    	    	    divFoto.appendChild(img);
    	    	    divTesto.appendChild(name);
    	    	    divTesto.appendChild(testo);
    	    	    commentoNew=commentoNew+input.value+"-";
    	    	    a1.href="CommentiServlet?idUtente="+idUtente+"&idPost="+idPost+"&commentiNew="+commentoNew+"&paginaPost=home";
    	    	    
    	    	 input.value="";
    	    	 input.placeholder="Commento...";
    	  }
        }
    )
}