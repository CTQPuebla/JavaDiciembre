package com;
import java.util.*;

public class Ejercicio12 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	    int duracion;
	    String dia;
	    String turno;
	    double precio;
	    double impuesto;

	    System.out.println("Primero calculamos el precio base de la llamada y el impuesto a pagar:");
	    System.out.print("Duración de la llamada en minutos: ");
	    duracion = scanner.nextInt();
	    System.out.print("Día de la semana: ");
	    dia = scanner.next(); scanner.nextLine();
	    
	    if (duracion > 10){
	        precio = 3;
	    } else if (duracion > 8){
	        precio = 2.5;
	    } else if (duracion > 5){
	        precio = 1.80;
	    } else {
	        precio = 1;
	    }   
	    
	    
	    if (!dia.toUpperCase().equals("DOMINGO")) {
	      System.out.print("¿En que turno se realizo la llamada? ¿En la mañana o en la tarde? ");
	      turno = scanner.nextLine();
	      if (turno.toUpperCase().equals("MAÑANA")) {
	        impuesto = precio * 0.15;
	      } else if (turno.toUpperCase().equals("TARDE")) {
	        impuesto = precio * 0.10;
	      } else {
	        System.out.println("El horario que escribiste es incorrecto");
	      }
	    } else {
	      impuesto = precio * 0.03;
	      System.out.println("El precio total de la llamada es de " + (precio + impuesto) + " siendo el precio base de " + precio + " y el impuesto a pagar es de " + impuesto);
	    }
	   
	}

}
