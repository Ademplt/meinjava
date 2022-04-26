package replit5;

import java.util.Scanner;

public class Q05_MaksimumCharacter {
    /*
    Write a Java program to get a String from user as input and find
    the maximum occurring character in that string.(Ignore case sensitivity).

    Input :Learning java is easy

    Output: maximum occurring character is : a
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String Input=scanner.nextLine();
       String[] arr =Input.split("");
       String character="";
        int count=0;
        int max = 0;
        for (String s : arr) {
            count = 0;
            for (String value : arr) {
                if (s.equalsIgnoreCase(value)) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                character = s;
            }

        }

        System.out.println(max +" "+character);
    }

}
