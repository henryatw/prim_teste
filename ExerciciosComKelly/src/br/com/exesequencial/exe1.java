package br.com.exesequencial;

import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int a = sc.nextInt();
		
		System.out.println("Digite o segundo numero");
		int b = sc.nextInt();
		
		int soma = a+b;
		System.out.println("Este valor "+soma+" é a soma do primeiro numere + o segundo numero");

	}

}
