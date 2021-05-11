package ChapterFive;

public class PrintingTriangles {
    public static void main(String[] args) {

        int starsA =1;

        for (int i = 1; i <= 10; i++) {

            for (int j = starsA; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
            starsA++;
        }
        System.out.println("---------------------------------");


        int starsB = 10;
        for (int i = 10; i > 0; i--) {
            for (int j = starsB; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
            starsB--;
        }
        System.out.println("------------------------------");



        int space = 0;
        int starsC = 10;
        for (int i = 0; i < 10; i++) {
            for (int j = space; j > 0 ; j--) {
                System.out.print(" ");
            }
            space++;

            for (int j = starsC; j > 0; j--) {
                System.out.print("*");

            }
            System.out.println();
            starsC--;
        }
        System.out.println("---------------------------------------");

        int starD = 1;
        int space1 = 10;

        for (int i = 0; i < 10 ; i++) {
            System.out.println();
            for (int j = space1; j > 0; j-- ) {
                System.out.print(" ");
            }
            space1--;

            for (int j = starD; j > 0 ; j--) {
                System.out.print("*");
            }
            starD++;
        }

    }

}
