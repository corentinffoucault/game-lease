package itemlease;

import java.util.AbstractMap.SimpleImmutableEntry;

import itemlease.printer.APrinter;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String _name;
    private APrinter _printer;
    private List<Lease> _leases = new ArrayList<Lease>();

    public Customer(String name, APrinter printer) {
        _name = name;
        _printer = printer;
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
        List<SimpleImmutableEntry<String, Double>> listOfGameWithAmount = new ArrayList<SimpleImmutableEntry<String, Double>>();

        for (Lease lease : _leases) {
            double thisAmount = lease.getAmount();

            // add loyalty points
            nbLoyaltyPoints++;
            
            // add bonus for a two day famous lease
            if (lease.enableBonus()) {
                nbLoyaltyPoints++;
            }
            
            listOfGameWithAmount.add(new SimpleImmutableEntry<>(lease.getGame().getTitle(), thisAmount));
            // show figures for this lease
            totalAmount += thisAmount;
        }

        return _printer.print(getName(), totalAmount, nbLoyaltyPoints, listOfGameWithAmount);
    }
}