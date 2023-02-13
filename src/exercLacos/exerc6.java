package exercLacos;

import java.util.Scanner;


public class exerc6 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		int numero, multiplos=0, cont=0; 
		float media;
		
		do {
			System.out.println("Digite um numero inteiro: ");
			numero = entrada.nextInt();	
			
			if(numero % 3==0 && numero != 0) {
				multiplos =+ numero;
				cont++;
			}
			
		}while(numero !=0);
		
			media = multiplos / cont;
			System.out.printf("A média dos números multiplos de 3 é: %.1f",media);
		
	}
}
//Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)