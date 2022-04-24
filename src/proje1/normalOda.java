package proje1;

public class normalOda extends hotel{
    public normalOda() {
        super("NormalOda",9);
    }

    @Override
    protected boolean temizlikYapildiMi() {
        return false;
    }

    @Override
    public void ucretHesapla() {

    }
}
