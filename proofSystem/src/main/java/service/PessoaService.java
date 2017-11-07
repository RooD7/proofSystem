package service;

import java.util.List;

import dao.PessoaDAO;
import excecoes.NegocioException;
import modelo.Pessoa;

public class PessoaService {

	PessoaDAO pesDAO;
	
	
	public PessoaService() {
		pesDAO = new PessoaDAO();
	}
	
	public void salvar(Pessoa pessoa) throws NegocioException{
		
		if (pessoa.getNome()==null &&
				pessoa.getNome().trim().isEmpty())
		   throw new NegocioException("Nome da pessoa não informado.");
			
		pesDAO.salvar(pessoa);
	}
	
	public void remover(Pessoa pessoa){
		pesDAO.remover(pessoa);
		
	}

	public Pessoa buscarPorId(Long id){
		return pesDAO.buscarPorId(id);
	}

	public List<Pessoa> buscarTodos(){	
		return pesDAO.buscarTodos();
	}
	
}
