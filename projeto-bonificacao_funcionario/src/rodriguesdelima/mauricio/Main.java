package rodriguesdelima.mauricio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int cont = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de Colaboradores que deseja cadastrar: ");
        int qtdFunc = scanner.nextInt();
        int[] qtdFuncionarios = new int[qtdFunc];
        String[] nomeFuncionarios = new String[qtdFunc];
        double[] salarios = new double[qtdFunc];

        for (int i = 0; i < qtdFuncionarios.length; i++) {
            System.out.print("Insira o nome do colaborador: ");
            nomeFuncionarios[cont] = scanner.nextLine();

            System.out.print("Remuneração base do colaborador(a) " + nomeFuncionarios[cont] + " - R$ ");
            salarios[cont] = scanner.nextDouble();

        }

        double[] calculoSalario = new double[qtdFuncionarios.length];
        for (int i = 0; i < qtdFuncionarios.length; i++) {

            System.out.println("-------------------------------");
            System.out.println("Colaborador(a): " + nomeFuncionarios[i]);
            System.out.println("Remuneração: " + salarios[i]);

            if (salarios[i] <= 1000) {
                calculoSalario[i] += salarios[i] * 0.20;
                System.out.println("Bonificação: " + calculoSalario[i]);
                System.out.println("Remuneração total: " + (salarios[i]+calculoSalario[i]));
                System.out.println("--------------------------------");
            } else if (salarios[i] <= 2000) {
                calculoSalario[i] += salarios[i] * 0.10;
                System.out.println("Bonificação: " + calculoSalario[i]);
                System.out.println("Remuneração total: " + (salarios[i]+calculoSalario[i]));
                System.out.println("--------------------------------");
            } else {
                calculoSalario[i] -= salarios[i] * 0.10;
                System.out.println("Desconto: " + calculoSalario[i]);
                System.out.println("Remuneração total: " + (salarios[i] + calculoSalario[i]));
                System.out.println("--------------------------------");
            }
        }
    }
}
