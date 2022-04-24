package tag03_scanner;

import java.util.Scanner;

public class Soru2_scanner {
    public static void main(String[] args) {
        // Soru 2) Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini
        // ve alanini  hesaplayip yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen karenin bit kenae uzunlugunu giriniz : ");
        double kareninKenari=scan.nextDouble();
        System.out.println("karenin cevresi: "+(4*kareninKenari));

        System.out.println("karenin alani : "+(kareninKenari*kareninKenari));


    }
}
