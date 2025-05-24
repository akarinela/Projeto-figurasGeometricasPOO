package br.edu.figurasgeometricasplanas;

public class Retangulo extends FiguraGeometricaPlana {
    protected double base;
    protected double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcArea() {
        area = base * altura;
    }

    public String getNomeFigura() {
        return "Retângulo";
    }
}