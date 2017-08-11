package com.multiva.processors;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

import com.multiva.model.request.pojo.DatosBasicosRequest;
import com.multiva.ws.client.EnquiryInput;
import com.multiva.ws.client.EnquiryInputCollection;
import com.multiva.ws.client.WSCUSEGETINFOCUSTOMER;
import com.multiva.ws.client.WebRequestCommon;

public class DatosBasicosT24RequestProcessor implements Processor {

	private static final Logger LOGGER = Logger.getLogger(DatosBasicosT24RequestProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {

		DatosBasicosRequest datosBasicosRequest = exchange.getIn().getBody(DatosBasicosRequest.class);

		WSCUSEGETINFOCUSTOMER consulta = new WSCUSEGETINFOCUSTOMER();

		WebRequestCommon webRequestCommon = new WebRequestCommon();
		webRequestCommon.setPassword(datosBasicosRequest.getTicket().getId_creds());
		webRequestCommon.setUserName(datosBasicosRequest.getTicket().getId_user());

		consulta.setWebRequestCommon(webRequestCommon);

		EnquiryInput enquiryInput = new EnquiryInput();
		List<EnquiryInputCollection> listEnquiryInputCollection = new ArrayList<EnquiryInputCollection>();
		EnquiryInputCollection enquiryInputCollection = new EnquiryInputCollection();
		enquiryInputCollection.setColumnName("CUSTOMER.CODE");
		enquiryInputCollection.setCriteriaValue(String.valueOf(datosBasicosRequest.getIdPersona()));
		enquiryInputCollection.setOperand("EQ");
		listEnquiryInputCollection.add(enquiryInputCollection);
		enquiryInput.setEnquiryInputCollection(listEnquiryInputCollection);

		consulta.setBMVTWSEINFOGRALCLIENTEType(enquiryInput);

		LOGGER.info("InSoapRequest");

		exchange.getOut().setBody(consulta);

	}
}
