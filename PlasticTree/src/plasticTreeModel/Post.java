package plasticTreeModel;
import java.util.*;

public class Post {

	public Post(String idPost, String testo, Utente utente, Date data, ArrayList<Utente> like) {
		this.testo = testo;
		this.data = data;
		this.utente = utente;
		this.like = like;
		this.idPost = idPost;
	}
	public Post(String idPost, String testo, Utente utente) {
		this.testo = testo;
		this.data = new Date();
		this.utente = utente;
		this.like = new ArrayList<Utente>();
		this.idPost = idPost;
	}
	public String getIdPost() {
		return idPost;
	}
	public void setIdPost(String idPost) {
		this.idPost = idPost;
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
	public String getObiettivoPost() {
		String obiettivo = "";
		int num =testo.lastIndexOf(":");
		if(num==-1) {
			return obiettivo;
		}
		obiettivo = testo.substring(testo.lastIndexOf(":"));
		return obiettivo;
	}
	
	private String idPost;
	private String testo;
	private Date data;
	private Utente utente;
	private ArrayList<Utente> like;
	
	
}
