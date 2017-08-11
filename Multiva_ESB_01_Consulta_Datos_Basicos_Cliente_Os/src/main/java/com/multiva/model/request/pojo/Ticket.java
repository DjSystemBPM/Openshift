package com.multiva.model.request.pojo;

public class Ticket {

	private String id_user;
	private String id_creds;

	public Ticket() {
		super();
	}

	public Ticket(String id_user, String id_creds) {
		super();
		this.id_user = id_user;
		this.id_creds = id_creds;
	}

	@Override
	public String toString() {
		return "Ticket [id_user=" + id_user + ", id_creds=" + id_creds + "]";
	}

	public String getId_user() {
		return id_user;
	}

	public void setId_user(String id_user) {
		this.id_user = id_user;
	}

	public String getId_creds() {
		return id_creds;
	}

	public void setId_creds(String id_creds) {
		this.id_creds = id_creds;
	}

}
