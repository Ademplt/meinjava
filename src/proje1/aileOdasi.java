package proje1;

public class aileOdasi extends hotel{
    int kaldigiGun=7;
    public aileOdasi() {
        super("aileodasi",7);
    }

    @Override
    protected boolean temizlikYapildiMi() {
        return false;
    }

    @Override
    public void ucretHesapla() {

    }
}
