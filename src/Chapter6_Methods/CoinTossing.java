package Chapter6_Methods;

import java.security.SecureRandom;

public class CoinTossing {

    static int headCounter;
    static int tailCounter;
    static Face coinFace;

    enum Face{
        HEAD, TAIL
    }

    public static void flip(){
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < 5; i++) {

            int flip = random.nextInt(2);

            if (flip + 1 == 1) coinFace = Face.HEAD;
            else coinFace = Face.TAIL;

            System.out.println(coinFace);
            System.out.println("number of Heads " + getHeadCounter());
            System.out.println("number of Tails " + getTailCounter());
        }
    }

    public static int getHeadCounter() {
        if (coinFace == Face.HEAD)
            headCounter++;
        return headCounter;
    }

    public static int getTailCounter() {
        if (coinFace == Face.TAIL)
            tailCounter++;
        return tailCounter;
    }

    public static void main(String[] args) {
        flip();
    }


}
