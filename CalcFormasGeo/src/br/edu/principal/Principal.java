package br.edu.principal;

import br.edu.figurasgeometricasplanas.*;

public class Principal {
	public static void main(String[] args) {
		
		Triangulo fg1 = new Triangulo();
		fg1.recebeAltura(5);
		fg1.recebeBase(5);
		fg1.calcArea();
		fg1.mostrarArea();
		double recebeAreaTr = fg1.mostrarAreaTrComRetorno();

		Quadrado fg2 = new Quadrado();
		fg2.recebeLado(5);                                                                                                
		fg2.calcArea();
		fg2.mostrarArea();
		double recebeAreaQu = fg2.mostrarAreaQuComRetorno();
		

		Retangulo fg3 = new Retangulo();
		fg3.recebeAltura(5);
		fg3.recebeBase(5);
		fg3.calcArea();
		fg3.mostrarArea();
		double recebeAreaRe = fg3.mostrarAreaReComRetorno();
		
		Circulo fg4 = new Circulo();
		fg4.recebeRaio(5);
		fg4.calcArea();
		fg4.mostrarArea();
		double recebeAreaC = fg4.mostrarAreaCComRetorno();
		
		Losango fg5 = new Losango();
		fg5.recebeMaiorD(5);
		fg5.recebeMenorD(5);
		fg5.calcAreaL();
		fg5.mostrarAreaL();
		double recebeAreaL = fg5.mostrarAreaLComRetorno();

		Trapezio fg6 = new Trapezio();
		fg6.recebeMaiorB(5);
		fg6.recebeMenorB(5);
		fg6.recebeAltura(5);
		fg6.calcArea();
		fg6.mostrarArea();
		double recebeAreaTp = fg6.mostrarAreaTpComRetorno();
		
		Paralelogramo fg7 = new Paralelogramo();
		fg7.recebeAltura(5);
		fg7.recebeBase(5);
		fg7.calcArea();
		fg7.mostrarArea();
		double recebeAreaP = fg7.mostrarAreaPComRetorno();
		
		Hexagono fg8 = new Hexagono();
		fg8.recebeLado(5);
		fg8.calcArea();
		fg8.mostrarArea();
		double recebeAreaH = fg8.mostrarAreaHComRetorno();
		
		Pentagono fg9 = new Pentagono();
		fg9.recebePerimetro(5);
		fg9.recebeApotema(5);
		fg9.calcAreaPe();
		fg9.mostrarAreaPe();
		double recebeAreaPe = fg9.mostrarAreaPeComRetorno();
	}
}