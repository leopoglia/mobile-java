import java.util.Scanner;

public class atvd1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o seu código de funcionário: ");
		int codigo = sc.nextInt();
		
		System.out.print("Digite o seu salário: ");
		double salario = sc.nextDouble();
		
		switch(codigo) {
		case 1:
			System.out.println("Bem-vindo escriturário, o aumento do seu salário é de 50% e o novo salário é: " + (salario + (salario*0.5)));
			break;
		case 2:
			System.out.println("Bem-vindo secretário, o aumento do seu salário é de 35% e o novo salário é: " + (salario + (salario*0.35)));
			break;
		case 3:
			System.out.println("Bem-vindo caixa, o aumento do seu salário é de 20% e o novo salário é: " + (salario + (salario*0.2)));
			break;
		case 4:
			System.out.println("Bem-vindo gerente, o aumento do seu salário é de 10% e o novo salário é: " + (salario + (salario*0.1)));
			break;
		case 5:
			System.out.println("Bem-vindo diretor, você não ganhou aumento!");
			break;
		default:
				System.out.println("Código errado!");
				break;
		}
		sc.close();
	}
}