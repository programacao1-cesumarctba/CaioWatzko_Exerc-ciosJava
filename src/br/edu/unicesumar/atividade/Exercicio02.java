package br.edu.unicesumar.atividade;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String args[]) {
		int N;
		
		System.out.println("Atribua um novo valor para N: ");
		
		Scanner input = new Scanner(System.in);
		N = input.nextInt();
		
		if (N % 2 == 1){
			System.out.println("\n\nEstranho");
		}else if ((N % 2 == 0) && (N < 10)){
			System.out.println("\n\nNao e estranho");
		}else if ((N % 2 == 0) && (N > 10) && (N < 20)){
			System.out.println("\n\nEstranho");
		}else if ((N % 2 == 0) && (N > 20)){
			System.out.println("\n\nNao e estranho");
		}
	}
}