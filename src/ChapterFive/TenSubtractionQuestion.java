package ChapterFive;

public class TenSubtractionQuestion {
    public static void main(String[] args) {

        final int NUMBER_OF_QUESTIONS = 10;
        int i = 0;
        System.out.println("answer all 10 question");

        while(i < NUMBER_OF_QUESTIONS) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            if(number1 < number2){
                int swap = number1;
                number1 = number2;
                number2 = swap;
            }
            System.out.println(number1  + "-" + number2);
            i++;

        }
    }
}
