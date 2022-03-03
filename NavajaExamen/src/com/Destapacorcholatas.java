package com;

public class Destapacorcholatas {

	private double tamano;
	
	public Destapacorcholatas(){
		tamano = 20;
	}
	
	public void destapar() {
		System.out.println("Destapo corcholatas");
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}
}
