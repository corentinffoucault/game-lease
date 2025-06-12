package itemlease.item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeaseNewlyReleasedTest {

    @Test
    public void getAmount() {
        LeaseNewlyReleased leaseNewlyReleased = new LeaseNewlyReleased("Super Mario");
        assertEquals(0, leaseNewlyReleased.getAmount(0),0);
        assertEquals(3, leaseNewlyReleased.getAmount(1),0);
        assertEquals(9, leaseNewlyReleased.getAmount(3),0);
        assertEquals(300, leaseNewlyReleased.getAmount(100),0);
    }
    
    @Test
    public void enableBonus() {
        LeaseNewlyReleased leaseNewlyReleased = new LeaseNewlyReleased("Super Mario");
        assertTrue(leaseNewlyReleased.enableBonus());
    }
}
