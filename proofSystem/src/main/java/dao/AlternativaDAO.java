package dao;

import java.util.List;

import javax.persistence.EntityManager;

import modelo.Alternativa;
import util.JPAUtil;

public class AlternativaDAO {

	EntityManager em;
	
	public AlternativaDAO() {
		this.em = JPAUtil.getEntityManager();
	}
	

	public void remover(Alternativa alternativa){
		em.getTransaction().begin();
		
		Alternativa aux = em.find(Alternativa.class, alternativa.getId());
		em.remove(aux);
		em.flush();
		
		em.getTransaction().commit();		
	}

	public void salvar(Alternativa alternativa){
		em.getTransaction().begin();
		em.merge(alternativa);
		em.getTransaction().commit();
	}

	public Alternativa buscarPorId(Long id){
		return em.find(Alternativa.class, id);
	}

	public List<Alternativa> buscarTodos(){
	
		return 
			em.createQuery("from Alternativa",Alternativa.class).getResultList();
	}

	
	
}
