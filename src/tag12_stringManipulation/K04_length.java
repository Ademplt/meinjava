package tag12_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class K04_length {
    public static void main(String[] args) {
        // Kullanicidan ismini alip basharfini ve son harfini Buyuk harflerle yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz");
        String isim=scan.nextLine();
        System.out.println("ilk harf :" + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0) );
        System.out.println("son harf :" + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

    }
}
