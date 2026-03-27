package prjMetodos;

import java.util.Scanner;
public class Aplicacao {

    public static void main(String[] args) {
       
        Menu a = new Menu ();
       
        Scanner sc = new Scanner (System.in);
       
        System.out.println("digite o número da área que deseja ver:");
        System.out.println("1-Área do Retangulo \n2-Área do Triangulo \n3-área do Circulo \n4-Área do Losango \n5-Sair" );
        int n = sc.nextInt();
       
        a.exibirMenu (n);
        sc.close();
    }
}

