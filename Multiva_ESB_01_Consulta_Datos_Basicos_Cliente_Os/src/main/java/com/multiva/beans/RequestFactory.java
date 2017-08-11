package com.multiva.beans;

import org.apache.camel.Exchange;

import com.multiva.model.request.pojo.DatosBasicosRequest;


/**
 * 
 * @author Alfredo Cuevas
 * @version 1.0.0
 * @category Request Factory Red Hat JBoss Fuse
 * @since 2017/03/14
 * 
 */
public class RequestFactory {


	public DatosBasicosRequest saveBodyOnProps(Exchange message) {

		// Se obtiene mensaje de entrada
		DatosBasicosRequest datosBasicos = (DatosBasicosRequest) message.getIn().getBody();

		message.setProperty("datosBasicos", datosBasicos);

		return datosBasicos;
	}

	public DatosBasicosRequest restoreRequest(Exchange message) {

		// Se obtiene mensaje de entrada
		DatosBasicosRequest datosBasicos = (DatosBasicosRequest) message
				.getProperty("datosBasicos");

		return datosBasicos;
	}

}

