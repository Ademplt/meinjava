package day32_calisma;

import java.util.Scanner;

public class C03_soru3 {
    public static void main(String[] args) {
        /* TASK :
       Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        ve x girildiğinde ise "Program bitti" yazan programı yazınız.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        String girilen=scan.next();
        while (!girilen.equals("x")){
            System.out.println("Program calisiyor.");
            System.out.println("tekrar giris yapiniz");
            girilen=scan.next();
            if (girilen.equals("x")){
                System.out.println("Program bitti ");
            }
        }
    }
}
