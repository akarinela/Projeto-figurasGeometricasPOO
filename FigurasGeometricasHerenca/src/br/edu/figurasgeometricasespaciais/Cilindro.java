package br.edu.figurasgeometricasespaciais;

public class Cilindro extends FiguraGeometricaEspacial {
    protected double raio;
    protected double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    @Override
    public void calcVolume() {
        volume = Math.PI * raio * raio * altura;
    }

    @Override
    public String getNomeFigura() {
        return "Cilindro";
    }
}
