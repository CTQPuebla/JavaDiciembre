package com;

public class Principal {
	
	public static void main(String[] args) {
		Medico m = new  Medico();
		m.setTitulo("Medico Cirujano");
		m.setCarrera("Medicina");
		m.trabajar();
		
		Arquitecto ar = new Arquitecto();
		ar.setTitulo("Lic Arquitectura");
		ar.setCarrera("Arquitectura");
		ar.trabajar();
		
	}

}
