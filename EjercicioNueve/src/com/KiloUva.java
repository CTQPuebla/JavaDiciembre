package com;
import java.util.*;
public class KiloUva {

	public static void main(String[] args) {
		double precioInicial;
		String tipo;
		int tamano;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Asigna precio inicial");
		precioInicial = scanner.nextDouble();
		System.out.println("Asigna el tipo A o B");
		tipo = scanner.nextLine(); scanner.next();
		System.out.println("Asigna el tamaño 1 o 2");
		tamano = scanner.nextInt();
		scanner.close();
		
		if(!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B"))
				&& (tamano == 1 || tamano == 2))){
			System.out.println("NO SON CORRECTOS");
		}
		else {
			if(tipo.toUpperCase().equals("A") && tamano == 1) {
				System.out.println("El total tipo A Uno es: " + (precioInicial + 0.20));
			}
			else if(tipo.toUpperCase().equals("A") && tamano == 2) {
				System.out.println("El total tipo A Dos es: " + (precioInicial + 0.30));
			}
			else if(tipo.toUpperCase().equals("B") && tamano == 1){
				System.out.println("EL total tipo B Uno es: " + (precioInicial - 0.30));
			}
			else if(tipo.toUpperCase().equals("B") && tamano == 2) {
				System.out.println("El total tipo B Dos es: " + (precioInicial - 0.50));
			}
		}
	}
}