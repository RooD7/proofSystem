package service;

import java.util.List;

import dao.TurmaDAO;
import excecoes.NegocioException;
import modelo.Turma;

public class TurmaService {

	TurmaDAO turDAO;
	
	
	public TurmaService() {
		turDAO = new TurmaDAO();
	}
	
	public void salvar(Turma turma) throws NegocioException{
		
		if (turma.getNome()==null &&
				turma.getNome().trim().isEmpty())
		   throw new NegocioException("Nome do turma não informado.");
			
		turDAO.salvar(turma);
	}
	
	public void remover(Turma turma){
		turDAO.remover(turma);
		
	}

	public Turma buscarPorId(Long id){
		return turDAO.buscarPorId(id);
	}

	public List<Turma> buscarTodos(){	
		return turDAO.buscarTodos();
	}
	
}
