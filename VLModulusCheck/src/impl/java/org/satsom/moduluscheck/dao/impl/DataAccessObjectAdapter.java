package org.satsom.moduluscheck.dao.impl;

import java.io.Serializable;

import org.satsom.moduluscheck.dao.DataAccessObject;
import org.satsom.moduluscheck.domain.Entity;
import org.satsom.moduluscheck.spi.DataAccessException;

/**
 * 
 * @author skushwaha
 *
 */
public abstract class DataAccessObjectAdapter implements DataAccessObject {

	@Override
	public <T extends Entity> T findByEntityKey(Class<T> entityClass,
			Serializable entityKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Entity> T findByEntityKey(Class<T> entityClass,
			String entityName, Serializable entityKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Serializable create(Entity entity) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Entity entity) throws DataAccessException {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Entity entity, String entityName)
			throws DataAccessException {
		// TODO Auto-generated method stub

	}

	@Override
	public int delete(Entity entity) throws DataAccessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Serializable create(Entity entity, String entityName) {
		// TODO Auto-generated method stub
		return null;
	}

}
