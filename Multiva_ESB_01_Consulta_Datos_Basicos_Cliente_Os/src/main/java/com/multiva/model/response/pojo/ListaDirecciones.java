package com.multiva.model.response.pojo;

public class ListaDirecciones {
	private String direccion;
	private String poblacion;
	private String ciudad;
	private String estado;
	private String cp;
	private String tipoDireccion;

	public ListaDirecciones() {
		super();
	}

	public ListaDirecciones(String direccion, String poblacion, String ciudad, String estado, String cp,
			String tipoDireccion) {
		super();
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.ciudad = ciudad;
		this.estado = estado;
		this.cp = cp;
		this.tipoDireccion = tipoDireccion;
	}

	@Override
	public String toString() {
		return "ListaDirecciones [direccion=" + direccion + ", poblacion=" + poblacion + ", ciudad=" + ciudad
				+ ", estado=" + estado + ", cp=" + cp + ", tipoDireccion=" + tipoDireccion + "]";
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getTipoDireccion() {
		return tipoDireccion;
	}

	public void setTipoDireccion(String tipoDireccion) {
		this.tipoDireccion = tipoDireccion;
	}

}
