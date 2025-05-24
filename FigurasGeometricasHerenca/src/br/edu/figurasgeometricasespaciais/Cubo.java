package br.edu.figurasgeometricasespaciais;

public class Cubo extends FiguraGeometricaEspacial {
    protected double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcVolume() {
        volume = lado * lado * lado;
    }

    @Override
    public String getNomeFigura() {
        return "Cubo";
    }
}