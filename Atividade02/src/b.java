import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1, num2, num3, num4, num5;
		
		System.out.print("Digite o numero 1: ");
		num1 = sc.nextDouble();
		
		System.out.print("Digite o numero 2: ");
		num2 = sc.nextDouble();

		System.out.print("Digite o numero 3: ");
		num3 = sc.nextDouble();
		
		System.out.print("Digite o numero 4: ");
		num4 = sc.nextDouble();
		
		System.out.print("Digite o numero 5: ");
		num5 = sc.nextDouble();
		
		System.out.println("Resultado: " + ((num1+num2+num3+num4+num5)/8));
		sc.close();
	}

}
