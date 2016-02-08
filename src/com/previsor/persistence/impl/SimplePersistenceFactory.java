package com.previsor.persistence.impl;

import com.previsor.persistence.CuentaDao;
import com.previsor.persistence.PersistenceFactory;

public class SimplePersistenceFactory implements PersistenceFactory {

	@Override
	public CuentaDao createCuentaDao() {
		
		return new CuentaMyBatisDao();
	}

}
