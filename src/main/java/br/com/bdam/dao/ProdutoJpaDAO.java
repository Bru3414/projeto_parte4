/**
 * 
 */
package br.com.bdam.dao;

import br.com.bdam.dao.generic.GenericJpaDAO;
import br.com.bdam.domain.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
