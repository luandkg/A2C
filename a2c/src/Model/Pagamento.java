package Model;

public class Pagamento {

	private int pid = 0;
	private int usuarioid = 0;
	private int mpid = 0;
	private float valor = 0;


	public int getPID() {
		return this.pid;
	}

	public void setPID(int valor) {
		this.pid = valor;
	}

	public void setUsuarioID(int valor) {
		this.usuarioid = valor;
	}

	public int getUsuarioID() {
		return this.usuarioid;
	}

	public void setMPID(int valor) {
		this.mpid = valor;
	}

	public int getMPID() {
		return this.mpid;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getValor() {
		return this.valor;
	}

}
