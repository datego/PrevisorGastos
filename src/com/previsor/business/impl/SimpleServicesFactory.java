package com.previsor.business.impl;

import com.previsor.business.CuentaService;
import com.previsor.business.ServicesFactory;
import com.previsor.business.impl.SimpleCuentaService;

public class SimpleServicesFactory implements ServicesFactory {

	@Override
	public CuentaService createCuentaService() {
		
		return new SimpleCuentaService();
	}

}
