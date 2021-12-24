package com;

public class NavajaExtendida extends Navaja implements NavajaMetodos {

	boolean navaja = true;
	boolean desatornillador = true;
	boolean tijeras = true;
	boolean abreBotellas = true;
	boolean pinzas = true;
	
	public NavajaExtendida() {
		setNombre("Capadora");
		setColor("Morado");
		setMarca("US");
		setTamano(50);
		setPrecio(400);
	}
	
	//CONSTRUCTOR
	public NavajaExtendida(boolean navaja, boolean desatornillador, boolean tijeras, boolean abreBotellas, boolean pinzas) {
		super();
		this.navaja = navaja;
		this.desatornillador = desatornillador;
		this.tijeras = tijeras;
		this.abreBotellas = abreBotellas;
		this.pinzas = pinzas;
	}
	//GETTER Y SETTER
	public boolean isNavaja() {
		return navaja;
	}

	public void setNavaja(boolean navaja) {
		this.navaja = navaja;
	}

	public boolean isDesatornillador() {
		return desatornillador;
	}

	public void setDesatornillador(boolean desatornillador) {
		this.desatornillador = desatornillador;
	}

	public boolean isTijeras() {
		return tijeras;
	}

	public void setTijeras(boolean tijeras) {
		this.tijeras = tijeras;
	}

	public boolean isAbreBotellas() {
		return abreBotellas;
	}

	public void setAbreBotellas(boolean abreBotellas) {
		this.abreBotellas = abreBotellas;
	}

	public boolean isPinzas() {
		return pinzas;
	}

	public void setPinzas(boolean pinzas) {
		this.pinzas = pinzas;
	}
	
	//MOSTRAR LOS DATOS
	@Override
	public String toString() {
		return "\t -----NavajaExtendida----- \nnombre= " + nombre + "\n" + "color= " + color + "\n" + "marca= " + marca + "\n" + "tamano= " + tamano
				+ "\n" + "precio= " + precio;
	}
	
	//METODO DE INTERFACE
	@Override
	public String caracteristicas() {
		return "\t -----Caracteristicas NE----- \ncuenta con navaja? " + navaja + "\n" + "cuenta con desatornillador? " + desatornillador + "\n" + "cuenta con tijeras?  " + tijeras
				+ "\n" + "cuenta con abreBotellas? " + abreBotellas + "\n" + "cuenta con pinzas? " + pinzas + "\n" + "nombre= " + nombre + "\n" + "color= " + color
				+ "\n" + "marca= " + marca + "\n" + "tamano= " + tamano + "\n" + "precio= " + precio;
	}
	
	
}
