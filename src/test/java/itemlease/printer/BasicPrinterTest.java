package itemlease.printer;

import static org.junit.Assert.assertEquals;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BasicPrinterTest {
        @Test
    public void testBasicText() {
        BasicPrinter printer = new BasicPrinter();
        
        List<SimpleImmutableEntry<String, Double>> listOfGameWithAmount = new ArrayList<SimpleImmutableEntry<String, Double>>();
        listOfGameWithAmount.add(new SimpleImmutableEntry<>("Call Of Duty", 2.));
        listOfGameWithAmount.add(new SimpleImmutableEntry<>("Golden Eye", 3.5));
        listOfGameWithAmount.add(new SimpleImmutableEntry<>("Short New", 3.));
        listOfGameWithAmount.add(new SimpleImmutableEntry<>("Long New", 6.));
        listOfGameWithAmount.add(new SimpleImmutableEntry<>("Super Mario", 1.5));
        listOfGameWithAmount.add(new SimpleImmutableEntry<>("Threes", 3.));

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

        assertEquals(expected, printer.print("Bob", 19.0, 7, listOfGameWithAmount));
    }
}
