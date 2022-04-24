package tag12_stringManipulation;

import java.util.Scanner;

public class K11_replaceAll {
    public static void main(String[] args) {
        // kullanicidan isim- soyisim bilgisini alip
        // butun harfleri * yapalim
        Scanner scan=new Scanner(System.in);
        System.out.println("LUTFEN ISIM-SOYISIM GIRINIZ");
        String isimSoyisim= scan.nextLine();
        System.out.println(isimSoyisim.replaceAll("\\S","*"));
        

    }
}
