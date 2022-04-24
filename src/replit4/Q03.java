package replit4;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /*
        Get a sentence from the user. Accept the sentence received from the user as a parameter,
        Invert sentence using Array and write a Method that returns the result as a String to the main method.

        Note: Upper and lower case letters, spaces and special characters will not be changed.

       Input :It is very nice to write code.
       Output :.edoc etirw ot ecin yrev si tI

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen  bir cumle giriniz.");
        String str = scanner.nextLine();
        System.out.println(str);
      terstenCumle(str);
        System.out.println(terstenCumle(str));


    }

    public static String terstenCumle(String str) {
        String arr[] = str.split("");
        String reverses = "";


        for (int i = arr.length - 1; i >= 0; i--) {

            reverses += arr[i];
        }
        return reverses;
    }
}
