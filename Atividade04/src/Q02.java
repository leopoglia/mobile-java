import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mes, ano, dia, hora, min;
		System.out.print("Informe o ano:");
		ano = sc.nextInt();
		System.out.print("Informe o m�s: ");
		mes = sc.nextInt();
		System.out.print("Informe o dia: ");
		dia = sc.nextInt();
		System.out.print("Informe as horas: ");
		hora = sc.nextInt();
		System.out.print("Informe os minutos: ");
		min = sc.nextInt();
		if(mes == 1) {
			System.out.println(dia+"� de Janeiro de"+ano+" - "+hora+":"+min);
		}else if(mes == 2) {
			System.out.println(dia+"� de Fevereiro de"+ano+" - "+hora+":"+min);
		}else if(mes == 3) {
			System.out.println(dia+"� de Mar�o de"+ano+" - "+hora+":"+min);
		}else if(mes == 4) {
			System.out.println(dia+"� de Abril de"+ano+" - "+hora+":"+min);
		}else if(mes == 5) {
			System.out.println(dia+"� de Maio de"+ano+" - "+hora+":"+min);
		}else if(mes == 6) {
			System.out.println(dia+"� de Junho de"+ano+" - "+hora+":"+min);
		}else if(mes == 7) {
			System.out.println(dia+"� de Julho de"+ano+" - "+hora+":"+min);
		}else if(mes == 8) {
			System.out.println(dia+"� de Agosto de"+ano+" - "+hora+":"+min);
		}else if(mes == 9) {
			System.out.println(dia+"� de Setembro de"+ano+" - "+hora+":"+min);
		}else if(mes == 10) {
			System.out.println(dia+"� de Outubro de"+ano+" - "+hora+":"+min);
		}else if(mes == 11) {
			System.out.println(dia+"� de Novembro de"+ano+" - "+hora+":"+min);
		}else if(mes == 12) {
			System.out.println(dia+"� de Dezembro de"+ano+" - "+hora+":"+min);
		}else {
			System.out.println("Data inv�lida");
		}
		sc.close();
	}

}
