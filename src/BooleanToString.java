
/*
Implement a function which convert the given boolean value into its string representation.
Note: Only valid inputs will be given.
 */

public class BooleanToString {
    public static String convert(boolean b) {
        //prende il valore booleano e gli applica il metodo toString() per renderlo una stringa
        String bToString = Boolean.toString(b);
        //poi ritorna direttamente la stringa bToString
        return bToString;
    }
}
