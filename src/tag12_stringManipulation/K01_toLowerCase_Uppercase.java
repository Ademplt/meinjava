package tag12_stringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class K01_toLowerCase_Uppercase {
    public static void main(String[] args) {

        String str = "javayi basaracagim";
        System.out.println(str.toUpperCase().charAt(17));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
        String str1 = "aabbccdd";
      List<String> list =new ArrayList<String>(Arrays.asList(str1.split("")));
        System.out.println(list);
        list.stream().distinct().forEach(System.out::print);
    }
}
