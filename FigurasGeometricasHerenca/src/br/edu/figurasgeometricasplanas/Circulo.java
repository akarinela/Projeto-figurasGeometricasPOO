package br.edu.figurasgeometricasplanas;

public class Circulo extends FiguraGeometricaPlana {
    protected double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void calcArea() {
        area = Math.PI * raio * raio;
    }

    public String getNomeFigura() {
        return "Círculo";
    }
}