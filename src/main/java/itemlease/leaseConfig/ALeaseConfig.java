package itemlease.leaseConfig;

public abstract class ALeaseConfig {

    public ALeaseConfig() {
    }

    public abstract double getBasicAmount();
    public abstract double getAmountMultiplier();
    public abstract int getNumberDayWithBasicAmount();
    public abstract boolean enableBonus();
}