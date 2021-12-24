package com;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Contacto implements MetodosContacto {
	Scanner scanner = new Scanner (System.in);
	private String nombre;
	private int telefono1;
	private int telefono2;
	private String domicilio;
	private String fechaNacimiento;
	List<Contacto> co = new ArrayList <Contacto>();
	
	public Contacto() {
		
	}
	
	
	
	public Contacto(String nombre, int telefono1, int telefono2, String domicilio, String fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.telefono1 = telefono1;
		this.telefono2 = telefono2;
		this.domicilio = domicilio;
		this.fechaNacimiento = fechaNacimiento;
	}



	public String getNombre() {
		return nombre;
	
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono1() {
		return telefono1;
	}
	public void setTelefono1(int telefono1) {
		this.telefono1 = telefono1;
	}
	
	
	public int getTelefono2() {
		return telefono2;
	}

	public void setTelefono2(int telefono2) {
		this.telefono2 = telefono2;
	}

	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + ", domicilio="
				+ domicilio + ", fechaNacimiento=" + fechaNacimiento + "]";
	}



	@Override
	public Object ingresarValores() {
		try {
			System.out.println("\n" + "------Opción ingresa valores------");
			System.out.println("Ingrese nombre: ");
			String nombre = scanner.next(); scanner.nextLine();
			System.out.println("Ingrese celular 1: ");
			int telefono1 = scanner.nextInt();
			System.out.println("Ingrese celular 2: ");
			int telefono2 = scanner.nextInt();
			System.out.println("Ingrese domicilio: ");
			String domicilio = scanner.next(); scanner.nextLine();
			System.out.println("Ingresa fecha de nacimiento: ");
			String fechaNacimiento = scanner.next(); scanner.nextLine();
			
			
			
			Contacto a = new Contacto();
			a.setNombre(nombre);
			a.setTelefono1(telefono1);
			a.setTelefono2(telefono2);
			a.setDomicilio(domicilio);
			a.setFechaNacimiento(fechaNacimiento);
			co.add(a);

	} catch (InputMismatchException e) {
		System.out.println("\n" + "Debes introducir un número ");
		scanner.next();

	}
		return 0;
	

	}

	@Override
	public Object editarContacto() {
		
		System.out.println("\n" + "-------Opción editar contacto-------");
		System.out.println("Indroduce el nombre del alumno a eliminar: ");
		String nombre = scanner.next(); scanner.nextLine();
		System.out.println("Introduce el nuevo nombre del contacto: ");
		String nombre2 = scanner.next(); scanner.nextLine();
		System.out.println("Introduce el nuevo telefono 1 de contacto: ");
		int telefonoo1 = scanner.nextInt();
		System.out.println("Introduce el nuevo telefono 2 de contacto: ");
		int telefonoo2 = scanner.nextInt();
		System.out.println("Introduce nueva domicilio de contacto: ");
		String domicilio2 = scanner.next(); scanner.nextLine();
		System.out.println("Introduce nueva fecha de nacimiento");
		String fechaNacimiento2= scanner.next(); scanner.nextLine();
		Iterator<Contacto> it = co.iterator();
		
		while(it.hasNext()) {
			Contacto a = it.next();
			if(a.getNombre().equals(nombre)) {
				a.setNombre(nombre2);
				a.setTelefono1(telefonoo1);
				a.setTelefono2(telefonoo2);
				a.setDomicilio(domicilio2);
				a.setFechaNacimiento(fechaNacimiento2);
			
			}
			
	
		}
		
		return 0;
	}

	@Override
	public Object buscarContacto() {
		System.out.println("\n" + "-------Opción buscar por nombre contacto-------");
		System.out.println("Indroduce el nombre del alumno a buscar: ");
		String nombre = scanner.next(); scanner.nextLine();
		Iterator<Contacto> it = co.iterator();
		int cont = 0;
		while(it.hasNext()) {
			Contacto a = it.next();
			if(a.getNombre().equals(nombre)) {
				System.out.println("Nombre : " + a.getNombre() +"\n" + "Telefono 1: " + "\n" + a.getTelefono1() + "\n" + "Telefono 2: " + "\n" + a.getTelefono2() + 
						"\n" +	"Domicilio: " + a.getDomicilio() + "\n" + "Fecha de nacimiento : " + a.getFechaNacimiento() + "\n" ) ;
				cont = 1;
			}
		}
		
		if(cont == 0) {
			System.out.println("Contacto no existe");
		}
		return 0;
		
	}



	@Override
	public Object eliminarContacto() {
		System.out.println("\n" + "-------Opción eliminar contacto-------");
		System.out.println("Indroduce el nombre del alumno a eliminar: ");
		String nombre = scanner.next(); scanner.nextLine();
		Iterator<Contacto> it = co.iterator();
		int cont = 0;
		while(it.hasNext()) {
			Contacto a = it.next();
			if(a.getNombre().equals(nombre)) {
				it.remove();
				cont = 1;
			}
		}
		if(cont == 0) {
			System.out.println("Contacto no existe");
		}
		return 0;
	}



	@Override
	public Object verTodo() {
		System.out.println("\n" + "-----------Ver todo--------------");
		for (Contacto a : co) {
		 	System.out.println("Nombre : " + a.getNombre() +"\n" + "Telefono 1: " + "\n" + a.getTelefono1() + "\n" + "Telefono 2: " + "\n" + a.getTelefono2() + 
					"\n" +	"Domicilio: " + a.getDomicilio() + "\n" + "Fecha de nacimiento : " + a.getFechaNacimiento() + "\n" ) ;
		}
		return 0;
	}


	public void metodo() {
		System.out.println("\n" + "---------------MENÚ-----------------------");
		System.out.println("\n" + "1. Ingresa valores a contacto.");
		System.out.println("2. Ver contacto por nombre.");
		System.out.println("3. Eliminar contacto.");
		System.out.println("4. Ver todo");
		System.out.println("5. Editar contacto.");
		System.out.println("6. Salir. "+"\n");
		
	}

	
	
	
	
}
