package dao;

import java.util.List;

import javax.persistence.EntityManager;

import modelo.Prova;
import util.JPAUtil;

public class ProvaDAO {

	EntityManager em;
	
	public ProvaDAO() {
		this.em = JPAUtil.getEntityManager();
	}
	

	public void remover(Prova prova){
		em.getTransaction().begin();
		
		Prova aux = em.find(Prova.class, prova.getId());
		em.remove(aux);
		em.flush();
		
		em.getTransaction().commit();		
	}

	public void salvar(Prova prova){
		em.getTransaction().begin();
		em.merge(prova);
		em.getTransaction().commit();
	}

	public Prova buscarPorId(Long id){
		return em.find(Prova.class, id);
	}

	public List<Prova> buscarTodos(){
	
		return 
			em.createQuery("from Prova",Prova.class).getResultList();
	}
}
