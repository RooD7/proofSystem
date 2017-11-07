package dao;

import java.util.List;

import javax.persistence.EntityManager;

import modelo.Aluno;
import util.JPAUtil;

public class AlunoDAO {

	EntityManager em;
	
	public AlunoDAO() {
		this.em = JPAUtil.getEntityManager();
	}
	

	public void remover(Aluno aluno){
		em.getTransaction().begin();
		
		Aluno aux = em.find(Aluno.class, aluno.getId());
		em.remove(aux);
		em.flush();
		
		em.getTransaction().commit();		
	}

	public void salvar(Aluno aluno){
		em.getTransaction().begin();
		em.merge(aluno);
		em.getTransaction().commit();
	}

	public Aluno buscarPorId(Long id){
		return em.find(Aluno.class, id);
	}

	public List<Aluno> buscarTodos(){
	
		return 
			em.createQuery("from Aluno",Aluno.class).getResultList();
	}
}
