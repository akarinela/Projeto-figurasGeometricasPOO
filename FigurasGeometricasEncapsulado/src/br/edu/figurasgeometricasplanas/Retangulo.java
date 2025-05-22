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
		
		public void calcArea() {
			area = (base * altura);
		}
	
		public double getBase() {
			return base;
		}

		public void setBase(double base) {
			this.base = base;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}

		public double getArea() {
			return area;
		}

		public double mostrarAreaReComRetorno() {
			System.out.println ("Área do Retangulo com retorno: " + area);
			return area;
		}
}