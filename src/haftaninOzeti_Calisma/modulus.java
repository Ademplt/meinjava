package haftaninOzeti_Calisma;

import java.util.Scanner;

public class modulus {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz : ");

        int sayi=scan.nextInt();
        int rakam=0;
        int rakamlartoplami=0;

        rakam=sayi%10;
        rakamlartoplami+=rakam;

        sayi=sayi/10;
        rakam=sayi%10;
        rakamlartoplami+=rakam;

        sayi=sayi/10;
        rakam=sayi%10;
        rakamlartoplami+=rakam;
        sayi=sayi/10;
        System.out.println("Girdiginiz sayinin rakamlar toplami : "+rakamlartoplami);




    }



}
