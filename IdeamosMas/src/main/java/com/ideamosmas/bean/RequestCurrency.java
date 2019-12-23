package com.ideamosmas.bean;

import java.io.Serializable;

public class RequestCurrency implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6802745629823269573L;
	
	String countryName;
	Double amount;
	
	public RequestCurrency() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RequestCurrency(String countryName, Double amount) {
		super();
		this.countryName = countryName;
		this.amount = amount;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	
	
}
