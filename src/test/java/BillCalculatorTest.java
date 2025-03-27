import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;

public class BillCalculatorTest {

    @Test
    public void testCalculateTotalBill() {
        BillCalculator calculator = new BillCalculator();
        Article article1 = new Article(10.0, 2);
        Article article2 = new Article(5.5, 3);

        double total = calculator.calculateTotalBill(Arrays.asList(article1, article2), 50.0, 0.1);
        assertEquals(36.45, total, 0.01); // 36.5 with discount
    }

    @Test
    public void testCalculateTotalBillNoDiscount() {
        BillCalculator calculator = new BillCalculator();
        Article article1 = new Article(10.0, 1);

        double total = calculator.calculateTotalBill(Arrays.asList(article1), 50.0, 0.1);
        assertEquals(10.0, total, 0.01); // No discount applied
    }
}
