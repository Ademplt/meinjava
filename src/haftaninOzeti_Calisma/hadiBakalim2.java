package haftaninOzeti_Calisma;

import java.util.Scanner;

public class hadiBakalim2 {
    public static void main(String[] args) {


        int sayi1=10;
        int sayi2=20;

        System.out.println("Swaptan once Sayi1 : " +sayi1 +", Sayi2 : " +sayi2);
        int temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;

        System.out.println("Swaptan sonra Sayi1 : " +sayi1 + ", Sayi2 : "+sayi2);

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz :");
        String kullaniciIsmi= scan.nextLine();
        System.out.println("Kullanici ismi: " + kullaniciIsmi);

        Scanner scan1=new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz : ");
        double yaricap=scan1.nextDouble();
        System.out.println("Girdiginiz Yaricap : "+ yaricap);
        System.out.println("Cemberin cevresi : "+ 2*3.14*yaricap);
        System.out.println("Dairenin Alani : "+ 3.14*yaricap*yaricap);



    }
}
