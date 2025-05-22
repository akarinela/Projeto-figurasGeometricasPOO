package br.edu.figurasgeometricasplanas;
public class Pentagono {

	private double perimetro;
	private double apotema;
	private double area;
	
	public Pentagono() {
		perimetro = 10;
		apotema = 10;
		area = 0;
		
	}
	
	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public double getArea() {
		return area;
	}

	public void calcAreaPe() {
		area = (perimetro * apotema) / 2;
	} 
	
	public double mostrarAreaPeComRetorno() {
		System.out.println("Área do Pentagono com retorno: " + area);
		return area;
	}
} 