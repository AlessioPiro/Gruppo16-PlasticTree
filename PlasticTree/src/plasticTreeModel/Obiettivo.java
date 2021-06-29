package plasticTreeModel;

public class Obiettivo {
	
	public Obiettivo(String idObiettivo, String titolo, String descrizione, float ricompensa) {
		this.idObiettivo = idObiettivo;
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.ricompensa = ricompensa;
	}
	public String getIdObiettivo() {
		return idObiettivo;
	}
	public void setIdObiettivo(String idObiettivo) {
		this.idObiettivo = idObiettivo;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public float getRicompensa() {
		return ricompensa;
	}
	public void setRicompensa(float ricompensa) {
		this.ricompensa = ricompensa;
	}
	
	private String idObiettivo;
	private String titolo;
	private String descrizione;
	private float ricompensa;
}
