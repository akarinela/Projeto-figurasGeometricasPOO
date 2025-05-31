package br.edu.figurasgeometricasplanas;
public class Pentagono extends FiguraGeometricaPlana{
    private double perimetro;
    private double apotema;

    public Pentagono() {
    	perimetro = 10;
    	apotema = 10;
    	
    } public void setPerimetro(double pPerimetro) {
        perimetro = perimetro;
    } public double getPerimetro() {
        return perimetro;
    } public void setApotema(double pApotema) {
        apotema = apotema;
    } public double getApotema() {
        return apotema;
    } public void calcArea() {
        area = (perimetro * apotema) / 2;
    }
}