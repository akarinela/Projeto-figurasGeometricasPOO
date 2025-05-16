# Projeto-figurasGeometricasPOO
Figuras Geométricas Planas - Programação Orientada a Objetos
Este repositório foi desenvolvido com o objetivo de demonstrar, de forma clara e prática, os conceitos de Programação Orientada a Objetos (POO) aplicados ao cálculo de áreas de figuras geométricas planas. Através da criação de diferentes classes, cada uma representando uma figura geométrica, e da separação de pacotes, o projeto evidencia princípios como encapsulamento, herança, coesão, reutilização e organização modular de código.

Objetivo
Implementar o cálculo de área (com e sem retorno de valor) para diversas figuras geométricas planas utilizando os conceitos fundamentais da orientação a objetos em Java.

Arquitetura do Projeto
O projeto está dividido em dois pacotes principais:

📁 br.edu.principal
Contém a classe principal do programa, com o método main, responsável por:

Executar os métodos de cálculo de área.
Demonstrar o uso prático das classes criadas.
📁 br.edu.figurasgeometricasplanas
Este pacote contém todas as classes que representam as figuras geométricas planas. Cada classe mostrando os atributos e comportamentos específicos de uma figura, e possui:

Métodos sem retorno que imprimem diretamente a área.
Métodos com retorno que devolvem a área calculada.
Figuras Geométricas Implementadas
As seguintes figuras foram implementadas como classes independentes:
---
Triângulo
Quadrado
Retângulo
Círculo
Losango
Trapézio
Paralelogramo
Hexágono
Pentágono
Cada classe segue uma estrutura padrão com:

Atributos privados (bases, altura, lados, raio, etc.)
Construtor para inicialização de atributos
Métodos calcArea#() com e sem retorno
UML - Diagrama de Classes
O diagrama de classes UML a seguir ilustra as relações entre os componentes do sistema, destacando as classes, métodos e organização dos pacotes:
