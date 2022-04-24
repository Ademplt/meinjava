package proje1;

public class suitOda extends hotel implements SuitServis {

int ucret=40;

    public suitOda() {
        super("suit", 5);
    }



    @Override
    protected boolean temizlikYapildiMi() {
        return false;
    }

    @Override
    public void ucretHesapla() {
        System.out.println(getKaldigiGun()*ucret);

    }

    public static void main(String[] args) {
      suitOda obj = new suitOda();
      obj.ucretHesapla();
        System.out.println(obj.temizlikYapildiMi());
    }
}
