public class Divisao extends Operacoes{


    public static String operacao(double num1, double num2, double num3, double num4, double num5, double quantidadeNum){
        double divisao = 0;

        if (quantidadeNum == 1) {
            System.out.println("Não da para dividir sozinho!");
            Calculadora.opcoes();
        } else if (quantidadeNum == 2) {
            divisao = num1 / num2;
        } else if (quantidadeNum == 3) {
            divisao = num1 / num2 / num3;
        } else if (quantidadeNum == 4) {
            divisao = num1 / num2 / num3 / num4;
        } else if (quantidadeNum == 5) {
            divisao = num1 / num2 / num3 / num4 / num5;
        }

        return "A divisão dos números é: " + divisao;
    }
}
