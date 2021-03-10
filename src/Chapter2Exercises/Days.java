package Chapter2Exercises;

public class Days {
    public static void main(String[] args) {
        int day=3;
        switch (day) {
            case 1 -> System.out.println("MONDAY");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("WEDNESDAY");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("FRIDAY");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("SUNDAY");
        }
    }
}
