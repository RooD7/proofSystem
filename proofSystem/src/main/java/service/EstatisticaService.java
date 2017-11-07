package service;

import java.util.List;

import dao.EstatisticaDAO;
import excecoes.NegocioException;
import modelo.Estatistica;

public class EstatisticaService {

	EstatisticaDAO estDAO;
	
	
	public EstatisticaService() {
		estDAO = new EstatisticaDAO();
	}
	
	public void salvar(Estatistica estatistica) throws NegocioException {
		
		if (estatistica.getNumQuestoes()==0 &&
				estatistica != null)
		   throw new NegocioException("Número de questões da estatistica não informado.");
			
		estDAO.salvar(estatistica);
	}
	
	public void remover(Estatistica estatistica){
		estDAO.remover(estatistica);
		
	}

	public Estatistica buscarPorId(Long id){
		return estDAO.buscarPorId(id);
	}

	public List<Estatistica> buscarTodos(){	
		return estDAO.buscarTodos();
	}
	
}
