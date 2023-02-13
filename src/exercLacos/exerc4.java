package exercLacos;

import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int cont= 0, idade, genero, comportamento,mulheresNervosas=0, calmas=0,homensAgressivos=0;
		
		System.out.println("Digite sua idade: ");
		idade= leia.nextInt();
		
		

		while (cont < 2){
			System.out.println("Digite seu Gênero: Digite 1 para feminio, 2 para masculino e 3 para outros.");
			genero= leia.nextInt();
			
			System.out.println("Digite selecione seu comportamento: digite 1 se for calmo, 2 se for nervoso(a) e 3 se for agressivo(a)");
			comportamento= leia.nextInt();
			
			if( comportamento == 1) {
				calmas++;;
				
			}else if(genero == 1 && comportamento == 2) {
				mulheresNervosas++;
				
			}else if( genero == 2 && comportamento == 3) {
				homensAgressivos++;
			
			}
			
			if (idade >= 40 && comportamento == 2 ) {
				System.out.println("Quantidade de pessoas nervosas com mais de 40 anos: "+ mulheresNervosas);
				
			}else if(idade <= 18 && comportamento == 1) {
				System.out.println("Quantidade de pessoas calmas com menos de 18 anos: "+ calmas);
				
			}
		}
	
	}

}

//Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado: idade, identificação de gênero (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
