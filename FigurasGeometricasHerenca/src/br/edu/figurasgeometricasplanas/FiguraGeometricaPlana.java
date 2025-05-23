package br.edu.figurasgeometricasplanas;

public abstract class FiguraGeometricaPlana {
    protected double area;

    public abstract void calcArea();

    public double getArea() {
        return area;
    }

    public String getNomeFigura() {
        return "Figura Genérica";
    }
}