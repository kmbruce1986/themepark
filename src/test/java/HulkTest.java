import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HulkTest {

    Hulk hulk;
    Customer customer1;
    Customer customer2;

    @Before
    public void setUp() {
        customer1 = new Customer(20, 1.80, 35.00);
        customer2 = new Customer(21, 1.59, 4.00);
        hulk = new Hulk(10.00, 1.70);
    }

    @Test
    public void canGetPrice() {
        assertEquals(10.00, hulk.getPrice(), 0.01);
    }

    @Test
    public void canGetMinimumHeight() {
        assertEquals(1.70, hulk.getMinimumHeight(), 0.01);
    }

    @Test
    public void canCheckHeightTallEnough() {
        assertEquals(true, hulk.checkHeight(customer1));
    }

    @Test
    public void canCheckHeightNotTallEnough() {
        assertEquals(false, hulk.checkHeight(customer2));
    }

    @Test
    public void canTakePayment() {
        hulk.takePayment(customer1);
        assertEquals(25.00, customer1.getMoney(), 0.01);
    }


    @Test
    public void cannotTakePayment() {
        hulk.takePayment(customer2);
        assertEquals(4.00, customer2.getMoney(), 0.01);
    }
}
