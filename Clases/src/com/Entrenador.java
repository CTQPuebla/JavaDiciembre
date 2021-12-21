package com;

public class Entrenador extends SelecciondeFutbol{

	private String idFederacion;

	public Entrenador() {
	}

	public Entrenador(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	@Override
	public String toString() {
		return "Entrenador [idFederacion=" + idFederacion + ", id=" + id + ", nombre=" + nombre + ", edad=" + edad
				+ "]";
	}


	
	
	
}
