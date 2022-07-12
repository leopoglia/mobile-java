package exemplo;

import java.util.Scanner;

public class atv4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, num3;
		System.out.print("Número 1: ");
		num1 = sc.nextDouble();

		System.out.print("Número 2: ");
		num2 = sc.nextDouble();

		System.out.print("Número 3: ");
		num3 = sc.nextDouble();

		if(num1 < num2 && num1 < num3) {
			System.out.println("1º " + num1);
		}
		if(num2 < num1 && num2 < num3) {
			System.out.println("1º " + num2);
		}
		if(num3 < num1 && num3 < num2) {
			System.out.println("1º " + num3);
		}
		
		if((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2) ) {
			System.out.println("2º " + num2);
		}
		if((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1) ) {
			System.out.println("2º " + num2);
		}
		if((num3 > num2 && num3 < num1) || (num3 > num1 && num3 < num2) ) {
			System.out.println("2º " + num2);
		}
		if (num1 > num2 && num1 > num3) {
			System.out.println("3º " + num1);
		}
		if (num2 > num1 && num2 > num3) {
			System.out.println("3º " + num2);
		}
		if (num3 > num1 && num3 > num2) {
			System.out.println("3º " + num3);
		}
		
		sc.close();
	}
}