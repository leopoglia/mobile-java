import java.util.Scanner;

public class i {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salarioMinimo;
		int numeroHoras, numeroHorasExtra;

		System.out.print("Salário minimo: ");
		salarioMinimo = sc.nextDouble();

		System.out.print("Horas trabalhadas: ");
		numeroHoras = sc.nextInt();
		
		System.out.print("Horas Extras trabalhadas: ");
		numeroHorasExtra = sc.nextInt();
		
		System.out.println("Salario a receber: " + (((numeroHoras * (salarioMinimo/6)) + (numeroHorasExtra * (salarioMinimo/3)))));
		sc.close();
	}
}
