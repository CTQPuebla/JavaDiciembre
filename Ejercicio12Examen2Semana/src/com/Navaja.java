package com;

public class Navaja implements HerramientasBasicas{

	String color, marca, modelo;

	public Navaja() {
		
	}
	
	public Navaja(String color, String marca, String modelo) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
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

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Navaja [color=" + color + ", marca=" + marca + ", modelo=" + modelo + "]";
	}

	@Override
	public void hojadecortar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destornillador() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tijeras() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destapador() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void regla() {
		// TODO Auto-generated method stub
		
	}

	
	
}
