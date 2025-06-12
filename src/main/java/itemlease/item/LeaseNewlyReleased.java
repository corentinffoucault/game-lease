package itemlease.item;

public class LeaseNewlyReleased extends ALeaseItem {
    private static boolean ENABLE_BONUS = true;
    private static double AMOUNT_MULTIPLIER = 3;

    public LeaseNewlyReleased(String title) {
        super(title);
    }

    public double getAmount(int daysLeased) {
        return daysLeased * AMOUNT_MULTIPLIER;
    }

    @Override
    public boolean enableBonus() {
        return ENABLE_BONUS;
    }
}
