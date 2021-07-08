function printError(elemId, hintMsg) {
    document.getElementById(elemId).innerHTML = hintMsg;
    document.getElementById(elemId).style.cssText = "color:red; margin-left:80px;";
}

// Definisce una funzione per validare il form
function validateForm() {
    // Recupera i valori degli elementi del form
    var name = document.bonificoForm.nome.value;
    var surname = document.bonificoForm.cognome.value;
    var iban = document.bonificoForm.iban.value;
    var importo = document.bonificoForm.importo.value;
    var password = document.bonificoForm.psw.value;
	// Definisce un valore di default alle variabili di errore
    var nameErr = true;
    var surnameErr = true;
    var ibanErr = true;
    var importoErr = true;
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
    
    // Convalida iban
    if(iban == "") {
        printError("ibanErr", "Inserisci il tuo iban");
    } else {
        var regex = /^AL\d{10}[0-9A-Z]{16}$|^AD\d{10}[0-9A-Z]{12}$|^AT\d{18}$|^BH\d{2}[A-Z]{4}[0-9A-Z]{14}$|^BE\d{14}$|^BA\d{18}$|^BG\d{2}[A-Z]{4}\d{6}[0-9A-Z]{8}$|^HR\d{19}$|^CY\d{10}[0-9A-Z]{16}$|^CZ\d{22}$|^DK\d{16}$|^FO\d{16}$|^GL\d{16}$|^DO\d{2}[0-9A-Z]{4}\d{20}$|^EE\d{18}$|^FI\d{16}$|^FR\d{12}[0-9A-Z]{11}\d{2}$|^GE\d{2}[A-Z]{2}\d{16}$|^DE\d{20}$|^GI\d{2}[A-Z]{4}[0-9A-Z]{15}$|^GR\d{9}[0-9A-Z]{16}$|^HU\d{26}$|^IS\d{24}$|^IE\d{2}[A-Z]{4}\d{14}$|^IL\d{21}$|^IT\d{2}[A-Z]\d{10}[0-9A-Z]{12}$|^[A-Z]{2}\d{5}[0-9A-Z]{13}$|^KW\d{2}[A-Z]{4}22!$|^LV\d{2}[A-Z]{4}[0-9A-Z]{13}$|^LB\d{6}[0-9A-Z]{20}$|^LI\d{7}[0-9A-Z]{12}$|^LT\d{18}$|^LU\d{5}[0-9A-Z]{13}$|^MK\d{5}[0-9A-Z]{10}\d{2}$|^MT\d{2}[A-Z]{4}\d{5}[0-9A-Z]{18}$|^MR13\d{23}$|^MU\d{2}[A-Z]{4}\d{19}[A-Z]{3}$|^MC\d{12}[0-9A-Z]{11}\d{2}$|^ME\d{20}$|^NL\d{2}[A-Z]{4}\d{10}$|^NO\d{13}$|^PL\d{10}[0-9A-Z]{,16}n$|^PT\d{23}$|^RO\d{2}[A-Z]{4}[0-9A-Z]{16}$|^SM\d{2}[A-Z]\d{10}[0-9A-Z]{12}$|^SA\d{4}[0-9A-Z]{18}$|^RS\d{20}$|^SK\d{22}$|^SI\d{17}$|^ES\d{22}$|^SE\d{22}$|^CH\d{7}[0-9A-Z]{12}$|^TN59\d{20}$|^TR\d{7}[0-9A-Z]{17}$|^AE\d{21}$|^GB\d{2}[A-Z]{4}\d{14}$/;
        if(regex.test(iban) === false || iban.length > 60) {
            printError("ibanErr", "Inserisci un IBAN valido");
        } else{
            printError("ibanErr", "");
            ibanErr = false;
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
    
 // Convalida importo
    if(importo == "") {
        printError("importoErr", "Inserisci un importo");
    } else {
    	var regex = /^\d+(?:[.]\d{1,2}|$)$/;               
        if(regex.test(importo) === false) {
            printError("importoErr", "Inserisci un importo valido");
        } else {
            printError("importoErr", "");
            importoErr = false;
        }
    }
    
    
    
    
    // Previene che il form venga inviato nel caso ci siano errori
    if((nameErr || surnameErr || importoErr || ibanErr || passwordErr) == true) {
       return false;
    }
}


function validateForm2() {
    // Recupera i valori degli elementi del form
    var importo = document.bonificoForm.importoPaypal.value;
	// Definisce un valore di default alle variabili di errore
 
    var importoPayErr = true;
  
    
 // Convalida importo paypal
    if(importoPay == "") {
        printError("importoPayErr", "Inserisci un importo");
    } else {
    	var regex = /^\d+(?:[.]\d{1,2}|$)$/;               
        if(regex.test(importoPay) === false) {
            printError("importoPayErr", "Inserisci un importo valido");
        } else {
            printError("importoPayErr", "");
            importoPayErr = false;
        }
    }
    
    
    
    
    // Previene che il form venga inviato nel caso ci siano errori
    if((importoPayErr) == true) {
       return false;
    }
}


var vis = 1000;
function conferma(msg) {
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
    a.style.cssText = "width:250px; height:80px; border:1px solid #bbb; border-radius:5px; padding:10px; background:#ABDCB6; box-shadow:0px 0px 8px #0006; position:absolute; top:40%; left:42%; margin:auto; font-family: \"Arial\", sans-serif; color:black;z-index:"+ vis+ ";";
    b.style.cssText = "width:100%; height:60px;margin-top:5px; border-top:2px solid #000000; background:#FFFFFF; font-family: \"Arial\", sans-serif; color:black;";
    
    input.style.cssText = "display: flex; flex-direction: column; align-items: center; font-family: Verdana, Helvetica, sans-serif; font-size: 14px; margin-top: 10px; text-align:center;";
    
    
    input.innerHTML=msg;
    		
    	
    
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