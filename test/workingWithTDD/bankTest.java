package workingWithTDD;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bankTest {

    Bank access;
    @BeforeEach
    void setUp() {
        access = new Bank("Fred Dan",12345,100);
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void bankCanCreateAccount(){
        String accountName = access.getAccountName("Fred Dan");
        assertEquals("Fred Dan", accountName);

    }

    @Test
    void checkBalance(){
        double balance = access.getBalance();
        assertEquals(100,balance);

    }
    @Test
    void depositPositiveValue(){
        access.deposit(200);
        assertEquals(300, access.getBalance());

    }

    @Test
    void canNotDepositANegativeValue(){
        access.deposit(-99);
        assertEquals(100, access.getBalance());

    }

    @Test
    void withdraw(){
        access.withdraw(100);
        assertEquals(0,access.getBalance());
    }

    @Test
    void cannotWithdrawANegativeValue(){
        access.withdraw(-100);
        assertEquals(100,access.getBalance());
    }
    @Test
    void cannotWithdrawAValueGreaterThanBalance(){
        access.withdraw(101);
        assertEquals(100,access.getBalance());
    }


}