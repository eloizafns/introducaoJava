package introducao;

import java.util.Scanner; // Importanto Scanner para dentro da classe

public class EntradaSaida {

	public static void main(String[] args) {
		
		// Variaveis
		String nome;
		float temperatura;
		float fahrenheit;
		
		// Construindo o leia
		Scanner leia = new Scanner(System.in);
		
		
		// Entrada de dados - Pedir/Inserir o nome, temperatura
		System.out.println("Insira o seu nome: ");
		nome = leia.next(); // nextLine();
		
		System.out.println("Insira a temperatura em Celsius: ");
		temperatura = leia.nextFloat();
		
		// Processamento
		fahrenheit = temperatura * 1.8f + 32;
		
		// Saída dos dados
		System.out.println("Bom dia" + nome);
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit); // Concatenação
	}

}
