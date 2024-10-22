import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BankAccountTest {
    @RepeatedTest(5)
    @DisplayName("Withdrawing testing Class")
    public void testWithdraw() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());

    }

    @RepeatedTest(6)
    @DisplayName("Depositing testing class")
    public void testDeposit() {
        BankAccount bankAccount1 = new BankAccount(400, 0);
        bankAccount1.deposit(500);
        assertEquals(900, bankAccount1.getBalance());
    }

    @Test
    @DisplayName("Withdraw will become negative")
    public void testWithdrawNotStuckAtZero() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(800);
        assertNotEquals(0, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Test activation account after creation")
    public void testActive() {
        BankAccount bankAccount = new BankAccount(500, 0);
        assertTrue(bankAccount.isActive());
    }

    @Test
    @DisplayName("Test set Holder Name")
    public void testHolderNameSet() {
        BankAccount bankAccount = new BankAccount(500, 0);
        bankAccount.setHoldername("Maaike");
        assertNotNull(bankAccount.getHoldername());
    }

}
