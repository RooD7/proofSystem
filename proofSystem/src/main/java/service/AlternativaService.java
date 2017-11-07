package service;

import java.util.List;

import dao.AlternativaDAO;
import excecoes.NegocioException;
import modelo.Alternativa;

public class AlternativaService {

	AlternativaDAO altDAO;
	
	
	public AlternativaService() {
		altDAO = new AlternativaDAO();
	}
	
	public void salvar(Alternativa alternativa) throws NegocioException{
		
		if (alternativa.getDescricao()==null &&
				alternativa.getDescricao().trim().isEmpty())
		   throw new NegocioException("Nome do alternativa não informado.");
			
		altDAO.salvar(alternativa);
	}
	
	public void remover(Alternativa alternativa){
		altDAO.remover(alternativa);
		
	}

	public Alternativa buscarPorId(Long id){
		return altDAO.buscarPorId(id);
	}

	public List<Alternativa> buscarTodos(){	
		return altDAO.buscarTodos();
	}
	
}
