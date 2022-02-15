package Chapter6_Methods.CAI;

import java.security.SecureRandom;
import java.util.Scanner;

public class Computer_Assisted_Instruction {

    private static final SecureRandom random = new SecureRandom();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        add();
    }

    private static void repeatQ(){
        for (int k = 0; k < 9; k++) {
    
        }
    }


    private static void add(){
        int end = (int) 900;
        System.out.println("type 900 to quit");
        int i = random.nextInt(10);
        int j = random.nextInt(10);
        int ans = i + j;
        System.out.println("How much is "+ i +" plus "+ j +"?");
        int input = scanner.nextInt();

        while (input != ans && input != 900){
            System.out.println("Pls try again:");
            input = scanner.nextInt();
            if (input == end)break;
        }
        System.out.println("Great Job");

    }
}
