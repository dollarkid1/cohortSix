package Chapter6_Methods;

/*Rolling a Six-Sided Die 20 Times*/

import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        for (int i = 0; i < 20; i++) {

            int face = 1 + randomNumbers.nextInt(6);

            if (i % 5 == 0)
                System.out.println();

            System.out.printf("%d ",face);
        }



    }
}
