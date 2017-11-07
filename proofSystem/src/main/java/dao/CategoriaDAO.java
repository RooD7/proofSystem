package dao;

import java.util.List;

import javax.persistence.EntityManager;

import modelo.Categoria;
import util.JPAUtil;

public class CategoriaDAO {

	EntityManager em;
	
	public CategoriaDAO() {
		this.em = JPAUtil.getEntityManager();
	}
	

	public void remover(Categoria categoria){
		em.getTransaction().begin();
		
		Categoria aux = em.find(Categoria.class, categoria.getId());
		em.remove(aux);
		em.flush();
		
		em.getTransaction().commit();		
	}

	public void salvar(Categoria categoria){
		em.getTransaction().begin();
		em.merge(categoria);
		em.getTransaction().commit();
	}

	public Categoria buscarPorId(Long id){
		return em.find(Categoria.class, id);
	}

	public List<Categoria> buscarTodos(){
	
		return 
			em.createQuery("from Categoria",Categoria.class).getResultList();
	}
}
