package service;

import java.util.List;

import dao.DatesDAO;
import excecoes.NegocioException;
import modelo.Dates;

public class DatesService {

	DatesDAO datDAO;
	
	
	public DatesService() {
		datDAO = new DatesDAO();
	}
	
	public void salvar(Dates dates) throws NegocioException{
		
		if (dates.getDataCriacao()==null &&
				dates.getDataCriacao().toString().isEmpty())
		   throw new NegocioException("Nome do dates não informado.");
			
		datDAO.salvar(dates);
	}
	
	public void remover(Dates dates){
		datDAO.remover(dates);
	}

	public Dates buscarPorId(Long id){
		return datDAO.buscarPorId(id);
	}

	public List<Dates> buscarTodos(){	
		return datDAO.buscarTodos();
	}
	
}
