package com;
import java.util.*;

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int dia;

	    System.out.println("Digite un numero de la siguiente lista:");
	    System.out.println("1.- Lunes.");
	    System.out.println("2.- Martes.");
	    System.out.println("3.- Miércoles.");
	    System.out.println("4.- Jueves.");
	    System.out.println("5.- Viernes.");
	    System.out.println("6.- Sábado.");
	    System.out.println("7.- Domingo.");
	    dia = s.nextInt();
	    
	    switch (dia) {
	    case 1:
	      System.out.println("El día seleccionado es LUNES");
	      break;
	    case 2:
	      System.out.println("El día seleccionado es MARTES");
	      break;
	    case 3:
	      System.out.println("El día seleccionado es MIÉRCOLES");
	      break;
	    case 4:
	      System.out.println("El día seleccionado es JUEVES");
	      break;
	    case 5:
	      System.out.println("El día seleccionado es VIERNES");
	      break;
	    case 6:
	      System.out.println("El día seleccionado es SÁBADO");
	      break;
	    case 7:
	      System.out.println("El día seleccionado es DOMINGO");
	      break;
	    default:
	      System.out.println("ERROR: número incorrecto.");
	    }
	}

}
