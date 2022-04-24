package tag7_ifStatements;

import java.util.Scanner;

public class sorular {
    public static void main(String[] args) {

        //kullanıcıdan maas ıcın bir teklif isteyin
        //teklif 80000 ustundeyse "kabul ediyorum"
        //60000-80000 arasında ise "konusabılırız"
        //60000 altıysa" maalesef kabul edemem"

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir maas teklifi sununuz ");
        int Teklif= scan.nextInt();

        if (Teklif>80000){
            System.out.println("Kabul ediyorum ");
        }else if (Teklif>60000){
            System.out.println("Konusalim");
        } else System.out.println("Kabul edemem");


    }


}
