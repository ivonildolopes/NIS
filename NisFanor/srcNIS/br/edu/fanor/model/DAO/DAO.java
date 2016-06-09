package br.edu.fanor.model.DAO;

import java.util.List;



public interface DAO<T> {
	
	public boolean salvar(Class<T> obj);
	
	public void remover(Class<T> obj);
	
	public List<T> listarTodos();
	
	public Object buscarPorID(Integer id);
	
	

}
