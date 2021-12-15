package com;
import java.util.*;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		int año;
		
		Scanner s = new Scanner(System.in);
		GregorianCalendar calendar = new GregorianCalendar(); //subclase de la clase Calendar 
		
		System.out.println("Programa que te dice si el año es bisiesto");
		 System.out.println("Inserte el año");
		 año = s.nextInt();
		 
		 if(calendar.isLeapYear(año)) { //evalua si el año es bisiesto
			 System.out.println("El año es bisiesto");
		 }else {
			 System.out.println("El año no es bisiesto");
		 }
		
	}

}
