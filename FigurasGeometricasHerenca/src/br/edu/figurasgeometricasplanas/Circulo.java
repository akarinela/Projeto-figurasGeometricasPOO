package br.edu.figurasgeometricasplanas;
public class Circulo extends FiguraGeometricaPlana{
    private double raio;

    public Circulo() {
    	raio = 10;
    	
    } public void setRaio(double pRaio) {
        raio = raio;
    } public double getRaio() {
        return raio;
    } public void calcArea() {
        double area = Math.PI * raio * raio;
    }
}