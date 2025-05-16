package br.edu.figurasgeometricasplanas;

public class Paralelogramo {

	private double base;
	private double altura;
	private double area;
	
	public Paralelogramo() {
		base = 10;
		altura = 10;
		area = 0;
		
	} 
	public void recebeBase(double pBase) {
		base = pBase;
	} 
	public void recebeAltura(double pAltura) {
		altura = pAltura;
	} 
	public void calcArea() {
		area = base * altura;
	} 
	public void mostrarArea() {
		System.out.println("Área do Paralelogramo: " + area);
	} 
	public double mostrarAreaPComRetorno() {
		System.out.println("Área do Paralelogramo com retorno: " + area);
		return area;
	}
} 