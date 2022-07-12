import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.print("Digite o numero 1: ");
		num1 = sc.nextDouble();
		
		System.out.print("Digite o numero 2: ");
		num2 = sc.nextDouble();
		
		System.out.println("Multiplicação do primeiro pelo segundo: " + (num1 * num2));
		sc.close();
	}

}
