package com;

public abstract class Mamifero {

	private int dientes;
	private double iq;
	
	public int getDientes() {
		return dientes;
	}
	public void setDientes(int dientes) {
		this.dientes = dientes;
	}
	public double getIq() {
		return iq;
	}
	public void setIq(double iq) {
		this.iq = iq;
	}
	
	public abstract void desplazarse();
	public abstract void comer();
}
