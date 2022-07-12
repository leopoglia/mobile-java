import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;

		while (numero != -1) {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();
			
			System.out.println("numero: " + numero + " potência de 2: " + Math.pow(numero, 2) + " potência de 3: " + Math.pow(numero, 3) + " raiz quadrada: " + Math.sqrt(numero));
		}
		sc.close();
	}

}
