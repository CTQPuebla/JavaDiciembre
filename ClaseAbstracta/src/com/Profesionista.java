package com;

public abstract class Profesionista {
	String titulo;
	String carrera;
	public Profesionista(String titulo, String carrera) {
		super();
		this.titulo = titulo;
		this.carrera = carrera;
	}
	public Profesionista() {
		
	}
	@Override
	public String toString() {
		return "Profesionista [titulo=" + titulo + ", carrera=" + carrera + "]";
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public abstract void trabajar();
}
