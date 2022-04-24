package day32_calisma;

import java.util.Scanner;

public class C02_Soru2 {
    public static void main(String[] args) {

        /* TASK :
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen birtamsayi giriniz");
        int girilenSayi = scan.nextInt();
        while(girilenSayi>0 ){
            if (girilenSayi%2!=0){
                System.out.print(girilenSayi+ " ");
            }
            girilenSayi--;

        }

    }
}

