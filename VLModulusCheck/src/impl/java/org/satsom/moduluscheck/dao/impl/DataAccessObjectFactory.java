package org.satsom.moduluscheck.dao.impl;

import java.util.Map;

import org.satsom.moduluscheck.dao.DataAccessObject;

/**
 * 
 * @author skushwaha
 *
 */
public class DataAccessObjectFactory {
	
	private DataAccessObjectFactory(){}
	
	private static final DataAccessObjectFactory INSTANCE = new DataAccessObjectFactory();
	
	//Map<String,>
	
	static{
		
	}
	
	public DataAccessObjectFactory getInstance(){
		if(INSTANCE == null){
			return new DataAccessObjectFactory();
		}
		return INSTANCE;
	}
	
	public DataAccessObject getDataAccessObject(Class clazz,String dbIdentifier){
		return null;
	}
	
}
