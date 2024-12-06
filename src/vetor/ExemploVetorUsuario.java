package vetor;

import java.util.Scanner;

public class ExemploVetorUsuario {

	public static void main(String[] args) {
		
		// tipo nome_vetor[] = new tipo [quantidade_valores];
		int numeros[] = new int[3]; // 0-1-2-3-4
		//0[8] 1[] 2[]
		
		Scanner leia = new Scanner(System.in);

		for (int indice = 0; indice < 3; indice++) { //esse guarda informação
			System.out.println("Digite o " + (indice + 1) + "º Número: ");
			numeros[indice] = leia.nextInt(); // ler algo e adicionar ao vetor
			// nome = leia.next();
			// numeros [0] = 8
			
			//armazena o que o usuario escreveu
		}

		System.out.println("\nOs números digitados foram: \n");

		for (int indice = 0; indice < 3; indice++) { //esse lista as informações guardadas
			System.out.println((indice + 1) + "º número: " + numeros[indice]);
		}

	}

}
