package exemplo;

import java.util.Scanner;

public class atv5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num1, num2, num3, num4;
		boolean verdade = false;
		System.out.println("Digite os 3 primeiros n�meros em ordem e o 4 n�o!");
		System.out.print("N�mero 1: ");
		num1 = sc.nextDouble();

		System.out.print("N�mero 2: ");
		num2 = sc.nextDouble();

		System.out.print("N�mero 3: ");
		num3 = sc.nextDouble();
		
		System.out.print("N�mero 4: ");
		num4 = sc.nextDouble();


		if(num3 > num2 && num2 > num1) {			
			if(num4 > num3) {
				System.out.println(num4);
			}
			System.out.println(num3);
			if(num4 > num2 && num4 < num3) {
				System.out.println(num4);
			}
			System.out.println(num2);
			if(num4 > num1 && num4 < num2) {
				System.out.println(num4);
			}
			System.out.println(num1);
			if(num4 < num1) {
				System.out.println(num4);
			}
			verdade = true;
		}
		
		if(!verdade) {
			System.out.println("N�O VIERAM EM ORDEM CRESCENTE");
		}
		sc.close();	
	}

}
