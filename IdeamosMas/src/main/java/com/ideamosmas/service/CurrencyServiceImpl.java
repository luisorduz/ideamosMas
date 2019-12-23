package com.ideamosmas.service;

import java.text.NumberFormat;
import java.util.Locale;

import org.springframework.stereotype.Service;

import com.ideamosmas.bean.RequestCurrency;
import com.ideamosmas.bean.ResponseCurrency;

@Service("currencyService")
public class CurrencyServiceImpl implements CurrencyService{

	@Override
	public ResponseCurrency getCurrency(RequestCurrency requestCurrency) {
		
		ResponseCurrency response = new ResponseCurrency();
		/*Plus*/
			/*obtenemos el valor ingresado*/
			double amount = requestCurrency.getAmount();
			/*crea un local dinamico */
			Locale locale = new Locale("en", requestCurrency.getCountryName());   
			NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
			String currency = currencyFormatter.format(amount);
			/*registramos el nombre del local y la moneda con formato en la respuesta*/
			response.setCountryName(locale.getCountry());
			response.setCurrency(currency);
		/*Plus*/
		
		/*Solucion a Ejercicio	*/
			/*Creamos un local personalizado para la India*/
		    Locale indiaLocale = new Locale("en", "IN");
		    /* Creamos los NumberFormats usando Local */
		    NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
		    NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
		    NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
		    NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		      
		    String mensaje = "US: "     + us.format(amount)+
		    		  			" - India: "  + india.format(amount)+
		    		  			" - China: "  + china.format(amount)+
		    		  			" - France: " + france.format(amount);
		      
		    response.setMensaje(mensaje);
		 /*Solucion a Ejercicio	*/

		return response;
	}
}
