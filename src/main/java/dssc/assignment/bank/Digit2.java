package dssc.assignment.bank;

import java.util.Objects;

public class Digit2 {
    static final TwoWayHashMap<Character, String> map = new TwoWayHashMap<>();
    final char digitChar;
    final String digitText;

    Digit2(char digitChar) {
        if (map.isEmpty()) {
            map.put('0', ZERO_CELL);
            map.put('1', ONE_CELL);
            map.put('2', TWO_CELL);
            map.put('3', THREE_CELL);
            map.put('4', FOUR_CELL);
            map.put('5', FIVE_CELL);
            map.put('6', SIX_CELL);
            map.put('7', SEVEN_CELL);
            map.put('8', EIGHT_CELL);
            map.put('9', NINE_CELL);
        }

        this.digitChar = digitChar;
        digitText = convertToText(digitChar);
    }

    public char getChar() {
        return digitChar;
    }

    public String getText() {
        return digitText;
    }

    public String getPrintableText() {
        return convertToPrintableText(digitText);
    }

    public static String convertToText(char digit) {
        return map.get(digit);
    }

    public static char convertToChar(String text) {
        return map.getKey(text);
    }

    public static String convertToPrintableText(String text){
        return text.substring(0, 3) +
                System.lineSeparator() +
                text.substring(3, 6) +
                System.lineSeparator() +
                text.substring(6, 9) +
                System.lineSeparator();
    }

    public static String convertToPrintableText(char digit) {
        return convertToPrintableText(convertToText(digit));
    }

    @Override
    public String toString() {
        return getPrintableText();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Digit2 other = (Digit2) o;
        return digitChar == other.digitChar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(digitChar);
    }

    static final String ZERO_CELL =
            " _ " +
            "| |" +
            "|_|";
    static final String ONE_CELL =
            "   " +
            "  |" +
            "  |";
    static final String TWO_CELL =
            " _ " +
            " _|" +
            "|_ ";
    static final String THREE_CELL =
            " _ " +
            " _|" +
            " _|";
    static final String FOUR_CELL =
            "   " +
            "|_|" +
            "  |";
    static final String FIVE_CELL =
            " _ " +
            "|_ " +
            " _|";
    static final String SIX_CELL =
            " _ " +
            "|_ " +
            "|_|";
    static final String SEVEN_CELL =
            " _ " +
            "  |" +
            "  |";
    static final String EIGHT_CELL =
            " _ " +
            "|_|" +
            "|_|";
    static final String NINE_CELL =
            " _ " +
            "|_|" +
            " _|";
}
