package devdojo.maratonajava.exercicios.array;

// Array

public class ExercicioDevDojo07 {
    public static void main(String[] args) {
        // Percorrendo um array
        String[] nome = new String[5];

        nome[0] = "Ademar";
        nome[1] = "Breno";
        nome[2] = "Carlos";
        nome[3] = "Diogo";
        nome[4] = "Ellen";

        for (int i = 0 ; i < nome.length; i++) {
            System.out.println("Nome: "+nome[i]+" na posição "+i+".");
        }
    }
}
