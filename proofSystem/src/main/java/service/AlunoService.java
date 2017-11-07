package service;

import java.util.List;

import dao.AlunoDAO;
import excecoes.NegocioException;
import modelo.Aluno;

public class AlunoService {

	AlunoDAO aluDAO;
	
	
	public AlunoService() {
		aluDAO = new AlunoDAO();
	}
	
	public void salvar(Aluno aluno) throws NegocioException{
		
		if (aluno.getDados().getNome()==null &&
				aluno.getDados().getNome().trim().isEmpty())
		   throw new NegocioException("Nome do aluno não informado.");
			
		aluDAO.salvar(aluno);
	}
	
	public void remover(Aluno aluno){
		aluDAO.remover(aluno);
		
	}

	public Aluno buscarPorId(Long id){
		return aluDAO.buscarPorId(id);
	}

	public List<Aluno> buscarTodos(){	
		return aluDAO.buscarTodos();
	}
	
}
