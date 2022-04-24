package tag4_scanner;

public class tag04_SorularCevaplar {
    public static void main(String[] args) {

        //  Soru 1 ) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
// birer degisken olusturup adim adim widening yapin ve yazdirin

        byte sayi1=12;
        System.out.println(sayi1);
        short sayi2=sayi1;
        System.out.println(sayi2);

        int sayi3=sayi2;
        System.out.println(sayi3);

        float sayi4=sayi3;
        System.out.println(sayi4);
        double sayi5=sayi4;


        System.out.println(sayi5);

        // Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin

        double kesir =11324.2345;
        System.out.println(kesir);
        int tamsayi=(int)kesir;
        System.out.println(tamsayi);
        short kisa=(short) tamsayi;
        System.out.println(kisa);

        byte enKisa=(byte) kisa;
        System.out.println(enKisa);


        float flt=2.2345f;
        System.out.println(flt);
        short age=(short) flt;
        System.out.println(age);


        //4

        double cevirme=255.36;
        System.out.println(cevirme);
        int tam=(int) cevirme;
        System.out.println(tam);

        byte byt=(byte) tam;

        System.out.println(byt);




    }
}
