package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("¿Cuántos celulares vas a registrar?");
		int numCelulares = sc.nextInt(); int i = 0;
		int modelo; String marca;
		Celulares[] cel = new Celulares[numCelulares];
		
		while(i < numCelulares) {
			System.out.print("Teclee el numero de modelo (1-6): ");
			modelo = sc.nextInt();
			cel[i] = new Celulares();
			cel[i].setModelo(modelo);
			System.out.print("Teclee el nombre de su marca preferida: ");
			marca = sc1.nextLine();
			cel[i].setMarca(marca);
			i++;
		}
		System.out.println("");
		
		int decision=1;
		do{
			System.out.println("Presione 1 para buscar un celular por marca");
			System.out.println("Presione 2 para eliminar un celular por modelo");
			System.out.println("Presione 3 para mostrar todos los celulares");
			System.out.println("Presione 0 para salir");
			
			decision = sc.nextInt();
			
			if (decision==1) {
				System.out.print("Teclee la marca del celular que buscas: ");
				marca = sc1.nextLine();
				for (int j = 0; j < numCelulares; j++) {
					if (marca.equals(cel[j].getMarca())) {
						System.out.println("Encontramos tu celular, es un modelo "+ cel[j].getModelo());
						System.out.println("");
						break;
					}
				}
			}
			else if(decision==2) {
				System.out.print("Teclee el modelo del celular que deseas eliminar (1-6): ");
				int numModelo = sc.nextInt();
				for (int j = 0; j < numCelulares; j++) {
					if (Celulares.getModeloStr(numModelo-1).equals(cel[j].getModelo())){
						System.out.println("Eliminaremos el celular, es un modelo "+ cel[j].getModelo());
						System.out.println("");
						cel[j] = null;
						break;
					}
				}
			
			}
			else if(decision==3) {
				for(int j = 0; j<cel.length; j++) {			
					if(cel[j]!=null) {
						System.out.print("Celular "+(j+1)+":");
						System.out.println(cel[j].toString());
					}		
				}
				System.out.println("");
			}
			
		}while(decision!=0);
		
	}

}
