package exemplo;

import java.util.Scanner;

public class atv3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;

		System.out.print("N�mero 1: ");
		num1 = sc.nextDouble();

		System.out.print("N�mero 2: ");
		num2 = sc.nextDouble();
		
		if(num1 > num2) {
			System.out.println("N�mero " +num1 + " � o maior");
		}
		if(num2 > num1) {
			System.out.println("N�mero " +num2 + " � o maior");
		}
		sc.close();
	}

}
