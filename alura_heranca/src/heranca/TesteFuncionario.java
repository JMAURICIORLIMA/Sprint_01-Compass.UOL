package heranca;

import java.util.Scanner;

public class TesteFuncionario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000);

        EditorDeVideos ev = new EditorDeVideos();
        ev.setSalario(2500);

        Designer d = new Designer();
        d.setSalario(2000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registro(g1);
        controle.registro(ev);
        controle.registro(d);

        System.out.println(controle.getSoma());

    }
}
