import java.util.Scanner;

public class j {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double totalDinheiro;
		
		System.out.print("Digite o total de dinheiro que irá levar para viagem: ");
		totalDinheiro = sc.nextInt();
		
		System.out.println("Total em Dólar Austaliano: " + (totalDinheiro / 3.55));
		System.out.println("Total em Bitcoin: " + (totalDinheiro / 200000));
		System.out.println("Total em Libra Esterlina: " + (totalDinheiro / 6.29));
		sc.close();
	}

}
