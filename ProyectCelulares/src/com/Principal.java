package com;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args)throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Celular> celulares = new ArrayList<Celular>();
		
		int limite = 0;
		
		while(limite==0) {
			System.out.println();
			System.out.println("--MENU CELULARES--");
			System.out.println("1-Registrar celulares: ");
			System.out.println("2-Buscar celulares: ");
			System.out.println("3-Eliminar celulares: ");
			System.out.println("4-Salida de programa: ");
			
			int op = Integer.parseInt(bf.readLine());
			
			switch(op) {
			case 1:
				System.out.println("Ingresa celular: ");
				String marca = bf.readLine();
				System.out.println("Ingresa modelo: ");
				String modelo = bf.readLine();
				System.out.println("Ingresa precio: ");
				double precio = Double.parseDouble(bf.readLine());
				System.out.println("Ingresa ram: ");
				int ram = Integer.parseInt(bf.readLine());
				System.out.println("Ingresa memoria: ");
				int memoria = Integer.parseInt(bf.readLine());
				
				Celular c1 = new Celular(marca, modelo, precio, ram, memoria);
				System.out.println("Celular asignado con exito..");
				celulares.add(c1);
				
				break;
			case 2:
				System.out.println("Buscar por marca: ");
				String m = bf.readLine();
				
				int encontrado = 0;
				
				for (int i = 0; i < celulares.size(); i++) {
					if(m.equals(celulares.get(i).getMarca())) {
						System.out.println("Celular encontrado");
						System.out.println("Celular: " + celulares.get(i).getMarca());
						System.out.println("Modelo: " + celulares.get(i).getModelo());
						System.out.println("Precio: " + celulares.get(i).getPrecio());
						System.out.println("Ram: " + celulares.get(i).getRam());
						System.out.println("Memoria: " + celulares.get(i).getMemoria());
						encontrado = 1;
					}
				}
				if(encontrado == 0) {
					System.out.println("No hay datos de celulares");
				}
				break;
			case 3:
				break;
			case 4:
				System.out.println("programa cerrado");
				limite = 999;
				break;
				default: 
					System.out.println("Error!, opción no valida");
					System.out.println();
		}
	}
	}
	}