package itemlease.item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class LeaseChildrenTest {
    
    @Test
    public void getAmount() {
        LeaseChildren leaseChildren = new LeaseChildren("Super Mario");
        assertEquals(1.5, leaseChildren.getAmount(0),0);
        assertEquals(1.5, leaseChildren.getAmount(1),0);
        assertEquals(1.5, leaseChildren.getAmount(2),0);
        assertEquals(1.5, leaseChildren.getAmount(3),0);
        assertEquals(3.0, leaseChildren.getAmount(4),0);
        assertEquals(151.5, leaseChildren.getAmount(103),0);
    }
    
    @Test
    public void enableBonus() {
        LeaseChildren leaseChildren = new LeaseChildren("Super Mario");
        assertFalse(leaseChildren.enableBonus());
    }

}
