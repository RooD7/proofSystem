package modelo;

public class Estatistica {

	private int id;
	private int numQuestoes;
	private int acertos;
	private float porcAcertos;
	
	public Estatistica() {
		this.numQuestoes = 0;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumQuestoes() {
		return numQuestoes;
	}
	public void setNumQuestoes(int numQuestoes) {
		this.numQuestoes = numQuestoes;
	}
	public int getAcertos() {
		return acertos;
	}
	public void setAcertos(int acertos) {
		this.acertos = acertos;
	}
	public float getPorcAcertos() {
		if(getNumQuestoes() != 0) {
			porcAcertos = (getAcertos() / getNumQuestoes()) * 100;
			return porcAcertos;
		}
		else {
			porcAcertos = 0;
			return porcAcertos;
		}
			
	}
	public void setPorcAcertos(float porcAcertos) {
		this.porcAcertos = porcAcertos;
	}	
	
	//DASH
	
	
}
