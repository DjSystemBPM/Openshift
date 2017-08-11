/**
 * 
 */
package com.multiva.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.multiva.model.response.pojo.HoraServidorResponse;

/**
 * @author acuevas
 *
 */
public class ClienteResponseProcessor implements Processor{
	
	@Override
	public void process(Exchange exchange) throws Exception {
		
		HoraServidorResponse horaServidorResponse = new HoraServidorResponse();
		
		horaServidorResponse.setHoraServidor("18:24:30");
		horaServidorResponse.setResponseStatus("200");
		horaServidorResponse.setResponseError("");
		
		exchange.getOut().setBody(horaServidorResponse);
		
	}}
