package com;

public class Victorinox extends Navaja implements Componentes {

	public Victorinox() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Object componentes() {
		Navaja na = new Victorinox();
		na.setColor("Color");
		na.setMaterial("Sintético");
		na.setPeso(4.1);//onzas
		na.setAncho(2); //cm
		na.setLargo(8.4);//cm
		na.setPrecio(1995.0);//pesos
		
		boolean navaja = true;
		boolean desatornillador = true;
		boolean tijeras = true;
		boolean abreBotellas = true;
		boolean pinzas = true;
		System.out.println("\n" + "---------------------Victorinox--------------------" + "\n");
		System.out.println(na);
		System.out.println("Victorinox: " + navaja + " Desartonillador: " + desatornillador + " Tijeras: " + tijeras + 
				
				" Destapador de botella: " + abreBotellas + "Pinzas: " + pinzas);
		return 0;
	}
	
	
}
