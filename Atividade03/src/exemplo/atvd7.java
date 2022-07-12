package exemplo;
import java.util.Scanner;
public class atvd7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A, B, C, I;
		System.out.print("Número A: ");
		A = sc.nextDouble();
		System.out.print("Número B: ");
		B = sc.nextDouble();
		System.out.print("Número C: ");
		C = sc.nextDouble();
		System.out.print("Número I: ");
		I = sc.nextDouble();
		if(I == 1) {
			if(A < B && A < C) {
				System.out.println("1º " + A);
			}
			if(B < A && B < C) {
				System.out.println("1º " + B);
			}
			if(C < A && C < B) {
				System.out.println("1º " + C);
			}
			if((A > B && A < C) || (A > C && A < B) ) {
				System.out.println("2º " + B);
			}
			if((B > A && B < C) || (B > C && B < A) ) {
				System.out.println("2º " + B);
			}
			if((C > B && C < A) || (C > A && C < B) ) {
				System.out.println("2º " + B);
			}
			if (A > B && A > C) {
				System.out.println("3º " + A);
			}
			if (B > A && B > C) {
				System.out.println("3º " + B);
			}
			if (C > A && C > B) {
				System.out.println("3º " + C);
			}
		}
		if(I == 2) {
			if (A > B && A > C) {
				System.out.println("1º " + A);
			}
			if (B > A && B > C) {
				System.out.println("1º " + B);
			}
			if (C > A && C > B) {
				System.out.println("1º " + C);
			}
			if((A > B && A < C) || (A > C && A < B) ) {
				System.out.println("2º " + B);
			}
			if((B > A && B < C) || (B > C && B < A) ) {
				System.out.println("2º " + B);
			}
			if((C > B && C < A) || (C > A && C < B) ) {
				System.out.println("2º " + B);
			}
			if(A < B && A < C) {
				System.out.println("3º " + A);
			}
			if(B < A && B < C) {
				System.out.println("3º " + B);
			}
			if(C < A && C < B) {
				System.out.println("3º " + C);
			}
		}
		if(I == 3) {
			if(A < B && A < C) {
				System.out.println("1º " + A);
			}
			if(B < A && B < C) {
				System.out.println("1º " + B);
			}
			if(C < A && C < B) {
				System.out.println("1º " + C);
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
				System.out.println("2º " + B);
			}
			if((B > A && B < C) || (B > C && B < A) ) {
				System.out.println("2º " + B);
			}
			if((C > B && C < A) || (C > A && C < B) ) {
				System.out.println("2º " + B);
			}
			sc.close();
		}
	}
}