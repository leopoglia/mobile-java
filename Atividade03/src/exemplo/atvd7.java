package exemplo;
import java.util.Scanner;
public class atvd7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A, B, C, I;
		System.out.print("N�mero A: ");
		A = sc.nextDouble();
		System.out.print("N�mero B: ");
		B = sc.nextDouble();
		System.out.print("N�mero C: ");
		C = sc.nextDouble();
		System.out.print("N�mero I: ");
		I = sc.nextDouble();
		if(I == 1) {
			if(A < B && A < C) {
				System.out.println("1� " + A);
			}
			if(B < A && B < C) {
				System.out.println("1� " + B);
			}
			if(C < A && C < B) {
				System.out.println("1� " + C);
			}
			if((A > B && A < C) || (A > C && A < B) ) {
				System.out.println("2� " + B);
			}
			if((B > A && B < C) || (B > C && B < A) ) {
				System.out.println("2� " + B);
			}
			if((C > B && C < A) || (C > A && C < B) ) {
				System.out.println("2� " + B);
			}
			if (A > B && A > C) {
				System.out.println("3� " + A);
			}
			if (B > A && B > C) {
				System.out.println("3� " + B);
			}
			if (C > A && C > B) {
				System.out.println("3� " + C);
			}
		}
		if(I == 2) {
			if (A > B && A > C) {
				System.out.println("1� " + A);
			}
			if (B > A && B > C) {
				System.out.println("1� " + B);
			}
			if (C > A && C > B) {
				System.out.println("1� " + C);
			}
			if((A > B && A < C) || (A > C && A < B) ) {
				System.out.println("2� " + B);
			}
			if((B > A && B < C) || (B > C && B < A) ) {
				System.out.println("2� " + B);
			}
			if((C > B && C < A) || (C > A && C < B) ) {
				System.out.println("2� " + B);
			}
			if(A < B && A < C) {
				System.out.println("3� " + A);
			}
			if(B < A && B < C) {
				System.out.println("3� " + B);
			}
			if(C < A && C < B) {
				System.out.println("3� " + C);
			}
		}
		if(I == 3) {
			if(A < B && A < C) {
				System.out.println("1� " + A);
			}
			if(B < A && B < C) {
				System.out.println("1� " + B);
			}
			if(C < A && C < B) {
				System.out.println("1� " + C);
			}
			if (A > B && A > C) {
				System.out.println("MAIOR " + A);
			}
			if (B > A && B > C) {
				System.out.println("MAIOR " + B);
			}
			if (C > A && C > B) {
				System.out.println("MAIOR " + C);
			}
			if((A > B && A < C) || (A > C && A < B) ) {
				System.out.println("2� " + B);
			}
			if((B > A && B < C) || (B > C && B < A) ) {
				System.out.println("2� " + B);
			}
			if((C > B && C < A) || (C > A && C < B) ) {
				System.out.println("2� " + B);
			}
			sc.close();
		}
	}
}