package prjFatorial;

import java.util.Scanner;
public class Aplicacao {

	public static void main(String[] args) {
		// Exercicio 04 - Recebe número e apresenta fatorial
		Fatorial fat = new Fatorial ();
		
		Scanner sc = new Scanner (System.in);

		
		System.out.println("Digite aqui um número para descobrir o fatorial: ");
		long numeroFat = sc.nextLong();		//obs: foi usado o tipo long pois estava estourando a quantidade de caracteres
		
		fat.exibirFatorial(numeroFat);
		
	}
}



