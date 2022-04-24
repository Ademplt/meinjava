package tag12_stringManipulation;

public class K06_indexOff {
    public static void main(String[] args) {
// Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //      - Girilen kelime cumlede kullanilmamis.
        //      - Girilen kelime cumlede 1 kere kullanilmis.
        //      - Girilen kelime cumlede 1’den fazla kullanilmis.
     String cumle="java cok onemli ogrenmeye devam";
     String kelime="cok";
     int ilkIndex=cumle.indexOf(kelime);
     int ikinciIndex=cumle.indexOf(kelime,ilkIndex+1);
     if (ilkIndex==(-1)){
         System.out.println("Girilen kelime cumlede kullanilmamis.");
     }else if (ikinciIndex==(-1)){
         System.out.println(" Girilen kelime cumlede 1 kere kullanilmis");
     }else {
         System.out.println(" Girilen kelime cumlede 1’den fazla kullanilmis");
     }
    }
}
