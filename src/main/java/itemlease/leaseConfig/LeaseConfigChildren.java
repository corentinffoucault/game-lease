package itemlease.leaseConfig;

public class LeaseConfigChildren extends ALeaseConfig {
    private static boolean ENABLE_BONUS = false;
    private static double BASIC_AMOUNT = 1.5;
    private static double AMOUNT_MULTIPLIER = 1.5;
    private static int NUMBER_DAY_WITH_BASIC_AMOUNT = 3;

    public LeaseConfigChildren() {
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