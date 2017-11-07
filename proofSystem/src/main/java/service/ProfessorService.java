package service;

import java.util.List;

import dao.ProfessorDAO;
import excecoes.NegocioException;
import modelo.Professor;

public class ProfessorService {

	ProfessorDAO proDAO;
	
	
	public ProfessorService() {
		proDAO = new ProfessorDAO();
	}
	
	public void salvar(Professor professor) throws NegocioException{
		
		if (professor.getDados().getNome()==null &&
				professor.getDados().getNome().trim().isEmpty())
		   throw new NegocioException("Nome do professor não informado.");
			
		proDAO.salvar(professor);
	}
	
	public void remover(Professor professor){
		proDAO.remover(professor);
		
	}

	public Professor buscarPorId(Long id){
		return proDAO.buscarPorId(id);
	}

	public List<Professor> buscarTodos(){	
		return proDAO.buscarTodos();
	}
	
}
