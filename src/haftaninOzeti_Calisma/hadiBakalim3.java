package haftaninOzeti_Calisma;

import java.util.Scanner;

public class hadiBakalim3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz : ");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyisminizi yaziniz : ");
        String soyisim= scan.nextLine();
        System.out.println("isim - Soyisim : "+isim+ " " +soyisim);

        Scanner scan1=new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz : ");
        char ilkHarf=scan1.next().charAt(0);
        System.out.println("Girdiginiz ismin ilk harfi :" + ilkHarf);

        int sayi1=73;
        int sayi2=5;
        System.out.println(sayi1/sayi2);





    }
}
