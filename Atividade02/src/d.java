import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double gasolina;
		
		System.out.print("Pre�o da gasolina: ");
		gasolina = sc.nextDouble();
		
		System.out.println("Pre�o com aumento: " + (gasolina + (gasolina * 0.1)));
		sc.close();
	} 

}
