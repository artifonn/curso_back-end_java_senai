package com.atividade09.models;

import com.atividade09.repository.ICombustivel;

public class Combustivel implements ICombustivel {
	private double precoEtanol;
	private double precoGasolina;

	public Combustivel(double precoEtanol, double precoGasolina) {
		this.precoEtanol = precoEtanol;
		this.precoGasolina = precoGasolina;
	}

	public double getprecoEtanol() {
		return this.precoEtanol;
	}

	public void setprecoEtanol(double precoEtanol) {
		this.precoEtanol = precoEtanol;
	}

	public double getprecoGasolina() {
		return this.precoGasolina;
	}

	public void setprecoGasolina(double precoGasolina) {
		this.precoGasolina = precoGasolina;
	}

	@Override
	public String melhorCombustivel() {
		return (this.precoEtanol <= 0.7 * this.precoGasolina)
				? "Melhor abastecer com etanol"
				: "Melhor abstecer com casolina";
	}

}
