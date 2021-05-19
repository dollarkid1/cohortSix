package Chapter7;

public class BarChart {
    public static void main(String[] args) {
        int[] scores = {0,0,0,0,0,0,1,2,3,2,1};
        System.out.println("Grade distribution");
        for (int i = 0; i < scores.length; i++) {
            if (i == 10)
                System.out.printf("%5d:", 100);
            else
                System.out.printf(" %02d-%02d:", i * 10, i * 10 );
           for(int stars = 0; stars < scores[i]; stars++){
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
