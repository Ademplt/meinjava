package replit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q05_DeleteFromArray {
    public static void main(String[] args) {
        /*
        Write a program that deletes the letters 'a' from the names in the list given as input.

       INPUT :  list1={"Ali","Veli","Ayse","Fatma","Omer"}

       OUTPUT :   [Veli,Omer]

         */
        String arr []={"Ali","Veli","Ayse","Fatma","Omer"};
        System.out.println(Arrays.toString(arr));
        List<String> list2 = new ArrayList<String>(Arrays.asList(arr));

        list2.removeIf(each -> each.contains("a") || each.contains("A"));
        System.out.println(list2);
    }
}
