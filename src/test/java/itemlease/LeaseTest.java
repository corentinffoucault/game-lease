package itemlease;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import itemlease.item.LeaseNewlyReleased;
import itemlease.item.LeaseRegular;

public class LeaseTest {
    
    @Test
    public void enableBonusWithInvalidLeaseItem() {
        Lease lease0 = new Lease(new LeaseRegular("Super Mario"), 0);
        Lease lease1 = new Lease(new LeaseRegular("Super Mario"), 1);
        Lease lease2 = new Lease(new LeaseRegular("Super Mario"), 2);
        assertFalse(lease0.enableBonus());
        assertFalse(lease1.enableBonus());
        assertFalse(lease2.enableBonus());
    }

    @Test
    public void enableBonusWithValidItem() {
        Lease lease0 = new Lease(new LeaseNewlyReleased("Super Mario"), 0);
        Lease lease1 = new Lease(new LeaseNewlyReleased("Super Mario"), 1);
        Lease lease2 = new Lease(new LeaseNewlyReleased("Super Mario"), 2);
        assertFalse(lease0.enableBonus());
        assertFalse(lease1.enableBonus());
        assertTrue(lease2.enableBonus());
    }
}
