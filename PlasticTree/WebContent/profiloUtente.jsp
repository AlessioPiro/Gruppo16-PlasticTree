<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="plasticTreeModel.Utente" %> 
<%@page import="plasticTreeModel.Commento" %> 
<%@page import="plasticTreeModel.ObiettivoUtente" %> 
<%@page import="plasticTreeModel.Post" %> 
<%@page import="plasticTreeModel.Dao" %> 
<%@ page import="java.util.*" %> 
<%@ page import="java.text.*" %>  
<% Utente u=(Utente) request.getSession().getAttribute("utente");
   Dao dao= (Dao) request.getSession().getAttribute("dao");
   boolean confermaCond=false;
   String profilo="";
   if(request.getAttribute("confermaCond")!=null){
   	confermaCond=(boolean) request.getAttribute("confermaCond");
   	profilo=(String) request.getAttribute("profiloCond");
   	}
   if(dao==null){dao=new Dao();} 
    if(u==null){u=dao.getUtente("U1");}%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="Css/profiloUtente.css" type="text/css">
	<title>Profilo - Plastic Tree</title>
	</head>
	<body <%if(confermaCond==true){ %> onload="conferma(<%=profilo%>)"<%} %>>
	  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
      <script src="JS/profiloUtente.js"></script>
		<jsp:include page="header.jsp"/>
		<div class="fotoENome">
			<img class="fotoProfiloUtente" alt="" src="fotoUtente/<%=u.getIdUtente() %>.jpg" >
			<h2 class="nomeProfiloUtente"><%=u.getNome() %> <%=u.getCognome() %></h2>
		</div>
		<div class="informazioni">
			<h3 class="informazioniTesto">Informazioni</h3>
				<div class="informationFormContenitore">
					<form class="information-form" name="infForm" onsubmit="return validateForm()" action="ModificaProfiloUtenteServlet" method="POST">
						Nome: <input type="text" name="nome" value="<%=u.getNome() %>">
						<div id="nameErr"></div><br>
						Cognome: <input type="text" name="cognome" value="<%=u.getCognome() %>">
						<div id="surnameErr"></div><br>
						<%
						String pattern = "yyyy-MM-dd";
						DateFormat df = new SimpleDateFormat(pattern);
						String nascitaAsString = df.format(u.getNascita());
						%>
						Nato il: <input type="date" name="data" value="<%=nascitaAsString%>">
						<div id="dataErr"></div><br>
						Indirizzo: <input type="text" name="indirizzo" value="<%=u.getIndirizzo() %>">
						<div id="addressErr"></div><br>
						Email: <input type="email" name="email" value="<%=u.getEmail() %>">
						<div id="emailErr"></div><br>
						Password: <input type="password" name="psw" placeholder="***********" value="">
						<div id="passwordErr"></div><br>
						<!-- RIMUOVERE ERRORI DELLA CARTA IN JS -->
						<div class="button-container">
							<input type="submit" value="Salva modifiche">
						</div>
					</form>
				</div>
		</div>
		<div class="obiettivi">
			<h3 class="obiettiviTesto">I miei obiettivi</h3>
			<div class="obiettiviContenitore">
				<div class="immaginiObiettiviContenitore">
				  <%ArrayList<ObiettivoUtente> ob=dao.getObiettiviUtente(u);
				     int end=5;
				     for(int i=0;i<end;i++){
					  if(i<ob.size()){
						  if(ob.get(i).isRaggiunto()==true){
						  String s= ob.get(i).getIdObiettivo();
						  %><img class="obiettivo" alt="" src="fotoObiettivi/<%=s%>.png">
						  <%}else{end++;}
					  }
				  }%>
					
				</div>
				<form action="ObiettiviUtenteServlet" method="POST" name="">
					<input class="mostraAltroPulsante" type="submit" value="Mostra altro">
				</form>
			</div>
			
		</div>
		<div class="attivita">
			<h3 class="attivitaTesto">Attivita'</h3>
			<div class="insiemePost">
			<% ArrayList<Post> posts= dao.getPostUtente(u);
			   for(int j=0;j<posts.size();j++){
			       Post post=posts.get(j); %>
			    
				<div class="post">
					<div class="creatorePost">
						<img class="postFotoUtente" src="fotoUtente/<%=post.getUtente().getIdUtente() %>.jpg">
						<h3 class="postNomeUtente"><%=post.getUtente().getNome() %> <%=post.getUtente().getCognome() %></h3>
						<input class="pulsanteCondivisione" type="image" src="icone/condividi.png" onclick="condividi('message')">
					</div>
					<div class="contenutoPost">
						<p class="postTesto"><%=post.getTesto() %></p>
						<%String foto=post.getObiettivoPost();
							String id = dao.getIdObiettivo(foto);
						  if(id == null){
							  id="noObiettivo";
						  }
						  %>
						<img class="postImmagine" alt="" src="fotoObiettivi/<%=id%>.png">
						<div class="interazioneContainer">
							<div class="pulsantiContenitore">
							   <%boolean mioLike=false;
							   for(int x=0;x<post.getLike().size();x++){
								   Utente utenteP=post.getLike().get(x);
								   if(utenteP.getEmail().equals(u.getEmail())){
									   mioLike=true;
								   }
							   } %>
								<div class="miPiaceContenitore">
									<div class="numeroMiPiaceContenitore"<%if(mioLike==true){%> style="background-color:#FF0000;" <%} %>>
										<p class="numeroMiPiace"><%=post.getLike().size() %></p>
										<img class="cuore" src="icone/cuore.png">
									</div>
									<form action="LikeServlet" method="POST" name="">
										<input class="miPiace" type="submit" value="Mi piace" <%if(mioLike==true){%> style="background-color:#FF0000; " <%} %>>
										<input class="utenteLike" name="utenteLike" type="hidden" value="<%=u.getIdUtente() %>">
										<input class="idPost" name="idPost" type="hidden" value="<%=post.getIdPost() %>">
										<input class="pagina" name="pagina" type="hidden" value="/profiloUtente.jsp">
									</form>
								</div>
								
									<%ArrayList<Commento> c=dao.getCommentiPost(post.getIdPost());%>
								
								<datalist id="C<%=post.getIdPost() %>">
								  <%for(int i=0;i<c.size();i++){ %>
                                   <option value="<%=c.get(i).getTesto() %>" id="<%=c.get(i).getTesto() %>">
                                     <%} %>
                                 </datalist>
                                 <datalist id="U<%=post.getIdPost() %>">
								  <%for(int i=0;i<c.size();i++){ %>
                                   <option value="<%=c.get(i).getUtente().getNome() %> <%=c.get(i).getUtente().getCognome() %>" id="<%=c.get(i).getUtente().getNome() %> <%=c.get(i).getUtente().getCognome() %>">
                                     <%} %>
                                 </datalist>
                                 <datalist id="F<%=post.getIdPost() %>">
								  <%for(int i=0;i<c.size();i++){ %>
                                   <option value="<%=c.get(i).getUtente().getIdUtente() %>" id="<%=c.get(i).getUtente().getIdUtente() %>">
                                     <%} %>
                                 </datalist>
								
								<% String nomeCognome = u.getNome() + " " + u.getCognome();  %>
									<div class="commenti"><input type="submit" value="Commenti" onclick="messageInfo('<%=u.getIdUtente() %>', '<%=post.getIdPost() %>', '<%=nomeCognome%>')"></div>
								
							</div>
							<p class="data">[<%=post.getData().getDate() %>/<%=post.getData().getMonth()+1 %>/<%=post.getData().getYear()+1900 %>]</p>
						</div>
					</div>
				</div>
				<%} %>
			</div>
			
		</div>
		<jsp:include page="footer.jsp"/>
	</body>
</html>