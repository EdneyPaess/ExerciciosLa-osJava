package exercLacos;

import java.util.Scanner;

public class exerc2 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		for (int numero = 1; numero <= 10; numero++) {
			if(numero % 2 == 0) {
				System.out.println("\n Numero pares: "+numero);
			}else if(numero % 2 ==1) {
				System.out.println("\n Numero impares: "+numero);
			}
		}

		
	}

}

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
