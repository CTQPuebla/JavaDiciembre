package com;

public class DestapaCorcho {
	private double tamano;
	
	public DestapaCorcho() {
		tamano = 3;
	}
	
	public void destapar() {
		System.out.println("Destapo corchos");
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}
}
