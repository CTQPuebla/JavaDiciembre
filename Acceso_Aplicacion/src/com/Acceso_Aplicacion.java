package com;
import javax.swing.*;

public class Acceso_Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave = "Gilberto";
		
		String pass = "";
		
		while (clave.equals(pass)==false)
		{
			pass = JOptionPane.showInputDialog("Introduce la contraseña por favor:  ");
			
			if (clave.equals(pass)==false)
			{
				
			System.out.println("Contraseña Incorrecta");	
			}
		}
		System.out.println("Contraseña Correcta. Acceso Permitido");
	}

}
