package ChapterFive;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println( "          MULTIPLICATION TABLE");
        for (int i = 1; i <=9; i++) {
            System.out.printf("%4d",i);
        }System.out.println();
        System.out.println("__________________________________________");
        for (int j = 1; j <=9 ; j++) {
            System.out.print(j+"|");
            for (int k = 1; k <=9 ; k++) {
                System.out.printf("%4d",j*k);
            }
            System.out.println();
        }
    }
}

