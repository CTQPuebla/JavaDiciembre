package com;
import java.util.*;

public class Ejercicio13 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int dado;
	    
	    System.out.println("Simula que tiras un dado, digita el numero que has obtenido:");
	    System.out.print("Resultado de la cara obtenida: ");
	    dado = s.nextInt();

	    
	    switch (dado) {
	    case 1:
	      System.out.println("En la cara opuesta está el \"seis\" ");
	      break;
	    case 2:
	      System.out.println("En la cara opuesta está el \"cinco\" ");
	      break;
	    case 3:
	      System.out.println("En la cara opuesta está el \"cuatro\" ");
	      break;
	    case 4:
	      System.out.println("En la cara opuesta está el \"tres\" ");
	      break;
	    case 5:
	      System.out.println("En la cara opuesta está el \"dos\" ");
	      break;
	    case 6:
	      System.out.println("En la cara opuesta está el \"uno\" ");
	      break;
	    default:
	      System.out.println("ERROR: número incorrecto.");
	    }
	}

}
