package br.edu.figurasgeometricasespaciais;
public class Cilindro extends FiguraGeometricaEspacial{
    private double raio;
    private double altura;
    
    public Cilindro() {
    	raio = 10;
    	altura = 10;
    	
    } public void setRaio(double pRaio) {
		raio = raio;
	} public double getRaio() {
		return raio;
	} public void setAltura(double pAltura) {
		altura = altura;
	} public double getAltura() {
		return altura;
	} public void calcAreaBase() {
		areaBase = Math.PI * (raio * raio);
	} public void calcAreaTotalBase() {
		double areaTotalBase = 2 * Math.PI * (raio * raio);
	} public void calcAreaLateral() {
		areaLateral = Math.PI * raio * altura;
	} public void calcAreaTotal() {
		areaTotal = 2 * Math.PI * raio * (raio * altura);
	} public void calcVolume() {
		volume = Math.PI * (raio * raio) * altura;
	} public void calcArea() {
		area = area;
	} public void calcDiagonal() {
		diagonal = diagonal;
	} public void calcAlturaa() {
		altura = altura;
	}
	
	@Override
	public void calcAltura() {
		
	}
}