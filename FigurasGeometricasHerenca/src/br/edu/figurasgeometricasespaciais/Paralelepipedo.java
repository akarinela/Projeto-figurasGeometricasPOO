package br.edu.figurasgeometricasespaciais;

public class Paralelepipedo extends FiguraGeometricaEspacial {
    protected double comprimento;
    protected double largura;
    protected double altura;

    public Paralelepipedo(double comprimento, double largura, double altura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    public void calcVolume() {
        volume = comprimento * largura * altura;
    }

    public String getNomeFigura() {
        return "Paralelepípedo";
    }
}