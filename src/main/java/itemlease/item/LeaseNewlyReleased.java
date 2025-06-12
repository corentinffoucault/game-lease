package itemlease.item;

public class LeaseNewlyReleased extends ALeaseItem {

    public LeaseNewlyReleased(String title) {
        super(title);
    }

    public double getAmount(int daysLeased) {
        return daysLeased * 3;
    }

    @Override
    public boolean enableBonus() {
        return true;
    }
}
