package com.ideamosmas.bean;

import java.io.Serializable;

public class RequestDateAndTime  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7286851222413664890L;
	String date;
	
	public RequestDateAndTime() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RequestDateAndTime(String date) {
		super();
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
