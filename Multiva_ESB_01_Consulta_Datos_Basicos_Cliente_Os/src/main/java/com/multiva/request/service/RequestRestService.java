package com.multiva.request.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.multiva.model.request.pojo.DatosBasicosRequest;

@Path("/")
public interface RequestRestService {

	@POST
	@Path(value = "/cliente")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response process(DatosBasicosRequest datosBasicos);

}
