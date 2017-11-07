package service;

import java.util.List;

import dao.QuestaoDAO;
import excecoes.NegocioException;
import modelo.Questao;

public class QuestaoService {

	QuestaoDAO queDAO;
	
	
	public QuestaoService() {
		queDAO = new QuestaoDAO();
	}
	
	public void salvar(Questao questao) throws NegocioException{
		
		if (questao.getPergunta()==null &&
				questao.getPergunta().trim().isEmpty())
		   throw new NegocioException("Nome do questao não informado.");
			
		queDAO.salvar(questao);
	}
	
	public void remover(Questao questao){
		queDAO.remover(questao);
		
	}

	public Questao buscarPorId(Long id){
		return queDAO.buscarPorId(id);
	}

	public List<Questao> buscarTodos(){	
		return queDAO.buscarTodos();
	}
	
}
