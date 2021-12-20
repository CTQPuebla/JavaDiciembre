package com;

public class Computadora {
	
		//marca
		//modelo
		//procesador
		//RAM
		//Material
		//Tama�o
		//Puertos usb
		
		String marca;
		String modelo;
		String procesador;
		double ram;
		String material;
		String tama�o;
		int puertos;
		
		//una clase tiene n constructores, es el lugar de la clase donde se le da valor
		//a los atributos de la clase
		
		public Computadora() {
			
		}

		public Computadora(String marca, String modelo, String procesador, double ram, String material, String tama�o,
				int puertos) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.procesador = procesador;
			this.ram = ram;
			this.material = material;
			this.tama�o = tama�o;
			this.puertos = puertos;
		}
		
		
		//setter un metodo a la vez, recibe valor y se lo da a la clase, da valor a los atributos
		public void setMarca(String m) {
			this.marca = m;
		}	
		//getter recuperar los valores de los atributos de la clase
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

		public String getTama�o() {
			return tama�o;
		}

		public void setTama�o(String tama�o) {
			this.tama�o = tama�o;
		}

		public int getPuertos() {
			return puertos;
		}

		public void setPuertos(int puertos) {
			this.puertos = puertos;
		}

		@Override
		public String toString() {
			return "Computadora [marca=" + marca + ", modelo=" + modelo + ", procesador=" + procesador + ", ram=" + ram
					+ ", material=" + material + ", tama�o=" + tama�o + ", puertos=" + puertos + "]";
		}
		
		
		//
		public void reproducirMusica() {
			System.out.println("Reproducir youtube");
			
		}
		
		
}


