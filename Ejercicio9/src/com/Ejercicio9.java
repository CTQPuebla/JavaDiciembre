package com;
import java.util.*;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		int a�o;
		
		Scanner s = new Scanner(System.in);
		GregorianCalendar calendar = new GregorianCalendar(); //subclase de la clase Calendar 
		
		System.out.println("Programa que te dice si el a�o es bisiesto");
		 System.out.println("Inserte el a�o");
		 a�o = s.nextInt();
		 
		 if(calendar.isLeapYear(a�o)) { //evalua si el a�o es bisiesto
			 System.out.println("El a�o es bisiesto");
		 }else {
			 System.out.println("El a�o no es bisiesto");
		 }
		
	}

}
