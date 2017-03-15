package br.com.vinicius.cdi.interfaces;

import java.util.List;

public interface DAO<T> {
	
	public void salvar(T t);
	public void altualizar(T t);
	public void removerPorId(Long id);
	public List<T> listarTodos();
	public void checarExistencia(T t);

}
