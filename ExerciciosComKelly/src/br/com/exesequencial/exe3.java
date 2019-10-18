package br.com.exesequencial;

import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero A");
		int a = sc.nextInt();
		System.out.println("Digite o numero B");
		int b = sc.nextInt();
		System.out.println("Digite o numero C");
		int c = sc.nextInt();
		System.out.println("Digite o numero D");
		int d = sc.nextInt();
		
		int form = a * b - c * d;
		System.out.println("A diferenca do produto de A e B pelo produto de C e D é: "+form);
	}
}