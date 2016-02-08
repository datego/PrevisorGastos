package com.previsor.presentation;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.previsor.model.Cuenta;

@ManagedBean(name = "BeanCuenta")
@SessionScoped
public class BeanCuenta implements Serializable {

	private static final long serialVersionUID = 1L;

	private Cuenta cuenta= new Cuenta();

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
}
