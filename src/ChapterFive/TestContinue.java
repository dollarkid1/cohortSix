package ChapterFive;

public class TestContinue {
    public static void main(String[] args) {
        int i = 0, sum = 0;

        while(i < 20){
            i++;
            System.out.println(i);
            if(i == 10 || i == 11)
                break;
            sum += i;
        }
            System.out.println(sum);
    }
}
