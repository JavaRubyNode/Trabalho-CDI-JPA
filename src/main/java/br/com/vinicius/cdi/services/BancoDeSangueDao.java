package br.com.vinicius.cdi.services;

import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
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
		Integer version = t.getVersionBancoDeSangue();
		BancoDeSangue temp = t;
		if(temp.getVersionBancoDeSangue() !=version){
			em.merge(t);
		}else{
			salvar(temp);
		}
		
		
	}

	@Override
	public void removerPorId(Long id) {
		em.getTransaction().begin();
		BancoDeSangue banco = em.find(BancoDeSangue.class, id);
		em.remove(banco);
		em.getTransaction().commit();
		
	}

	@Override
	public List<BancoDeSangue> listarTodos() {
		TypedQuery<BancoDeSangue> query= em.createQuery("select bs from BancoDeSangue bs  ",BancoDeSangue.class );
		List<BancoDeSangue> listaRetornoBancoDeSangues = query.getResultList();
		return listaRetornoBancoDeSangues;
	}

	@Override
	public BancoDeSangue checarExistencia(Long id) {
		BancoDeSangue banco = em.find(BancoDeSangue.class, id);
		return banco;
		
	}

}
