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
	public void recebeMaiorD(double pMaiorD) { 
		this.maiorD = pMaiorD;
	} 
	public void recebeMenorD(double pMenorD) {
		menorD = pMenorD;
	} 
	public void calcAreaL() {
		area = (maiorD * menorD) / 2;
	} 
	public void mostrarAreaL() {
		System.out.println("Área do Losango: " +area);
	} 
	public double mostrarAreaLComRetorno() {
		System.out.println("Área do Losango com retorno: " + area);
		return area;
	}
} 