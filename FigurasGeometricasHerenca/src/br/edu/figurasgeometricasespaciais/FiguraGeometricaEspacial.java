package br.edu.figurasgeometricasespaciais;

public abstract class FiguraGeometricaEspacial {
    protected double volume;

    public abstract void calcVolume();

    public double getVolume() {
        return volume;
    }

    public String getNomeFigura() {
        return "Figura Espacial Genérica";
    }
}