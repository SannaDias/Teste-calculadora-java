package com.diocalculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b; 
		System.out.println("Digite o primeiro valor:");
		a = sc.nextInt();
		System.out.println("Digite o segundo valor:");
		b = sc.nextInt();
		
		int soma = soma(a,b);
		int subtracao =subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		int divisao = divisao(a,b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
	}

	public static int soma( int a,int b) {
		return a + b;
	}
	
	public static int subtracao( int a,int b) {
		return a - b;
	}
	
	public static int divisao( int a,int b) {
		return a / b;
	}
	
	public static int multiplicacao( int a, int b) {
		return a * b;
	}
	
	
	
}
