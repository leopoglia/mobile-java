public class Multiplicacao extends Operacoes{

    public static String operacao(double num1, double num2, double num3, double num4, double num5, double quantidadeNum) {
        double multiplicacao = 0;

        if (quantidadeNum == 1) {
            System.out.println("Não da para multiplicar sozinho!");
            Calculadora.opcoes();
        } else if (quantidadeNum == 2) {
            multiplicacao = num1 * num2;
        } else if (quantidadeNum == 3) {
            multiplicacao = num1 * num2 * num3;
        } else if (quantidadeNum == 4) {
            multiplicacao = num1 * num2 * num3 * num4;
        } else if (quantidadeNum == 5) {
            multiplicacao = num1 * num2 * num3 * num4 * num5;
        }

        return "A multiplicação dos números é: " + multiplicacao;
    }
}
