package com;
import java.util.*;

public class Ejercicio10 {
	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
		
		int kilos;
		double precioI;
	    String tipo;
	    int tamano;
	    
	    System.out.println("Se calculara la ganancia seg�n el tipo de vino, tama�o y cantidad vendido:");
	    System.out.print("Introduce los Kilos de uva entregada al embarque: ");
	    kilos = s.nextInt();
	    System.out.print("Tipo de uva 1 � 2: ");
	    tamano = s.nextInt();
	    System.out.print("Uva de valor A o B ");
	    tipo = s.next(); s.nextLine();
	    System.out.print("Precio por Kilo inicial: ");
	    precioI = s.nextDouble();
	    
	    if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) && (tamano == 1 || tamano == 2))) { //en caso de que el usuario inserte casos diferentes a lo solicitado
	      System.out.println("Tipo o tama�o incorrecto");
	    } else {
	      if (tipo.toUpperCase().equals("A") && tamano == 1) {
	        System.out.println("La ganancia final es de: " + ((kilos * precioI)+(kilos*0.20)));
	      } else if (tipo.toUpperCase().equals("A") && tamano == 2) {
	        System.out.println("La ganancia final es de: " + ((kilos*precioI)+(kilos*0.30)));
	      } else if (tipo.toUpperCase().equals("B") && tamano == 1) {
	        System.out.println("La ganancia final es de: " + ((kilos * precioI)-(kilos*0.30)));
	      } else if (tipo.toUpperCase().equals("B") && tamano == 2) {
	        System.out.println("La ganancia final es de: " + ((kilos*precioI)-(kilos*0.50)));
	      }
		
	    }
	    
	}

}
