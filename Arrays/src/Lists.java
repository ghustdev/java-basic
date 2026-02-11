import java.util.ArrayList;
import java.util.List;

public class Lists {
	static void main() {
		// estrutrua de dados do mesmo tipo e ordenada
		// inicia vazia e alocada dinamicamente, tamanho variavel
		// ponteiros de nós com lista encadeada
		// tipo List (interface), esse tipo não instancia
		// ArrayList, LinkedList
		// acesso sequencial, mas pode se comportar como vetor
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		List<Integer> list = new ArrayList<Integer>(); // para instaciar intarfaces, é necessário colocar uma lcasse que implemente ela
		
		list.add(1);
		list.add(2);
		
		list.removeIf(number -> number > 1); // função lambda / predicado
		
		for (Integer i : list) {
			System.out.println(i);
		}
	}
}
