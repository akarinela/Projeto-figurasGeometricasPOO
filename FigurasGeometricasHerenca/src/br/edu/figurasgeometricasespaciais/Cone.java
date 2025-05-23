package br.edu.figurasgeometricasespaciais;

public class Cone extends FiguraGeometricaEspacial {
    protected double raio;
    protected double altura;

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public void calcVolume() {
        volume = (Math.PI * raio * raio * altura) / 3;
    }

    public String getNomeFigura() {
        return "Cone";
    }
}