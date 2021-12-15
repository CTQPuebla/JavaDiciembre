package com;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int nAlumnos;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa cantidad de alumnos: ");
		nAlumnos = scanner.nextInt();
		
		if(nAlumnos <= 0)
		{
			System.out.println("Alumno no puede ser 0 o con numero negativo");
		}
			
	    else 
	    {
	    	if(nAlumnos >= 100) {
				System.out.println("Pago por alumno es: 65 euros");
				System.out.println("Pago a la compañia de autobus es: " + (nAlumnos * 65) + " Euros");
			}
			else if(nAlumnos > 49 && nAlumnos < 100) {
				System.out.println("Pago por alumno es: 70 euros");
				System.out.println("Pago a la compañia de autobus es: " + (nAlumnos * 70) + " Euros");
			}
		
		    else if(nAlumnos >29 && nAlumnos < 50) 
		    {
		    	System.out.println("Pago por alumno es: 95 euros");
		    	System.out.println("Pago a la compañia de autobus es: " + (nAlumnos * 70)+ " Euros");
			}
			
		    else if(nAlumnos < 30){
		    	System.out.println("Pago por alumno: " + (nAlumnos / 4000) + "Euros");
		    	System.out.println("Pago a la compañia de autobus es: 4000 euros");
		    }
	    }
		
				
	}

}
