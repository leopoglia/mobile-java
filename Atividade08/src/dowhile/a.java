package dowhile;
import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1, num, divisores = 0;
		
		System.out.print("Digite um n�mero maior que 1: ");
		num = sc.nextInt();
		
		
		do {
			if(num % i == 0) {
				divisores += 1;
			}
			i++;
		
		}while(i <= num);
		
		if(divisores == 2) {
			System.out.println("� primo");
		}else {
			System.out.println("N�o � divisor!");
		}
		sc.close();
	}

}
