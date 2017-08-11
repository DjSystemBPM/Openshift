package com.multiva.model.response.pojo;

import java.util.List;

public class DatosBasicosRespose {

	private long numCliente;
	private String nombre;
	private List<ListaDirecciones> listaDirecciones;
	private String rfc;
	private List<ListaTelefonos> listaTelefonos;
	private List<ListaEmails> listaEmails;
	private String tipoPersona;
	private String estatus;
	private String sucursal;
	private String vip;
	private String responseStatus;
	private String responseError;

	public DatosBasicosRespose() {
		super();
	}

	public DatosBasicosRespose(long numCliente, String nombre, List<ListaDirecciones> listaDirecciones, String rfc,
			List<ListaTelefonos> listaTelefonos, List<ListaEmails> listaEmails, String tipoPersona, String estatus,
			String sucursal, String vip, String responseStatus, String responseError) {
		super();
		this.numCliente = numCliente;
		this.nombre = nombre;
		this.listaDirecciones = listaDirecciones;
		this.rfc = rfc;
		this.listaTelefonos = listaTelefonos;
		this.listaEmails = listaEmails;
		this.tipoPersona = tipoPersona;
		this.estatus = estatus;
		this.sucursal = sucursal;
		this.vip = vip;
		this.responseStatus = responseStatus;
		this.responseError = responseError;
	}

	@Override
	public String toString() {
		return "DatosClienteRespose [numCliente=" + numCliente + ", nombre=" + nombre + ", listaDirecciones="
				+ listaDirecciones + ", rfc=" + rfc + ", listaTelefonos=" + listaTelefonos + ", listaEmails="
				+ listaEmails + ", tipoPersona=" + tipoPersona + ", estatus=" + estatus + ", sucursal=" + sucursal
				+ ", vip=" + vip + ", responseStatus=" + responseStatus + ", responseError=" + responseError + "]";
	}

	public long getNumCliente() {
		return numCliente;
	}

	public void setNumCliente(long numCliente) {
		this.numCliente = numCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<ListaDirecciones> getListaDirecciones() {
		return listaDirecciones;
	}

	public void setListaDirecciones(List<ListaDirecciones> listaDirecciones) {
		this.listaDirecciones = listaDirecciones;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public List<ListaTelefonos> getListaTelefonos() {
		return listaTelefonos;
	}

	public void setListaTelefonos(List<ListaTelefonos> listaTelefonos) {
		this.listaTelefonos = listaTelefonos;
	}

	public List<ListaEmails> getListaEmails() {
		return listaEmails;
	}

	public void setListaEmails(List<ListaEmails> listaEmails) {
		this.listaEmails = listaEmails;
	}

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public String getVip() {
		return vip;
	}

	public void setVip(String vip) {
		this.vip = vip;
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

}
