package com.multiva.model.response.pojo;

public class ListaEmails {
	private String mail;
	private boolean activo;
	private String tipoEmail;

	public ListaEmails() {
		super();
	}

	public ListaEmails(String mail, boolean activo, String tipoEmail) {
		super();
		this.mail = mail;
		this.activo = activo;
		this.tipoEmail = tipoEmail;
	}

	@Override
	public String toString() {
		return "ListaEmails [mail=" + mail + ", activo=" + activo + ", tipoEmail=" + tipoEmail + "]";
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String getTipoEmail() {
		return tipoEmail;
	}

	public void setTipoEmail(String tipoEmail) {
		this.tipoEmail = tipoEmail;
	}

}
