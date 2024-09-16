package com;

public class Celular {

	String marca;
	String color;
	int modelo;
	
	public Celular() {

	}

	public Celular(String marca, String color, int modelo) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", color=" + color + ", modelo=" + modelo + "]";
	}
	
	
	
	
	
}
