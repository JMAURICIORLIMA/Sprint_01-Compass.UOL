package rodriguesdelima.mauricio;

import java.util.Scanner;

public class Main {
    static int acerto = 0;
    static int erro = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cont = 0;

        String[] perguntas = new String[]{"Qual o tempo máximo de duração de uma Daily? ",
                "O que o comando git init faz?",
                "O que quer dizer POO?"};
        String[][] alternativas = {{"A - 15", "B - 20", "C - 10"},
                {"A - Prepara o arquivo para commit", "B - Empurra os arquivos para o repositório", "C - Inicializa um repositório local"},
                {"A - Orientação Para Objeto", "B - Programação Orientada a Objeto", "C - Objeto Orientado a Programação"}};

        String respostas[] = new String[3];

        System.out.println("Bem-vindo(a), ao Quiz Compass" +
                "\nQual o seu nome? ");
        String nome = scanner.nextLine();

        while (cont < perguntas.length) {
            System.out.println((cont + 1) + "° Pergunta:");
            System.out.println(perguntas[cont]);

            for (int i = 0; i <= 2; i++) {
                System.out.println(alternativas[cont][i]);
            }

            System.out.println("Informe sua resposta: ");
            respostas[cont] = scanner.next();

            verificaResposta(respostas[cont], cont);

            cont++;

        }
        mostraResultado(nome);
    }

    static public void mostraResultado(String nome) {
        System.out.println(nome + " seu resultado foi: ");
        System.out.println("Acerto(s): " + acerto);
        System.out.println("Erro(s): " + erro);
    }

    static public void verificaResposta(String resposta, int pergunta) {
        switch (pergunta) {
            case 0:
                if (resposta.equalsIgnoreCase("A")) {
                    System.out.println("Acertou!");
                    acerto++;
                } else {
                    System.out.println("Errou!");
                    erro++;
                }
                break;
            case 1:
                if (resposta.equalsIgnoreCase("C")) {
                    System.out.println("Acertou!");
                    acerto++;
                } else {
                    System.out.println("Errou!");
                    erro++;
                }
                break;
            case 2:
                if (resposta.equalsIgnoreCase("B")) {
                    System.out.println("Acertou!");
                    acerto++;
                } else {
                    System.out.println("Errou!");
                    erro++;
                }
                break;
            default:
                System.out.println("Resposta inválida.");
                erro++;
        }
    }
}
