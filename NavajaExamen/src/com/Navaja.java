package com;

public class Navaja {
	private double filo;
	private double tamano;
	
	public Navaja() {
		filo = 17;
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
	public void partir() {
		System.out.println("Sirvo más para partir con un filo de "+filo);
	}

}
