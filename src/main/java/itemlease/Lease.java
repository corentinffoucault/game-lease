package itemlease;

public class Lease {

    private LeaseItem _leaseItem;
    private int _daysLeased;

    public Lease(LeaseItem leaseItem, int daysLeased) {
        _leaseItem = leaseItem;
        _daysLeased = daysLeased;
    }

    public int getDaysLeased() {
        return _daysLeased;
    }

    public LeaseItem getGame() {
        return _leaseItem;
    }

    public double calculAmount() {
        double amount = _leaseItem.getLeaseConfig().getBasicAmount();
        int numberOfDay = _leaseItem.getLeaseConfig().getNumberDayWithBasicAmount();
        if (_daysLeased > numberOfDay) {
            amount += (_daysLeased - numberOfDay) * _leaseItem.getLeaseConfig().getAmountMultiplier();
        }
        return amount;
    }

    public boolean enableBonus() {
        return _leaseItem.getLeaseConfig().enableBonus() && _daysLeased > 1;
    }
}
