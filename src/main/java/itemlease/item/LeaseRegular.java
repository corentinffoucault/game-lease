package itemlease.item;

public class LeaseRegular extends ALeaseItem {

    public LeaseRegular(String title) {
        super(title);
    }

    public double getAmount(int daysLeased) {
        double amount = 2;
        if (daysLeased > 2) {
            amount += (daysLeased - 2) * 1.5;
        }
        return amount;
    }

}
