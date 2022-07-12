import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double gasolina;
		
		System.out.print("Preço da gasolina: ");
		gasolina = sc.nextDouble();
		
		System.out.println("Preço com aumento: " + (gasolina + (gasolina * 0.1)));
		sc.close();
	} 

}
