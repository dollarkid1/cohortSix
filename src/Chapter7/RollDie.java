package Chapter7;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int [] frequency = new int[7];

        for(int roll = 0; roll < 6_000_000; roll++)
        ++frequency[1 + secureRandom.nextInt(6)];
        System.out.printf("%s%10s%n", "Face", "Frequency");

        for(int face = 1; face < frequency.length; face++)
        System.out.printf("%3d%9d%n", face ,frequency[face]);
    }
}
