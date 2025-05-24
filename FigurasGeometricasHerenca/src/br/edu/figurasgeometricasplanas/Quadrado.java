package br.edu.figurasgeometricasplanas;

public class Quadrado extends FiguraGeometricaPlana {
    protected double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public void calcArea() {
        area = lado * lado;
    }

    public String getNomeFigura() {
        return "Quadrado";
    }
}