package com;

public class SelecciondeFutbol {
	
	protected int id;
	protected String nombre;
	protected int edad;
	
	
	public SelecciondeFutbol() {
		
	}

	public SelecciondeFutbol(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "SelecciondeFutbol [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
		

}
