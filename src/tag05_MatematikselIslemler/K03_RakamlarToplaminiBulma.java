package tag05_MatematikselIslemler;

import java.util.Scanner;

public class K03_RakamlarToplaminiBulma {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen rakamlar toplamini giriniz :");
        int sayi=scan.nextInt();


        int rakam=0;
        int rakamlarToplami=0;


        rakam=sayi%10; //2
        rakamlarToplami+=rakam;
        sayi/=10; //753

        //ayni islemi sayi 0 olana kadar yapariz



    }
}
