import java.util.Scanner;

public class e {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salario, vendas;

		System.out.print("Salário fixo: ");
		salario = sc.nextDouble();

		System.out.print("Total de R$ em vendas: ");
		vendas = sc.nextDouble();
		
		System.out.println("SALARIO: " + (salario + (vendas*0.4)));
		sc.close();
	}

}
