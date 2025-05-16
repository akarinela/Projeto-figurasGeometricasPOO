package br.edu.figurasgeometricasplanas;

public class Circulo {
	
	private double area;
	public double raio;
	
	public Circulo() {
		raio = 0;
		area = 0;
	}
	
	public void recebeRaio(double pRaio) {
		this.raio = pRaio;
	}
	public void calcArea() {
		area = 3.14 * (raio * raio);
	}
	public void mostrarArea() {
			System.out.println ("Área do Círculo: " + area);
	}
	public double mostrarAreaCComRetorno() {
			System.out.println ("Área do Círculo com retorno: " +area);
			return area;
	}
}