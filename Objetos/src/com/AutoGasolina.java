package com;

public class AutoGasolina {
	
	static final String COMBUSTIBLE = "Gasolina";
	
	int llantas;
	String motor;
	double largo;
	double ancho;
	double alto;
	int asientos;
	String marca ;
	String modelo;
	String color;
	boolean estandar;
	
	public AutoGasolina () {
		
	}

	public AutoGasolina(int llantas, String motor, double largo, double ancho, double alto, int asientos, String marca,
			String modelo, String color, boolean estandar) {
		super();
		this.llantas = llantas;
		this.motor = motor;
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
		this.asientos = asientos;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.estandar = estandar;
	}

	public int getLlantas() {
		return llantas;
	}

	public void setLlantas(int llantas) {
		this.llantas = llantas;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isEstandar() {
		return estandar;
	}

	public void setEstandar(boolean estandar) {
		this.estandar = estandar;
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static String getCombustible() {
		return COMBUSTIBLE;
	}

	@Override
	public String toString() {
		return "AutoGasolina [llantas=" + llantas + ", motor=" + motor + ", largo=" + largo + ", ancho=" + ancho
				+ ", alto=" + alto + ", asientos=" + asientos + ", marca=" + marca + ", modelo=" + modelo + ", color="
				+ color + ", estandar=" + estandar + "]";
	}
	
	
    
}
