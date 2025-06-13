package itemlease.leaseConfig;

public class LeaseConfigNewlyReleased extends ALeaseConfig {
    private static boolean ENABLE_BONUS = true;
    private static double BASIC_AMOUNT = 0;
    private static double AMOUNT_MULTIPLIER = 3;
    private static int NUMBER_DAY_WITH_BASIC_AMOUNT = 0;

    public LeaseConfigNewlyReleased() {
    }

    @Override
    public double getBasicAmount() {
        return BASIC_AMOUNT;
    }

    @Override
    public double getAmountMultiplier() {
        return AMOUNT_MULTIPLIER;
    }

    @Override
    public int getNumberDayWithBasicAmount() {
        return NUMBER_DAY_WITH_BASIC_AMOUNT;
    }

    @Override
    public boolean enableBonus() {
        return ENABLE_BONUS;
    }
}