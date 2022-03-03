package com;

public class Pinza {
	private double tamano;
	private double resistencia;
	
	public Pinza() {
		tamano = 4;
		resistencia = 80;
	}
	
	public void apretar() {
		System.out.println("Sirvo para apretar cosas, mido "+tamano+" cm.");
	}
	
	public void sujetar() {
		System.out.println("Sujeto cosas con una resistencia de: "+ resistencia);
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}
}
