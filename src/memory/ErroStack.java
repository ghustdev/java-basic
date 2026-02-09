package memory;

// teste para forçar o erro

public class ErroStack {
	public static void main(String[] args) {
		metodoRecursivo();
	}
	
	public static void metodoRecursivo() {
		// O método chama a si mesmo criando novos blocos na Stack
		// até que a memória da pilha acabe.
		metodoRecursivo();
		
		// Lembrando que a memória em Stack é menor, porém rápida
		// Enquando a memória e Heap é maior e lenta
	}
}
