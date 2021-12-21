package com;

public class Celulares {
	private String marca;
	private String modelo;
	
	public void modeloStr(int modelo) {
		switch(modelo) {
		case 0: this.modelo = "2RAM Camara8M"; break; case 1: this.modelo="2RAM Camara8M"; break;
		case 2: this.modelo = "4RAM Camara12M"; break; case 3: this.modelo="4RAM Camara16M"; break;
		case 4: this.modelo = "8RAM Camara20"; break; case 5: this.modelo="8RAM Camara 25M"; break;
		}
	}
	
	public static String getModeloStr(int modelo){
		switch(modelo) {
		case 0: return "2RAM Camara8M"; 
		case 1: return "2RAM Camara8M";
		case 2: return "4RAM Camara12M"; 
		case 3: return "4RAM Camara16M"; 
		case 4: return "8RAM Camara20"; 
		case 5: return "8RAM Camara 25M"; 
		default: return "2RAM Camara8M";
		}
	}
	
	@Override
	public String toString() {
		return "[marca=" + marca + ", modelo=" + modelo + "]";
	}

	public Celulares() {
		
	}
	
	public Celulares(String marca, int modelo) {
		this.marca = marca;
		modeloStr(modelo);
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		modeloStr(modelo);
	}
	
}
