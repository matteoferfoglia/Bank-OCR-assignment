package dssc.assignment.bank;

public class Cell {

    private static final String ZERO_CELL =
                    " _ " +
                    "| |" +
                    "|_|";
    private final String cellAsText;

    public Cell(String cellAsText) {
        this.cellAsText = cellAsText;
    }

    @Override
    public String toString() {
        //return ZERO_CELL.equals(cellAsText) ? "0": "1";
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
}

class Digit {

    private static final String ZERO_CELL =
            " _ " +
            "| |" +
            "|_|";
    private static final String ONE_CELL =
            "  |" +
            "  |" +
            "  |";
    private static final String TWO_CELL =
            " _ " +
            " _|" +
            "|_ ";
    private static final String THREE_CELL =
            " _ " +
            " _|" +
            " _|";
    private static final String FOUR_CELL =
            "   " +
            "|_|" +
            "  |";
    private static final String FIVE_CELL =
            " _ " +
            "|_ " +
            " _|";
    private static final String SIX_CELL =
            " _ " +
            "|_ " +
            "|_|";
    private static final String SEVEN_CELL =
            " _ " +
            "  |" +
            "  |";
    private static final String EIGHT_CELL =
            " _ " +
            "|_|" +
            "|_|";
    private static final String NINE_CELL =
            " _ " +
            "|_|" +
            " _|";
}