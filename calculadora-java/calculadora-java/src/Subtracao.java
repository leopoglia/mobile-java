public class Subtracao extends Operacoes {

    public static String operacao(double num1, double num2, double num3, double num4, double num5, double quantidadeNum) {
        double subtracao = 0;

        if (quantidadeNum == 1) {
            System.out.println("Não da para subtrair sozinho!");
            Calculadora.opcoes();
        } else if (quantidadeNum == 2) {
            subtracao = num1 - num2;
        } else if (quantidadeNum == 3) {
            subtracao = num1 - num2 - num3;
        } else if (quantidadeNum == 4) {
            subtracao = num1 - num2 - num3 - num4;
        } else if (quantidadeNum == 5) {
            subtracao = num1 - num2 - num3 - num4 - num5;
        }

        return "A subtração dos números é: " + subtracao;
    }
}
