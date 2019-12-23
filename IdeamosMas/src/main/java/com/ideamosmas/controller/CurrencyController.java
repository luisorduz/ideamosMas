package com.ideamosmas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ideamosmas.bean.RequestCurrency;
import com.ideamosmas.bean.ResponseCurrency;
import com.ideamosmas.service.CurrencyService;

@RestController
@RequestMapping("/v1")
public class CurrencyController {
	
	@Autowired
	private CurrencyService _currencyService;
	
	@RequestMapping(value = "/getCurrency", method = RequestMethod.POST, headers = "Accept=application/json")
    public ResponseEntity<ResponseCurrency> getCurrency(@RequestBody RequestCurrency requestCurrency, UriComponentsBuilder ucBuilder) {
		 
		ResponseCurrency response = new ResponseCurrency();
		HttpStatus httpStatus = null;
		try {
			 response =  _currencyService.getCurrency(requestCurrency);
			 httpStatus = HttpStatus.OK;
		 }catch (Exception e) {
			 response.setMensaje("Hubo un error..."+" cause : "+e.getCause());
			 httpStatus = HttpStatus.CONFLICT;
		 }
		
		return new ResponseEntity<ResponseCurrency>(response, httpStatus);
    }
	
	
}