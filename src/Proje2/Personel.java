package Proje2;

public abstract class Personel {
   final String sirketIsmi ;////sirket isimi ve adresi herkes icin ayni ve degistirilmeyecek
    static final String sirketAdresi = "leipzig/DEUTSCHLAND"; // bu yuzden static final
    //Static oldugu icin heryerden ulasilacak ,final oldugu icin degistirilmeyecek

    protected String isim = "Deger Girilmemis";
    protected String soyisim = "Deger Girilmemis";
    protected String tcNo = "Deger Girilmemis";
    protected String telefon = "Deger Girilmemis";
    protected String iseBaslamaTarihi = "Deger Girilmemis";
    protected String sigortaNo = "Deger Girilmemis";
    // bu bilgiler personel ile ilgili bilgiler, yani objelerle ilgili bilgiler.Bu yuzden protected ve inctance.
    // deger girilmemis yapildi ,cunku alt klaslarda bunlarla ilgili bir islem yapildiginda null degilde
    // deger girilmemis yazilsin

    static int personelSayac=100;

    protected String personelNo;

    protected Personel(String sirketIsmi) {
        this.sirketIsmi = sirketIsmi;
    }

    //personel no diye bir metod olusturduk.Her seferinde call yapildiginda sayac kaldigi yerden bir artirilacak
    // ve string olarak dondurulecek.
    protected String personelNo(){
        personelSayac++;
        String no=personelSayac+"";
        return no;
    }
//burada hic abstarct method olusturulmadi cunku yukardaki variable lar klaslar ile ilgili degil objelerle ilgili
}
