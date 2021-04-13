package ChapterFive;
/*an example of a while loop, for loop and a do while loop*/
public class Try1 {

    public static void main(String[] args) {
        long sum = 0;
        int i = 0;
        while (i <= 1000){
            i++;
        sum = sum + i;

        System.out.println(sum);
    }

        long sum1 = 0;
        for (int j = 0; j <= 5; j++)
            sum1 = sum1 + i;
        System.out.println(sum1);

        int k = 0;
        do{
            k+=1;
            System.out.println(k);
            k++;
        }while(k < 10);
    }
}
