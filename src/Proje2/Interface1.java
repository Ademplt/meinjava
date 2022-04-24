package Proje2;

public interface Interface1 {
    // bir interface icinde ki variable'lar mutlaka public ,static ve final olmalidir.
    public static final int SAYI1=45;
    static final int SAYI2=10;
    final int SAYI3=5;
    int SAYI4=0;

    // BU VARIABLE'LERIN HEPSI AYNI OZELLIKLERE SAHIPTIR
    //Static olduklari icin proje icinden rahatlikla ulasilabilirler
    //Final oldugu icin mutlaka deger atanmalidir.Sonradan degistirilemezler(constant)

    // NOT-> -> PRIVATE veya PROTECTED variable'ler compile time error verir.

    void inter1a();
    public  void inter1b();
    void inter1c();
    void inter1f();
    static void armstrongMethod(){

}
    // java 8 den itibaren interfacelerde body li methodlar olusturulmasina izin verilmistir.
    // ve child'lar bu methodlari implemet etmek zorunda degildir.tamamen opsiyoneldir
    // Neden, neden ,neden veeee nasil olusturabilir, hangi key'ler ile

}
