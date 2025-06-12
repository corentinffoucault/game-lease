package itemlease;

import itemlease.item.ALeaseItem;

/**
 * The Lease class represents a customer leasing a game.
 */
public class Lease {

    private ALeaseItem _leaseItem;
    private int _daysLeased;

    public Lease(ALeaseItem leaseItem, int daysLeased) {
        _leaseItem = leaseItem;
        _daysLeased = daysLeased;
    }

    public int getDaysLeased() {
        return _daysLeased;
    }

    public ALeaseItem getGame() {
        return _leaseItem;
    }

    public double getAmount() {
        return _leaseItem.getAmount(_daysLeased);
    }

    public boolean enableBonus() {
        return _leaseItem.enableBonus() && _daysLeased > 1;
    }
}
