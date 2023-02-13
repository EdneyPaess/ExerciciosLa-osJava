package exercLacos;

import java.util.Scanner;

public class exerc2 {

	public static void main(String[] args) {

		int par=0, impar=0;
		Scanner entrada= new Scanner(System.in);
		
		for (int numero = 1; numero <= 10; numero++) {
			System.out.println("Digite um numero: ");
			numero= entrada.nextInt();
			
			if(numero % 2 == 0) {
				par++;
				
			}else if(numero % 2 ==1) {
				impar++;
				
			}
			
		}
		System.out.println("\n Impar: "+impar);
		System.out.println("\n Par: "+par);
	}
}

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
