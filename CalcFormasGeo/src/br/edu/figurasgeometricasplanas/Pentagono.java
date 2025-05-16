package br.edu.figurasgeometricasplanas;
public class Pentagono {

	private double perimetro;
	private double apotema;
	private double area;
	
	public Pentagono() {
		perimetro = 10;
		apotema = 10;
		area = 0;
		
	} public void recebePerimetro(double pPerimetro) {
		perimetro = pPerimetro;
	} 
	public void recebeApotema(double pApotema) {
		apotema = pApotema;
	} 
	public void calcAreaPe() {
		area = (perimetro * apotema) / 2;
	} 
	public void mostrarAreaPe() {
		System.out.println("Área do Pentagono: " + area);
	} 
	public double mostrarAreaPeComRetorno() {
		System.out.println("Área do Pentagono com retorno: " + area);
		return area;
	}
} 