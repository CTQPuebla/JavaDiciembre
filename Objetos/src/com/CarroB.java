package com;

public class CarroB {
	private boolean automatico;
	
	public CarroB() {
		
	}

	public CarroB(boolean automatico) {
		super();
		this.automatico = automatico;
	}

	public boolean isAutomatico() {
		return automatico;
	}

	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}

	@Override
	public String toString() {
		return "CarroB [automatico=" + automatico + "]";
	}
	
	
	
	
}
