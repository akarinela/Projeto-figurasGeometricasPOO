package br.edu.figurasgeometricasespaciais;

public class Paralelepipedo {

	private double volume;
	private double altura;
	private double largura;
	private double comprimento;

	public Paralelepipedo() {
		altura = 0;
		largura = 0;
		comprimento = 0;
		volume = 0;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getVolume() {
		return volume;
	}

	public void calcVolume() {
		volume = altura * largura * comprimento;
	}

	public double mostrarVolumeComRetorno() {
		System.out.println("Volume do Paralelepípedo com retorno: " + volume);
		return volume;
	}
}