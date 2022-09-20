import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        opcoes();
    }

    public static void opcoes() {
        double quantidadeNum, num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;

        System.out.println("Escolha a opção\n"
                + "(1) SOMA\n(2) MULTIPLICAÇÃO\n(3) DIVISÃO\n(4) SUBTRAÇÃO\n(5) POTENCIAÇÃO\n(6) PORCENTAGEM\n(7) RAIZ QUADRADA");
        int opcao = sc.nextInt();


        do {
            System.out.print("Quantidade de números a serem inseridos: ");
            quantidadeNum = sc.nextInt();

            if (quantidadeNum < 1 || quantidadeNum > 5) {
                System.out.println("Digite entre 1 e 5");
            }
        } while (quantidadeNum < 1 || quantidadeNum > 5);


        if (quantidadeNum >= 1) {
            System.out.print("Digite o número 1: ");
            num1 = sc.nextInt();
        }
        if (quantidadeNum >= 2) {
            System.out.print("Digite o número 2: ");
            num2 = sc.nextInt();
        }

        if (quantidadeNum >= 3) {
            System.out.print("Digite o número 3: ");
            num3 = sc.nextInt();
        }

        if (quantidadeNum >= 4) {
            System.out.print("Digite o número 4: ");
            num4 = sc.nextInt();
        }

        if (quantidadeNum == 5) {
            System.out.print("Digite o número 5:");
            num5 = sc.nextInt();
        }

        switchCase(num1, num2, num3, num4, num5, opcao, quantidadeNum);
    }

    public static void switchCase(double num1, double num2, double num3, double num4, double num5, int opcao, double quantidadeNum){

        switch (opcao) {
            case 1:
                System.out.println(Soma.operacao(num1, num2, num3, num4, num5));
                break;
            case 2:
                System.out.println(Multiplicacao.operacao(num1, num2, num3, num4, num5, quantidadeNum));
                break;
            case 3:
                System.out.println(Divisao.operacao(num1, num2, num3, num4, num5, quantidadeNum));
                break;
            case 4:
                System.out.println(Subtracao.operacao(num1, num2, num3, num4, num5, quantidadeNum));
                break;
            case 5:
                System.out.println(Potenciacao.operacao(num1, num2, num3, num4, num5, quantidadeNum));
                break;
            case 6:
                System.out.println(Porcentagem.operacao(num1, num2, num3, num4, num5, quantidadeNum));
                break;
            case 7:
                System.out.println(RaizQuadrada.operacao(num1, num2, num3, num4, num5, quantidadeNum));
                break;
        }
    }
}