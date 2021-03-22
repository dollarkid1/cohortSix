package Chapter2Exercises;

public class ArrayUsingForEachLoop {
    public static void main(String[] args) {
        int[][] i = {{12, 11, 42, 18}, {78, 39, 24, 32}, {91, 90, 28, 13}};
      {

        for (int a = 0; a< i.length; a++){

            for (int b = 0; b < i.length; b++) {
                int total = i[0][0];
                System.out.print(i[a][b] + " ");
            }
            System.out.println();

        }
        }
    }
}