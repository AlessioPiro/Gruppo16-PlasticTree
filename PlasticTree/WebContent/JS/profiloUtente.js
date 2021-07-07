var vis = 1000;
function condividi(msg) {
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
    var p1 = document.createElement('p');
    var p2 = document.createElement('p');
    var p3 = document.createElement('p');
    var p4 = document.createElement('p');
    var p5 = document.createElement('p');
    var input1 = document.createElement('img');
    var input2 = document.createElement('img');
    var input3 = document.createElement('img');
    var input4 = document.createElement('img');
    var input5 = document.createElement('img');
    var a1 = document.createElement('a');
    var a2 = document.createElement('a');
    var a3 = document.createElement('a');
    var a4 = document.createElement('a');
    var a5 = document.createElement('a');
    var y = document.createElement('button');
    var img = document.createElement('img');

    //regole di stile CSS
    a.style.cssText = "width:280px; height:290px; border:1px solid #bbb; border-radius:5px; padding:10px; background:#ABDCB6; box-shadow:0px 0px 8px #0006; position:fixed; top:25%; left:38%; margin:auto; font-family: \"Arial\", sans-serif; color:black;z-index:"+ vis+ ";";
    b.style.cssText = "display: flex; flex-direction: column; align-items: left; width:100%; height:260px; margin-top:25px; border-top:2px solid #000000; background:#FFFFFF; font-family: \"Arial\", sans-serif; color:black;";
    
    input1.src="icone/facebooklogo.png";
    input1.style.cssText ="min-width: 34px; max-height: 34px; border-radius: 5px; margin:10px 20px 10px 63px;";
    input2.src="icone/Twitterlogo.png";
    input2.style.cssText ="min-width: 30px; max-height: 30px; border-radius: 5px; margin:10px 30px 10px 65px;";
    input3.src="icone/instagramlogo.png";
    input3.style.cssText ="min-width: 40px; max-height: 40px; border-radius: 5px; margin:5px 20px 10px 60px;";
    input4.src="icone/Telegramlogo.png";
    input4.style.cssText ="min-width: 31px; max-height: 31px; border-radius: 5px; margin:10px 25px 10px 65px;";
    input5.src="icone/whatsapplogo.png";
    input5.style.cssText ="min-width: 60px; max-height: 60px; border-radius: 5px; margin:-8px 15px 10px 49px;";
    
    p1.style.cssText = "font-family: Verdana, Helvetica, sans-serif; font-size: 16px; color:black; ";
    p1.innerHTML="Facebook";
    p2.style.cssText = "font-family: Verdana, Helvetica, sans-serif; font-size: 16px; color:black; ";
    p2.innerHTML="Twitter";
    p3.style.cssText = " font-family: Verdana, Helvetica, sans-serif; font-size: 16px; color:black; ";
    p3.innerHTML="Instagram";
    p4.style.cssText = "font-family: Verdana, Helvetica, sans-serif; font-size: 16px; color:black; ";
    p4.innerHTML="Telegram";
    p5.style.cssText = "font-family: Verdana, Helvetica, sans-serif; font-size: 16px; color:black; ";
    p5.innerHTML="Whatsapp";
    
    
    a1.href="CondividiServlet?appCond='Facebook'";
    a1.style.cssText = "display: flex; flex-direction: rows; align-items: left; text-decoration: none;";
    a2.href="CondividiServlet?appCond='Twitter'";
    a2.style.cssText = "display: flex; flex-direction: rows; align-items: left; text-decoration: none;";
    a3.href="CondividiServlet?appCond='Instagram'";
    a3.style.cssText = "display: flex; flex-direction: rows; align-items: left; text-decoration: none;";
    a4.href="CondividiServlet?appCond='Telegram'";
    a4.style.cssText = "display: flex; flex-direction: rows; align-items: left; text-decoration: none;";
    a5.href="CondividiServlet?appCond='Whatsapp'";
    a5.style.cssText = "display: flex; flex-direction: rows; align-items: left; text-decoration: none;";
    
    a1.appendChild(input1);
    a1.appendChild(p1);
    a2.appendChild(input2);
    a2.appendChild(p2);
    a3.appendChild(input3);
    a3.appendChild(p3);
    a4.appendChild(input4);
    a4.appendChild(p4);
    a5.appendChild(input5);
    a5.appendChild(p5);
    
    img.src="icone/condividi.png";
    img.style.cssText ="width: 20px; height: 20px; position:absolute; top:10px; left:10px; margin-left: 5px; margin-right: 5px; margin-bottom:5px;";
    //buttons style
    y.style.cssText = "position:absolute; top:10px; right:-35px; width:40%; margin-bottom:10px; clear:both; border: none; background-color: transparent;";
    y.innerHTML = "X";
    y.id="button_updateSi";
    document.body.appendChild(a);
    a.appendChild(b);
    b.appendChild(a1);
    b.appendChild(a2);
    b.appendChild(a3);
    b.appendChild(a4);
    b.appendChild(a5);
    a.appendChild(y);
    a.appendChild(img);
    
    vis--;


    //case NO
    y.addEventListener("click", function(e,resp) {
            a.remove();

        }
    )
}

