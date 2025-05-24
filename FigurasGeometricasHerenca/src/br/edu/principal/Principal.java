package br.edu.principal;

import br.edu.figurasgeometricasplanas.FiguraGeometricaPlana;

import br.edu.figurasgeometricasplanas.Circulo;
import br.edu.figurasgeometricasplanas.Hexagono;
import br.edu.figurasgeometricasplanas.Losango;
import br.edu.figurasgeometricasplanas.Paralelogramo;
import br.edu.figurasgeometricasplanas.Pentagono;
import br.edu.figurasgeometricasplanas.Quadrado;
import br.edu.figurasgeometricasplanas.Retangulo;
import br.edu.figurasgeometricasplanas.Trapezio;
import br.edu.figurasgeometricasplanas.Triangulo;

public class Principal {
    public static void main(String[] args) {
        FiguraGeometricaPlana[] figuras = {
            new Circulo(3),
            new Triangulo(5, 2),
            new Quadrado(4),
            new Retangulo(6, 3),
            new Losango(5, 2),
            new Trapezio(8, 4, 3),
            new Paralelogramo(7, 3),
            new Pentagono(10, 4),
            new Hexagono(6)
        };

        for (FiguraGeometricaPlana figura : figuras) {
            figura.calcArea();
            System.out.println("Área do " + figura.getNomeFigura() + ": " + figura.getArea());
        }
    }
}

