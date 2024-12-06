package vetor;

public class ExemploVetor {

	public static void main(String[] args) {

		String cachorros[] = { "Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi" };
		// Tipo nome_vetor [] = { valores }
		
		// nome_do_vetor [indice]
		//rua[1] == "João"
		
		//Essa estrutura está percorrendo o vetor.
		for (int indice = 0; indice < 5; indice++) { // indice = indice(1) +1
			System.out.println((indice + 1) + "º elemento: " + cachorros[indice]); // esse +1 é para aparecer 1º
		}

	}

}
