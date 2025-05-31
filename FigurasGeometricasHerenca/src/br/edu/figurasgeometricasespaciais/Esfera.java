package br.edu.figurasgeometricasespaciais;
public class Esfera extends FiguraGeometricaEspacial{
    private double raio;

    public Esfera() {
    	raio = 10;
    	
    } public void setRaio(double pRaio) {
        raio = raio;
    } public double getRaio() {
        return raio;
    } public void calcArea() {
    	area = 4 * Math.PI * (raio * raio);
    } public void calcVolume() {
        volume = (4 / 3) * Math.PI * (raio  * raio * raio);
    } public void calcAreaTotal() {
		areaTotal = areaTotal;
	} public void calcDiagonal() {
		diagonal = diagonal;
	} public void calcAreaTotalBase() {
		 areaTotalBase = areaTotalBase;
	} public void calcAlturaa() {
		altura = altura;
	}
	
	@Override
	public void calcAltura() {
		
	}
}