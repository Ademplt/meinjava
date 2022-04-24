package tag12_stringManipulation;

import java.util.Scanner;

public class K05_indexOf {
    public static void main(String[] args) {
        String str="Java ogrenmek guzel hem de ne guzel";
        System.out.println(str.indexOf("o"));
        System.out.println(str.length()); //35
        System.out.println(str.length()-1); //34
        System.out.println(str.indexOf("uzel")); //15
        System.out.println(str.indexOf("e")); //8
        System.out.println(str.indexOf("e",8));
        int ilkindex=str.indexOf("a"); //1
        System.out.println(str.indexOf("a",ilkindex+1));
        System.out.println(str.indexOf("c"));

        // kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdirin
        // iceriyorsa mailiniz kabul edildi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String mail=scan.next();
        if (mail.indexOf("@")==(-1)){
            System.out.println("mailiniz gecersiz");
        }else{
            System.out.println("mailiniz kabul edildi");
        }






    }
}
