function printError(elemId, hintMsg) {
    document.getElementById(elemId).innerHTML = hintMsg;
}

// Definisce una funzione per validare il form
function validateForm() {
    // Recupera i valori degli elementi del form
    var name = document.regForm.nome.value;
    var surname = document.regForm.cognome.value;
    var email = document.regForm.email.value;
    var address = document.regForm.indirizzo.value;
    var data = document.regForm.data.value;
    var password = document.regForm.psw.value;
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
};