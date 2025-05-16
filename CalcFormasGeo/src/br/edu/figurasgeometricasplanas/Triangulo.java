package br.edu.figurasgeometricasplanas;

public class Triangulo {
	
	private double base;
	private double altura;
	private double area;
	
	public Triangulo() {
		base = 0;
		altura = 0;
		area = 0;
	}
	
	public void recebeAltura(double pAltura) {
		this.altura = pAltura;
	}
	public void recebeBase(double pBase) {
		base = pBase;
	}
	public void calcArea() {
		area = (base * altura)/2;
	}
	public void mostrarArea() {
		System.out.println("Área do Triangulo: " + area);
	}
	public double mostrarAreaTrComRetorno() {
		System.out.println ("Área do Triangulo com retorno: " + area);
		return area;
	}
}