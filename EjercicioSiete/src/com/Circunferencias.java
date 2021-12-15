package com;
import java.util.*;
public class Circunferencias {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x1 , x2, y1, y2, r1, r2;
		double distancia;
		System.out.println("Escribe valor x1: ");
		x1 = scanner.nextInt();
		System.out.println("Escribe valor y1: ");
		y1 = scanner.nextInt();
		System.out.println("Escribe valor x2: ");
		x2 = scanner.nextInt();
		System.out.println("Escribe valor y2: ");
		y2 = scanner.nextInt();
		System.out.println("Escribe valor r1: ");
		r1 = scanner.nextInt();
		System.out.println("Escribe valor r2: ");
		r2 = scanner.nextInt();
		scanner.close();
		
		//Distancia entre ambas circunferencias
		
		distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		System.out.println("La distancia es: " + distancia);
		
		//comparaciones y muestra
		
		if(distancia == 0) {
			System.out.println("Ambas son concéntricas");
		}
		else if(distancia > (r1+r2)){
			System.out.println("Son exteriores");
		}
		else if(distancia > 0 && distancia < Math.abs(r1-r2)) {
			System.out.println("Son interiores");
		}
		else if(distancia == (r1+r2)) {
			System.out.println("Son tangentes exteriores");
		}
		else if(distancia == Math.abs(r1-r2)) {
			System.out.println("Son tangentes interiores");
		}
		else if(distancia < (r1+r2) && distancia > Math.abs(r1-r2)) {
			System.out.println("Son secantes");
		}
	}

}
