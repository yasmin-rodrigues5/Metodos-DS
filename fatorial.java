package prjFatorial;

public class Fatorial {
	public void exibirFatorial (long numeroFat ) {
		
		long fatorial = 1;		//obs: foi usado o tipo long pois estava estourando a quantidade de caracteres
		
		
		 for (int i = 1; i <= numeroFat; i++) {
		        fatorial = fatorial * i;
		       
		 }

		
		System.out.println("Fatorial de " + numeroFat +" é: ! " + fatorial);
	}
}
