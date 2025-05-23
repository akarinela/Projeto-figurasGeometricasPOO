package br.edu.figurasgeometricasespaciais;

public class Esfera extends FiguraGeometricaEspacial {
    protected double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public void calcVolume() {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    public String getNomeFigura() {
        return "Esfera";
    }
}