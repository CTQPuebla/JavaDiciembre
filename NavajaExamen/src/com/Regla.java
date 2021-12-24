package com;

public class Regla {
	private double tamano;
	
	public Regla() {
		
	}
	public void medir() {
		System.out.println("Mido en centimetros y pulgadas");
	}
	public double getTamano() {
		return tamano;
	}
	public void setTamano(double tamano) {
		this.tamano = tamano;
	}
}
