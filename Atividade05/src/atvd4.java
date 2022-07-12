import java.util.Scanner;

public class atvd4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor total da compra: ");
		double preco = sc.nextDouble();
		
		System.out.println("Pagamento (1) À vista (2) Cheque (3) 6 vezes (4) 12 vezes");
		int opcao = sc.nextInt();
		
		
		switch(opcao) {
		case 1:
			System.out.println("Valor  total: " + preco);
			System.out.println("Desconto: " + (preco*0.15));
			System.out.println("Valor com desconto: " + (preco - (preco*0.15)));
			break;
		case 2:
			System.out.println("Valor  total: " + preco);
			System.out.println("Desconto: " + (preco*0.10));
			System.out.println("Valor com desconto: " + (preco - (preco*0.10)));
			break;
		case 3:
			System.out.println("Valor  total: " + preco);
			System.out.println("Parcelado em 6 vezes!");
			System.out.println("Sem desconto");
			break;
		case 4:
			System.out.println("Valor  total: " + preco);
			System.out.println("Parcelado em 12 vezes!");
			System.out.println("Juros: " + (preco*0.08));
			System.out.println("Valor com acrécimo: " + (preco + (preco*0.08)));
			break;
		default:
			System.out.println("Opção Inválida!!!");
			break;	
		}
		sc.close();
	}

}
