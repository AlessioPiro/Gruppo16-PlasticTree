package plasticTreeModel;

public class ObiettivoUtente {
	
	public ObiettivoUtente(String idObiettivo, String idUtente, boolean raggiunto, boolean riscattato) {
		this.idObiettivo = idObiettivo;
		this.idUtente = idUtente;
		this.raggiunto = raggiunto;
		this.riscattato = riscattato;
	}
	
	public String getIdObiettivo() {
		return idObiettivo;
	}
	public void setIdObiettivo(String idObiettivo) {
		this.idObiettivo = idObiettivo;
	}
	public String getIdUtente() {
		return idUtente;
	}
	public void setIdUtente(String idUtente) {
		this.idUtente = idUtente;
	}
	public boolean isRaggiunto() {
		return raggiunto;
	}
	public void setRaggiunto(boolean raggiunto) {
		this.raggiunto = raggiunto;
	}
	public boolean isRiscattato() {
		return this.riscattato;
	}
	public void setRiscattato(boolean riscattato) {
		this.riscattato = riscattato;
	}
	
	String idObiettivo;
	String idUtente;
	boolean raggiunto;
	boolean riscattato;
}
