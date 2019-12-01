package Model;

public class Pedido {

	private int pid = 0;

	private int cid = 0;
	private int usuarioid = 0;

	public int getPID() {
		return this.pid;
	}

	public void setPID(int valor) {
		this.pid = valor;
	}

	public int getCID() {
		return this.cid;
	}

	public void setCID(int valor) {
		this.cid = valor;
	}

	public void setUsuarioID(int valor) {
		this.usuarioid = valor;
	}

	public int getUsuarioID() {
		return this.usuarioid;
	}

}
