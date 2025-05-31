package br.edu.figurasgeometricasplanas;
public class Quadrado extends FiguraGeometricaPlana{
    private double lado;

    public Quadrado() {
    	lado = 10;
    	
    } public void setLado(double pLado) {
        lado = lado;
    } public double getLado() {
        return lado;
    } public void calcArea() {
        area = lado * lado;
    }
}