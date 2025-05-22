package br.edu.figurasgeometricasplanas;

public class Retangulo {
		
		private double base;
		private double altura;
		private double area;
		
		public Retangulo() {
			base = 0;
			altura = 0;
			area = 0;
			
		}
		
		public void recebeAltura(double altura) {
			this.altura = altura;
		}
		public void recebeBase(double pBase) {
			base = pBase;
		}
		public void calcArea() {
			area = (base * altura);
		}
		public void mostrarArea() {
			System.out.println ("Área do Retangulo: " + area);
		}
		public double mostrarAreaReComRetorno() {
			System.out.println ("Área do Retangulo com retorno: " + area);
			return area;
		}
}