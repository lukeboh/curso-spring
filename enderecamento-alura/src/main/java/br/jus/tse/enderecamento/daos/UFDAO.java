package br.jus.tse.enderecamento.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.jus.tse.enderecamento.models.UF;

@Repository
@Transactional
public class UFDAO {

	@PersistenceContext
	private EntityManager manager;

	public void gravar(UF uf) {
		manager.persist(uf);
	}

	public List<UF> listar() {
		return manager.createQuery("select p from UF p", UF.class).getResultList();
	}

	public UF find(Integer id) {
		 return manager.find(UF.class, id);
	}
}
