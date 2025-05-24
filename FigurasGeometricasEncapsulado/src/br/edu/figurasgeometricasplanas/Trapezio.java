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
	 
	
	public void calcArea() {
		area = (maiorB + menorB) * altura / 2;
	} 
	
	public double getMaiorB() {
		return maiorB;
	}

	public void setMaiorB(double maiorB) {
		this.maiorB = maiorB;
	}

	public double getMenorB() {
		return menorB;
	}

	public void setMenorB(double menorB) {
		this.menorB = menorB;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArea() {
		return area;
	}

	public double mostrarAreaTpComRetorno() {
		System.out.println("Área do Trapezio com retorno: " + area);
		return area;
	}
} 