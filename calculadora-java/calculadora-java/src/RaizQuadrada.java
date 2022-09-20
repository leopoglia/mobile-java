public class RaizQuadrada {

    public static String operacao(double num1, double num2, double num3, double num4, double num5, double quantidadeNum) {
        double raizQuadrada = 0;

        if (quantidadeNum == 1) {
            raizQuadrada = Math.sqrt(num1);
        } else if (quantidadeNum == 2) {
            raizQuadrada = Math.sqrt(num2);
        } else if (quantidadeNum == 3) {
            raizQuadrada = Math.sqrt(num3);
        } else if (quantidadeNum == 4) {
            raizQuadrada = Math.sqrt(num4);
        } else if (quantidadeNum == 5) {
            raizQuadrada = Math.sqrt(num5);
        }

        return "A raiz quadrada dos números é: " + raizQuadrada;
    }
}
