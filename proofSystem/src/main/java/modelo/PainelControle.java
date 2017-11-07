package modelo;

import java.util.ArrayList;

public class PainelControle {

	// Possui todas as categorias cadastradas no sistema
	private ArrayList<Categoria> categorias;
	
	

	public boolean hasCategoria(Categoria c) {
		// Verifica se categoria c esta cadastrada.
		for (Categoria cat : categorias) {
			if(cat.equals(c))
				return true;
		}
		return false;
	}
}
