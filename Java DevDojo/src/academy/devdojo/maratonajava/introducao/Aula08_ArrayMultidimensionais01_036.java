package academy.devdojo.maratonajava.introducao;

public class Aula08_ArrayMultidimensionais01_036 {

    public static void main(String[] args) {

        int[][] dias = new int[12][2];

        dias[0][0] = 1;
        dias[0][1] = 31;
        dias[1][0] = 2;
        dias[1][1] = 28;
        dias[2][0] = 3;
        dias[2][1] = 31;
        dias[3][0] = 4;
        dias[3][1] = 30;
        dias[4][0] = 5;
        dias[4][1] = 31;
        dias[5][0] = 6;
        dias[5][1] = 31;
        dias[6][0] = 7;
        dias[6][1] = 30;
        dias[7][0] = 8;
        dias[7][1] = 31;
        dias[8][0] = 9;
        dias[8][1] = 30;
        dias[9][0] = 10;
        dias[9][1] = 31;
        dias[10][0] = 11;
        dias[10][1] = 30;
        dias[11][0] = 12;
        dias[11][1] = 31;

        System.out.println("For");
        for (int i = 0; i < dias.length; i++) {
            System.out.println();
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("-----------------------------");

        System.out.println("Foreach");
        for (int[] arrBase : dias) {
            System.out.println();
            for (int num : arrBase) {
                System.out.println(num);
            }

        }
    }
}
