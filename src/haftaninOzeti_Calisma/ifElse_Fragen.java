package haftaninOzeti_Calisma;

import java.io.StringReader;
import java.util.Scanner;

public class ifElse_Fragen {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen merak ettiginiz gunu yaziniz ");
        String gunIsmi= scan.nextLine().toLowerCase();
        if (gunIsmi.equals("cuma")){
            System.out.println("MUSLUMANLAR ICIN KUTSAL GUN ");
        } else  if (gunIsmi.equals("pazar")){
            System.out.println("hrstiyanlar icin kutsal gun");

        } else if (gunIsmi.equals("cumartesi")){
            System.out.println("yahudiler icin kutsal gun");
        } else {
            System.out.println("girilen gun kutsal bir gun degil");
        }



    }
}
