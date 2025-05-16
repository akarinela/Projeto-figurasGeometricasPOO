package br.edu.figurasgeometricasplanas;

public class Hexagono {

	private double lado;
	private double area;
	
	public Hexagono() {
		lado = 10;
		area = 0;
		
	} 
	public void recebeLado(double pLado) {
		lado = pLado;
	} 
	public void calcArea() {
		area = (3 * Math.sqrt(3) * (lado * lado)) / 2;
	} 
	public void mostrarArea() {
		System.out.println("Área do Hexagono: " +area);
	}
	public double mostrarAreaHComRetorno() {
		System.out.println("Área do Hexagono com retorno: " +area);
		return area;
	}
} 