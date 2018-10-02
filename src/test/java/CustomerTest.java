import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer1;
    Customer customer2;

    @Before
    public void setUp() {
        customer1 = new Customer(20, 1.80, 35.00);
        customer2 = new Customer(21, 1.60, 10.00);
    }

    @Test
    public void canGetAge() {
        assertEquals(20, customer1.getAge());
    }

    @Test
    public void canGetHeight() {
        assertEquals(1.80, customer1.getHeight(), 0.01);
    }

    @Test
    public void canGetMoney() {
        assertEquals(35.00, customer1.getMoney(), 0.01);
    }
}
