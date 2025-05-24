package br.edu.figurasgeometricasplanas;

public class Hexagono extends FiguraGeometricaPlana {

    private double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    public void calcArea() {
        area = ((3 * Math.sqrt(3)) / 2) * lado * lado;
    }
}