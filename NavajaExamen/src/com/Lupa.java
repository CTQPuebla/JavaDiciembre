package com;

public class Lupa {
	public double aumento;
	
	public Lupa() {
		aumento = 22;
	}
	
	public void ver() {
		System.out.println("Puedo ver con un aumento de "+ aumento);
	}

	public double getAumento() {
		return aumento;
	}

	public void setAumento(double aumento) {
		this.aumento = aumento;
	}
}
