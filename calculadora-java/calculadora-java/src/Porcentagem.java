public class Porcentagem extends Operacoes{

    public static String operacao(double num1, double num2, double num3, double num4, double num5, double quantidadeNum) {
        double porcentagem = 0;

        if (quantidadeNum == 1 || quantidadeNum > 2) {
            return "Não da para tirar a porcentagem!";
        } else if (quantidadeNum == 2) {
            porcentagem = (num2 / num1) * 100;

            return "A porcentagem é: " + porcentagem + "%";
        }
        return "Não da para tirar a porcentagem!";
    }
}
