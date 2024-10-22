import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountNestedTest {

    @Test
    @DisplayName("Withdrawing testing Class")
    public void testWithdraw() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());

    }

    @Test
    @DisplayName("Depositing testing class")
    public void testDeposit() {
        BankAccount bankAccount1 = new BankAccount(400, 0);
        bankAccount1.deposit(500);
        assertEquals(900, bankAccount1.getBalance());
    }
@Nested
    class WhenBalanceEqualsZero {
       @Test
       @DisplayName("Inner class test method 1")
        public void testWithdrawMinimumBalanceis0() {
            BankAccount bankAccount = new BankAccount(0, 0);
            assertThrows(RuntimeException.class, () -> bankAccount.withdraw(500));


        }
        @Test
        @DisplayName("Inner class test method 2")
        public void testWithdrawMinimumBalanceNegative1000() {
            BankAccount bankAccount = new BankAccount(0, -1000);
            bankAccount.withdraw(500);
            assertEquals(-500, bankAccount.getBalance());

        }
    }
}
