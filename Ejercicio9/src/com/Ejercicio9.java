package com;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		
	    int kilos, tamano;
	    double precioInicial;
	    String tipo;
	   
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Introduce los Kilos de uva: ");
	    kilos = scanner.nextInt();
	    System.out.print("Precio por Kilo inicial: ");
	    precioInicial = scanner.nextDouble();
	    System.out.print("Uva de valor A o B: ");
	    tipo = scanner.next(); scanner.nextLine();
	    System.out.print("Tipo de uva 1 o 2: ");
	    tamano = scanner.nextInt();

	    if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
	        (tamano == 1 || tamano == 2))) {
	      System.out.println("Tipos de datos incorrectos, ponga solo los mencionados.");
	    } else {
	      if (tipo.toUpperCase().equals("A") && tamano == 1) {
	        System.out.println("El total es: " + ((kilos * precioInicial)+(kilos*0.20)));
	      } else if (tipo.toUpperCase().equals("A") && tamano == 2) {
	        System.out.println("El total es: " + ((kilos*precioInicial)+(kilos*0.30)));
	      } else if (tipo.toUpperCase().equals("B") && tamano == 1) {
	        System.out.println("El total es: " + ((kilos * precioInicial)-(kilos*0.30)));
	      } else if (tipo.toUpperCase().equals("B") && tamano == 2) {
	        System.out.println("El total es: " + ((kilos*precioInicial)-(kilos*0.50)));
	      }
	    }
		
	}

}	
