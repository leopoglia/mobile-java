import java.util.Scanner;

public class c {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.print("Digite o numero 1: ");
		num1 = sc.nextDouble();
		
		System.out.print("Digite o numero 2: ");
		num2 = sc.nextDouble();
		
		if(num1 != 0) {
			System.out.println(num1 % num2);
		}else {
			System.out.println("O primeiro número não pode ser 0");
		}
		sc.close();

	}

}
