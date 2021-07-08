<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="plasticTreeModel.Utente" %> 
    <%@page import="plasticTreeModel.Commento" %> 
    <%@page import="plasticTreeModel.ObiettivoUtente" %> 
<%@page import="plasticTreeModel.Post" %> 
<%@page import="plasticTreeModel.Dao" %> 
<%@ page import="java.util.*" %>  
<% Utente u=(Utente) request.getSession().getAttribute("utente"); 
   Utente guardato=(Utente) request.getAttribute("altroUtente"); 
   Dao dao= (Dao) request.getSession().getAttribute("dao");
   boolean confermaCond=false;
   String profilo="";
   String profiloName="";
   boolean seg=false;
   if(request.getAttribute("confermaCond")!=null){
   	confermaCond=(boolean) request.getAttribute("confermaCond");
   	profilo=(String) request.getAttribute("profiloCond");
   	profiloName=(String) request.getAttribute("profiloName");
   	seg=(boolean) request.getAttribute("seguito");
   	}
%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="Css/altroUtente.css" type="text/css">
	<title>Profilo - Plastic Tree</title>
	</head>
	<body <%if(confermaCond==true){ %> onload="conferma('<%=profilo%>','<%=profiloName%>','<%=seg%>')"<%}%>>
	    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
        <script src="JS/altroUtente.js"></script>
		<jsp:include page="header.jsp"/>
		<div class="fotoENome">
			<img class="fotoProfiloUtente" alt="" src="fotoUtente/<%=guardato.getIdUtente() %>.jpg">
			<h3 class="nomeProfiloUtente"><%=guardato.getNome() %> <%=guardato.getCognome() %></h3>
			<form action="SeguiServlet"><%if(dao.isSeguito(u, guardato)==false) {%><input class="segui" name="segui" type="submit" value="Segui"><%}else{ %><input class="segui" name="segui" type="submit" value="Non seguire più"><%} %>
			<input type="hidden" name="utenteSeguito" value="<%=guardato.getIdUtente() %>">
			</form>
		</div>
		<div class="informazioni">
			<h3 class="informazioniTesto">Informazioni</h3>
				<div class="informationFormContenitore">
						<div class=infoUtente>Nato il: <%=guardato.getNascita().getDate() %>/<%=guardato.getNascita().getMonth()+1 %>/<%=guardato.getNascita().getYear()+1900 %></div>
						<div id="dataErr"></div><br><!-- DA AGGIUNGERE AL POSTO DI USERNAME IN JS -->
						<div class=infoUtente>Indirizzo: <%=guardato.getIndirizzo() %></div>
						<div id="addressErr"></div>
				</div>
		</div>
		<div class="obiettivi">
			<h3 class="obiettiviTesto">Obiettivi completati da <%=guardato.getNome() %></h3>
			<div class="obiettiviContenitore">
				<div class="immaginiObiettiviContenitore">
				  <%int end=5;
				  ArrayList<ObiettivoUtente> ob=dao.getObiettiviUtente(guardato);
				     for(int i=0;i<5;i++){
					  if(i<ob.size()){
						  if(ob.get(i).isRaggiunto()==true){
						  String s= ob.get(i).getIdObiettivo();
						  %><img class="obiettivo" alt="" src="fotoObiettivi/<%=s%>.png" onerror="icone/nophoto.jpg">
						  <%}else{end++;}
					  }
					  }%>
					
				</div>
				
				<form action="ObiettiviAltroUtenteServlet" method="POST" name="">
					<input class="mostraAltroPulsante" type="submit" value="Mostra altro">
					<input  name="altroUtente" type="hidden" value="<%=guardato.getIdUtente()%>">
				</form>
			</div>
		</div>
		<div class="attivita">
			<h3 class="attivitaTesto">Attivita'</h3>
			<div class="insiemePost">
			<% ArrayList<Post> posts= dao.getPostUtente(guardato);
			   for(int j=0;j<posts.size();j++){
			       Post post=posts.get(j); %>
			    
				<div class="post">
					<a href="AltroUtenteServlet?altroUtente=<%=post.getUtente().getIdUtente()%>" style="text-decoration: none;">
						<div class="creatorePost">					
							<img class="postFotoUtente" src="fotoUtente/<%=post.getUtente().getIdUtente() %>.jpg">
							<h3 class="postNomeUtente"><%=post.getUtente().getNome() %> <%=post.getUtente().getCognome() %></h3>
						</div>
					</a>
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
									<div class="numeroMiPiaceContenitore" <%if(mioLike==true){%> style="background-color:#FF0000;" <%} %>>
										<p class="numeroMiPiace"><%=post.getLike().size() %></p>
										<img class="cuore" src="icone/cuore.png">
									</div>
									<form action="LikeServlet" method="POST" name="">
										<input class="miPiace" type="submit" value="Mi piace" <%if(mioLike==true){%> style="background-color:#FF0000; " <%} %>>
										<input class="utenteLike" name="utenteLike" type="hidden" value="<%=u.getIdUtente() %>">
										<input class="idPost" name="idPost" type="hidden" value="<%=post.getIdPost() %>">
										<input class="idUtenteGuardato" name="idUtenteGuardato" type="hidden" value="<%=guardato.getIdUtente()%>">
										<input class="pagina" name="pagina" type="hidden" value="/altroUtente.jsp">
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
									<div class="commenti"><input type="submit" value="Commenti" onclick="messageInfo('<%=u.getIdUtente() %>', '<%=post.getIdPost() %>', '<%=nomeCognome%>', '<%=guardato.getIdUtente()%>')"></div>								
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