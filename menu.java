package prjMetodos;

public class Menu {
    public void exibirMenu(int n) {
           
   
        if (n==1) {
            System.out.println("1- Você escolheu a área do retangulo, obrigada!");
           
        }else if(n==2) {
            System.out.println("2- Você escolheu a área do Triangulo, obrigada!");
           
        }else if (n==3) {    
            System.out.println("3- Você escolheu a área do Circulo, obrigada!");
        }else if( n ==4) {
            System.out.println("4- Você escolheu a área do Losango, obrigada!");
        }else {
            System.out.println("5 - Sair");
           
        }

    }
}
