package br.edu.figurasgeometricasplanas;

public class Trapezio extends FiguraGeometricaPlana {
    protected double baseMaior;
    protected double baseMenor;
    protected double altura;

    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public void calcArea() {
        area = ((baseMaior + baseMenor) * altura) / 2;
    }

    public String getNomeFigura() {
        return "Trapézio";
    }
}