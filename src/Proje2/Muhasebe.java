package Proje2;

public abstract class Muhasebe extends Personel{
   protected int saatUcreti;
   protected int aylikCalismaSuresi;
   protected int maas;

    public Muhasebe() {
        super("yildiz");
    }

    // Her bir personelin ortak degiskenleri
    //Ama bunlarin herbir klas tarafindan override edilmesi gerekiyor cunku memurun saat ucreti farkli iscinin farkli
    // bu yuzden metod olusturularak override edilmesi saglanacak,Child klaslarda bu metodlarla ilgili istenen
    // degisiklikler yapilabilir
    protected abstract int saatUcreti();
    protected abstract int aylikCalismaSuresi();
    // abstract oldugu icin boddye ihtiyac yok cunku override edilecekler

    protected int maas(int saatUcreti,int aylikCalismaSuresi){
        int maas = saatUcreti*aylikCalismaSuresi;
        return maas;
    }
    // bu metod abstract degil cunku child klaslarda ki saat ucreti ve aylik calisma suresi girildiginde
    // degisecektir.Her bir klasda ayri metod olusturmaya gerek yok
}
