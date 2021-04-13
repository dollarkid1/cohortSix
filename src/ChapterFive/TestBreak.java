package ChapterFive;

public class TestBreak {
    public static void main(String[] args) {
        int sum=0;
        int i=0;

        while (i<20) {
            i++;
            sum += i;
            if(sum>=100){
                break;}

        }System.out.println(i);
        System.out.println(sum);

    }
}
