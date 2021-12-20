package com;

public class Computadora {

	String marca;
	String modelo;
	String procesador;
	double ram;
	String material;
	String tamaño;
	int puertos;
	
	//Ka herencia es un principio por el cual se concreta ay especializa la sintesis
	//la sisntesis de una clase en otra, habiliatando el acceso y absorcion de los miembros de una clase hacia otra
	
	public Computadora() {
		
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

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public double getRam() {
		return ram;
	}

	public void setRam(double ram) {
		this.ram = ram;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public int getPuertos() {
		return puertos;
	}

	public void setPuertos(int puertos) {
		this.puertos = puertos;
	}
	
	
}
