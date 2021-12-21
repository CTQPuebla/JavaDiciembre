package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Medico medico = new Medico();
		medico.setTitulo("Medico");
		medico.setCarrera("Medicina");
		medico.trabajar();
		
		Arquitecto ar = new Arquitecto();
		ar.setTitulo("Arquitecto");
		ar.setCarrera("Arquitectura");
		ar.trabajar();
		
		Ballena b = new Ballena();
		Leon l = new Leon();
		
		b.setIq(15);
		l.setIq(15);
		l.setDientes(30);
		
		b.comer();
		
		b.desplazarse();
		l.desplazarse();
		l.comer();
	}

}
