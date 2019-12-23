package com.ideamosmas.bean;

import java.io.Serializable;

public class ResponseCurrency implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8190267729572965299L;
	
	String currency;
	String countryName;
	String mensaje;
	
	public ResponseCurrency() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ResponseCurrency(String currency, String countryName, String mensaje) {
		super();
		this.currency = currency;
		this.countryName = countryName;
		this.mensaje = mensaje;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	

}
