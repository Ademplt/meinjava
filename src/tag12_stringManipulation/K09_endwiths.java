package tag12_stringManipulation;

public class K09_endwiths {
    public static void main(String[] args) {
        // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin
        // mehmet@gmail.com.tr
        String mail="polatadem.2541@gmail.com";
        String metin="hotmail.com";
        if (!mail.contains(metin)){
            System.out.println("lutfen gmail adresi giriniz");
        }else if (mail.endsWith(metin)){
            System.out.println("Email adresiniz kaydedildi");
        }else{
            System.out.println("lutfen yazimi kontol edin");
        }
    }
}
