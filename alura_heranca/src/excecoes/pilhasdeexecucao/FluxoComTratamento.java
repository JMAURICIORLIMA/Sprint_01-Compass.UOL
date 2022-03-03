package excecoes.pilhasdeexecucao;

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException | MinhaExcecao exception){
            String msg = exception.getMessage();
            System.out.println("Exceção: " + msg);
            exception.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            throw new MinhaExcecao("Algo errado não está certo.");
        }
        System.out.println("Fim do metodo2");
    }
}
