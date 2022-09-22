package quiz;
import java.util.Scanner;

public class Quiz {

    private String[] perguntas = {"Qual mob é agressivo aos girinos? \n(1) Axalott\n(2) Bacalhau\n(3) Sapo\n(4) Zumbi\n> ", "Em que ano o minecraft foi lançado? \n(1) 2009\n(2) 2011\n(3) 2010\n(4) 2008\n> ", "Qual é o minério mais raro do minecraft? \n(1) Diamante\n(2) Netherite\n(3) Esmeralda\n(4) Ouro\n> ", "Qual é o mob mais fraco do minecraft? \n(1) Abelha\n(2) Morcego\n(3) Galinha\n(4) Coelho\n> ", "Qual é a melhor comida do minecraft? \n(1) Cenoura dourada\n(2) Maça dourada\n(3) Carne de boi assada\n(4) Bolo\n> ", "Qual é o limite de construção para cima? \n(1) 128\n(2) 384\n(3) 230\n(4) 320\n> ", "Quantos diamantes são necessários para fazer uma armadura inteira de ferro? \n(1) 28\n(2) 32\n(3) 0\n(4) 24\n> ", "Quantos blocos as tnts explodem? \n(1) 5\n(2) 7\n(3) 10\n(4) 12\n> ", "Em qual linguagem de programação foi feito o minecraft? \n(1) Javascript\n(2) Python\n(3) Java\n(4) C\n> ", "Qual é o melhor youtuber de minecraft? \n(1) Monark\n(2) Pewdiepie\n(3) Viniccius13\n(4) Felipe Neto\n> "};
    private String[] resultados = {" tente novamente, você consegue!\nPontuação: ", " você foi muito bem, parabéns! :)\nPontuação:", " parabéns você está entre os 1% das pessoas mais inteligentes do mundo!\nPontuação: "};
    private int[] respostas = new int[10];
    private int[] respostasCertas = {1, 2, 3, 4, 1, 4, 3, 2, 3, 3};
    private int pontos = 0;

    void verificarRespostas() {
        for (int i = 0; i < 10; i++) {
            if (this.getRespostas()[i] == this.getRespostasCertas()[i]) {
                this.setPontos(this.getPontos() + 1);
            }
        }
    }

    public String[] getPerguntas() {
        return perguntas;
    }

    public int[] getRespostas() {
        return respostas;
    }

    public int[] getRespostasCertas() {
        return respostasCertas;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String[] getResultados() {
        return resultados;
    }

}