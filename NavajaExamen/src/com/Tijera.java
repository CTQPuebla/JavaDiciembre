package com;

public class Tijera {
	private double filo;
	private double tamano;
	
	public Tijera() {
		filo = 10.0;
	}

	public double getFilo() {
		return filo;
	}

	public void setFilo(double filo) {
		this.filo = filo;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}
	
	public void cortar() {
		System.out.println("Filo de "+ filo+" corto minimo una hoja de papel");
	};
}
