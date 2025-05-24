package br.edu.figurasgeometricasplanas;

public class Losango extends FiguraGeometricaPlana {
    protected double diagonalMaior;
    protected double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    public void calcArea() {
        area = (diagonalMaior * diagonalMenor) / 2;
    }

    public String getNomeFigura() {
        return "Losango";
    }
}