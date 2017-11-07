package modelo;

import java.util.ArrayList;

public class Prova {

	private int id;
	private String nome;
	private String disciplina;
	private ArrayList<Questao> questoes;
	private Estatistica estatistica;
	private boolean online;
	
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
		Prova other = (Prova) obj;
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public ArrayList<Questao> getQuestoes() {
		return questoes;
	}
	public void setQuestoes(ArrayList<Questao> questoes) {
		this.questoes = questoes;
	}
	public Estatistica getEstatistica() {
		return estatistica;
	}
	public void setEstatistica(Estatistica estatistica) {
		this.estatistica = estatistica;
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	
}
