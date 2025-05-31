## Projeto de Figuras Geométricas Planas com POO
Programação Orientada a Objetos aplicada a Figuras Geométricas Planas

Este repositório foi desenvolvido com a finalidade de apresentar, de forma prática e didática, os principais conceitos da **Programação Orientada a Objetos (POO)**, aplicados ao cálculo de áreas de figuras geométricas planas. Através da criação de diferentes classes — cada uma representando uma figura específica — e da organização em pacotes, o projeto reforça princípios como encapsulamento, herança, modularidade, coesão e reutilização de código.

## Objetivo
Desenvolver métodos para calcular a área (com e sem retorno de valor) de várias figuras planas, utilizando os fundamentos da programação orientada a objetos na linguagem Java.

## ⚙️ Conceitos de POO Aplicados

◻️ Abstração

🧷 Encapsulamento

🧬 Herança

## 🗂️ figurasGeometricas - Abstração
Demonstra o conceito de abstração, ocultando os detalhes internos da implementação das figuras e expondo apenas o essencial para o usuário.

Pacotes:

br.edu.principal → Contém o método Principal com testes das classes.

br.edu.figurasgeometricasplanas → Contém classes abstratas e apenas figuras planas.

## 📐 UML - Diagrama de Abstração em Java
O diagrama de classes UML a seguir ilustra as relações entre os componentes do sistema, destacando as classes, métodos e organização dos pacotes:

![Calculadora Forma Geométricas](https://github.com/user-attachments/assets/d180fd41-6041-4ee8-b486-94a769a934ea)

[Ver PDF](docs/CalculadoraFormasGeométricasAbstração.pdf)

## 🗂️ figurasGeometricas – Encapsulamento
Este módulo aplica o conceito de encapsulamento, protegendo os atributos das classes e permitindo o acesso a eles apenas por meio de métodos públicos (get e set), garantindo segurança e controle sobre os dados.

Pacotes:

br.edu.principal → Classe principal responsável por executar chamadas aos métodos encapsulados.

br.edu.figurasgeometricasplanas → Contém classes como Triângulo, Retângulo, Losango etc.

br.edu.figurasgeometricasespaciais → Contém classes como Cubo, Esfera, Cilindro, Cone etc.

## 📐 UML - Diagrama de Encapsulamento em Java
Este diagrama demonstra o uso do princípio de encapsulamento em um programa Java, onde atributos são mantidos privados e acessados por meio de métodos públicos (getters e setters). O modelo mostra como as classes protegem seus dados internos e garantem acesso controlado:

![Calculadora Forma Geométricas](https://github.com/user-attachments/assets/bf98efc5-6ec0-4b8f-a83e-40cef52ca38e)

[Ver PDF](docs/CalculadoraFormasGeométricasEncapsulado.pdf)

## 🗂️ figurasGeometricas – Herança
Este módulo demonstra o uso de herança, permitindo a reutilização de código e a redução de redundância por meio da criação de subclasses que herdam atributos e comportamentos de superclasses.

Pacotes:

br.edu.principal → Classe principal responsável por executar o programa.

br.edu.figurasgeometricasplanas → Contém subclasses que herdam da classe abstrata FiguraPlana.

br.edu.figurasgeometricasespaciais → Contém subclasses que herdam da classe abstrata FiguraEspacial.

## 📐 UML - Diagrama de Herança em Java
O diagrama abaixo representa a aplicação do conceito de herança em Java, onde classes filhas herdam atributos e comportamentos de uma classe base. Ele ilustra a hierarquia entre classes, promovendo reutilização de código e extensão de funcionalidades:

![Calculadora Forma Geométricas](https://github.com/user-attachments/assets/4f2ba52a-ecc7-474e-9ee6-9defd7dcb335)

[Ver PDF](docs/CalculadoraFormaGeométricasHerença.pdf)