function conferma(profilo) {
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
    b.style.cssText = "width:100%; height:80px;margin-top:5px; border-top:2px solid #000000; background:#FFFFFF; font-family: \"Arial\", sans-serif; color:black;";
    
    input.style.cssText = "display: flex; flex-direction: column; align-items: center; font-family: Verdana, Helvetica, sans-serif; font-size: 12px; margin-top: 10px; text-align:center;";
    
    
    input.innerHTML="Post condiviso su "+profilo+"!";
    		
    	
    
   //buttons style
    y.style.cssText = "position:absolute; top:10px; right:-40px; width:40%; margin-bottom:10px; clear:both; border: none; background-color: transparent;";
    y.innerHTML = "X";
    y.id="button_updateSi";
    document.body.appendChild(a);
    a.innerHTML = "<b>Conferma</b><br>";
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

function printError(elemId, hintMsg) {
    document.getElementById(elemId).innerHTML = hintMsg;
}

// Definisce una funzione per validare il form
function validateForm() {
    // Recupera i valori degli elementi del form
    var name = document.infForm.nome.value;
    var surname = document.infForm.cognome.value;
    var email = document.infForm.email.value;
    var address = document.infForm.indirizzo.value;
    var data = document.infForm.data.value;
    var password = document.infForm.psw.value;
	// Definisce un valore di default alle variabili di errore
    var nameErr = true;
    var surnameErr = true;
    var emailErr = true;
    var addressErr = true;
    var dataErr = true;
    var passwordErr = true;
        
    // Convalida il nome
    if(name == "") {
        printError("nameErr", "Inserisci il tuo nome");
    } else {
        var regex = /^[a-zA-Z\s]{1,20}$/;                
        if(regex.test(name) === false) {
            printError("nameErr", "Inserisci un nome valido");
        } else {
            printError("nameErr", "");
            nameErr = false;
        }
    }
    
 // Convalida il cognome
    if(surname == "") {
        printError("surnameErr", "Inserisci il tuo cognome");
    } else {
        var regex = /^[a-zA-Z\s]{1,20}$/;                
        if(regex.test(surname) === false) {
            printError("surnameErr", "Inserisci un cognome valido");
        } else {
            printError("surnameErr", "");
            surnameErr = false;
        }
    }
    
    // Convalida l'email
    if(email == "") {
        printError("emailErr", "Inserisci la tua email");
    } else {
        var regex = /^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})$/;
        if(regex.test(email) === false || email.length > 60) {
            printError("emailErr", "Inserisci un'email valida");
        } else{
            printError("emailErr", "");
            emailErr = false;
        }
    }
    
  // Convalida la password
    if(password == "") {
        printError("passwordErr", "Inserisci una password");
    } else {
        var regex = /^\w{7,14}$/;                
        if(regex.test(password) === false) {
            printError("passwordErr", "Inserisci una password valida");
        } else {
            printError("passwordErr", "");
            passwordErr = false;
        }
    }
    
 // Convalida l'indirizzo
    if(address == "") {
        printError("addressErr", "Inserisci il tuo indirizzo");
    } else {
    	var regex = /^([a-zA-Z0-9 ]+),([a-zA-Z ]+)$/;               
        if(regex.test(address) === false) {
            printError("addressErr", "Inserisci un indirizzo valido, rispettando il formato: Via Numero, Citta'");
        } else {
            printError("addressErr", "");
            addressErr = false;
        }
    }
    
    // Convalida la data di nascita
    if(data == "") {
        printError("dataErr", "Inserisci la tua data di nascita");
    } else {
    	var regex = /^([0-9]{4})-([0-9]{2})-([0-9]{2})$/;
        if(regex.test(data) === false) {
            printError("dataErr", "Inserisci una data valida con questo formato: GG/MM/AAAA");
        } else{
            printError("dataErr", "");
            dataErr = false;
        }
    }
    
    
    // Previene che il form venga inviato nel caso ci siano errori
    if((nameErr || surnameErr || emailErr || addressErr || dataErr || passwordErr) == true) {
       return false;
    }
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
    a1.href="CommentiServlet?idUtente="+idUtente+"&idPost="+idPost+"&commentiNew="+commentoNew+"&paginaPost=profiloUtente";
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
    	    	    a1.href="CommentiServlet?idUtente="+idUtente+"&idPost="+idPost+"&commentiNew="+commentoNew+"&paginaPost=profiloUtente";
    	    	    
    	    	 input.value="";
    	    	 input.placeholder="Commento...";
    	  }
        }
    )
}