package sorular;

import java.util.Scanner;

public class sorular_stringManipulation {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini alin ,hangisinin uzun oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen isminizi yaziniz");
        String isim= scan.nextLine();
        Scanner scann=new Scanner(System.in);
        System.out.print("Lutfen soyisminizi yaziniz");
        String soyIsim=scann.nextLine();
        int isimUzunluk=isim.length();
        int soyIsimUzunluk=soyIsim.length();
        String sonuc= (isimUzunluk>soyIsimUzunluk)?(soyIsimUzunluk>isimUzunluk)?("isminiz uzundur soyisminizdir"):
                ("soyisminiz uzundur isminizden"):("isminiz ve soyisminizin uzunlugu esittir");
        System.out.println("sonuc = " + sonuc);




    }
}
