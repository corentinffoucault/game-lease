package itemlease;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import itemlease.item.LeaseChildren;
import itemlease.item.LeaseNewlyReleased;
import itemlease.item.LeaseRegular;

public class CustomerTest {

    @Test
    public void test() {
        Customer customer = new Customer("Bob");
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
}
