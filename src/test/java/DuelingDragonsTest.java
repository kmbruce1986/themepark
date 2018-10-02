import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DuelingDragonsTest {
    
    DuelingDragons duelingDragons;

    @Before
    public void setUp() {
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
}
