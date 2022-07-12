package dowhile;

import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigoCidade, numeroVeiculos, numeroAcidentes, maiorIndice = 0, menorIndice = 9999999, mediaVeiculos, totalVeiculos = 0, acidentesMenor2000 = 0, i = 0;

		do {
			i++;
			System.out.print("Código da cidade: ");
			codigoCidade = sc.nextInt();

			System.out.print("Número de veículos de passeio: ");
			numeroVeiculos = sc.nextInt();

			System.out.print("Número de acidentes de trânsito com vítimas: ");
			numeroAcidentes = sc.nextInt();

			if (numeroAcidentes > maiorIndice) {
				maiorIndice = numeroAcidentes;
			}

			if (numeroAcidentes < menorIndice) {
				menorIndice = numeroAcidentes;
			}
			
			totalVeiculos += numeroVeiculos;
			
			if(numeroVeiculos < 2000) {
				acidentesMenor2000 += numeroAcidentes;
			}

		} while (i > 5);
		
		System.out.println("Maior indice: " + maiorIndice);
		System.out.println("Menor indice: " + menorIndice);
		System.out.println("Média de veículos: " + (totalVeiculos / 5));
		System.out.println("Média de acidentes menor de 2.000 veículos: " + (acidentesMenor2000 / 5));
		sc.close();
	}

}
