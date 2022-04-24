package Proje2;


public class Isci extends Muhasebe{


    @Override
    public String toString() {
        return "Isci{" +
                "saatUcreti=" + saatUcreti +
                ", aylikCalismaSuresi=" + aylikCalismaSuresi +
                ", maas=" + maas +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", telefon='" + telefon + '\'' +
                ", iseBaslamaTarihi='" + iseBaslamaTarihi + '\'' +
                ", sigortaNo='" + sigortaNo + '\'' +
                ", personelNo='" + personelNo + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Isci isci1 = new Isci();
        isci1.saatUcreti=isci1.saatUcreti();
        isci1.aylikCalismaSuresi= isci1.aylikCalismaSuresi();
        isci1.maas=isci1.maas(isci1.saatUcreti, isci1.aylikCalismaSuresi);
        isci1.isim="hasan";
        isci1.soyisim="can";
        //iscimizin bilgilerini gorebilmek icin tostring metodu olusturulabilir
        System.out.println(isci1.toString());
    }

    @Override
    protected int saatUcreti() {
        return 10;
    }

    @Override
    protected int aylikCalismaSuresi() {
        return 200;
    }
}

