package memory;

import java.util.Scanner;

public class LearnMemory {
	static void main() {
		int idade = 20; // Vai para a STACK (Primitivo)
		
		// 'p1' (referência) vai para a STACK
		// 'new Pessoa()' (objeto) vai para o HEAP
//		Pessoa p1 = new Pessoa("Gustavo");
		Scanner sc = new Scanner(System.in);
		
		sc = null; // Cortamos a referência.
		// O objeto "Gustavo" no HEAP agora é alvo do Garbage Collector (GC).
	}
}
