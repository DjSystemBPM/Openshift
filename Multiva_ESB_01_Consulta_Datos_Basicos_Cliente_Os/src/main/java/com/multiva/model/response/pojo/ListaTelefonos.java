package com.multiva.model.response.pojo;

public class ListaTelefonos {
	private int cvePais;
	private int codArea;
	private long telefono;
	private String tipoTelefono;

	public ListaTelefonos() {
		super();
	}

	public ListaTelefonos(int cvePais, int codArea, long telefono, String tipoTelefono) {
		super();
		this.cvePais = cvePais;
		this.codArea = codArea;
		this.telefono = telefono;
		this.tipoTelefono = tipoTelefono;
	}

	@Override
	public String toString() {
		return "ListaTelefonos [cvePais=" + cvePais + ", codArea=" + codArea + ", telefono=" + telefono
				+ ", tipoTelefono=" + tipoTelefono + "]";
	}

	public int getCvePais() {
		return cvePais;
	}

	public void setCvePais(int cvePais) {
		this.cvePais = cvePais;
	}

	public int getCodArea() {
		return codArea;
	}

	public void setCodArea(int codArea) {
		this.codArea = codArea;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getTipoTelefono() {
		return tipoTelefono;
	}

	public void setTipoTelefono(String tipoTelefono) {
		this.tipoTelefono = tipoTelefono;
	}

}
