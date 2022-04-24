package tag4_scanner;

import java.util.Scanner;

public class k01_scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz : ");
        char ilkHarf=scan.next().charAt(0);
        // charart indeks metodu
        // e r s i n   e=0 r=1 s=3

        System.out.println("Girdiginiz ismin ilk harfi :"+ ilkHarf);

    }
}
