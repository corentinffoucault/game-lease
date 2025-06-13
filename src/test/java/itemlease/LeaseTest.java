package itemlease;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import itemlease.leaseConfig.ALeaseConfig;
import itemlease.leaseConfig.LeaseConfigChildren;
import itemlease.leaseConfig.LeaseConfigNewlyReleased;
import itemlease.leaseConfig.LeaseConfigRegular;

public class LeaseTest {
    
    @Test
    public void getLeaseInfoForRegularConfig() {
        ALeaseConfig config = new LeaseConfigRegular();

        Lease lease = new Lease(new LeaseItem("Super Mario", config), 0);
        assertEquals(2, lease.calculAmount(),0);
        assertFalse(lease.enableBonus());

        lease = new Lease(new LeaseItem("Super Mario", config), 1);
        assertEquals(2, lease.calculAmount(),0);
        assertFalse(lease.enableBonus());

        lease = new Lease(new LeaseItem("Super Mario", config), 2);
        assertEquals(2, lease.calculAmount(),0);
        assertFalse(lease.enableBonus());

        lease = new Lease(new LeaseItem("Super Mario", config), 3);
        assertEquals(3.5, lease.calculAmount(),0);
        assertFalse(lease.enableBonus());

        lease = new Lease(new LeaseItem("Super Mario", config), 4);
        assertEquals(5.0, lease.calculAmount(),0);
        assertFalse(lease.enableBonus());

        lease = new Lease(new LeaseItem("Super Mario", config), 102);
        assertEquals(152, lease.calculAmount(),0);
        assertFalse(lease.enableBonus());
    }

    @Test
    public void getLeaseInfoForChildrenConfig() {
        ALeaseConfig config = new LeaseConfigChildren();

        Lease lease = new Lease(new LeaseItem("Super Mario", config), 0);
        assertEquals(1.5, lease.calculAmount(),0);
        assertFalse(lease.enableBonus());

        lease = new Lease(new LeaseItem("Super Mario", config), 1);
        assertEquals(1.5, lease.calculAmount(),0);
        assertFalse(lease.enableBonus());

        lease = new Lease(new LeaseItem("Super Mario", config), 2);
        assertEquals(1.5, lease.calculAmount(),0);
        assertFalse(lease.enableBonus());

        lease = new Lease(new LeaseItem("Super Mario", config), 3);
        assertEquals(1.5, lease.calculAmount(),0);
        assertFalse(lease.enableBonus());

        lease = new Lease(new LeaseItem("Super Mario", config), 4);
        assertEquals(3, lease.calculAmount(),0);
        assertFalse(lease.enableBonus());

        lease = new Lease(new LeaseItem("Super Mario", config), 102);
        assertEquals(150, lease.calculAmount(),0);
        assertFalse(lease.enableBonus());
    }

    @Test
    public void getLeaseInfoForNewlyReleasedConfig() {
        ALeaseConfig config = new LeaseConfigNewlyReleased();

        Lease lease = new Lease(new LeaseItem("Super Mario", config), 0);
        assertEquals(0, lease.calculAmount(),0);
        assertFalse(lease.enableBonus());

        lease = new Lease(new LeaseItem("Super Mario", config), 1);
        assertEquals(3, lease.calculAmount(),0);
        assertFalse(lease.enableBonus());

        lease = new Lease(new LeaseItem("Super Mario", config), 3);
        assertEquals(9, lease.calculAmount(),0);
        assertTrue(lease.enableBonus());

        lease = new Lease(new LeaseItem("Super Mario", config), 100);
        assertEquals(300, lease.calculAmount(),0);
        assertTrue(lease.enableBonus());
    }

}
