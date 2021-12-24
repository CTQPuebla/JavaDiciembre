package com;

public class Medico extends Profesionista{

	@Override //indica sobreescritura
	public void trabajar() {
		System.out.println("Realiza cirugias");
		System.out.println("Consulta pacientes");
		
	}

}
