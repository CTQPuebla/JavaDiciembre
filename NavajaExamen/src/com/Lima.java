package com;

public class Lima {
	private double tamano;
	private double aspereza;
	
	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

	public double getAspereza() {
		return aspereza;
	}

	public void setAspereza(double aspereza) {
		this.aspereza = aspereza;
	}

	public Lima() {
		tamano = 5;
		aspereza = 10;
	}
	
	public void limar() {
		System.out.println("Limo con aspereza de: "+aspereza);
	}
}
