import java.util.Scanner;

public class n {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double pesoSaco, quantidadeRacao;

		System.out.print("Peso do saco: ");
		pesoSaco = sc.nextDouble();

		System.out.print("Quantidade de ra��o fornecida para cada gato: ");
		quantidadeRacao = sc.nextDouble();
		
		System.out.println("Restante de ra��o: " + (pesoSaco - (5 * (quantidadeRacao/1000 * 2))));
		sc.close();
	}

}
