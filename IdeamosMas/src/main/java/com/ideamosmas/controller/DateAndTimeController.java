package com.ideamosmas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ideamosmas.bean.RequestDateAndTime;
import com.ideamosmas.bean.ResponseDateAndTime;
import com.ideamosmas.service.DateAndTimeService;

@RestController
@RequestMapping("/v1")
public class DateAndTimeController {

		@Autowired
		private DateAndTimeService _dateAndTimeService;
		
		@RequestMapping(value = "/getDateAndTime", method = RequestMethod.POST, headers = "Accept=application/json")
	    public ResponseEntity<ResponseDateAndTime> getDateAndTime(@RequestBody RequestDateAndTime dateAndTime, UriComponentsBuilder ucBuilder) {
			 
			ResponseDateAndTime response = new ResponseDateAndTime();
			HttpStatus httpStatus = null;
			try {
				 response =  _dateAndTimeService.getNameDate(dateAndTime.getDate());
				 httpStatus = HttpStatus.OK;
			 }catch (Exception e) {
				 response.setMensaje("Hubo un error..."+" cause : "+e.getCause());
				 httpStatus = HttpStatus.CONFLICT;
			 }
			
			return new ResponseEntity<ResponseDateAndTime>(response, httpStatus);
	    }
}
