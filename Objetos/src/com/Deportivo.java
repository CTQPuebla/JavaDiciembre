package com;

public class Deportivo extends AutoGasolina {
	double torque;
	double hp;
	
	public Deportivo() {
		
	
	}

	public Deportivo(double torque, double hp) {
		super();
		this.torque = torque;
		this.hp = hp;
	}

	public double getTorque() {
		return torque;
	}

	public void setTorque(double torque) {
		this.torque = torque;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Deportivo [torque=" + torque + ", hp=" + hp + ", llantas=" + llantas + ", motor=" + motor + ", largo="
				+ largo + ", ancho=" + ancho + ", alto=" + alto + ", asientos=" + asientos + ", marca=" + marca
				+ ", modelo=" + modelo + ", color=" + color + ", estandar=" + estandar + "]";
	}

	
	
}
