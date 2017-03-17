package br.com.vinicius.cdi.util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import br.com.vinicius.cdi.enums.JpaUtil;
import br.com.vinicius.cdi.modelo.BancoDeSangue;
import br.com.vinicius.cdi.modelo.Endereco;
import br.com.vinicius.cdi.services.BancoDeSangueDao;
import static org.junit.Assert.*;

public class BancoDeSangueTest {

	private EntityManager em;
	private static final String CPF = "999.999.999-99"; 
	
	@Before
	public void instanciarEntityManager(){
		em = JpaUtil.INSTANCE.getEntityManager();
	}
	
	@After
	public void fecharEntityManager(){
		if(em.isOpen()){
			em.close();
		}
	}
	
	@AfterClass
	public static void deveLimparBaseTeste(){
		EntityManager entityManager = JpaUtil.INSTANCE.getEntityManager();
		entityManager.getTransaction().begin();
		Query query = entityManager.createQuery("DELETE FROM BancoDeSangue b");
		int qtdeRegistrosExcluidos = query.executeUpdate();
		
		entityManager.getTransaction().commit();
		
		assertTrue("Certifica que a base foi limpa", qtdeRegistrosExcluidos > 0);
	}
	
	@Test
	public void deveSalvarNoBanco(){
		BancoDeSangue bs = new BancoDeSangue();
		bs.setNome("HEMOLABOR");
		bs.setEndereco(new Endereco());
		bs.setEmail("atendimento@hemolabor.com.br");
		bs.setTelefone("9999-9999");
		
		assertTrue("Não deve ter ID definido", bs.isTransient());
		
		em.getTransaction().begin();
		em.persist(bs);
		em.getTransaction().commit();
		
		assertFalse("Deve ter ID definido", bs.isTransient());
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void deveconsultarEmail(){
		deveSalvarNoBanco();
		
		String filtro = "9999-9999";
		
		Query query = em.createQuery("SELECT b.telefone FROM BancoDeSangue b WHERE b.telefone LIKE :nome");
		query.setParameter("nome", "%"+filtro+"%");
		
		List<String>listaTelefone = query.getResultList();
		
		assertTrue("Verifica se há registro na lista", listaTelefone.isEmpty());
	}
}
