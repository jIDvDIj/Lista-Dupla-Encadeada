package classes;

public class No {
	private int info;
	private No prox;
	private No ant;
	public int getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	public No getProx() {
		return prox;
	}
	public void setProx(No prox) {
		this.prox = prox;
	}
	public No getAnt() {
		return ant;
	}
	public void setAnt(No ant) {
		this.ant = ant;
	}
	public No(int info, No prox, No ant) {
		super();
		this.info = info;
		this.prox = prox;
		this.ant = ant;
	}
}