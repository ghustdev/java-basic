import java.util.Scanner;

public class Arrays {
	static void main() {
		// alocaçõa estática
		Scanner input = new Scanner(System.in);
		String[] produtos;
		
		Products[] vect = new Products[10];
		
		for (int i = 0; i <3; i++) {
			String name = "Teste";
			vect[i] = new Products(name);
		}
		
		for (int i = 0; i <3; i++) {
			System.out.println(vect[i].getName());
		}
		
		// matriz
		int n[][] = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println(" - ");
		}
	}
}
