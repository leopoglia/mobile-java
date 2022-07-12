import java.util.Scanner;

public class atvd3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		System.out.print("Digite a quantidade de produtos: ");
		int quantidadeProdutos = sc.nextInt();
		
		
		if(quantidadeProdutos > 20) {
			opcao = 1;
		}else {
			opcao = 2;
		}
		
		switch(opcao) {
		case 1:
			System.out.println("Critério A: R$0,25 por livro + R$7,50 fixo");
			break;
		case 2:
			System.out.println("Critério B: R$0,50 por livro + R$2,50 fixo");
			break;
		}
		sc.close();
	}
}
