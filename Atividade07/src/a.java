import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		
		for(int i = 0; i < 11; i++) {
			System.out.println(numero + " x " + i + " = " + (numero*i) );
		}
		sc.close();
	}
}
