import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CreditCardValidatorTest {

    @Test
    public void testIsValidCreditCardNumber() {
        CreditCardValidator validator = new CreditCardValidator();
        assertTrue(validator.isValidCreditCardNumber("4532015112830366")); // Valid card number
        assertFalse(validator.isValidCreditCardNumber("1234567812345670")); // Invalid card number
    }

    @Test
    public void testIsValidCreditCardNumberEdgeCase() {
        CreditCardValidator validator = new CreditCardValidator();
        assertTrue(validator.isValidCreditCardNumber("4012888888881881")); // Another valid card number
        assertFalse(validator.isValidCreditCardNumber("1234567890123456")); // Invalid card number
    }
}
