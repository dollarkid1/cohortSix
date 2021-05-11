package ChapterFive;

public class PrintTrianglesOnALine {

    public static void main(String[] args) {

        int t1 = 1, t2 = 10;
        int space1 = 12, space2 = 5;
        // declare a loop for 10 iterations
        for (int i = 0; i < 10; i++) {

            for (int a = t1; a > 0; a--) {
                System.out.print("*");
            }


            for (int b = space1; b > 0; b--) {
                System.out.print(" ");
            }

            for (int c = t2; c > 0 ; c--) {
                System.out.print("*");
            }

            for (int d = space2; d > 0 ; d--) {
                System.out.print(" ");
            }

            for (int c = t2; c > 0 ; c--) {
                System.out.print("*");
            }

            for (int b = space1; b > 0; b--) {
                System.out.print(" ");
            }


            for (int a = t1; a > 0; a--) {
                System.out.print("*");
            }
            System.out.println();

            t1++; space1--; t2--; space2 +=2;
        }

    }

}
