package exemplo;

import java.util.Scanner;

public class atv4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, num3;
		System.out.print("N�mero 1: ");
		num1 = sc.nextDouble();

		System.out.print("N�mero 2: ");
		num2 = sc.nextDouble();

		System.out.print("N�mero 3: ");
		num3 = sc.nextDouble();

		if(num1 < num2 && num1 < num3) {
			System.out.println("1� " + num1);
		}
		if(num2 < num1 && num2 < num3) {
			System.out.println("1� " + num2);
		}
		if(num3 < num1 && num3 < num2) {
			System.out.println("1� " + num3);
		}
		
		if((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2) ) {
			System.out.println("2� " + num2);
		}
		if((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1) ) {
			System.out.println("2� " + num2);
		}
		if((num3 > num2 && num3 < num1) || (num3 > num1 && num3 < num2) ) {
			System.out.println("2� " + num2);
		}
		if (num1 > num2 && num1 > num3) {
			System.out.println("3� " + num1);
		}
		if (num2 > num1 && num2 > num3) {
			System.out.println("3� " + num2);
		}
		if (num3 > num1 && num3 > num2) {
			System.out.println("3� " + num3);
		}
		
		sc.close();
	}
}