package dao;

import java.util.List;

import javax.persistence.EntityManager;

import modelo.Professor;
import util.JPAUtil;

public class ProfessorDAO {

	EntityManager em;
	
	public ProfessorDAO() {
		this.em = JPAUtil.getEntityManager();
	}
	

	public void remover(Professor professor){
		em.getTransaction().begin();
		
		Professor aux = em.find(Professor.class, professor.getId());
		em.remove(aux);
		em.flush();
		em.getTransaction().commit();		
	}

	public void salvar(Professor professor){
		em.getTransaction().begin();
		em.merge(professor);
		em.getTransaction().commit();
	}

	public Professor buscarPorId(Long id){
		return em.find(Professor.class, id);
	}

	public List<Professor> buscarTodos(){
	
		return 
			em.createQuery("from Professor",Professor.class).getResultList();
	}
}
