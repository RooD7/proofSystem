package dao;

import java.util.List;

import javax.persistence.EntityManager;

import modelo.Pessoa;
import util.JPAUtil;

public class PessoaDAO {

	EntityManager em;
	
	public PessoaDAO() {
		this.em = JPAUtil.getEntityManager();
	}
	

	public void remover(Pessoa pessoa){
		em.getTransaction().begin();
		
		Pessoa aux = em.find(Pessoa.class, pessoa.getId());
		em.remove(aux);
		em.flush();
		
		em.getTransaction().commit();		
	}

	public void salvar(Pessoa pessoa){
		em.getTransaction().begin();
		em.merge(pessoa);
		em.getTransaction().commit();
	}

	public Pessoa buscarPorId(Long id){
		return em.find(Pessoa.class, id);
	}

	public List<Pessoa> buscarTodos(){
	
		return 
			em.createQuery("from Pessoa",Pessoa.class).getResultList();
	}
}
