package br.edu.figurasgeometricasespaciais;

public class Cilindro {
	
	private double volume;
	private double raio;
	private double altura;
	
	public Cilindro() {
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
		volume = 3.14 * raio * raio * altura;
	}
	
	public double mostrarVolumeComRetorno() {
		System.out.println("Volume do Cilindro com retorno: " + volume);
		return volume;
	}

	public void setRaio(int raio2) {
		
	}
}