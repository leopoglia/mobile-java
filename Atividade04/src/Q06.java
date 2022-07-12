import java.util.Scanner;
public class Q06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("(1) Imposto \n(2) Novo salário\n(3) Classificação");
		int opcao = sc.nextInt();
		
		System.out.print("Salário do funcionário: ");
		double salario = sc.nextDouble();
		
		switch(opcao) {
		case 1:
			imposto(salario);
			break;
		case 2:
			novoSalario(salario);
			break;
		case 3:
			classificacao(salario);
			break;
		default:
			System.out.println("Opção Invalida");
			main(args);	
		}
		sc.close();
	}

	private static void imposto(double salario) {
		double imposto = 0;
		if(salario < 500) {
			imposto = salario*0.05;
		}else if(salario >= 500 && salario <= 850) {
			imposto = salario*0.1;
		}else if(salario > 850) {
			imposto = salario*0.15;
		}
		System.out.println("Imposto: " + imposto);
	}

	private static void novoSalario(double salario) {
		double aumento = 0;
		if(salario > 1500) {
			aumento = salario + 25;
		}else if(salario > 750 && salario <= 1500) {
			aumento = salario + 50;
		}else if(salario >= 450 &&  salario < 750) {
			aumento = salario + 75;
		}else if(salario < 450) {
			aumento = salario + 100;
		}
		System.out.println("Aumento: " + aumento);
	}

	private static void classificacao(double salario) {
		if(salario <= 700) {
			System.out.println("Mal Remunerado");
		}else if(salario > 700) {
			System.out.println("Bem Remunerado");
		}
	}

}
