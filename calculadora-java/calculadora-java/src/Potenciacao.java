public class Potenciacao extends Operacoes {

    public static String operacao(double num1, double num2, double num3, double num4, double num5, double quantidadeNum) {
        double potenciacao = 0;

        if (quantidadeNum == 1) {
            System.out.println("Não da para potenciar sozinho!");
            Calculadora.opcoes();
        } else if (quantidadeNum == 2) {
            potenciacao = Math.pow(num1, num2);
        } else if (quantidadeNum == 3) {
            potenciacao = Math.pow(num1, num2);
            potenciacao = Math.pow(potenciacao, num3);
        } else if (quantidadeNum == 4) {
            potenciacao = Math.pow(num1, num2);
            potenciacao = Math.pow(potenciacao, num3);
            potenciacao = Math.pow(potenciacao, num4);
        } else if (quantidadeNum == 5) {
            potenciacao = Math.pow(num1, num2);
            potenciacao = Math.pow(potenciacao, num3);
            potenciacao = Math.pow(potenciacao, num4);
            potenciacao = Math.pow(potenciacao, num5);
        }

        return "A potenciação dos números é: " + potenciacao;

    }
}
