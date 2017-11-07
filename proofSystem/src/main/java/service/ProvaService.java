package service;

import java.util.List;

import dao.ProvaDAO;
import excecoes.NegocioException;
import modelo.Prova;

public class ProvaService {

	ProvaDAO proDAO;
	
	
	public ProvaService() {
		proDAO = new ProvaDAO();
	}
	
	public void salvar(Prova prova) throws NegocioException{
		
		if (prova.getNome()==null &&
				prova.getNome().trim().isEmpty())
		   throw new NegocioException("Nome da prova não informado.");
			
		proDAO.salvar(prova);
	}
	
	public void remover(Prova prova){
		proDAO.remover(prova);
		
	}

	public Prova buscarPorId(Long id){
		return proDAO.buscarPorId(id);
	}

	public List<Prova> buscarTodos(){	
		return proDAO.buscarTodos();
	}
	
}
