package br.edu.figurasgeometricasplanas;

public class Pentagono extends FiguraGeometricaPlana {
    protected double perimetro;
    protected double apotema;

    public Pentagono(double perimetro, double apotema) {
        this.perimetro = perimetro;
        this.apotema = apotema;
    }

    public void calcArea() {
        area = (perimetro * apotema) / 2;
    }

    public String getNomeFigura() {
        return "Pentágono";
    }
}