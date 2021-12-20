package com;

public class Computadora {
		// Marca, modelo, procesador, ram, material, tamaño
		// puertos,
		
		String marca;
		String modelo;
		String procesador;
		int ram;
		String material;
		String tamanio;
		int puertos;
		
		public Computadora(){
			
		}

		public Computadora(String marca, String modelo, String procesador, int ram, String material, String tamanio,
				int puertos) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.procesador = procesador;
			this.ram = ram;
			this.material = material;
			this.tamanio = tamanio;
			this.puertos = puertos;
		}
		
		//setter - da valor a los atributos de clase
		public void setMarca(String m){
			this.marca = m;
		}
		//getter - recupera valores de los atributos de clase
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

		public int getRam() {
			return ram;
		}

		public void setRam(int ram) {
			this.ram = ram;
		}

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		public String getTamanio() {
			return tamanio;
		}

		public void setTamanio(String tamanio) {
			this.tamanio = tamanio;
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
					+ ", material=" + material + ", tamanio=" + tamanio + ", puertos=" + puertos + "]";
		}
		
		//comportamientos
		public void reproducirMusica() {
			System.out.println("reproduciendo musica yt");
		}
		
	}