package br.edu.figurasgeometricasplanas;

public class Triangulo extends FiguraGeometricaPlana {
    protected double base;
    protected double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcArea() {
        area = (base * altura) / 2;
    }

    public String getNomeFigura() {
        return "Triângulo";
    }
}