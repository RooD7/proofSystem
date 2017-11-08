package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estatistica implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private int numQuestoes;
	private int acertos;
	private float porcAcertos;
	
	public Estatistica() {
		this.numQuestoes = 0;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estatistica other = (Estatistica) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
