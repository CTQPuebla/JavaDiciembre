package com;

public class Agenda {
	
	String nombre, domicilio, correo, fechanacimiento, telefono1, telefono2;
	
	
	public Agenda() {
		
	}
	
	
	public Agenda(String nombre, String domicilio, String correo, String fechanacimiento, String telefono1,String telefono2) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.correo = correo;
		this.fechanacimiento = fechanacimiento;
		this.telefono1 = telefono1;
		this.telefono2 = telefono2;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getFechanacimiento() {
		return fechanacimiento;
	}


	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}


	public String getTelefono1() {
		return telefono1;
	}


	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}


	public String getTelefono2() {
		return telefono2;
	}


	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}


	@Override
	public String toString() {
		return "Agenda [nombre=" + nombre + ", domicilio=" + domicilio + ", correo=" + correo + ", fechanacimiento="
				+ fechanacimiento + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + "]";
	}
	
	
	

}
