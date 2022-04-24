package sorular;

import java.util.Scanner;

public class Ter02 {
    public static void main(String[] args) {
       /* kullanicidan bir character girmesini isteyiniz
        Character harf ise kucuk harf olup olmadigini kontrol ediniz
        Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        Harf degilse ekrana "Harf degil" yazdiriniz

        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().charAt(0);
      String sonuc=  (karakter>='A' && karakter<='Z'||karakter>='a'&&karakter<='z')
                ?((karakter>='A' && karakter<='Z')?("harf buyuktur"):("harf kucuktur")):
              ("bu bir harf degildir");
        System.out.println("sonuc = " + sonuc);
    }
}
