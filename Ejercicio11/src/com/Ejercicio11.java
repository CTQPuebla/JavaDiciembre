package com;
import java.util.*;

public class Ejercicio11 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	    int numAlumnos;
	    	
	    System.out.println("Se calculara el precio a pagar por alumno en el viaje seg�n la cantidad de alumnos:");
	    System.out.println("N�mero de alumnos: ");
	    numAlumnos = s.nextInt();
	    
	    if (numAlumnos >= 100) {
	      System.out.println("El pago a la compa�ia de viajes ser� de " + numAlumnos*65 + " " + "euros y cada alumno debe pagar 65 euros");
	    } else if (numAlumnos <100 && numAlumnos >= 50) {
	      System.out.println("El pago a la compa�ia de viajes ser� de " + numAlumnos*70 + " " + "euros y cada alumno debe pagar 70 euros");
	    } else if (numAlumnos < 50 && numAlumnos >= 30) {
	      System.out.println("El pago a la compa�ia de viajes ser� de " + numAlumnos*95 + " " + "euros y cada alumno debe pagar 95 euros");
	    } else {
	      System.out.println("El coste de la renta del autob�s es de 4000 euros y cada alumno " + "debe pagar " + (4000/numAlumnos) + " euros.");
	    } 
	}

}
