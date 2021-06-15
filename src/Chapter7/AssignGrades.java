package Chapter7;
import java.util.Arrays;
import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students");
        int number = input.nextInt();

        System.out.println("Enter Scores");
        int[] scores = new int[number];

        for (int i = 0; i < scores.length; i++)
        scores[i] = input.nextInt();
        System.out.println("Scores entered");
        System.out.println(Arrays.toString(scores));

        int best = scores[0];
        for (int score : scores) {
            if (best < score)
                best = score;
        }

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= best - 10)
                System.out.println("Student no "+ i + " is " + scores[i] + " and grade is A"  );
              else if (scores[i] >= best - 20)
                System.out.println("Student no "+ i + " is " + scores[i] + " and grade is B"  );
              else if (scores[i] >= best - 30)
                System.out.println("Student no "+ i + " is " + scores[i] + " and grade is C"  );
              else if (scores[i] >= best - 40)
                System.out.println("Student no "+ i + " is " + scores[i] + " and grade is D"  );
              else System.out.println("Student no "+ i + " is " + scores[i] + " and grade is F"  );
        }


    }
}
