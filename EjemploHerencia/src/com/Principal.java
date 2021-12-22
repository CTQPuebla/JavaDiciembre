package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) {

		// Relizar un menú
		// Registrar cuantos celulares vas a registar
		// Registrar los celulares
		// Buscar un celular por marca
		// Eliminar celular por modelo
		// Mostrar todos los celulares
		// scanner - arrays - ifs - instancia de un objeto - mostrar todos los celulares
		Celular ce = new Celular();

		Scanner scanner = new Scanner(System.in);
		boolean salir = false;
		int opcion;
		int registro;
		boolean aux = true;
		System.out.println("----------BIENVENIDOS----------");

		Celular[] arr = null;

		String marca;
		String modelo;
		int largo;
		int ancho;
		double ram;
		String sistemaOperativo;
		double precio;
		int contador = 0;

		while (!salir) {
			try {
				if (aux) {
					System.out.println("Cuantos celulares deseas registrar?: ");
					registro = scanner.nextInt();
					aux = false;
					arr = new Celular[registro];
				}

				System.out.println("\n" + "---------------MENÚ-----------------------");
				System.out.println("\n" + "1. Ingresa valores a celular.");
				System.out.println("2. Ver celular por modelo.");
				System.out.println("3. Eliminar celular.");
				System.out.println("4. Ver todo");
				System.out.println("5. Salir.");
				System.out.println("6. Reiniciar Lista" + "\n");

				try {

					System.out.println("Introduce una opción según los números: ");
					opcion = scanner.nextInt();
					switch (opcion) {
					case 1:
						try {

							for (int i = 0; i < arr.length; i++) {
								System.out.println("\n" + "------Opción ingresa valores------");
								System.out.println("Ingresa marca de celular: ");
								marca = scanner.next();
								scanner.nextLine();
								System.out.println("Ingresa modelo de celular: ");
								modelo = scanner.next();
								scanner.nextLine();
								System.out.println("Ingrese sistema operativo: ");
								sistemaOperativo = scanner.next();
								scanner.nextLine();

								System.out.println("Ingresa largo de celular: ");
								largo = scanner.nextInt();
								System.out.println("Ingresa ancho de celular: ");
								ancho = scanner.nextInt();
								System.out.println("Ingrese ram de celular: ");
								ram = scanner.nextDouble();

								System.out.println("Ingrese precio: ");
								precio = scanner.nextDouble();

								arr[i] = new Celular(contador, marca, modelo, largo, ancho, ram, sistemaOperativo, precio);
								System.out.println("Celular registrado...");
								contador++;
							}

						} catch (InputMismatchException e) {
							System.out.println("\n" + "Debes introducir un número ");
							scanner.next();

						}
						break;

					case 2:
						System.out.println("\n" + "--------Opcion buscar marca celular-------");
						System.out.println("\n" + "Ingresa marca de celular: ");
						String x = scanner.next();
						scanner.nextLine();
						int ceEn = 0;
						
						for (int i = 0; i < arr.length; i++) {
							if (x.equals(arr[i].getMarca())) {
								System.out.println("Id: " + arr[i].getId());
								System.out.println("Marca: " + arr[i].getMarca());
								System.out.println("Modelo " + arr[i].getModelo());
								System.out.println("Largo: " + arr[i].getLargo());
								System.out.println("Ancho: " + arr[i].getAncho());
								System.out.println("Ram: " + arr[i].getRam());
								System.out.println("Sistema operativo: " + arr[i].getSistemaOperativo());
								System.out.println("Precio: " + arr[i].getPrecio());
								ceEn = 1;
							}

						}
						if (ceEn == 0) {
							System.out.println("No existe");
						}

						break;
					case 3:
						System.out.println("\n" + "-------Opción eliminar celular-------");
						System.out.println("\n" + "Ingresa Id");
						int id1 = scanner.nextInt();
						
						for (int i = id1; i < arr.length; i++) {
							
							arr[i] = null;
							System.out.println(arr[i].getId());
							
						}

						break;
						
					case 4:
						System.out.println("\n" + "-----------Ver todo--------------");
						for (int i = 0; i < arr.length; i++) {
							if(arr[i] != null) {
								System.out.println("Id: " + arr[i].getId());
								System.out.println(arr[i]);
							}
							
						}
						break;
						
					case 5:
						salir = true;
						break;
					case 6:
						System.out.println("Cuantos celulares deseas registrar?: ");
						registro = scanner.nextInt();
						arr = new Celular[registro];
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
