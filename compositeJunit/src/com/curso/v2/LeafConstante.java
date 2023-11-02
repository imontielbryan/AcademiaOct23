package com.curso.v2;

public class LeafConstante implements Component {
	
	private double valor;

	public LeafConstante(double valor) {
		this.valor = valor;
	}

	@Override
	public double operation() {
		return valor;
	}
	
	

}
