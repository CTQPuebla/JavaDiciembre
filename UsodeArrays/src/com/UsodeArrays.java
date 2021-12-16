package com;

public class UsodeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] mi_matriz = new int [5];
		
	//	 int mi_matriz2 [] = new int [5];     (otra forma de declarar una matriz).
		
		// inicializar una matriz
		
		mi_matriz [0] = 5;
		mi_matriz [1] = 38;
		mi_matriz [2] = -15;
		mi_matriz [3] = 92;
		mi_matriz [4] = 71;
		
		
		// int [] mi_matriz = {5, 38, -15, 92, 71};  
		
		System.out.println(mi_matriz[3]);
		
		
		// for (int i = 0; i < mi_matriz.length; i++)     (otra forma usando length)
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Valor del índice" + i + " =" + mi_matriz[i]);
		}
		 

	}

}
