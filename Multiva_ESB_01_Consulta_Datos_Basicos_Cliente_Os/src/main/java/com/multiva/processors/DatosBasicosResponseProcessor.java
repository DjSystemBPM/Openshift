package com.multiva.processors;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

import com.multiva.model.response.pojo.DatosBasicosRespose;
import com.multiva.model.response.pojo.ListaDirecciones;
import com.multiva.model.response.pojo.ListaEmails;
import com.multiva.model.response.pojo.ListaTelefonos;
import com.multiva.ws.client.BMVTWSEINFOGRALCLIENTEType;
import com.multiva.ws.client.WSCUSEGETINFOCUSTOMERResponse;

public class DatosBasicosResponseProcessor implements Processor {

	private static final Logger LOGGER = Logger.getLogger(DatosBasicosResponseProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {

		WSCUSEGETINFOCUSTOMERResponse respuestaT24 = exchange.getIn().getBody(WSCUSEGETINFOCUSTOMERResponse.class);

		DatosBasicosRespose datos = new DatosBasicosRespose();

		for (BMVTWSEINFOGRALCLIENTEType primerLoop : respuestaT24.getBMVTWSEINFOGRALCLIENTEType()) {
			for (BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType segundoLoop : primerLoop
					.getGBMVTWSEINFOGRALCLIENTEDetailType().getMBMVTWSEINFOGRALCLIENTEDetailType()) {

				LOGGER.info("respuesta " + respuestaT24);

				long numCliente = Long.parseLong(segundoLoop.getNoCliente().getValue());
				datos.setNumCliente(numCliente);
				datos.setNombre(segundoLoop.getNombre().getValue());

				List<ListaDirecciones> direcciones = new ArrayList<ListaDirecciones>();
				ListaDirecciones listaDirecciones = new ListaDirecciones();
				String direccion = "CALLE: " + segundoLoop.getCalle().getValue() + " NUMERO EXTERIOR: "
						+ segundoLoop.getNumExterior().getValue() + " NUMERO INTERIOR: "
						+ segundoLoop.getNumInterior().getValue() + " COLONIA: "
						+ segundoLoop.getNumInterior().getValue();
				listaDirecciones.setDireccion(direccion);
				listaDirecciones.setPoblacion(segundoLoop.getMunicipio().getValue());
				listaDirecciones.setCiudad(segundoLoop.getCiudad().getValue());
				listaDirecciones.setEstado(segundoLoop.getEstado().getValue());
				listaDirecciones.setCp(segundoLoop.getCodigoPostal().getValue());
				listaDirecciones.setTipoDireccion("TIPO DIRECCION");
				direcciones.add(listaDirecciones);
				datos.setListaDirecciones(direcciones);

				datos.setRfc(segundoLoop.getRFC().getValue());

				List<ListaTelefonos> telefonos = new ArrayList<ListaTelefonos>();

				int cvePaisDomicilio = Integer
						.parseInt(substringCadena(segundoLoop.getCvePaisTelDomicilio().getValue()));
				int codAreaDomicilio = Integer
						.parseInt(substringCadena(segundoLoop.getCodAreaTelDomicilio().getValue()));
				long telDomicilio = Long.parseLong(substringCadena(segundoLoop.getTelDomicilio().getValue()));

				telefonos.add(new ListaTelefonos(cvePaisDomicilio, codAreaDomicilio, telDomicilio, "DOMICILIO"));

				int cvePaisCelular = Integer.parseInt(substringCadena(segundoLoop.getCvePaisTelCelular().getValue()));
				int codAreaCelular = Integer.parseInt(substringCadena(segundoLoop.getCodAreaTelCelular().getValue()));
				long telCelular = Long.parseLong(substringCadena(segundoLoop.getTelCelular().getValue()));

				telefonos.add(new ListaTelefonos(cvePaisCelular, codAreaCelular, telCelular, "CELULAR"));

				int cvePaisOficina = Integer.parseInt(substringCadena(segundoLoop.getCvePaisTelOficina().getValue()));
				int codAreaOficina = Integer.parseInt(substringCadena(segundoLoop.getCodAreaTelOficina().getValue()));
				long telOficina = Long.parseLong(substringCadena(segundoLoop.getTelOficina().getValue()));

				telefonos.add(new ListaTelefonos(cvePaisOficina, codAreaOficina, telOficina, "OFICINA"));

				datos.setListaTelefonos(telefonos);

				List<ListaEmails> emails = new ArrayList<ListaEmails>();
				emails.add(new ListaEmails(segundoLoop.getEmail().getValue(), true, "PERSONAL"));
				datos.setListaEmails(emails);

				datos.setTipoPersona(segundoLoop.getTipoPersona().getValue());
				datos.setEstatus("CLIENTE");
				datos.setSucursal(segundoLoop.getSucursal().getValue());
				datos.setVip(segundoLoop.getVIP().getValue());
				datos.setResponseStatus("200");
				datos.setResponseError("");
			}
		}

		exchange.getOut().setHeader("Content-Type", "application/json");
		exchange.getOut().setHeader(Exchange.HTTP_METHOD, "POST");
		exchange.getOut().setBody(datos);
	}

	public String substringCadena(String cadena) {

		try {
			String cadenaSustraida = cadena.substring(0, cadena.indexOf("|"));
			return cadenaSustraida;
		} catch (Exception e) {
			return "0";
		}

	}

}