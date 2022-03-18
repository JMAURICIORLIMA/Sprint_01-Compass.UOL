package devdojo.maratonajava.exercicios.array;

//Array Multidimensional - 03

public class ExercicioDevDojo11 {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];

        //inicialização de array multidimensional

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrBase : arrayInt2) {
            System.out.println("\n-----------------");
            for (int num : arrBase) {
                System.out.println(num + " ");
            }
        }

    }
}
