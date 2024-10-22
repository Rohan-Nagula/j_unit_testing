import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountDiTest {
    @RepeatedTest(6)
    @DisplayName("Depositing testing class")
    public void testDeposit(BankAccount bankAccount) {

        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }

}
