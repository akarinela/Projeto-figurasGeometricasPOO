package br.edu.figurasgeometricasplanas;

public class Quadrado {
	
	private double area;
	private double lado;
	
	public Quadrado() {
		lado = 0;
		area = 0;
	}
	
	public void calcArea() {
		area = lado * lado;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getArea() {
		return area;
	}

	public double mostrarAreaQuComRetorno() {
		System.out.println ("Área do Quadrado com retorno: " + area);
		return area;
	}
}