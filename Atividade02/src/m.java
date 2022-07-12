import java.util.Scanner;

public class m {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salarioMinimo;
		int quantidadeKw;

		System.out.print("Salário minimo: ");
		salarioMinimo = sc.nextDouble();

		System.out.print("Quantidade de kilowatts consumida: ");
		quantidadeKw = sc.nextInt();
		
		System.out.println("Valor do kilowatts: " + (salarioMinimo/6));
		System.out.println("Valor a ser pago: " + (quantidadeKw * (salarioMinimo/6)));
		System.out.println("Valor a ser pago com desconto de 18%: " + ((quantidadeKw * (salarioMinimo/6)) - ((quantidadeKw * (salarioMinimo/6)) * 0.18)));
		sc.close();
	}

}
