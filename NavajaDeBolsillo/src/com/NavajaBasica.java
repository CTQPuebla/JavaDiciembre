package com;

import java.util.Scanner;

public class NavajaBasica extends Navaja implements Componentes {

	Scanner scanner = new Scanner(System.in);
	public NavajaBasica() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Object componentes() {
		// TODO Auto-generated method stub
		System.out.println("\n" + "------Opción ingresa valores de navaja básica------");
		System.out.println("Ingrese color: ");
		String color = scanner.next(); scanner.nextLine();
		System.out.println("Ingrese material: ");
		String material = scanner.next(); scanner.nextLine();
		System.out.println("Ingrese peso: ");
		double peso = scanner.nextDouble();
		System.out.println("Ingrese ancho: ");
		double ancho = scanner.nextDouble();
		System.out.println("Ingrese alto: ");
		double alto = scanner.nextDouble();
		System.out.println("Ingrese Precio: ");
		double precio = scanner.nextDouble();
		
		
		
		NavajaBasica a = new NavajaBasica();
		a.setColor(color);
		a.setMaterial(material);
		a.setPeso(peso);
		a.setLargo(alto);
		a.setAncho(ancho);
		a.setPrecio(precio);
		
		
		boolean navaja = true;
		boolean desatornillador = false;
		boolean tijeras = false;
		boolean abreBotellas = false;
		boolean pinzas = false;
		
		System.out.println("\n" + "-------------Navaja básica---------------" + "\n");
		System.out.println(a);
		System.out.println("Navaja básica: " + navaja + " Desartonillador: " + desatornillador + " Tijeras: " + tijeras + 
				
				" Destapador de botella: " + abreBotellas + " Pinzas: " + pinzas);
		return null;
	}
	
	

}
