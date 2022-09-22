package quiz;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Quiz quiz = new Quiz();
    static Usuario usuario = new Usuario();

    public static void main(String[] args) {
        cadastrarUsuario();
        perguntas();
        quiz.verificarRespostas();
        mostrarResultado();
    }

    public static void cadastrarUsuario(){
        System.out.println("------QUIZ SOBRE MINECRAFT------");
        System.out.print("Digite o seu nome: ");
        usuario.setNome(sc.nextLine());
        System.out.println("--------------------------------");
    }

    private static void perguntas() {
        for (int i = 0; i < 10; i++) {
            int resposta;
            do {
                System.out.print(quiz.getPerguntas()[i]);
                resposta = sc.nextInt();
            } while (resposta < 1 || resposta > 4);
            quiz.getRespostas()[i] = resposta;
            System.out.println("--------------------------------");
        }
    }

    private static void mostrarResultado() {
        if (quiz.getPontos() < 6) {
            System.out.println(usuario.getNome() + quiz.getResultados()[0] + quiz.getPontos());
        } else if (quiz.getPontos() >= 6 && quiz.getPontos() < 8) {
            System.out.println(usuario.getNome() + quiz.getResultados()[1] + quiz.getPontos());
        } else if (quiz.getPontos() >= 8) {
            System.out.println(usuario.getNome() + quiz.getResultados()[2] + quiz.getPontos());
        }
    }
}