package com;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Principal {
	/*
	 * Modelar el funcionamiento de una agendaContacto:NombreTelefono 1 y 2, Correo,
	 * Domicilio, fechaNacimiento Agregar, Editar, Buscar, Eliminar, Mostrar todos
	 * los contactos
	 */
	public static void main(String[] args) {
		
		MetodosContacto co = new Contacto();
		Contacto co1 = new Contacto();
		int opcion;
		boolean salir = false;
		Scanner scanner = new Scanner(System.in);
		
		
		while (!salir) {
			try {
				co1.metodo();
				try {

					System.out.println("Introduce una opción según los números: ");
					opcion = scanner.nextInt();
					switch (opcion) {
					case 1:
						co.ingresarValores();
						break;

					case 2:
						co.buscarContacto();
						break;
					case 3:
						co.eliminarContacto();
						break;

					case 4:			
						co.verTodo();
						break;

					case 5:
						co.editarContacto();
						break;
					case 6:
						
						salir = true;
						break;
						
					default:
						System.out.println("\n" + "Sólo opción del 1 al 6");
					}

				} catch (InputMismatchException e) {
					System.out.println("\n" + "Debes introducir un número ");
					scanner.next();
				}
			} catch (InputMismatchException e) {
				System.out.println("\n" + "Debes introducir un número ");
				scanner.next();
			}
		}

		System.out.println("Fin del menú");
	}
}
