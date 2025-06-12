package itemlease.printer;

import static org.junit.Assert.assertEquals;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class HtmlPrinterTest {
    
    @Test
    public void print() {
        HtmlPrinter printer = new HtmlPrinter();
        
        List<SimpleImmutableEntry<String, Double>> listOfGameWithAmount = new ArrayList<SimpleImmutableEntry<String, Double>>();
        listOfGameWithAmount.add(new SimpleImmutableEntry<>("Call Of Duty", 2.));
        listOfGameWithAmount.add(new SimpleImmutableEntry<>("Golden Eye", 3.5));
        listOfGameWithAmount.add(new SimpleImmutableEntry<>("Short New", 3.));
        listOfGameWithAmount.add(new SimpleImmutableEntry<>("Long New", 6.));
        listOfGameWithAmount.add(new SimpleImmutableEntry<>("Super Mario", 1.5));
        listOfGameWithAmount.add(new SimpleImmutableEntry<>("Threes", 3.));

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

        assertEquals(expected, printer.print("Bob", 19.0, 7, listOfGameWithAmount));
    }
}
