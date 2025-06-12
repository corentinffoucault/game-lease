package itemlease;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import itemlease.item.LeaseChildren;
import itemlease.item.LeaseNewlyReleased;
import itemlease.item.LeaseRegular;
import itemlease.printer.BasicPrinter;
import itemlease.printer.HtmlPrinter;

public class CustomerTest {

    @Test
    public void testBasicText() {
        Customer customer = new Customer("Bob", new BasicPrinter());
        customer.addLease(new Lease(new LeaseRegular("Call Of Duty"), 2));
        customer.addLease(new Lease(new LeaseRegular("Golden Eye"), 3));
        customer.addLease(new Lease(new LeaseNewlyReleased("Short New"), 1));
        customer.addLease(new Lease(new LeaseNewlyReleased("Long New"), 2));
        customer.addLease(new Lease(new LeaseChildren("Super Mario"), 3));
        customer.addLease(new Lease(new LeaseChildren("Threes"), 4));

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
        Customer customer = new Customer("Bob", new HtmlPrinter());
        customer.addLease(new Lease(new LeaseRegular("Call Of Duty"), 2));
        customer.addLease(new Lease(new LeaseRegular("Golden Eye"), 3));
        customer.addLease(new Lease(new LeaseNewlyReleased("Short New"), 1));
        customer.addLease(new Lease(new LeaseNewlyReleased("Long New"), 2));
        customer.addLease(new Lease(new LeaseChildren("Super Mario"), 3));
        customer.addLease(new Lease(new LeaseChildren("Threes"), 4));

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
