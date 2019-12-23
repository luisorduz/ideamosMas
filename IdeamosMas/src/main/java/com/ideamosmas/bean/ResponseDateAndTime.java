package com.ideamosmas.bean;

import java.io.Serializable;

public class ResponseDateAndTime implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3917783650744507871L;
	
	String nombreDia;
	String fecha;
	String mensaje;

	
	public ResponseDateAndTime() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ResponseDateAndTime(String nombreDia, String fecha, String mensaje) {
		super();
		this.nombreDia = nombreDia;
		this.fecha = fecha;
		this.mensaje = mensaje;
	}


	public String getNombreDia() {
		return nombreDia;
	}


	public void setNombreDia(String nombreDia) {
		this.nombreDia = nombreDia;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	

}
