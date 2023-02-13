package exercLacos;

import java.util.Scanner;

public class exerc1 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		for(int numero = 1000; numero <= 1999; numero ++) {
			if(numero % 11 == 5) {
				System.out.println("O resto é: "+numero);
			}
			
		}

	}

}

//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)