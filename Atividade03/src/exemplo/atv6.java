package exemplo;

import java.util.Scanner;

public class atv6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		System.out.print("Número: ");
		num = sc.nextDouble();
		
		if(num % 2 == 0) {
			System.out.println("PAR");
		}
		
		if(num % 2 != 0) {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}

}
