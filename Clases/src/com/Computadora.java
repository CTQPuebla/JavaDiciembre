package com;

public class Computadora {
	
	//Atributos: Marca, modelo,  Procesador, RAM, Material, tamaño, num de puertos
	
	public String marca; //modificador de acceso public, seria lo mismo sin poner la palabra public
	String modelo;
	String procesador;
	double ram;
	private String material; //solo es visible denro de la clase
	String tamaño;
	int numpuertos;
	//Una clase puede tener n constructores, es donde se le da valor a los atributos de la clase 
	//Contructor siempre sera un metodo publico
	
	public Computadora() {
		
	}
	
	//Constructor creado con ayuda del IDE, se puede crear manualmente
	public Computadora(String marca, String modelo, String procesador, double ram, String material, String tamaño,
			int numpuertos) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.ram = ram;
		this.material = material;
		this.tamaño = tamaño;
		this.numpuertos = numpuertos;
	}
	
	//getter y setter -proporciona un mecanismo intermedio para acceder a los atributos
	
	
	//setter    - da valor a los atributos de clase
	public void setMarca(String m) {  //recibe un valor 
		this.marca= m;
	}
	
	//Getter  recupera los valores de los atributos de clase
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public double getRam() {
		return ram;
	}

	public void setRam(double ram) {
		this.ram = ram;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public int getNumpuertos() {
		return numpuertos;
	}

	public void setNumpuertos(int numpuertos) {
		this.numpuertos = numpuertos;
	}

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", modelo=" + modelo + ", procesador=" + procesador + ", ram=" + ram
				+ ", material=" + material + ", tamaño=" + tamaño + ", numpuertos=" + numpuertos + "]";
	}
	
	
	//comportamiento
	public void reproducrirMusica() {
		System.out.println("Reproduciendo musica");
	}

	
	
	
}
