import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade, menor18 = 0, totalIdades = 0;
		double peso, peso80 = 0, altura, totalAlturas = 0;


		for (int i = 0; i <= 22; i++) {
			System.out.print("Idade: ");
			idade = sc.nextInt();
			
			if(idade < 18) {
				menor18++;
			}
			
			totalIdades = totalIdades + idade;
			
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			
			if(peso > 80) {
				peso80++;
			}
			
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			
			totalAlturas = totalAlturas + altura;
		}
		
		System.out.println("Quantidade de Jogadores menores de 18 anos: " + menor18 + "\nMédia das idades dos jogadores: " + (totalIdades / 22) + "\nMédia de alturas: " + (totalAlturas / 22) + "\nPorcentagem de jogadores com mais de 80kg: " + ((peso80/22)*100));
		sc.close();
	}

}
