package VetoresMatrizes;

import java.util.Scanner;

public class Matrizes_Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float notas[][] = new float[10][4];
		float mediaAluno[] = new float[10];
		float somaNotas = 0;
		int x, y;
		
		// inserir as notas dos alunos na matriz
		for(x = 0; x < 10; x++) {
			System.out.println("\nNotas do "+(x + 1)+"º aluno: ");
			for(y = 0; y < 4; y++) {
				System.out.println("\nEntre com a "+(y + 1)+"ª nota: ");
				notas[x][y] = input.nextFloat();
				somaNotas += notas[x][y]; //somar as notas de cada aluno
			}
			mediaAluno[x] = somaNotas / 4; //calcular a media de cada aluno incluindo num vetor
			somaNotas = 0;
		}
		
		// mostrar a média de cada aluno
		for(x = 0; x < 10; x++) {
			System.out.printf("\nMédia do "+(x + 1)+"º aluno(a) foi de: %.1f",mediaAluno[x]);
		}
		

	}

}
