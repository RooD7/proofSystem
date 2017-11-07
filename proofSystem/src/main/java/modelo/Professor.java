package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Professor implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	// nivelSys - constante de enum?
	private Pessoa dados;
	private ArrayList<Turma> turmas;
	
	
	public Professor() {
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Professor other = (Professor) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pessoa getDados() {
		return dados;
	}
	public void setDados(Pessoa dados) {
		this.dados = dados;
	}

	public ArrayList<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(ArrayList<Turma> turmas) {
		this.turmas = turmas;
	}
}
