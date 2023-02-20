package day32_calisma;

import java.util.Scanner;

public class C01_kombinasyonFrage {
    public static void main(String[] args) {
        /* TASK :
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)
        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365
        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10
      */

        Scanner input = new Scanner(System.in);

        System.out.print("n sayısını giriniz: ");
        int n = input.nextInt();

        System.out.print("r sayısını giriniz: ");
        int r = input.nextInt();

        int kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n-r));

        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
        System.out.println(faktoriyel(5));
    }

    public static int faktoriyel(int sayi) {

        int faktoriyel = 1;

        for(int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }

        return faktoriyel;
    }
}
