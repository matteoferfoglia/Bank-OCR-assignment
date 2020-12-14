package dssc.assignment.bank;

public class Cell {

    private final String cellAsText;
    private char cellAsChar;

    public Cell(String cellAsText) {
        this.cellAsText = cellAsText;
    }

    @Override
    public String toString() {
        String s;
        switch (cellAsText){
            case ZERO_CELL:
                s = "0";
                break;
            default:
                s = "1";
                break;
        }
        return s;
    }



    public static final String ZERO_CELL =
            " _ " +
            "| |" +
            "|_|";
    public static final String ONE_CELL =
            "   " +
            "  |" +
            "  |";
    public static final String TWO_CELL =
            " _ " +
            " _|" +
            "|_ ";
    public static final String THREE_CELL =
            " _ " +
            " _|" +
            " _|";
    public static final String FOUR_CELL =
            "   " +
            "|_|" +
            "  |";
    public static final String FIVE_CELL =
            " _ " +
            "|_ " +
            " _|";
    public static final String SIX_CELL =
            " _ " +
            "|_ " +
            "|_|";
    public static final String SEVEN_CELL =
            " _ " +
            "  |" +
            "  |";
    public static final String EIGHT_CELL =
            " _ " +
            "|_|" +
            "|_|";
    public static final String NINE_CELL =
            " _ " +
            "|_|" +
            " _|";
}