package ChapterFour;

import java.util.Scanner;

public class Cryptographer {

    public static int encrypt(int message){
        int encryptedMessage = 0;
        // split into 4 digits

       int firstDigit = message/1000;
       firstDigit +=7;
       firstDigit %=10;

        message = message %1000;
       int secondDigit = message / 100;
        secondDigit +=7;
        secondDigit %=10;

       message = message % 100;
       int thirdDigit = message / 10;
        thirdDigit +=7;
        thirdDigit %=10;

        int fourthDigit = message % 10;
        fourthDigit +=7;
        fourthDigit %=10;

        thirdDigit *=1000;
        fourthDigit *= 100;
        firstDigit *= 10;
        secondDigit *= 1;

        encryptedMessage = thirdDigit + fourthDigit + firstDigit + secondDigit;

        return encryptedMessage;

    }

    public static int decrypt( int reverse){
        int decryptedMessage = 0;







        return decryptedMessage;
    }


}
