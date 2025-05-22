package br.edu.figurasgeometricasplanas;

public class Trapezio {

	private double maiorB;
	private double menorB;
	private double altura;
	private double area;
	
	public Trapezio() {
		maiorB = 10;
		menorB = 10;
		altura = 10;
		area = 0;
		
	} 
	public void recebeMaiorB(double pMaiorB) {
		this.maiorB = pMaiorB;
	} 
	public void recebeMenorB(double pMenorB) {
		menorB = pMenorB;
	} 
	public void recebeAltura(double pAltura) {
		altura = pAltura;
	} 
	public void calcArea() {
		area = (maiorB + menorB) * altura / 2;
	} 
	public void mostrarArea() {
		System.out.println("Área do Trapezio: " + area);
	} 
	public double mostrarAreaTpComRetorno() {
		System.out.println("Área do Trapezio com retorno: " + area);
		return area;
	}
} 