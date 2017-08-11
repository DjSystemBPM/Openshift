package com.multiva.model.request;

public class Cliente {
	
	private String numeroCliente;

	public Cliente() {
		super();
	}

	public Cliente(String numeroCliente) {
		super();
		this.numeroCliente = numeroCliente;
	}

	public String getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	@Override
	public String toString() {
		return "Cliente [numeroCliente=" + numeroCliente + "]";
	}
	
	

}
