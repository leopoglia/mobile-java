import java.util.Scanner;

public class f {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double salarioMinimo, salarioFuncionario;

		System.out.print("Sal�rio minimo: ");
		salarioMinimo = sc.nextDouble();

		System.out.print("Seu salario: ");
		salarioFuncionario = sc.nextDouble();
		
		
		System.out.println("Quantidade de sal�rios minimos que voc� ganha: " + (salarioFuncionario/salarioMinimo));
		sc.close();
	}

}
