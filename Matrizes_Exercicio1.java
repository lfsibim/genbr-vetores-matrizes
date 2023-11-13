package VetoresMatrizes;

import java.util.Scanner;

public class Matrizes_Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		int x, y, somaPrin = 0, somaSec = 0;
		int diagPrin[] = new int[3];
		int diagSec[] = new int[3];
		
		
		// insere os dados na matriz
		for(x = 0; x < 3; x++) {
			for(y = 0; y < 3; y++) {
				System.out.println("\nDigite um número inteiro: ");
				matriz[x][y] = input.nextInt();			
			}
		}
		// identifica os dados da diagonal principal e secundária e faz a soma
		for(x = 0; x < 3; x++) {
			for(y = 0; y < 3; y++) {
				if(x == y) {
					diagPrin[x] = matriz[x][y];
					somaPrin += matriz[x][y];
				}
				if(x + y == 2) {
					diagSec[x] = matriz[x][y];
					somaSec += matriz [x][y];
				}
			}
		}
		
		// mostra os elementos da diagonal principal
		System.out.println("\nElementos da diagonal principal: ");
		for(x = 0; x < 3; x++) {
			System.out.println(diagPrin[x] + " ");
		}
		
		// mostra os elementos da diagonal secundária
		System.out.println("\nElementos da diagonal secundário: ");
		for(x = 0; x < 3; x++) {
			System.out.println(diagSec[x] + " ");
		}
			
		// soma dos elementos da diagonal principal
		System.out.println("\nSoma dos elementos da diagonal principal: "+somaPrin);
		
		
		// soma dos elementos da diagonal secundária
		System.out.println("\nSoma dos elementos da diagonal secundária: "+somaSec);
		
	}

}
