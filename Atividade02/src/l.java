import java.util.Scanner;

public class l {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double custoShow, precoIngresso;

		System.out.print("Custo do Show: ");
		custoShow = sc.nextDouble();

		System.out.print("Pre�o do ingresso: ");
		precoIngresso = sc.nextDouble();
		
		System.out.println("N�mero de ingressos que ter�o que ser vendidos: " + (custoShow / precoIngresso));
		sc.close();
	}

}
