import java.util.Scanner;

public class atvd2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double imposto = 0, tipoPeso = 0;
		
		System.out.print("Código do produto comprado: ");
		int codigoProduto = sc.nextInt();
		
		System.out.print("Peso do produto (kg): ");
		double peso = sc.nextDouble();
		
		System.out.print("Código do país de origem: ");
		int codigoPais = sc.nextInt();
		
		if(codigoProduto > 0 && codigoProduto <= 4) {
			System.out.println("Peso do produto: " + peso);
			tipoPeso = 1000;
			System.out.println("Preço do produto: " + (peso*tipoPeso));	
		}else if(codigoProduto > 4 && codigoProduto <= 7) {
			System.out.println("Peso do produto: " + peso);
			tipoPeso = 2500;
			System.out.println("Preço do produto: " + (peso*tipoPeso));
		}else if(codigoProduto > 7 && codigoProduto <= 10) {
			System.out.println("Peso do produto: " + peso);
			tipoPeso = 3500;
			System.out.println("Preço do produto: " + (peso*tipoPeso));
		}else {
			System.out.println("Código do produto errado!");
		}
		
		if(codigoPais == 2) {
			imposto = 0.15;
		}else if(codigoPais == 3) {
			imposto = 0.25;
		}
		
		switch(codigoPais) {
		case 1:
			System.out.println("Sem imposto!");
			System.out.println("Valor total: " + (peso * tipoPeso));
			break;
		default:
			System.out.println("Valor do imposto: " + (peso * tipoPeso * imposto));
			System.out.println("Valor total: " + ((peso* tipoPeso * imposto) + peso*tipoPeso));
			break;
		}
		sc.close();
	}
}