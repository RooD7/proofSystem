package dao;

import java.util.List;

import javax.persistence.EntityManager;

import modelo.Questao;
import util.JPAUtil;

public class QuestaoDAO {

	EntityManager em;
	
	public QuestaoDAO() {
		this.em = JPAUtil.getEntityManager();
	}
	

	public void remover(Questao questao){
		em.getTransaction().begin();
		
		Questao aux = em.find(Questao.class, questao.getId());
		em.remove(aux);
		em.flush();
		
		em.getTransaction().commit();		
	}

	public void salvar(Questao questao){
		em.getTransaction().begin();
		em.merge(questao);
		em.getTransaction().commit();
	}

	public Questao buscarPorId(Long id){
		return em.find(Questao.class, id);
	}

	public List<Questao> buscarTodos(){
	
		return 
			em.createQuery("from Questao",Questao.class).getResultList();
	}
}
