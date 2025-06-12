package itemlease.item;

public class LeaseRegular extends ALeaseItem {
    private static boolean ENABLE_BONUS = false;
    private static double BASIC_AMOUNT = 2;
    private static double AMOUNT_MULTIPLIER = 1.5;
    private static int NUMBER_DAY_WITH_BASIC_AMOUNT = 2;

    public LeaseRegular(String title) {
        super(title);
    }

    public double getAmount(int daysLeased) {
        double amount = BASIC_AMOUNT;
        if (daysLeased > NUMBER_DAY_WITH_BASIC_AMOUNT) {
            amount += (daysLeased - NUMBER_DAY_WITH_BASIC_AMOUNT) * AMOUNT_MULTIPLIER;
        }
        return amount;
    }

    @Override
    public boolean enableBonus() {
        return ENABLE_BONUS;
    }

}
