package itemlease.printer;

public class HtmlPrinter extends APrinter {
    protected static String GameFormatLine = "<tr><td>%s</td><td>%2$.1f</td></tr>";
    protected static String FullText = "<h1>Games leased by <em>%s</em></h1><table>%s</table><p>Amount is <em>%3$.1f</em></p><p>You earned <em>%4$d</em> loyalty points</p>";
    
    public HtmlPrinter() {
        super();
    }
    protected String GetGameFormatLine() {
        return GameFormatLine;
    }
    protected String GetFullText() {
        return FullText;
    }

}
