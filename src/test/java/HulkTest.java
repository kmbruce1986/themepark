import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HulkTest {

    Hulk hulk;

    @Before
    public void setUp() {
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
}
