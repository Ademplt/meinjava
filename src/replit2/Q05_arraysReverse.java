package replit2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q05_arraysReverse {
    /*
    Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

    Input : Coding is greate.

    Output : .etaerg si gnidoC
     */
    public static void main(String[] args) {
        String str = "Coding is greate.";
        System.out.println(str);

        String arr[] = str.split("");
        String reverse="";
        for (int i=arr.length-1; i>=0; i--) {
       reverse +=arr[i];
    }

        System.out.println(reverse);
}
}


