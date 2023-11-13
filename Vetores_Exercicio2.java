package VetoresMatrizes;

import java.util.Scanner;

public class Vetores_Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int x, num, soma = 0;
		double media;
		
		// persistir dados no vetor
		for(x = 0; x < 10; x++) {
			System.out.println("Digite um número: \n");
			vetor[x] = input.nextInt();
		}
		
		// buscar elementos nos índices ímpares do vetor
		System.out.println("\nElemento nos índices ímpares: ");
		for(x = 0; x < vetor.length; x++) {
			if(x % 2 != 0) {
				System.out.println(vetor[x]);
			}
		}
		
		// buscar os elementos pares no vetor
		System.out.println("\nElementos pares: ");
		for(x = 0; x < vetor.length; x++) {
			if(vetor[x] % 2 == 0) {
				System.out.println(vetor[x]);
			}
		}
		
		// somar todos os elementos do vetor
		for(x = 0; x < vetor.length; x++) {
			soma += vetor[x];
		}
		System.out.println("\nSoma: "+soma);
		
		// media de todos os elementos do vetor
		
		media = (double)soma / vetor.length;
		System.out.printf("\nMédia: %.2f",media);
				
	}

}
