package dao;

import java.util.List;

import javax.persistence.EntityManager;

import modelo.Estatistica;
import util.JPAUtil;

public class EstatisticaDAO {

	EntityManager em;
	
	public EstatisticaDAO() {
		this.em = JPAUtil.getEntityManager();
	}
	

	public void remover(Estatistica estatistica){
		em.getTransaction().begin();
		
		Estatistica aux = em.find(Estatistica.class, estatistica.getId());
		em.remove(aux);
		em.flush();
		
		em.getTransaction().commit();		
	}

	public void salvar(Estatistica estatistica){
		em.getTransaction().begin();
		em.merge(estatistica);
		em.getTransaction().commit();
	}

	public Estatistica buscarPorId(Long id){
		return em.find(Estatistica.class, id);
	}

	public List<Estatistica> buscarTodos(){
	
		return 
			em.createQuery("from Estatistica",Estatistica.class).getResultList();
	}
}
