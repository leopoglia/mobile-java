import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valorSalarioMin, Kw = 0, valorKw = 0, preco = 0;
		int tipoConsumidor;
		
		
		while(Kw != 0) {
			System.out.println("Salario minimo: ");
			valorSalarioMin = sc.nextDouble();
			
			valorKw = valorSalarioMin/8;
			System.out.println("Quantidade de Kw gasta: ");
			Kw = sc.nextDouble();
			
			
			preco = Kw * (valorSalarioMin/valorKw);
			
			System.out.println("Consumidor (1) Residencial (2) Comercial (3) Industrial");
			tipoConsumidor = sc.nextInt();
			
			if(tipoConsumidor == 1) {
				preco = preco + preco*0.05;
			}else if(tipoConsumidor == 2) {
				preco = preco + preco*0.10;
			}else if(tipoConsumidor == 3) {
				preco = preco + preco*0.15;
			}
		}
		
		System.out.println("Valor do Kw: " + valorKw);
		System.out.println("Valor a ser pago: " + preco);
		
		sc.close();
	}

}
