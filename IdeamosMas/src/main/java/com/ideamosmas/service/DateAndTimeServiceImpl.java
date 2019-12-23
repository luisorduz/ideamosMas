package com.ideamosmas.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.ideamosmas.bean.ResponseDateAndTime;

@Service("dateAndTimeServiceImpl")
public class DateAndTimeServiceImpl implements DateAndTimeService {
	

	@Override
	public ResponseDateAndTime getNameDate(String date) {
		// TODO Auto-generated method stub
		ResponseDateAndTime response = new ResponseDateAndTime();
		String[] arrayColores = date.split(" ");
		
		int dd = Integer.parseInt(arrayColores[0]);			
		int mm = Integer.parseInt(arrayColores[1]);			
		int yy = Integer.parseInt(arrayColores[2]);			
		
		LocalDate dt = LocalDate.of(yy, mm, dd);
		String nombreDia = dt.getDayOfWeek().toString();
		
		response.setNombreDia(nombreDia);
		response.setFecha(date);
		response.setMensaje("El nombre del dia ("+dd+") del mes "+mm+" y año "+yy+" es: "+nombreDia);
		
		return response;
	}

}
