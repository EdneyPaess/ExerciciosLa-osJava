package exercLacos;

import java.util.Scanner;

public class exerc5 {

	public static void main(String[] args) {
		int numero,resultado=0;
		Scanner leia= new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			resultado += numero;
			
			
		}while(numero != 0);
		
		System.out.println("O resultado da soma dos numeros digitados é: "+resultado);

	}

}

//Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)