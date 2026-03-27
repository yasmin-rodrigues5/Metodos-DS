package prjSaudacao;

import java.util.Scanner;
public class Aplicacao {

	public static void main(String[] args) {
		// Exercicio 02 - Saudação Personalizada
		Saudacao n = new Saudacao ();
		
		Scanner sc = new Scanner (System.in);

		
		System.out.println("Digite o seu nome: ");
		String nome = sc.next();
		
		n.saudacaoPersonalizada( nome);
		
	}

}
