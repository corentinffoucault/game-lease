package itemlease.printer;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.List;
import java.util.Locale;

public abstract class APrinter {
    
    public APrinter() {

    }

    public String print(String name, Double totalAmount, int nbLoyaltyPoints, List<SimpleImmutableEntry<String, Double>> listOfGameWithAmount) {
        String gameText = "";

        for (SimpleImmutableEntry<String, Double> gameWithAmount : listOfGameWithAmount) {
            gameText += String.format(Locale.ENGLISH, GetGameFormatLine(), gameWithAmount.getKey(), gameWithAmount.getValue());
        }
        String result = String.format(Locale.ENGLISH, GetFullText(), name, gameText, totalAmount, nbLoyaltyPoints);

        return result;
    }

    protected  abstract String GetGameFormatLine();
    protected  abstract String GetFullText();
}
