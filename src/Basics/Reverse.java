package Basics;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the word you want to reverse:");
        String input = scanner.next();
        String string = input;

        char [] mychar = string.toCharArray();

        for (int i = mychar.length-1; i >= 0 ; i--) {
            System.out.print(mychar[i]);
        }
        System.out.println();
        String j = String.valueOf(mychar);
        System.out.println(j);
    }
}
