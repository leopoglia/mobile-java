import java.util.Scanner;

public class c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numero = 0, soma = 0, quantidade = 0, maiorNumero = 0, menorNumero = 1000000, numerosPares = 0, quantidadeNumerosPares = 0, numerosImpares = 0;
		
		while(numero != 30000) {
			System.out.print("Digite um n�mero: ");
			numero = sc.nextInt();
			
			if(numero == 30000) {
				break;
			}
			
			quantidade++;

			soma = soma + numero;
			
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}
			if(numero < menorNumero) {
				menorNumero = numero;
			}
			
			
			if(numero % 2 == 0) {
				numerosPares = numerosPares+ numero;
				quantidadeNumerosPares++;
			}
			
			if(numero % 2 != 0) {
				numerosImpares++;
			}
		}
		
		System.out.println("Soma de todos os n�meros: " + soma);
		System.out.println("Quantidade de n�meros: " + quantidade);
		System.out.println("Maior n�mero: " + maiorNumero);
		System.out.println("Menor n�mero: " + menorNumero);
		System.out.println("M�dia dos n�meros pares: " + (numerosPares/quantidadeNumerosPares));
		System.out.println("Porcentagem dos n�meros impares: " + ((numerosImpares/quantidade)*100));
		
		sc.close();
	}

}
