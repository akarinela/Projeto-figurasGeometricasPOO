package br.edu.figurasgeometricasespaciais;

public class Tetraedro {

	private double volume;
	private double aresta;

	public Tetraedro() {
		aresta = 0;
		volume = 0;
	}

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	public double getVolume() {
		return volume;
	}

	public void calcVolume() {
		volume = (Math.pow(aresta, 3)) / (6 * Math.sqrt(2));
	}

	public double mostrarVolumeComRetorno() {
		System.out.println("Volume do Tetraedro com retorno: " + volume);
		return volume;
	}
}