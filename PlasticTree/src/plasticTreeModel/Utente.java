package plasticTreeModel;
import java.util.*;

public class Utente {

	
	public Utente(String id, String nome, String cognome, Date nascita, String indirizzo, String email,
			String password) {
		super();
		this.idUtente = id;
		this.nome = nome;
		this.cognome = cognome;
		this.nascita = nascita;
		this.indirizzo = indirizzo;
		this.email = email;
		this.password = password;
		this.credito = 0;
		this.follower = new ArrayList<Utente>();
		this.post = new ArrayList<Post>();
		this.obiettivi = new ArrayList<ObiettivoUtente>();
		
	}
	
	public Utente(String id, String nome, String cognome, Date nascita, String indirizzo, String email, String password,
			float credito, ArrayList<Utente> follower, ArrayList<Post> post, ArrayList<ObiettivoUtente> obiettivi) {
		this.idUtente = id;
		this.nome = nome;
		this.cognome = cognome;
		this.nascita = nascita;
		this.indirizzo = indirizzo;
		this.email = email;
		this.password = password;
		this.credito = credito;
		this.follower = follower;
		this.post = post;
		this.obiettivi = obiettivi;
	}
	
	public String getIdUtente() {
		return idUtente;
	}
	public void setIdUtente(String id) {
		this.idUtente = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getNascita() {
		return nascita;
	}
	public void setNascita(Date nascita) {
		this.nascita = nascita;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public float getCredito() {
		return credito;
	}
	public void setCredito(float credito) {
		this.credito = credito;
	}
	public ArrayList<Utente> getFollower() {
		return follower;
	}
	public void setFollower(ArrayList<Utente> follower) {
		this.follower = follower;
	}
	public ArrayList<Post> getPost() {
		return post;
	}
	public void setPost(ArrayList<Post> post) {
		this.post = post;
	}
	public ArrayList<ObiettivoUtente> getObiettivi() {
		return obiettivi;
	}
	public void setObiettivi(ArrayList<ObiettivoUtente> obiettivi) {
		this.obiettivi = obiettivi;
	}
	
	private String idUtente;
	private String nome;
	private String cognome;
	private Date nascita;
	private String indirizzo;
	private String email;
	private String password;
	private float credito;
	private ArrayList<Utente> follower;
	private ArrayList<Post> post;
	private ArrayList<ObiettivoUtente> obiettivi;
	
}
