package itemlease;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import itemlease.leaseConfig.LeaseConfigChildren;
import itemlease.leaseConfig.LeaseConfigNewlyReleased;
import itemlease.leaseConfig.LeaseConfigRegular;
import itemlease.printer.BasicPrinter;
import itemlease.printer.HtmlPrinter;

public class CustomerTest {

    @Test
    public void testBasicText() {
        LeaseConfigRegular configRegular = new LeaseConfigRegular();
        LeaseConfigChildren configChildren = new LeaseConfigChildren();
        LeaseConfigNewlyReleased configNewlyReleased = new LeaseConfigNewlyReleased();

        Customer customer = new Customer("Bob", new BasicPrinter());
        customer.addLease(new Lease(new LeaseItem("Call Of Duty", configRegular), 2));
        customer.addLease(new Lease(new LeaseItem("Golden Eye", configRegular), 3));
        customer.addLease(new Lease(new LeaseItem("Short New", configNewlyReleased), 1));
        customer.addLease(new Lease(new LeaseItem("Long New", configNewlyReleased), 2));
        customer.addLease(new Lease(new LeaseItem("Super Mario", configChildren), 3));
        customer.addLease(new Lease(new LeaseItem("Threes", configChildren), 4));

        String expected = "" +
                "Games leased by Bob\n" +
                "\tCall Of Duty\t2.0\n" +
                "\tGolden Eye\t3.5\n" +
                "\tShort New\t3.0\n" +
                "\tLong New\t6.0\n" +
                "\tSuper Mario\t1.5\n" +
                "\tThrees\t3.0\n" +
                "Amount is 19.0\n" +
                "You earned 7 loyalty points";

        assertEquals(expected, customer.statement());
    }

    @Test
    public void testHtmlText() {
        LeaseConfigRegular configRegular = new LeaseConfigRegular();
        LeaseConfigChildren configChildren = new LeaseConfigChildren();
        LeaseConfigNewlyReleased configNewlyReleased = new LeaseConfigNewlyReleased();
        Customer customer = new Customer("Bob", new HtmlPrinter());

        customer.addLease(new Lease(new LeaseItem("Call Of Duty", configRegular), 2));
        customer.addLease(new Lease(new LeaseItem("Golden Eye", configRegular), 3));
        customer.addLease(new Lease(new LeaseItem("Short New", configNewlyReleased), 1));
        customer.addLease(new Lease(new LeaseItem("Long New", configNewlyReleased), 2));
        customer.addLease(new Lease(new LeaseItem("Super Mario", configChildren), 3));
        customer.addLease(new Lease(new LeaseItem("Threes", configChildren), 4));

        String expected = "" +
                "<h1>Games leased by <em>Bob</em></h1>" +
                "<table>" +
                "<tr><td>Call Of Duty</td><td>2.0</td></tr>" +
                "<tr><td>Golden Eye</td><td>3.5</td></tr>" +
                "<tr><td>Short New</td><td>3.0</td></tr>" +
                "<tr><td>Long New</td><td>6.0</td></tr>" +
                "<tr><td>Super Mario</td><td>1.5</td></tr>" +
                "<tr><td>Threes</td><td>3.0</td></tr>" +
                "</table>" +
                "<p>Amount is <em>19.0</em></p>" +
                "<p>You earned <em>7</em> loyalty points</p>";

        assertEquals(expected, customer.statement());
    }
}
