package plasticTreeModel;

public class Obiettivo {
	
	public Obiettivo(String idObiettivo, String titolo, String descrizione, float ricompensa, boolean raggiunto, boolean riscattato) {
		this.idObiettivo = idObiettivo;
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.ricompensa = ricompensa;
		this.raggiunto = raggiunto;
		this.riscattato = riscattato;
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
	public boolean isRaggiunto() {
		return raggiunto;
	}
	public void setRaggiunto(boolean raggiunto) {
		this.raggiunto = raggiunto;
	}
	public boolean isRiscattato() {
		return riscattato;
	}
	public void setRiscattato(boolean riscattato) {
		this.riscattato = riscattato;
	}
	
	private String idObiettivo;
	private String titolo;
	private String descrizione;
	private float ricompensa;
	private boolean raggiunto;
	private boolean riscattato;
}
