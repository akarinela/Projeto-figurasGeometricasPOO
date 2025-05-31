package br.edu.figurasgeometricasplanas;
public class Hexagono extends FiguraGeometricaPlana{
    private double lado;

    public Hexagono() {
    	lado = 10;
    	
    } public void setLado(double pLado) {
        lado = lado;
    } public double getLado() {
    	return lado;
    } public void calcArea() {
        double area = (3 * Math.sqrt(3) * (lado * lado)) / 2;
    }
}