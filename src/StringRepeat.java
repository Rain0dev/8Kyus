/*
* Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.
Examples (input -> output)

6, "I"     -> "IIIIII"
5, "Hello" -> "HelloHelloHelloHelloHello"

*/

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        //StringBuilder è usato per concatenare le string * n volte.
        StringBuilder result = new StringBuilder();
        //il for loop serve per iterare n volte e appende la stringa a stringbuilder.
        for (int i = 0; i < repeat; i++) {
            result.append(string);
        }
        //alla fine è tutto convertito in stringa.
        return result.toString();
    }
}
