import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora, min, hora1, min1, horafim, minfim;

		System.out.print("Informe a hora de in�cio: ");
		hora = sc.nextInt();
		System.out.print("Informe o minuto de in�cio: ");
		min = sc.nextInt();
		System.out.print("Informe a hora de t�rmino: ");
		hora1 = sc.nextInt();
		System.out.print("Informe o minuto de t�rmino: ");
		min1 = sc.nextInt();

		horafim = hora1 - hora;
		minfim = min1 - min;
		if (horafim > 24) {
			System.out.println("Passou do limite de tempo!");
		} else {
			if (minfim > 0) {
				System.out.println("Tempo: " + horafim + " horas e " + minfim + " minutos");
			} else {
				System.out.println("Tempo: " + horafim + " horas e " + (-minfim) + " minutos");
			}
		}
		sc.close();
	}

}
