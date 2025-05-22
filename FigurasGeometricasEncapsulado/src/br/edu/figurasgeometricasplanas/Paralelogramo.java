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
	
	public void calcArea() {
		area = base * altura;
	} 
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
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

	public double mostrarAreaPComRetorno() {
		System.out.println("Área do Paralelogramo com retorno: " + area);
		return area;
	}
} 