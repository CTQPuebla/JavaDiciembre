package com;

public abstract class Navaja {
	String Color, material;
	double peso, ancho, largo;
	double precio;
	
	public Navaja() {
		
	}

	public Navaja(String color, String material, double peso, double ancho, double largo, double precio) {
		super();
		Color = color;
		this.material = material;
		this.peso = peso;
		this.ancho = ancho;
		this.largo = largo;
		this.precio = precio;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Navaja [Color=" + Color + ", material=" + material + ", peso=" + peso + ", ancho=" + ancho + ", largo="
				+ largo + ", precio=" + precio + "]";
	}
	
	
	
}
