package dssc.assignment.bank;

import java.util.stream.Stream;

public class Cell {

    private final Digit cellContent;

    public Cell(String cellAsText) {
        this.cellContent = Digit.convertCellAsTextToDigit(cellAsText);
    }

    public Cell(char cellAsChar){
        this.cellContent = Digit.convertCellAsCharToDigit(cellAsChar);
    }

    @Override
    public String toString() {
        return String.valueOf(cellContent.getCellAsChar());
    }
}

enum Digit {

    ZERO(Digit.ZERO_CELL, '0'),
    ONE(Digit.ONE_CELL, '1'),
    TWO(Digit.TWO_CELL,'2'),
    THREE(Digit.THREE_CELL, '3'),
    FOUR(Digit.FOUR_CELL, '4'),
    FIVE(Digit.FIVE_CELL, '5'),
    SIX(Digit.SIX_CELL, '6'),
    SEVEN(Digit.SEVEN_CELL, '7'),
    EIGHT(Digit.EIGHT_CELL, '8'),
    NINE(Digit.NINE_CELL, '9');

    private final String cellAsString;
    private final char cellAsChar;

    Digit(String cellAsString, char cellAsChar) {
        this.cellAsChar = cellAsChar;
        this.cellAsString = cellAsString;
    }

    public static Digit convertCellAsTextToDigit(String cellAsString) {

        return Stream.of(Digit.values())
                .filter( x -> x.cellAsString.equals(cellAsString ))
                .findAny()
                .orElseThrow();

    }

    public static Digit convertCellAsCharToDigit(char cellAsChar) {

        return Stream.of(Digit.values())
                .filter( x -> x.cellAsChar==cellAsChar )
                .findAny()
                .orElseThrow();

    }

    public char getCellAsChar() {
        return cellAsChar;
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