package com;
import javax.swing.*;
public class IngresarDatosMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] paises = new String [8];
		
		for(int i=0; i<8; i++)
		{
			paises[i]=JOptionPane.showInputDialog("Introduce País:  " + (i+1));
		}
		
		for(String elemento:paises)
		{
			System.out.println("País: "+elemento);
		}

	}

}
