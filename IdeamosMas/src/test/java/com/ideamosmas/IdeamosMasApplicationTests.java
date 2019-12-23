package com.ideamosmas;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.ideamosmas.bean.RequestCurrency;
import com.ideamosmas.bean.RequestDateAndTime;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class IdeamosMasApplicationTests {

	@LocalServerPort
    int randomServerPort;
   
    @Test
    public void testGetCurrency() throws URISyntaxException 
    {
        RestTemplate restTemplate = new RestTemplate();
        final String baseUrl = "http://localhost:"+randomServerPort+"/v1/getCurrency";
        URI uri = new URI(baseUrl);
        RequestCurrency requestCurrency = new RequestCurrency("US", 123.21);
         
        HttpHeaders headers = new HttpHeaders();
     
        HttpEntity<RequestCurrency> request = new HttpEntity<>(requestCurrency, headers);
         
        try
        {
        	ResponseEntity<String> result =  restTemplate.postForEntity(uri, request, String.class);
           //Verify request succeed
            Assert.assertEquals(200, result.getStatusCodeValue());
            Assert.assertEquals(true, result.getBody().contains("currency"));
        }
        catch(HttpClientErrorException ex) 
        {
            //Verify bad request and missing header
            Assert.assertEquals(400, ex.getRawStatusCode());
            Assert.assertEquals(true, ex.getResponseBodyAsString().contains("Missing request header"));
        }
    }
    
    @Test
    public void testDateAndTime() throws URISyntaxException 
    {
        RestTemplate restTemplate = new RestTemplate();
        final String baseUrl = "http://localhost:"+randomServerPort+"/v1/getDateAndTime";
        URI uri = new URI(baseUrl);
        
        RequestDateAndTime requestDateAndTime = new RequestDateAndTime("17 09 1991");
         
        HttpHeaders headers = new HttpHeaders();
     
        HttpEntity<RequestDateAndTime> request = new HttpEntity<>(requestDateAndTime, headers);
         
        try
        {
        	ResponseEntity<String> result =  restTemplate.postForEntity(uri, request, String.class);
           //Verify request succeed
            Assert.assertEquals(200, result.getStatusCodeValue());
            Assert.assertEquals(true, result.getBody().contains("nombreDia"));
        }
        catch(HttpClientErrorException ex) 
        {
            //Verify bad request and missing header
            Assert.assertEquals(400, ex.getRawStatusCode());
            Assert.assertEquals(true, ex.getResponseBodyAsString().contains("Missing request header"));
        }
    }
    
    
    

}
