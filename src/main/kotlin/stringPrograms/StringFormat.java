package stringPrograms;

        /* Available signatures */
//String.format(String str, Object... args)
//String.format(Locale l, String format, Object... args)

import java.util.Locale;

public class StringFormat {

    public static void main(String[] args) {
        String language = "Java";

        System.out.println(String.format("Language: %s", language));
        // ------------------------------------------------------------------------

        int n1 = 47;
        float n2 = 35.864f;
        double n3 = 44534345.76d;

        //%o used for integers only
        System.out.println(String.format(n1+" in octal: %o", n1));
        //%x, %X used for integers only
        System.out.println(String.format(n1+" in hexadecimal: %x", n1));
        System.out.println(String.format(n1+" in hexadecimal: %X", n1));
        //%e, %E used for floating-point numbers only
        System.out.println(String.format(n2+" in scientific notation: %e", n2));
        System.out.println(String.format(n3+" in scientific notation: %g", n3));
        // ------------------------------------------------------------------------

        int number = 50;
        String text = "Result";
        /* %s -> value of text, %x -> hexadecimal value of number */
        System.out.println(String.format("%s\nhexadecimal: %x", text, number));
        // ------------------------------------------------------------------------

        float n4 = -452.534f;
        double n5 = -345.766d;

        //Java doesn't return the exact representation of floating-point numbers
        System.out.println(String.format(n4+" = %f", n4));
        System.out.println(String.format(n5+" = %f", n5));
        System.out.println(String.format(n4+" = %.5f", n4));
        System.out.println(String.format(n5+" = %.5f", n5));
        // ------------------------------------------------------------------------

        System.out.println(String.format("|%5d|", n1));
        System.out.println(String.format("|%05d|", n1));
        // -----------------------------------------------------------------------

        System.out.println(String.format("%#o", n1));
        System.out.println(String.format("%#x", n1));
        // -----------------------------------------------------------------------

        int num = 8652145;
        System.out.println(String.format("Number: %,d", num));
        System.out.println(String.format(Locale.GERMAN, "Number in German: %,d", num));
        // -----------------------------------------------------------------------
    }
}
