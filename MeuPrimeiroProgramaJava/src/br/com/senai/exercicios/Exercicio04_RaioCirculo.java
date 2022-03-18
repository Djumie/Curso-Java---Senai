package br.com.senai.exercicios;

import java.util.Scanner;

public class Exercicio04_RaioCirculo {

	public static void main(String[] args) {
		// Fórmula da área = π * raio²
		// π = 3.141559
		Scanner circulo = new Scanner(System.in);
		System.out.println("==================================================");
		System.out.println("================RAIO DO CÍRCULO===================");
		System.out.println("==================================================");
		System.out.println();
		System.out.print("Digite o raio do círculo: ");
		double pi = 3.141559;
		double raio = circulo.nextDouble();
		double area = pi * Math.pow(raio, 2.0);
		System.out.println("==================================================");
		System.out.printf("A área do círculo é %.4f%n", area);
		pi = Math.PI;
		System.out.printf("A área do círculo é %.4f%n", area);
		System.out.println("==================================================");
		System.out.println("==================================================");
		circulo.close();
	}

}
