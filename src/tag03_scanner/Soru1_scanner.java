package tag03_scanner;

import java.util.Scanner;

public class Soru1_scanner {
    public static void main(String[] args) {

        // Soru 1) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin

        Scanner scan=new Scanner(System.in);


        System.out.println("Lutfen bir tam sayi giriniz : ");
        int sayi1= scan.nextInt();

        System.out.println("Lutfen 2. tam sayiyi giriniz : ");
        int sayi2= scan.nextInt();

        System.out.println("Tamsayilarin toplami : "+(sayi1+sayi2));
        System.out.println("Tamsayilarin cikarma : "+(sayi1-sayi2));
        System.out.println("Tamsayilarin carpimi : "+(sayi1*sayi2));

    }





}
