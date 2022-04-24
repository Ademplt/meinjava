package tag23_Arrays;

import java.util.Scanner;

public class C08_ArraysKayitSorusu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen kaydetmek istediginiz ogrencinin ismini giriniz");
        String []isimler;
        isimler=new String[5];
        isimler[0]=scanner.nextLine();
        System.out.println("Lutfen kaydetmek istediginiz ogrencinin soyismini giriniz");
        String[] soyIsimler;
        soyIsimler=new String[5];
        soyIsimler[0]=scanner.nextLine();

        for (int i = 1; i <5 ; i++) {
            System.out.println("lutfen diger ogrencinin ismini giriniz");
            isimler[i]= scanner.nextLine();
            System.out.println("lutfen diger ogrencinin soyismini giriniz");
            soyIsimler[i]=scanner.nextLine();

        }
        System.out.println("sinif listeniz su sekildedir :");
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+ "-" + isimler[i] + soyIsimler[i]);

        }

    }
}
