package ChapterFive;

public class Diamond {
    public static void diamondShape() {
        int spaces = 9;
        int star = 1;

        for (int i = 1; i < 6; i++) {

            System.out.println();

            for (int j = spaces; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < star ; j++) {
                System.out.print("*");
            }
            spaces--; star+=2;

        }

        int space2 = 6;
        int stars2 = 7;

        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = space2; j > 0; j--) {
                System.out.print(" ");
            }
            for (int v = stars2; v > 0; v--) {
                System.out.print("*");
            }
            stars2-=2; space2+=1;
        }
        

    }
}
