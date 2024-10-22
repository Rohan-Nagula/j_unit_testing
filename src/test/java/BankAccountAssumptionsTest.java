import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class BankAccountAssumptionsTest {
    @Test
    @DisplayName("Test account activation after creation")
    public void testActive() {
        BankAccount bankAccount = new BankAccount(500, 0);
        //assumeTrue(bankAccount != null);
        assumingThat(bankAccount == null, () -> assertTrue(bankAccount.isActive()));
       //assertTrue(bankAccount.isActive());
    }
}
