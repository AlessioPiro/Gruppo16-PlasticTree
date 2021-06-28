package plasticTreeModel;
import java.util.*;

public class Post {

	public Post(String testo, Utente utente, Date data, ArrayList<Commento> commenti, ArrayList<Utente> like, String idFoto) {
		this.commenti = commenti;
		this.testo = testo;
		this.data = data;
		this.utente = utente;
		this.like = like;
		this.idFoto=idFoto;
	}
	public ArrayList<Commento> getCommenti() {
		return commenti;
	}
	public void setCommenti(ArrayList<Commento> commenti) {
		this.commenti = commenti;
	}
	public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public ArrayList<Utente> getLike() {
		return like;
	}
	public void setLike(ArrayList<Utente> like) {
		this.like = like;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getIdFoto() {
		return idFoto;
	}
	public void setIdFoto(String idFoto) {
		this.idFoto = idFoto;
	}
	
	private ArrayList<Commento> commenti;
	private String testo;
	private Date data;
	private Utente utente;
	private ArrayList<Utente> like;
	private String idFoto;
	
}
