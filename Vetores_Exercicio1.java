package VetoresMatrizes;

import java.util.Scanner;

public class Vetores_Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero = 0, x, indice = 0;
		boolean pesquisar = false;
		
		System.out.println("\nDigite o número que deseja encontrar: ");
		numero = input.nextInt();		
		
		
		// percorre o vetor. Se achar numero digitado, guarda na variavel indice e muda booleano para true
		for(x = 0; x < 10; x++) {
			if(numero == vetor[x]) {
				indice = x;
				pesquisar = true;	
			}
		}	
		// mostra o resultado de acordo com o booleano
		if(pesquisar == true) {
			System.out.println("\nO número "+numero+" está localizado na posição "+indice+".");
		}else {
			System.out.println("\nO número "+numero+" não foi encontrado.");
		}
		
	}

}
