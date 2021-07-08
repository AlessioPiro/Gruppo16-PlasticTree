<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%boolean conferma=false;
      float importo=0.0f;
      boolean valido =false;
      if(request.getAttribute("importo")!=null){
    	  importo=(float)request.getAttribute("importo");
    	  if(importo!=0.0f){
    		  valido=true;
    	  }
    	  }
    if(request.getAttribute("conferma")!=null){
    	conferma=(boolean) request.getAttribute("conferma");
    	}%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Css/agiungiCredito.css" type="text/css">
<meta charset="ISO-8859-1">
<title>Aggiungi Credito</title>
</head>
<body <%if(conferma==true){ %> onload="conferma(<%=importo%>,<%=valido%>)"<%} %>>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
      <script src="JS/aggiungiCredito.js"></script>
<jsp:include page="header.jsp"/>
 <div class="superContenitore">
  <div class="contenitore">
      <div class=title><img class="ask" alt="" src="icone/askLogo.png" onclick="messageInfo('message')"> Inserisci il codice</div>
      <form action="AggiungiCreditoServlet" method="post">
      <div class="codice"><input type="text" name="codice" id="codice" required> </div>
      <div class="button"><input type="submit" name="conferma" value="Conferma""> </div>
      </form>
   </div>
  </div>
  <div class="divFooter">
      <jsp:include page="footer.jsp"/>
  </div>
</body>
</html>