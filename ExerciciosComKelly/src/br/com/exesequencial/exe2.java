package br.com.exesequencial;

import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do raio do circulo");
		double r = sc.nextDouble();
		
		double form_area = 3.14159 * r * r;
	
		System.out.printf("O raio é = %.4f",form_area);
	}
}