package br.edu.figurasgeometricasplanas;

public class Hexagono {

	private double lado;
	private double area;
	
	public Hexagono() {
		lado = 10;
		area = 0;
		
	} 
	
	public void calcArea() {
		area = (3 * Math.sqrt(3) * (lado * lado)) / 2;
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

	public double mostrarAreaHComRetorno() {
		System.out.println("Área do Hexagono com retorno: " +area);
		return area;
	}
} 