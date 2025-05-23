package br.edu.figurasgeometricasespaciais;

public class Tetraedro extends FiguraGeometricaEspacial {
    protected double aresta;

    public Tetraedro(double aresta) {
        this.aresta = aresta;
    }

    public void calcVolume() {
        volume = (Math.pow(aresta, 3)) / (6 * Math.sqrt(2));
    }

    public String getNomeFigura() {
        return "Tetraedro";
    }
}