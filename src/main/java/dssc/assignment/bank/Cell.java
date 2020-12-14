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

}