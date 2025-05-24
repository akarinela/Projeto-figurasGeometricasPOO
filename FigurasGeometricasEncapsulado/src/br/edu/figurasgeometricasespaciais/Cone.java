package br.edu.figurasgeometricasespaciais;

public class Cone {

	private double volume;
	private double raio;
	private double altura;

	public Cone() {
		raio = 0;
		altura = 0;
		volume = 0;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getVolume() {
		return volume;
	}

	public void calcVolume() {
		volume = (3.14 * raio * raio * altura) / 3;
	}

	public double mostrarVolumeComRetorno() {
		System.out.println("Volume do Cone com retorno: " + volume);
		return volume;
	}
}