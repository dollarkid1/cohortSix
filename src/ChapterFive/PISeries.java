package ChapterFive;

public class PISeries {
    public static void PI() {
        // loop for 200_000
        double pi = 0;
        System.out.println("Term      PI");
        for(int i = 1; i <= 200_000; i++){

            if(i == 1){
                pi = 4/1;
            }

          else  if (i % 2 == 0){
                pi = pi -(double) 4/(i +(i-1));

            }
          else{
                pi = pi +(double) 4/(i +(i-1));
            }

            System.out.printf("%d%20f%n",i,pi);
        }

    }

}
