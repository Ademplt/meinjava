package replit4;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*
        Write a Java program to get a String from user as input and find
        the maximum occurring character in that string. (Ignore case sensitivity)

        input :Learning java is easy

       output:maximum occurring character is : a

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle yaziniz");
        String str = scanner.nextLine();
        int sayi = 0;
        int encokkactane = 0;
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            sayi = 0;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    sayi++;
                }

            }
            if (sayi > encokkactane) {
                encokkactane = sayi;
                index = i;
            }
        }
        System.out.println("cumlede encok tekrar eden harf : "+str.charAt(index));
        System.out.println("harfin tekrar sayisi : "+encokkactane);
    }
}
