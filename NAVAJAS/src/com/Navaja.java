package com;

public abstract class Navaja {
	
	String nombre, color, marca;
	double tamano, precio;
	
	public Navaja() {}
	
	//CONSTRUCTOR
	public Navaja(String nombre, String color, String marca, double tamano, double precio) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.marca = marca;
		this.tamano = tamano;
		this.precio = precio;
	}
	
	//GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getTamano() {
		return tamano;
	}
	public void setTamano(double tamano) {
		this.tamano = tamano;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	// PARA MOSTRAR LOS RESULTADOS EN PANTALLA PRINCIPAL
		@Override
		public String toString() {
			return "Navaja [nombre=" + nombre + ", color=" + color + ", marca=" + marca + ", tamano=" + tamano + ", precio="
					+ precio + "]";
		}
}
