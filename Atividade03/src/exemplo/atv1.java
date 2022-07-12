package exemplo;

import java.util.Scanner;

public class atv1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3, notafinal;
		
		System.out.print("Nota 1: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Nota 2: ");
		nota2 = sc.nextDouble();
		
		System.out.print("Nota 3: ");
		nota3 = sc.nextDouble();

		
		notafinal = (nota1*2 + nota2*3 + nota3*5)/10;

		if(notafinal < 5) {
			System.out.println("Nota Final: " + notafinal +" Conceito E");
		}
		if(notafinal >= 5 && notafinal < 6) {
			System.out.println("Nota Final: " + notafinal +" Conceito D");
		}
		if(notafinal >=6 && notafinal < 7) {
			System.out.println("Nota Final: " + notafinal +" Conceito C");
		}
		if(notafinal >=7 && notafinal < 8) {
			System.out.println("Nota Final: " + notafinal +" Conceito B");
		}
		if(notafinal >= 8) {
			System.out.println("Nota Final: " + notafinal +" Conceito A");
		}
		sc.close();
	}

}
