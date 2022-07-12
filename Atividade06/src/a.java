import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double carlos = 1000, joao = carlos/3;
		int meses = 0;
		
		while(joao < carlos) {
			meses++;
			carlos = carlos + carlos*0.02;
			joao = joao + joao*0.05;
		}
		
		System.out.println("João passou Carlos em " + meses + " meses");
		
		sc.close();
	}
}