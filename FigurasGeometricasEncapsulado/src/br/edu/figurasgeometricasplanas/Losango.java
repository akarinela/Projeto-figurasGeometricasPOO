package br.edu.figurasgeometricasplanas;

public class Losango {

	private double maiorD;
	private double menorD;
	private double area;
	
	public Losango() {
		maiorD = 10;
		menorD = 10;
		area = 0;
		
	} 

	public double getMaiorD() {
		return maiorD;
	}

	public void setMaiorD(double maiorD) {
		this.maiorD = maiorD;
	}

	public double getMenorD() {
		return menorD;
	}

	public void setMenorD(double menorD) {
		this.menorD = menorD;
	}

	public double getArea() {
		return area;
	}

	public void calcAreaL() {
		area = (maiorD * menorD) / 2;
	} 
	
	public double mostrarAreaLComRetorno() {
		System.out.println("Área do Losango com retorno: " + area);
		return area;
	}
} 