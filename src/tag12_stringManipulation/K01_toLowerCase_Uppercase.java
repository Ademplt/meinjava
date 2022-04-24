package tag12_stringManipulation;

import java.util.Locale;

public class K01_toLowerCase_Uppercase {
    public static void main(String[] args) {

        String str="javayi basaracagim";
        System.out.println(str.toUpperCase().charAt(17));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));


    }
}
