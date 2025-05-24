package br.edu.figurasgeometricasespaciais;

public class Esfera {

	private double volume;
	private double raio;

	public Esfera() {
		raio = 0;
		volume = 0;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getVolume() {
		return volume;
	}

	public void calcVolume() {
		volume = (4 * 3.14 * Math.pow(raio, 3)) / 3;
	}

	public double mostrarVolumeComRetorno() {
		System.out.println("Volume da Esfera com retorno: " + volume);
		return volume;
	}
}
