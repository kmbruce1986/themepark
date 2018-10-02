import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeacupsTest {

    Teacups teacups;
    Customer customer1;
    Customer customer2;

    @Before
    public void setUp() {
        customer1 = new Customer(5, 1.20, 5.00);
        customer2 = new Customer(10, 1.00, 2.00);
        teacups = new Teacups(3.00, 1.10);
    }

    @Test
    public void canGetPrice() {
        assertEquals(3.00, teacups.getPrice(), 0.01);
    }

    @Test
    public void canGetMinimumHeight() {
        assertEquals(1.10, teacups.getMinimumHeight(), 0.01);
    }

    @Test
    public void canCheckHeightTallEnough() {
        assertEquals(true, teacups.checkHeight(customer1));
    }

    @Test
    public void canCheckHeightNotTallEnough() {
        assertEquals(false, teacups.checkHeight(customer2));
    }

    @Test
    public void canTakePayment() {
        teacups.takePayment(customer1);
        assertEquals(2.00, customer1.getMoney(), 0.01);
    }


    @Test
    public void cannotTakePayment() {
        teacups.takePayment(customer2);
        assertEquals(2.00, customer2.getMoney(), 0.01);
    }
}
