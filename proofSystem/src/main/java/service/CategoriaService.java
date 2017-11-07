package service;

import java.util.List;

import dao.CategoriaDAO;
import excecoes.NegocioException;
import modelo.Categoria;

public class CategoriaService {

	CategoriaDAO catDAO;
	
	
	public CategoriaService() {
		catDAO = new CategoriaDAO();
	}
	
	public void salvar(Categoria categoria) throws NegocioException{
		
		if (categoria.getNome()==null &&
				categoria.getNome().trim().isEmpty())
		   throw new NegocioException("Nome do categoria não informado.");
			
		catDAO.salvar(categoria);
	}
	
	public void remover(Categoria categoria){
		catDAO.remover(categoria);
		
	}

	public Categoria buscarPorId(Long id){
		return catDAO.buscarPorId(id);
	}

	public List<Categoria> buscarTodos(){	
		return catDAO.buscarTodos();
	}
	
}
