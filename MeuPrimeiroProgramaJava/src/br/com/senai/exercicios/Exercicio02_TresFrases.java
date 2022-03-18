package br.com.senai.exercicios;

import java.util.Scanner;

public class Exercicio02_TresFrases {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um texto de 3 linhas: ");
		String primeiraPalavra = sc.nextLine();
		String segundaPalavra = sc.nextLine();
		String terceiraPalavra = sc.nextLine();
		System.out.println("==TRÊS LINHAS==");
//		System.out.println(primeiraPalavra);
//		System.out.println(segundaPalavra);
//		System.out.println(terceiraPalavra);
		sc.close();
		
		System.out.println(primeiraPalavra + " " + segundaPalavra + " " + terceiraPalavra);
	}
}
