package com;

public class Cpu {
	String marca;
	String modelo;
	String procesador;
	int ram;
	String material;
	String tamanio;
	int puertos;
	
	public Cpu(){
		
	}

	public Cpu(String marca, String modelo, String procesador, int ram, String material, String tamanio, int puertos) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.ram = ram;
		this.material = material;
		this.tamanio = tamanio;
		this.puertos = puertos;
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

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public int getPuertos() {
		return puertos;
	}

	public void setPuertos(int puertos) {
		this.puertos = puertos;
	}

	@Override
	public String toString() {
		return "Cpu [marca=" + marca + ", modelo=" + modelo + ", procesador=" + procesador + ", ram=" + ram
				+ ", material=" + material + ", tamanio=" + tamanio + ", puertos=" + puertos + "]";
	}
	
	
}
