package itemlease.printer;

public class BasicPrinter extends APrinter {
    protected static String GameFormatLine = "\t%s\t%2$.1f\n";
    protected static String FullText = "Games leased by %s\n%sAmount is %3$.1f\nYou earned %4$d loyalty points";
    
    public BasicPrinter() {
        super();
    }
    protected String GetGameFormatLine() {
        return GameFormatLine;
    }
    protected String GetFullText() {
        return FullText;
    }

}
