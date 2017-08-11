package com.multiva.model.response.pojo;

public class HoraServidorResponse {

	private String horaServidor;
	private String responseStatus;
	private String responseError;

	public HoraServidorResponse() {
		super();
	}

	public HoraServidorResponse(String horaServidor, String responseStatus, String responseError) {
		super();
		this.horaServidor = horaServidor;
		this.responseStatus = responseStatus;
		this.responseError = responseError;
	}

	public String getHoraServidor() {
		return horaServidor;
	}

	public void setHoraServidor(String horaServidor) {
		this.horaServidor = horaServidor;
	}

	public String getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}

	public String getResponseError() {
		return responseError;
	}

	public void setResponseError(String responseError) {
		this.responseError = responseError;
	}

	@Override
	public String toString() {
		return "HoraServidorResponse [horaServidor=" + horaServidor + ", responseStatus=" + responseStatus
				+ ", responseError=" + responseError + "]";
	}

}
