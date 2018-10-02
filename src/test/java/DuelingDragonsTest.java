import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DuelingDragonsTest {
    
    DuelingDragons duelingDragons;
    Customer customer1;
    Customer customer2;

    @Before
    public void setUp() {
        customer1 = new Customer(20, 1.80, 35.00);
        customer2 = new Customer(21, 1.59, 4.00);
        duelingDragons = new DuelingDragons(5.00, 1.60);
    }

    @Test
    public void canGetPrice() {
        assertEquals(5.00, duelingDragons.getPrice(), 0.01);
    }

    @Test
    public void canGetMinimumHeight() {
        assertEquals(1.60, duelingDragons.getMinimumHeight(), 0.01);
    }

    @Test
    public void canCheckHeightTallEnough() {
        assertEquals(true, duelingDragons.checkHeight(customer1));
    }

    @Test
    public void canCheckHeightNotTallEnough() {
        assertEquals(false, duelingDragons.checkHeight(customer2));
    }

    @Test
    public void canTakePayment() {
        duelingDragons.takePayment(customer1);
        assertEquals(30.00, customer1.getMoney(), 0.01);
    }


    @Test
    public void cannotTakePayment() {
        duelingDragons.takePayment(customer2);
        assertEquals(4.00, customer2.getMoney(), 0.01);
    }
}
