package ChapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CryptographerTest {
    @Test
    void encrypt(){

        System.out.println(  Cryptographer.encrypt(7468));
    }

}