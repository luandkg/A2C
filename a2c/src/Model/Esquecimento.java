package Model;


public class Esquecimento {

	private String usuario = "";
	private String resgate = "";
	private String ddc;
	private String status = "";

	public Esquecimento(String iusuario, String iresgate, String istatus, String iddc) {

		usuario = iusuario;
		resgate = iresgate;
		ddc = iddc;
		status = istatus;

	}

	public String getUsuario() {
		return this.usuario;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String valor) {
		this.status = valor;
	}

	public String getResgate() {
		return this.resgate;
	}

	public String getDDC() {
		return this.ddc;
	}
	
}
