package devdojo.maratonajava.exercicios.array;

// Array

public class ExercicioDevDojo06 {
    public static void main(String[] args) {
        // Na criação de uma array, o que está antes do sinal de igualdade é um tipo (reference)
        // Após a igualdade (lado direito) será um objeto de array.

        // Na declaração de um array e seus tipos primitivos, o valor padrão será o seguite:
        // byte, short, int, long, float e double = 0.
        // char = unicode '\u0000' ' ' =  Representa um espaço em branco.
        // boolean = false.
        // String = null.

        byte[] bt = new byte[1];
        short[] sh = new short[1];
        int[] in = new int[1];
        long[] lg = new long[1];
        float[] flt = new float[1];
        double[] dlb = new double[1];

        char[] ch = new char[1];

        boolean[] boo = new boolean[1];

        String[] st = new String[1];

        System.out.println("Primitivos numéricos");
        System.out.println(bt[0]);
        System.out.println(sh[0]);
        System.out.println(in[0]);
        System.out.println(lg[0]);
        System.out.println(flt[0]);
        System.out.println(dlb[0]);
        System.out.println("Caractere");
        System.out.println(ch[0]);
        System.out.println("Lógico");
        System.out.println(boo[0]);
        System.out.println("Cadea de caracteres");
        System.out.println(st[0]);


    }
}
