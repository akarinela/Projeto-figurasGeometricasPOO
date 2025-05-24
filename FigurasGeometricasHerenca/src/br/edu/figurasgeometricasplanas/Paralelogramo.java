package br.edu.figurasgeometricasplanas;

public class Paralelogramo extends FiguraGeometricaPlana {
    protected double base;
    protected double altura;

    public Paralelogramo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcArea() {
        area = base * altura;
    }

    public String getNomeFigura() {
        return "Paralelogramo";
    }
}