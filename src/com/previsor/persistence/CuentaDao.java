package com.previsor.persistence;

import java.util.List;

import com.previsor.model.Cuenta;

public interface CuentaDao {

	List<Cuenta> getCuentas();
	
	Cuenta getCuenta(long idCuenta);
	
	void save(Cuenta cuenta);
	
	void update(Cuenta cuenta);
	
	void delete(long idCuenta);
	
}
