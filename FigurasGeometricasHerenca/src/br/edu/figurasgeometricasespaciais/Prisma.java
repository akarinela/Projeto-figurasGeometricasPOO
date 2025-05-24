package br.edu.figurasgeometricasespaciais;

public class Prisma extends FiguraGeometricaEspacial {
    protected double areaBase;
    protected double altura;

    public Prisma(double areaBase, double altura) {
        this.areaBase = areaBase;
        this.altura = altura;
    }

    @Override
    public void calcVolume() {
        volume = areaBase * altura;
    }

    @Override
    public String getNomeFigura() {
        return "Prisma";
    }
}