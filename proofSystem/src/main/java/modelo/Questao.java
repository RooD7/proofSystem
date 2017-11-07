package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Questao implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String pergunta;
	private ArrayList<Alternativa> alternativas;
	private Categoria categoria;	
	private Dates datas;
	
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
		Questao other = (Questao) obj;
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
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	
	public ArrayList<Alternativa> getAlternativas() {
		return alternativas;
	}
	public void setAlternativas(ArrayList<Alternativa> alternativas) {
		this.alternativas = alternativas;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Dates getDatas() {
		return datas;
	}
	public void setDatas(Dates datas) {
		this.datas = datas;
	}
}
