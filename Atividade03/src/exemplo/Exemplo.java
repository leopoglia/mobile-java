package exemplo;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c;


		System.out.println("Informe A: ");
		a = sc.nextDouble();
		
		System.out.println("Informe B: ");
		b = sc.nextDouble();
		
		System.out.println("Informe C: ");
		c = sc.nextDouble();
		
		double xa = ((-b)+ Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
		double xb = ((-b)- Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
		System.out.println(xa);
		System.out.println(xb);
		sc.close();
	}

}
