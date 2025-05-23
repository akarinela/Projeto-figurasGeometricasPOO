package br.edu.figurasgeometricasespaciais;

public class Cubo extends FiguraGeometricaEspacial {
    protected double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public void calcVolume() {
        volume = lado * lado * lado;
    }

    public String getNomeFigura() {
        return "Cubo";
    }
}