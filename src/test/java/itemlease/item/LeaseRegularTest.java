package itemlease.item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class LeaseRegularTest {
        
    @Test
    public void getAmount() {
        LeaseRegular leaseRegular = new LeaseRegular("Super Mario");
        assertEquals(2, leaseRegular.getAmount(0),0);
        assertEquals(2, leaseRegular.getAmount(1),0);
        assertEquals(2, leaseRegular.getAmount(2),0);
        assertEquals(3.5, leaseRegular.getAmount(3),0);
        assertEquals(5.0, leaseRegular.getAmount(4),0);
        assertEquals(152, leaseRegular.getAmount(102),0);
    }
    
    @Test
    public void enableBonus() {
        LeaseRegular leaseRegular = new LeaseRegular("Super Mario");
        assertFalse(leaseRegular.enableBonus());
    }
}
