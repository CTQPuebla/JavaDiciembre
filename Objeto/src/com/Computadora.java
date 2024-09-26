package com;

public class Computadora {
	/*
	 * Marca
	 * Modelo
	 * Procesador
	 * RAM
	 * Material
	 * Tamaño
	 * #puertos USb
	 * 
	 * 
	 */
	
	private String marca;
	private String modelo;
	private String Procesador;
	private double ram;
	private String material;
	private String tamaño;
	private int puertos;
	
	
	//constructor vacío 
	public Computadora() {
		
	}


	public Computadora(String marca, String modelo, String procesador, double ram, String material, String tamaño,
			int puertos) {
		this.marca = marca;
		this.modelo = modelo;
		Procesador = procesador;
		this.ram = ram;
		this.material = material;
		this.tamaño = tamaño;
		this.puertos = puertos;
	}
	
	//setter (darle valor a los atributos de clase)
	public void setMarca(String m) {
		this.marca = m;
	}
	
	//getter (recuperar los valores de los atributos de clase)
	public String getMarca() {
		
		return marca;
	}

	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getProcesador() {
		return Procesador;
	}


	public void setProcesador(String procesador) {
		Procesador = procesador;
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

	//toString
	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", modelo=" + modelo + ", Procesador=" + Procesador + ", ram=" + ram
				+ ", material=" + material + ", tamaño=" + tamaño + ", puertos=" + puertos + "]";
	}
	
	//comportamiento
	public void reproducirMusica() {
		System.out.println("reproduciendo YouTube");
	}
	
	
	
	
	
	
	
}
