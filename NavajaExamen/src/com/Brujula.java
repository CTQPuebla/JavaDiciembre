package com;

public class Brujula {
	private double tamano;
	
	public Brujula() {
		tamano = 5;
	}
	
	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

	public void guiar() {
		System.out.println("Puedo servir para guiar");
	}
}
