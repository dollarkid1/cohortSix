package ourFirstTddClass;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyAccountTest {
    private MyAccount account;

    @BeforeEach
    void setUp() {
        account = new MyAccount();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void UserCanSetBalance(){
        account.setBalance(300.00);
        assertEquals(300, account.getBalance());


    }
    @Test
    void UserCanGetBalance(){
        account.setBalance(500.00);
        assertEquals(500.00, account.getBalance());
    }
    @Test
    void userCanChangeName(){
      account.setName("S");
      assertEquals("S", account.getName());

    }
    @Test
    void userCanSetPin(){
     account.setPin(0);
     assertEquals(0, account.getAccountPin());

    }
    @Test
    void userCanWithdraw(){
        account.setBalance(500.00);
        account.getCash(200.00);
        assertEquals(300.00,account.getBalance());
    }






}