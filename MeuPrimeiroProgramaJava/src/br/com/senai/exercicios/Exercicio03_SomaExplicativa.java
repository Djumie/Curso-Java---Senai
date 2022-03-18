package br.com.senai.exercicios;

import java.util.Scanner;

public class Exercicio03_SomaExplicativa {

	public static void main(String[] args) {
		Scanner matematica = new Scanner(System.in);
		
		int numeroUm, numeroDois;
		
		System.out.println("Digite o primeiro número: ");
		numeroUm = matematica.nextInt();
		System.out.println("Digite o segundo número: ");
		numeroDois = matematica.nextInt();
		matematica.close();
		System.out.println("SOMA = " + (numeroUm + numeroDois));
		
	}

}
