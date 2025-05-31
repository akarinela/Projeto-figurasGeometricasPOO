package br.edu.figurasgeometricasplanas;
public abstract class FiguraGeometricaPlana {
	protected double area;
	
	public void mostrarArea() {
        System.out.println("Área: " + area);
    } public double getArea() {
        System.out.println("Área com retorno: " + area);
        return area;
    }
    public abstract void calcArea();
}