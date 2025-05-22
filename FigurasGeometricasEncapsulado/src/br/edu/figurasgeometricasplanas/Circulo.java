package br.edu.figurasgeometricasplanas;

public class Circulo {
	
	private double area;
	public double raio;
	
	public Circulo() {
		raio = 0;
		area = 0;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getArea() {
		return area;
	}
	
	public void calcArea() {
		area = 3.14 * (raio * raio);
	}
	

	public double mostrarAreaCComRetorno() {
			System.out.println ("Área do Círculo com retorno: " +area);
			return area;
	}
}