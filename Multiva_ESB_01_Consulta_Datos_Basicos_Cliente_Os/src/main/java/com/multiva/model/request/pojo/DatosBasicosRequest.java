package com.multiva.model.request.pojo;

public class DatosBasicosRequest {

	private long idPersona;
	private Ticket ticket;
	private String canal;

	public DatosBasicosRequest() {
		super();
	}

	public DatosBasicosRequest(long idPersona, Ticket ticket, String canal) {
		super();
		this.idPersona = idPersona;
		this.ticket = ticket;
		this.canal = canal;
	}

	@Override
	public String toString() {
		return "Cliente [idPersona=" + idPersona + ", ticket=" + ticket + ", canal=" + canal + "]";
	}

	public long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(long idPersona) {
		this.idPersona = idPersona;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

}
