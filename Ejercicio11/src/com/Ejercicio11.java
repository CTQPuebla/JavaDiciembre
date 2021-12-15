package com;
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		int tiempoLlamada;
		String dia, horario;
		double impuesto, precio;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tiempo de llamada realizada: ");
		tiempoLlamada = scanner.nextInt();
		System.out.println("Ingresa dia de la semana");
		dia = scanner.next(); scanner.nextLine();
		
		if(tiempoLlamada <= 5) 
		{
			
			if((!((dia.toUpperCase().equals("Lunes") || dia.toUpperCase().equals("Martes") || dia.toUpperCase().equals("Miercoles") 
					|| dia.toUpperCase().equals("Jueves") || dia.toUpperCase().equals("Viernes") || dia.toUpperCase().equals("Sabado")
					|| dia.toUpperCase().equals("Domingo")))))
			{
				System.out.println("Solo se puede ingresar día de la semana");
			}
			else 
			{
				if(dia == "Domingo")
				{
					  precio = 3;
				      impuesto = precio * 0.03;
				      System.out.println("El precio final es: "+ (impuesto + precio));
				}
			}
			
		}
		
		else if(tiempoLlamada == 8) {
			
		}
		
		else if(tiempoLlamada == 10) {
			
		}
		
		else if(tiempoLlamada > 10) {
			
		}

	}

}
