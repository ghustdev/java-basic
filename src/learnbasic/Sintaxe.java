package learnbasic;

import java.util.ArrayList; // Library util tem utilizados do Java

// Converti um compact file em uma Class
// Crie um Package
public class Sintaxe {
	
	void main() {
		// com.example.sintaxe.Sintaxe Java - forma como escreve e elementos da linguagem (segue regras restritas)
		System.out.println("Hello World!"); // Legado
		IO.println("Hello World!"); // Moderno
		
		// ----- Variáveis -----
		// var: tipo de escopo local, identifica automaticamente o tipo, precisa do valor
		
		var idade = 20;
		String nome;
		nome = "Gustavo";
		double salario = 900.00;
		float meta_salarial = 10000.00F;
		
		// Primitivos: byte (8 bits), short (16 bits), int (32 bits), long
		// boolean, char = byte, double, float
		// String e Integer são clases
		
		if (salario < meta_salarial) {
			System.out.println("Nome: " + nome + "e Idade: " + idade);
		} else if (idade > 18) {
			System.out.println("Maior de idade");
		}
		
		// ----- Array / Vetores -----
		
		int[] idades = {1, 2, 3}; // Array pré inicializado
		int[] nums = new int[10]; // Array com 10 elementos
		int tamanho = nums.length;
		
		System.out.println("Tamanho: " + tamanho);
		System.out.println("Idades: " + idades[0]);
		
		// ----- ArrayLists / Alocação Dinâmica -----
		
		// Biblioteca: import java.util.Arraylist
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.remove(0); // Remove o index 0
		numbers.get(0); // index
		numbers.size(); // tamanho
		
		// ----- Casting -----
		// Implicito: apenas define o tipo de foma implicita
		int teste1 = 22;
		double teste2 = teste1;
		
		// teste1 = teste2; // Não pode, pois double é maior, use (int) teste2
		
		// Explicito: forçar
		teste1 = (int )teste2; // Funciona para primitivos
		
		char letra = 'a';
		String nomao = String.valueOf(letra); // Para classes
	}
}
