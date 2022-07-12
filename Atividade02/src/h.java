import java.util.Scanner;

public class h {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double salarioJoao, totalContas = 0, descontos;
		int confirmacao = 0, quantidadeContas = 0;

		System.out.print("Salário João: ");
		salarioJoao = sc.nextDouble();
		
		do {
			quantidadeContas++;
			System.out.println("Conta " + quantidadeContas);
			totalContas+= sc.nextDouble();
			
			System.out.println("Deseja adicionar uma nova conta? (1) SIM (2) NÃO");
			confirmacao = sc.nextInt();
		}while(confirmacao == 1);
		
		descontos = totalContas - (totalContas * quantidadeContas * 0.05);
		System.out.println("Sobra do salário: " + (salarioJoao - descontos));
		sc.close();
	}

}
