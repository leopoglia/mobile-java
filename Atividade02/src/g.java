import java.util.Scanner;

public class g {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("Digite um número para ser feita a tabuada: ");
		num = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + "x" + i + "=" + (num*i) );
		}
		sc.close();
	}

}
