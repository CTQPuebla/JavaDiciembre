package com;

public class Celular {

	private String marca;
	private String modelo;
	private Double precio;
	private int ram;
	private int memoria;
	
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
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public Celular(String marca, String modelo, Double precio, int ram, int memoria) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.ram = ram;
		this.memoria = memoria;
	}
	
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", ram=" + ram + ", memoria="
				+ memoria + "]";
	}
}
