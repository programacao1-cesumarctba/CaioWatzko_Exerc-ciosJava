package br.edu.unicesumar.atividade;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String args[]) {
		
		int num;
		
		System.out.println("Digite um numero: ");
		
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		if(num % 2 == 0){
			System.out.println("\n\nO numero e par");
		}else{
			System.out.println("\n\nO numero e impar");
		}
	}
}