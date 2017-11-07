package dao;

import java.util.List;

import javax.persistence.EntityManager;

import modelo.Dates;
import util.JPAUtil;

public class DatesDAO {

	EntityManager em;
	
	public DatesDAO() {
		this.em = JPAUtil.getEntityManager();
	}
	

	public void remover(Dates dates){
		em.getTransaction().begin();
		
		Dates aux = em.find(Dates.class, dates.getId());
		em.remove(aux);
		em.flush();
		
		em.getTransaction().commit();		
	}

	public void salvar(Dates dates){
		em.getTransaction().begin();
		em.merge(dates);
		em.getTransaction().commit();
	}

	public Dates buscarPorId(Long id){
		return em.find(Dates.class, id);
	}

	public List<Dates> buscarTodos(){
	
		return 
			em.createQuery("from Dates",Dates.class).getResultList();
	}
}
