package exercLacos;

import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int idade, idadeMenor= 0,idadeMaior= 0;
		
		System.out.println("Digite sua idade; ");
		idade = entrada.nextInt();
		
		
		while(idade >= 0){
			
			if(idade < 21) {
				idadeMenor++;
				
			}if(idade > 50) {
				idadeMaior++;
			}
		     System.out.println("Digite sua idade: ");
		     idade = entrada.nextInt();
			
		}
	    	System.out.println("Total de pessoas maiores de 50 anos: "+idadeMenor);
	    	System.out.println("Total de pessoas maiores de 50 anos: "+idadeMaior);
	}

}

//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)