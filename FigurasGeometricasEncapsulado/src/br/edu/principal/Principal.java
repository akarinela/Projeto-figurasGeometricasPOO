package br.edu.principal;

import br.edu.figurasgeometricasplanas.*;

public class Principal {
	public static void main(String[] args) {
		
		Triangulo fg1 = new Triangulo();
		fg1.setBase(5);
		fg1.setAltura(5);
		fg1.calcArea();
		fg1.getArea();
		double recebeAreaTr = fg1.mostrarAreaTrComRetorno();

		Quadrado fg2 = new Quadrado();
		fg2.setLado(5);                                                                                                
		fg2.calcArea();
		fg2.getArea();
		double recebeAreaQu = fg2.mostrarAreaQuComRetorno();
		

		Retangulo fg3 = new Retangulo();
		fg3.setAltura(5);
		fg3.setBase(5);
		fg3.calcArea();
		fg3.getArea();
		double recebeAreaRe = fg3.mostrarAreaReComRetorno();
		
		Circulo fg4 = new Circulo();
		fg4.setRaio(5);
		fg4.calcArea();
		fg4.getArea();
		double recebeAreaC = fg4.mostrarAreaCComRetorno();
		
		Losango fg5 = new Losango();
		fg5.setMaiorD(5);
		fg5.setMenorD(5);
		fg5.calcAreaL();
		fg5.getArea();
		double recebeAreaL = fg5.mostrarAreaLComRetorno();

		Trapezio fg6 = new Trapezio();
		fg6.setMaiorB(5);
		fg6.setMenorB(5);
		fg6.setAltura(5);
		fg6.calcArea();
		fg6.getArea();
		double recebeAreaTp = fg6.mostrarAreaTpComRetorno();
		
		Paralelogramo fg7 = new Paralelogramo();
		fg7.setAltura(5);
		fg7.setBase(5);
		fg7.calcArea();
		fg7.getArea();
		double recebeAreaP = fg7.mostrarAreaPComRetorno();
		
		Hexagono fg8 = new Hexagono();
		fg8.setLado(5);
		fg8.calcArea();
		fg8.getArea();
		double recebeAreaH = fg8.mostrarAreaHComRetorno();
		
		Pentagono fg9 = new Pentagono();
		fg9.setApotema(5);
		fg9.setPerimetro(5);
		fg9.calcAreaPe();
		fg9.getArea();
		double recebeAreaPe = fg9.mostrarAreaPeComRetorno();
	}
}
