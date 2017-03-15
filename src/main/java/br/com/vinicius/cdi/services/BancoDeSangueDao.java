package br.com.vinicius.cdi.services;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.vinicius.cdi.interfaces.DAO;
import br.com.vinicius.cdi.modelo.BancoDeSangue;

public class BancoDeSangueDao implements DAO<BancoDeSangue> {

	
	@Inject
	EntityManager em;
	
	@Override
	public void salvar(BancoDeSangue t) {
		
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
	}

	@Override
	public void altualizar(BancoDeSangue t) {
		
		
	}

	@Override
	public void removerPorId(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BancoDeSangue> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void checarExistencia(BancoDeSangue t) {
		// TODO Auto-generated method stub
		
	}

}
