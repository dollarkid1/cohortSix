package Chapter7;

public class VarArgsDemo {
    public static void printMax(double...numbers){
        if(numbers.length == 0){
            System.out.println("No argument passed");
        }
        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) result = numbers[i];
        }
        System.out.println("the max value is " + result);
    }

    public static void main(String[] args) {
        printMax(23,42,23.2,241,23.1,121.32,234);
        printMax(new double[]{1,2,3});
        String[] strings = {"New York", "Boston", "Atlanta"};
        CommandLineArgs.main(strings);
    }
}
