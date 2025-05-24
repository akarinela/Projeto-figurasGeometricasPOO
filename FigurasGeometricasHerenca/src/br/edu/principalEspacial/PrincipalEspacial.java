package br.edu.principalEspacial;

import br.edu.figurasgeometricasespaciais.Cilindro;
import br.edu.figurasgeometricasespaciais.Cone;
import br.edu.figurasgeometricasespaciais.Cubo;
import br.edu.figurasgeometricasespaciais.Esfera;
import br.edu.figurasgeometricasespaciais.FiguraGeometricaEspacial;
import br.edu.figurasgeometricasespaciais.Paralelepipedo;
import br.edu.figurasgeometricasespaciais.Piramide;
import br.edu.figurasgeometricasespaciais.Prisma;
import br.edu.figurasgeometricasespaciais.Tetraedro;


public class PrincipalEspacial {
    public static void main(String[] args) {
        FiguraGeometricaEspacial[] figuras = new FiguraGeometricaEspacial[] {
            new Cilindro(3, 5),
            new Cone(3, 5),
            new Cubo(4),
            new Piramide(6, 10),
            new Prisma(8, 12),
            new Paralelepipedo(4, 5, 6),
            new Tetraedro(6),
            new Esfera(5)
        };

        for (FiguraGeometricaEspacial figura : figuras) {
            figura.calcVolume();
            System.out.println("Volume do " + figura.getNomeFigura() + ": " + figura.getVolume());
        }
    }
}
