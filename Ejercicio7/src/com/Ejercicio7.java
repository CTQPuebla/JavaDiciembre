package com;
import java.util.*;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		int x1;
		int x2;
		int y1;
		int y2;		
		int r1;
		int r2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Inserte el primer valor central de la primera circunferencia:");
		x1 = s.nextInt();
		System.out.println("Inserte el segundo valor central de la primera circunferencia:");
		y1 = s.nextInt();
		System.out.println("Inserte el valor de radio de la primera circunferencia:");
		r1 = s.nextInt();
		
		
		System.out.println("Inserte el primer valor central de la segunda circunferencia:");
		x2 = s.nextInt();
		System.out.println("Inserte el segundo valor central de la segunda circunferencia:");
		y2 = s.nextInt();
		System.out.println("Inserte el valor de radio de la segunda circunferencia:");
		r2 = s.nextInt();
								
		double distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)); 
		//calculamos la distancia que existe entre las dos circunferencias
		
		if (distancia == 0) {  
		      System.out.println("Concéntricas");
		    } else if (distancia > (r1+r2)) {
		      System.out.println("Exteriores.");
		    } else if ((distancia > 0) && distancia < Math.abs(r1-r2)) {
		      System.out.println("Interiores");
		    } else if (distancia == (r1+r2)) {
		      System.out.println("Tangentes exteriores");
		    } else if (distancia == Math.abs(r1-r2)) {
		      System.out.println("Tangentes interiores");
		    } else if (distancia < (r1+r2) && distancia > Math.abs(r1-r2)) {
		      System.out.println("Secantes");
		    }
	}
}
