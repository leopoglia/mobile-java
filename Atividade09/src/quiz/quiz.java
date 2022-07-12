package quiz;
import java.util.Scanner;

public class quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------QUIZ SOBRE MINECRAFT------");
		System.out.print("Digite o seu nome: ");
		// Array para guardar o nome do usuário
		String nome = sc.next();
		System.out.println("--------------------------------");
		// Array com todas as perguntas
		String[] perguntas = {"Qual mob é agressivo aos girinos? \n(1) Axalott\n(2) Bacalhau\n(3) Sapo\n(4) Zumbi\n> " ,"Em que ano o minecraft foi lançado? \n(1) 2009\n(2) 2011\n(3) 2010\n(4) 2008\n> ","Qual é o minério mais raro do minecraft? \n(1) Diamante\n(2) Netherite\n(3) Esmeralda\n(4) Ouro\n> ","Qual é o mob mais fraco do minecraft? \n(1) Abelha\n(2) Morcego\n(3) Galinha\n(4) Coelho\n> ","Qual é a melhor comida do minecraft? \n(1) Cenoura dourada\n(2) Maça dourada\n(3) Carne de boi assada\n(4) Bolo\n> ","Qual é o limite de construção para cima? \n(1) 128\n(2) 384\n(3) 230\n(4) 320\n> ","Quantos diamantes é necessários para fazer uma armadura inteira de ferro? \n(1) 28\n(2) 32\n(3) 0\n(4) 24\n> ","Quantos blocos as tnts explodem? \n(1) 5\n(2) 7\n(3) 10\n(4) 12\n> ","Em qual linguagem de programação foi feito o minecraft? \n(1) Javascript\n(2) Python\n(3) Java\n(4) C\n> ","Qual é o melhor youtuber de minecraft? \n(1) Monark\n(2) Pewdiepie\n(3) Viniccius13\n(4) Felipe Neto\n> "};
		// Array onde as respostas do usuário será inserida
		int[] respostas = new int[10];
		// Array com todas as respostas certas, porfavor não colar
		int[] respostasCertas = {1, 2, 3, 4, 1, 4, 3, 2, 3, 3};
		// Variavel para contar os pontos
		int pontos = 0;

		// For das perguntas
		for(int i = 0; i < 10; i++) {
			int resposta;
			// Do while usado para não permitir o usuário digitar número abaixo de 1 ou acima de 4
			do {
			// Mostra a pergunta para o usuário
			System.out.print(perguntas[i]);
			// Guarda a reposta em uma variavel temporária
			resposta = sc.nextInt();
			}while(resposta < 1 || resposta > 4);
			// Caso pase pelo do while, ela será guardada no array das respostas do usuário
			respostas[i] = resposta;
			System.out.println("--------------------------------");
		}
		
		// For para verificação das respostas, caso for certa adicionará ponto
		for(int i = 0; i < 10; i++) {
			if(respostas[i] == respostasCertas[i]) {
				pontos++;
			}
		}
		
		// Ifs para mostrar na tela diferentes padrões pontuações		
		if(pontos < 6) {
			System.out.println(nome + " tente novamente, você consegue!\nPontuação: " + pontos);
		}else if(pontos >= 6 && pontos < 8) {
			System.out.println(nome + " você foi muito bem, parabéns! :)\nPontuação:" +pontos);
		}else if(pontos >= 8) {
			System.out.println(nome + " parabéns você está entre os 1% das pessoas mais inteligentes do mundo!\nPontuação: " + pontos);
		}
		
		System.out.println("Feito por Leonardo Heitor Poglia e Cassiano Danielsson");
		
		sc.close();
	}
}