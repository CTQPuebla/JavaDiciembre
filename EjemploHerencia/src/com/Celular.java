package com;

public class Celular {
	
	private int id;
	private String marca;
	private String modelo;
	private int largo;
	private int ancho;
	private double ram;
	private String sistemaOperativo;
	private double precio;
	
	public Celular() {
		id = 0;
		marca="";
		modelo="";
		largo=0;
		ancho=0;
		ram=0.0;
		sistemaOperativo="";
		precio=0.0;
		
	}
	
		
	

	public Celular(int id, String marca, String modelo, int largo, int ancho, double ram, String sistemaOperativo,
			double precio) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.largo = largo;
		this.ancho = ancho;
		this.ram = ram;
		this.sistemaOperativo = sistemaOperativo;
		this.precio = precio;
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
	
	

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public double getRam() {
		return ram;
	}

	public void setRam(double ram) {
		this.ram = ram;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", largo=" + largo + ", ancho=" + ancho + ", ram="
				+ ram + ", sistemaOperativo=" + sistemaOperativo + ", precio=" + precio + "]";
	}

	
	
}
