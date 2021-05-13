package ChapterFive;

public class DiamondMain {

    public static  void dShape(){

        int spaces = 10;
        int stars = 1;
        int lines = 9;
        int div = lines/2+1;

        for (int i = 0; i <= lines; i++) {

            for (int a = spaces; a > 0; a--) {
                System.out.print(" ");
            }
            for (int b = stars; b > 0; b--) {
                System.out.print("* ");
            }
            System.out.println();

            if (i < div){
                spaces -=2; stars+=2;
            }
            else if (i >= div){
                spaces +=2; stars -=2;
            }

        }

    }
}
