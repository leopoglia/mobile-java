import java.util.Scanner;

public class c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroOperario = 0, numeroPecasOperario = 0, totalPecas = 0, sexoOperario = 0, quantidadeHomens = 0,
				quantidadeMulheres = 0, quantidadePecasHomens = 0, quantidadePecasMulheres = 0,
				numOperarioMaiorSalario = 0;
		double folhadePagamento = 0, salarioMinimo = 1200, salario = 0, maiorSalario = 0;

		for (int i = 0; i <= 3; i++) {
			System.out.print("Digite o n�mero do oper�rio: ");
			numeroOperario = sc.nextInt();

			System.out.print("N�mero de pe�as feitas: ");
			numeroPecasOperario = sc.nextInt();

			if (numeroPecasOperario <= 30) {
				folhadePagamento = folhadePagamento + salarioMinimo;
			} else if (numeroPecasOperario > 30 && numeroPecasOperario <= 50) {
				salario = salarioMinimo + (salarioMinimo * 0.03) * (numeroPecasOperario - 30);
				folhadePagamento = folhadePagamento + (salario);
			} else if (numeroPecasOperario > 50) {
				salario = salarioMinimo + (salarioMinimo * 0.05) * (numeroPecasOperario - 30);
				folhadePagamento = folhadePagamento + (salario);
			}

			if (salario > maiorSalario) {
				maiorSalario = salario;
				numOperarioMaiorSalario = numeroOperario;
			}

			totalPecas = totalPecas + numeroPecasOperario;

			System.out.print("Sexo do usu�rio: (1) Masc (2) Fem");
			sexoOperario = sc.nextInt();

			if (sexoOperario == 1) {
				quantidadeHomens++;
				quantidadePecasHomens = quantidadePecasHomens + numeroPecasOperario;
			} else if (sexoOperario == 2) {
				quantidadeMulheres++;
				quantidadePecasMulheres = quantidadePecasMulheres + numeroPecasOperario;

			}
			System.out.println("N�mero do oper�rio: " + numeroOperario);
		}

		System.out.println("Folha de pagamento da firma: " + folhadePagamento + "\nTotal de pe�as fabricadas no m�s: "
				+ totalPecas + "\nM�dia de pe�as fabricadas por homens: " + (quantidadePecasHomens / quantidadeHomens)
				+ "\nM�dia de pe�as fabricas por mulheres: " + (quantidadePecasMulheres / quantidadeMulheres)
				+ "\nN�mero do operario com maior sal�rio: " + numOperarioMaiorSalario);

		sc.close();
	}
}
