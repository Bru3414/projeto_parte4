/**
 * 
 */
package br.com.bdam.dao;

import br.com.bdam.dao.generic.GenericJpaDAO;
import br.com.bdam.domain.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
