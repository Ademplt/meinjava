package replit3;

import java.util.Arrays;

public class Q1_Array {
    /*
     Create a custom return type method accepts a name as parameter and prints the name as a char array.

     (do not use toCharArray() method)

     Input : John

    Output :[J, o, h, n
     */
    public static void main(String[] args) {
        String str=" John";
        karakterAyir(str);

    }

    private static String karakterAyir(String str) {
        String arr[]=str.trim().split("");
        System.out.println(Arrays.toString(arr));
        return Arrays.toString(arr);

    }
}
