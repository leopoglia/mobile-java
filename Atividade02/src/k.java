import java.util.Scanner;

public class k {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horas, min;

		System.out.print("Horas: ");
		horas = sc.nextInt();

		System.out.print("Minutos: ");
		min = sc.nextInt();
		
		System.out.println("Horas em minutos: " + ((horas * 60) ));
		System.out.println("Horas e minutos em minutos: " + ((horas * 60) + min ));
		System.out.println("Minutos em segundo: " + (min * 60));
		sc.close();
	}

}
