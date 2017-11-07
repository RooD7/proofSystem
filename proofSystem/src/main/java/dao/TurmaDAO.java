package dao;

import java.util.List;

import javax.persistence.EntityManager;

import modelo.Turma;
import util.JPAUtil;

public class TurmaDAO {

	EntityManager em;
	
	public TurmaDAO() {
		this.em = JPAUtil.getEntityManager();
	}
	

	public void remover(Turma turma){
		em.getTransaction().begin();
		
		Turma aux = em.find(Turma.class, turma.getId());
		em.remove(aux);
		em.flush();
		
		em.getTransaction().commit();		
	}

	public void salvar(Turma turma){
		em.getTransaction().begin();
		em.merge(turma);
		em.getTransaction().commit();
	}

	public Turma buscarPorId(Long id){
		return em.find(Turma.class, id);
	}

	public List<Turma> buscarTodos(){
	
		return 
			em.createQuery("from Turma",Turma.class).getResultList();
	}
}
