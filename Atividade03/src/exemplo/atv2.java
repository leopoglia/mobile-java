package exemplo;

import java.util.Scanner;

public class atv2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, nota3, notafinal = 0, notaexame;

		System.out.print("Nota 1: ");
		nota1 = sc.nextDouble();

		System.out.print("Nota 2: ");
		nota2 = sc.nextDouble();

		System.out.print("Nota 3: ");
		nota3 = sc.nextDouble();
		
		
		notafinal = (nota1+nota2+nota3)/3;

		if(notafinal < 3) {
			System.out.println("REPROVADO!");
		}
		if(notafinal >= 3 && notafinal <7) {
			notaexame = 6*(2-notafinal);
			System.out.println("EXAME!" + notaexame);
		}
		if(notafinal > 7) {
			System.out.println("APROVADO!");
		}
		sc.close();
	}

}
