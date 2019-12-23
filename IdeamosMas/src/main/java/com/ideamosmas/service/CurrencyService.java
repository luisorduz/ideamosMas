package com.ideamosmas.service;

import com.ideamosmas.bean.RequestCurrency;
import com.ideamosmas.bean.ResponseCurrency;

public interface CurrencyService {
	
	ResponseCurrency getCurrency(RequestCurrency requestCurrency);

}
