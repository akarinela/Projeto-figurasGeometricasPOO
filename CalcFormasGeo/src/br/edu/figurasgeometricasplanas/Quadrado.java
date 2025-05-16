package br.edu.figurasgeometricasplanas;

public class Quadrado {
	
	private double area;
	private double lado;
	
	public Quadrado() {
		lado = 0;
		area = 0;
	}
	
	public void recebeLado(double pLado) {
		this.lado = pLado;
	}
	
	public void calcArea() {
		area = lado * lado;
	}
	public void mostrarArea() {
		System.out.println("Área do Quadrado: " + area);
	}
	
	public double mostrarAreaQuComRetorno() {
		System.out.println ("Área do Quadrado com retorno: " + area);
		return area;
	}
}