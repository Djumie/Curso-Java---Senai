package br.com.senai.exercicios;

import java.util.Scanner;

public class Exercicio05_DiferencaDeQuatroNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================================");
		System.out.println("============DIFEREN�A DE 4 N�MEROS================");
		System.out.println("==================================================");
		System.out.println();
		System.out.println("DIGITE OS N�MEROS A, B, C E D, EM SEQU�NCIA: ");
		int A, B, C, D;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		sc.close();
		System.out.println("==================================================");
		System.out.println("DIFEREN�A = " + (A * B - C * D));
		System.out.println("==================================================");
	}
}
