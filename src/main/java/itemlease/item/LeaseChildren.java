package itemlease.item;

public class LeaseChildren extends ALeaseItem {

    public LeaseChildren(String title) {
        super(title);
    }

    public double getAmount(int daysLeased) {
        double amount = 1.5;
        if (daysLeased > 3) {
            amount += (daysLeased - 3) * 1.5;
        }
        return amount;
    }
}
