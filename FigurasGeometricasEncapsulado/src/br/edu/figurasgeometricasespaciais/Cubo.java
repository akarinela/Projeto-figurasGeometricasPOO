package br.edu.figurasgeometricasespaciais;

public class Cubo {

	private double volume;
	private double lado;

	public Cubo() {
		lado = 0;
		volume = 0;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getVolume() {
		return volume;
	}

	public void calcVolume() {
		volume = lado * lado * lado;
	}

	public double mostrarVolumeComRetorno() {
		System.out.println("Volume do Cubo com retorno: " + volume);
		return volume;
	}
}