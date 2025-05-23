package br.edu.figurasgeometricasespaciais;

public class Piramide extends FiguraGeometricaEspacial {
    protected double base;
    protected double altura;

    public Piramide(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcVolume() {
        volume = (base * altura) / 3;
    }

    public String getNomeFigura() {
        return "Pirâmide";
    }
}