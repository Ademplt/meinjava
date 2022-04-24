package proje1;

public abstract class hotel {
  public  final  String Hotelname ;

private int kaldigiGun;

    public int getKaldigiGun() {
        return kaldigiGun;
    }

    public void setKaldigiGun(int kaldigiGun) {
        this.kaldigiGun = kaldigiGun;
    }

    public hotel(String Hotelname,int kaldigiGun) {
        this.Hotelname = Hotelname;
        setKaldigiGun(kaldigiGun);
    }

    protected abstract boolean temizlikYapildiMi();

    public abstract void ucretHesapla();


}
