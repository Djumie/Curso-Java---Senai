package br.com.senai.exercicios;

import java.util.Scanner;

public class Exercicio05_DiferencaDeQuatroNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================================");
		System.out.println("============DIFERENÇA DE 4 NÚMEROS================");
		System.out.println("==================================================");
		System.out.println();
		System.out.println("DIGITE OS NÚMEROS A, B, C E D, EM SEQUÊNCIA: ");
		int A, B, C, D;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		sc.close();
		System.out.println("==================================================");
		System.out.println("DIFERENÇA = " + (A * B - C * D));
		System.out.println("==================================================");
	}
}
