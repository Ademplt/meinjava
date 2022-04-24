package tag12_stringManipulation;

import java.util.Scanner;

public class K03_equalsIgnoreCase {
    public static void main(String[] args) {
        // kullaniciya derse katili katilmak istemedigini sorun
        // evet derse, cevabini ve  "derse katiliminiz onaylanmistir" yazdirin
        // hayir derse cevabini ve "Sonraki derslerimize bekleriz" yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Derse katilmak ister misiniz ? \n Evet veya Hayir yazin");
        String cevap=scan.next();
        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("derse katiliminiz onaylanmistir");
        }else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("Sonraki derslerimize bekleriz" );
        }else{
            System.out.println("Lutfen Evet ya da Hayir yaziniz");
        }
    }
}
