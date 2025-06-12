package itemlease;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String _name;
    private List<Lease> _leases = new ArrayList<Lease>();

    public Customer(String name) {
        _name = name;
    }

    public void addLease(Lease arg) {
        _leases.add(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int nbLoyaltyPoints = 0;
        String result = "Games leased by " + getName() + "\n";

        for (Lease lease : _leases) {
            double thisAmount = lease.getAmount();

            // add loyalty points
            nbLoyaltyPoints++;
            
            // add bonus for a two day famous lease
            if (lease.enableBonus()) {
                nbLoyaltyPoints++;
            }

            // show figures for this lease
            result += "\t" + lease.getGame().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        // add footer lines
        result += "Amount is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(nbLoyaltyPoints) + " loyalty points";

        return result;
    }
}
