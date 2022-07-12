import java.util.Scanner;

public class l {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double custoShow, precoIngresso;

		System.out.print("Custo do Show: ");
		custoShow = sc.nextDouble();

		System.out.print("Preço do ingresso: ");
		precoIngresso = sc.nextDouble();
		
		System.out.println("Número de ingressos que terão que ser vendidos: " + (custoShow / precoIngresso));
		sc.close();
	}

}
