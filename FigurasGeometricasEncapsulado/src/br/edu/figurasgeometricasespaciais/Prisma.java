package br.edu.figurasgeometricasespaciais;

public class Prisma {

	private double volume;
	private double areaBase;
	private double altura;

	public Prisma() {
		areaBase = 0;
		altura = 0;
		volume = 0;
	}

	public double getAreaBase() {
		return areaBase;
	}

	public void setAreaBase(double areaBase) {
		this.areaBase = areaBase;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getVolume() {
		return volume;
	}

	public void calcVolume() {
		volume = areaBase * altura;
	}

	public double mostrarVolumeComRetorno() {
		System.out.println("Volume do Prisma com retorno: " + volume);
		return volume;
	}
}