package dowhile;

import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigoCidade, numeroVeiculos, numeroAcidentes, maiorIndice = 0, menorIndice = 9999999, mediaVeiculos, totalVeiculos = 0, acidentesMenor2000 = 0, i = 0;

		do {
			i++;
			System.out.print("C�digo da cidade: ");
			codigoCidade = sc.nextInt();

			System.out.print("N�mero de ve�culos de passeio: ");
			numeroVeiculos = sc.nextInt();

			System.out.print("N�mero de acidentes de tr�nsito com v�timas: ");
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
		System.out.println("M�dia de ve�culos: " + (totalVeiculos / 5));
		System.out.println("M�dia de acidentes menor de 2.000 ve�culos: " + (acidentesMenor2000 / 5));
		sc.close();
	}

}
