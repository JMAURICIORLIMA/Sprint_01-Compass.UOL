package devdojo.maratonajava.exercicios.array;

// Array Multidimensional.

public class ExercicioDevDojo09 {
    public static void main(String[] args) {

        // 1,2,3,4,5,6,7,8,9,10,11,12 Meses
        // 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31 Dias
        int[][] dias = new int[4][3];
        dias[0][0] = 31; //Janeiro
        dias[0][1] = 28; //Fevereiro
        dias[0][2] = 31; //Março

        dias[1][0] = 30; //Abril
        dias[1][1] = 31; //Maio
        dias[1][2] = 30; //Junho

        dias[2][0] = 31; //Julho
        dias[2][1] = 31; //Agosto
        dias[2][2] = 30; //Setembro

        dias[3][0] = 31; //Outubro
        dias[3][1] = 30; //Novembro
        dias[3][2] = 31; //Dezembro

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);

            }          
        }
    }
}
