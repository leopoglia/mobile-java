import java.util.Scanner;

public class atvd1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o seu c�digo de funcion�rio: ");
		int codigo = sc.nextInt();
		
		System.out.print("Digite o seu sal�rio: ");
		double salario = sc.nextDouble();
		
		switch(codigo) {
		case 1:
			System.out.println("Bem-vindo escritur�rio, o aumento do seu sal�rio � de 50% e o novo sal�rio �: " + (salario + (salario*0.5)));
			break;
		case 2:
			System.out.println("Bem-vindo secret�rio, o aumento do seu sal�rio � de 35% e o novo sal�rio �: " + (salario + (salario*0.35)));
			break;
		case 3:
			System.out.println("Bem-vindo caixa, o aumento do seu sal�rio � de 20% e o novo sal�rio �: " + (salario + (salario*0.2)));
			break;
		case 4:
			System.out.println("Bem-vindo gerente, o aumento do seu sal�rio � de 10% e o novo sal�rio �: " + (salario + (salario*0.1)));
			break;
		case 5:
			System.out.println("Bem-vindo diretor, voc� n�o ganhou aumento!");
			break;
		default:
				System.out.println("C�digo errado!");
				break;
		}
		sc.close();
	}
}