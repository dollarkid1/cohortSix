package ProgrammingExerciseOnLoops;

public class Test {
    public static void main(String[] args) {


        int number = 542;
        int temp = number;
        int remainder;
        int reverse=0;

        while (temp>0)

        {
            remainder = temp % 10;
          reverse   = reverse * 10 + remainder;
            temp /= 10;
        }System.out.println("Reverse of " + number + " is " + reverse);

    }
}
