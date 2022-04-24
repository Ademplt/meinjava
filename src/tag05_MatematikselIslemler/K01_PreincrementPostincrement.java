package tag05_MatematikselIslemler;

public class K01_PreincrementPostincrement {
    public static void main(String[] args) {


        int sayi= 10;
        // sayiyi 1 artit
        sayi++; // 11
        System.out.println(sayi);
        sayi++; // 12
        System.out.println(sayi);

        System.out.println(++sayi); // 13


        System.out.println("post-increment satirin : "+sayi++); // 13 once yazdir sonra artir

    }
}
