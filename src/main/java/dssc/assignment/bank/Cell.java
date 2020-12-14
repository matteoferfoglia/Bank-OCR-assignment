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
            case ONE_CELL:
                s = "1";
                break;
            case TWO_CELL:
                s = "2";
                break;
            case THREE_CELL:
                s = "3";
                break;
            case FOUR_CELL:
                s = "4";
                break;
            case FIVE_CELL:
                s = "5";
                break;
            case SIX_CELL:
                s = "6";
                break;
            case SEVEN_CELL:
                s = "7";
                break;
            case EIGHT_CELL:
                s = "8";
                break;
            case NINE_CELL:
                s = "9";
                break;
            default:
                s = "";
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