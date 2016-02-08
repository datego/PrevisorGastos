package com.previsor.business;

import java.util.List;

import com.previsor.model.Cuenta;

public interface CuentaService {
	
		List<Cuenta> getCuentas();
		
		Cuenta getCuenta(long idcuenta);
		
	    void saveCuenta(Cuenta cuenta);

	    void updateCuenta(Cuenta cuenta);
	    
	    void deleteCuenta(long idcuenta);

}
